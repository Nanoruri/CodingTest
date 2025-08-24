class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int bandageTime = bandage[0];   // 붕대 감기 시전 시간
        int healPerSecond = bandage[1]; // 초당 회복량
        int extraHeal = bandage[2];     // 추가 회복량

        int currentHealth = health;
        int lastAttackTime = getLastAttackTime(attacks);

        int attackIndex = 0;
        int successTime = 0; // 연속 회복 시간

        for (int time = 0; time <= lastAttackTime; time++) {
            if (attackIndex < attacks.length && attacks[attackIndex][0] == time) {
                // 공격 처리
                currentHealth = currentHealth - attacks[attackIndex][1];
                attackIndex++;
                successTime = 0; // 연속 회복 끊김

                if (currentHealth <= 0) {
                    return -1; // 사망
                }
            } else {
                // 회복 처리
                currentHealth = heal(currentHealth, health, healPerSecond, extraHeal, ++successTime, bandageTime);

                if (successTime == bandageTime) {
                    successTime = 0; // 연속 성공 시 추가 회복 후 초기화
                }
            }
        }

        return currentHealth;
    }

    private int getLastAttackTime(int[][] attacks) {
        int maxTime = 0;
        for (int[] attack : attacks) {
            maxTime = Math.max(maxTime, attack[0]);
        }
        return maxTime;
    }

    private int heal(int currentHealth, int maxHealth, int healPerSecond, int extraHeal, int successTime, int bandageTime) {
        int healed = currentHealth + healPerSecond;

        if (successTime == bandageTime) {
            healed += extraHeal;
        }
        return Math.min(healed, maxHealth); // 최대 체력 초과 방지
    }

}
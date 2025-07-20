import java.time.LocalDate;

class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate d1 = makeDate(date1);
        LocalDate d2 = makeDate(date2);

        // 날짜 비교
        return d1.isBefore(d2) ? 1 : 0;
    }


    private LocalDate makeDate(int[] date) {
        if (date == null || date.length != 3) {
            throw new IllegalArgumentException("Invalid date array");
        }
        return LocalDate.of(date[0], date[1], date[2]);
  }
}
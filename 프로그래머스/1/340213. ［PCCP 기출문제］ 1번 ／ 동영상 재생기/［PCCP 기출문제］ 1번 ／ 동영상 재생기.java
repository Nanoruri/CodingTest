import java.time.Duration;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        //동영상의 길이를 분:초로 변환
        Duration video_lenDuration = parseTime(video_len);
        //현재 재생 위치를 분:초로 변환
        Duration posDuration = parseTime(pos);
        //오프닝 시작 시각을 분:초로 변환
        Duration op_startDuration = parseTime(op_start);
        //오프닝 끝나는 시각을 분:초로 변환
        Duration op_endDuration = parseTime(op_end);
        //기능 구현
        

        for (String command : commands) {
            // 오프닝 구간에 있는지 확인
            posDuration = skipOpening(posDuration, op_startDuration, op_endDuration);


            // 명령어 처리
            posDuration = posDuration.plusSeconds(commend(command));


            //10초 미만이면 첫위치로 이동
            posDuration = returnToStart(posDuration);

            //오프닝 구간에 있는지 확인
            posDuration = skipOpening(posDuration, op_startDuration, op_endDuration);


            // 동영상의 길이를 초과하지 않도록 조정
            if (posDuration.compareTo(video_lenDuration) > 0) {
                posDuration = video_lenDuration; // 마지막 위치로 이동
            }
        }


        return formatDuration(posDuration);
    }

    private int commend(String command) {
        switch (command) {
            case "prev":
                return -10; // 10초 전으로 이동
            case "next":
                return 10; // 10초 후로 이동
            default:
                return 0; // 알 수 없는 명령어는 무시
        }
    }

    private Duration returnToStart(Duration posDuration) {
        // 현재 위치가 10초 미만인 경우 영상의 처음 위치로 이동
        if (posDuration.compareTo(Duration.ofSeconds(10)) < 0) {
            return Duration.ZERO; // 처음 위치로 이동
        }
        return posDuration; // 현재 위치를 그대로 반환
    }


    private Duration parseTime(String time) {
        String[] parts = time.split(":");
        int minutes = Integer.parseInt(parts[0]);
        int seconds = Integer.parseInt(parts[1]);
        return Duration.ofMinutes(minutes).plusSeconds(seconds);
    }

    private String formatDuration(Duration duration) {
        long minutes = duration.toMinutes();
        long seconds = duration.getSeconds() % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    private Duration skipOpening(Duration posDuration, Duration op_startDuration, Duration op_endDuration) {
        // 현재 재생 위치가 오프닝 구간에 있는지 확인
        if (posDuration.compareTo(op_startDuration) >= 0 && posDuration.compareTo(op_endDuration) <= 0) {
            return op_endDuration; // 오프닝 끝나는 위치로 이동
        }
        return posDuration; // 오프닝 구간이 아니면 현재 위치를 그대로 반환
    }
}
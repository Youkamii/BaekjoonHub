import java.util.*;

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        int maxPlayTime = 0;

        m = sharp(m);

        for (String musicinfo : musicinfos) {
            String[] parts = musicinfo.split(",");
            String startTime = parts[0];
            String endTime = parts[1];
            String title = parts[2];
            String melody = sharp(parts[3]);

            int playTime = playTime(startTime, endTime);
            String fullMelody = fullSong(melody, playTime);

            if (fullMelody.contains(m) && playTime > maxPlayTime) {
                answer = title;
                maxPlayTime = playTime;
            }
        }

        return answer;
    }

    public static int playTime(String start, String end) {
        String[] startParts = start.split(":");
        String[] endParts = end.split(":");

        return (Integer.parseInt(endParts[0]) * 60 + Integer.parseInt(endParts[1]))
             - (Integer.parseInt(startParts[0]) * 60 + Integer.parseInt(startParts[1]));
    }

    public static String sharp(String melody) {
        return melody.replace("C#", "c")
                     .replace("D#", "d")
                     .replace("F#", "f")
                     .replace("G#", "g")
                     .replace("A#", "a")
                     .replace("B#", "b");
    }

    public static String fullSong(String melody, int playTime) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < playTime; i++) {
            sb.append(melody.charAt(i % melody.length()));
        }
        return sb.toString();
    }
}

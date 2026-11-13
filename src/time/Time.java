
package time;

public class Time {

    private static String[] parseTime(String time, int expectedParts) {

        String[] parts = time.split(":", -1);

        if (parts.length != expectedParts) {
            throw new NumberFormatException("Invalid time format");
        }

        for (String part : parts) {
            if (!part.matches("[0-9]{2}")) {
                throw new NumberFormatException("Invalid time format");
            }
        }

        return parts;
    }

    public static int getTotalSeconds(String time) {

        String[] parts = time.split(":", -1);

        if (parts.length != 3 && parts.length != 4) {
            throw new NumberFormatException("Invalid time format");
        }

        parts = parseTime(time, parts.length);

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);

        return hours * 3600 + minutes * 60 + seconds;
    }

    public static int getSeconds(String time) {
        String[] parts = parseTime(time, 3);
        return Integer.parseInt(parts[2]);
    }

    public static int getTotalMinutes(String time) {
        String[] parts = parseTime(time, 3);

        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        return hours * 60 + minutes;
    }

    public static int getTotalHours(String time) {
        String[] parts = parseTime(time, 3);
        return Integer.parseInt(parts[0]);
    }

    public static int getMilliseconds(String time) {
        String[] parts = parseTime(time, 4);
        return Integer.parseInt(parts[3]);
    }

    public static int getAllMilliseconds(String time) {
        String[] parts = parseTime(time, 4);

        int totalSeconds = getTotalSeconds(time);
        int milliseconds = Integer.parseInt(parts[3]);

        return totalSeconds * 1000 + milliseconds;
    }

    public static void main(String[] args) {

        int totalSeconds = getTotalSeconds("10:10:10:00");

        System.out.println("Github Seconds = " + totalSeconds);
    }
}

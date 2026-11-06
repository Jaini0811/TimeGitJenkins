
package time;

public class Time {

    public static int getTotalSeconds(String time) {

        if (time.length() > 8) {
            throw new NumberFormatException("Invalid time format");
        }

        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int seconds = Integer.parseInt(time.substring(6, 8));

        return hours * 3600 + minutes * 60 + seconds;
    }

    public static int getSeconds(String time) {
        return Integer.parseInt(time.substring(6, 8));
    }

    public static int getTotalMinutes(String time) {

        if (time.length() > 8) {
            throw new NumberFormatException("Invalid time format");
        }

        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));

        return hours * 60 + minutes;
    }

    public static int getTotalHours(String time) {
        return Integer.parseInt(time.substring(0, 2));
    }

    public static int getMilliseconds(String time) {

        if (time.length() > 11) {
            throw new NumberFormatException("Invalid time format");
        }

        return Integer.parseInt(time.substring(9, 11));
    }

    public static int getAllMilliseconds(String time) {

        if (time == null || time.length() != 11) {
            throw new NumberFormatException("Invalid time format");
        }

        if (time.charAt(2) != ':' || time.charAt(5) != ':'
                || time.charAt(8) != ':') {
            throw new NumberFormatException("Invalid time format");
        }

        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        int seconds = Integer.parseInt(time.substring(6, 8));
        int milliseconds = Integer.parseInt(time.substring(9, 11));

        return hours * 3600000
                + minutes * 60000
                + seconds * 1000
                + milliseconds;
    }

   
    public static void main(String[] args) {

        int totalSeconds = getTotalSeconds("10:10:10");

        System.out.println("Total Seconds = " + totalSeconds);
    }

}

public class Clocks {
    public static void main(String[] args) {
        setHours(6);
        setMinutes(20);
        setSeconds(455);
        addToSeconds(20);
        whatTimeIsIt();
    }

    static String seconds, minutes, hours;

    public static void whatTimeIsIt() {
        System.out.println(String.format("%s:%s:%s", hours, minutes, seconds));
    }

    public static String getSeconds() {
        return seconds;
    }

    public static String getMinutes() {
        return minutes;
    }

    public static String getHours() {
        return hours;
    }

    public static void setSeconds(int seconds) {
        if (seconds >= 10 && seconds < 60) {
            Clocks.seconds = Integer.toString(seconds);
            return;
        }

        if (seconds >= 0 && seconds < 10) {
            Clocks.seconds = "0" + seconds;
        } else {
            Clocks.seconds = "00";
        }
    }

    public static void setMinutes(int minutes) {
        if (minutes >= 10 && minutes < 60) {
            Clocks.minutes = Integer.toString(minutes);
            return;
        }

        if (minutes >= 0 && minutes < 10) {
            Clocks.minutes = "0" + minutes;
        } else {
            Clocks.minutes = "00";
        }
    }

    public static void setHours(int hours) {
        if (hours >= 10 && hours < 24) {
            Clocks.hours = Integer.toString(hours);
            return;
        }

        if (hours >= 0 && hours < 10) {
            Clocks.hours = "0" + hours;
        } else {
            Clocks.hours = "00";
        }
    }

    static void addToSeconds(int numToAdd) {
        seconds = Integer.toString(Integer.parseInt(seconds) + numToAdd);
        minutes = Integer.toString(Integer.parseInt(minutes) + (int) Integer.parseInt(minutes) % 60);
        seconds = Integer.toString(Integer.parseInt(seconds) % 60);
        hours = Integer.toString(Integer.parseInt(minutes) / 60+Integer.parseInt(hours));
        minutes = Integer.toString(Integer.parseInt(minutes) % 60);
        hours=Integer.toString(Integer.parseInt(hours)/24);
    }
}

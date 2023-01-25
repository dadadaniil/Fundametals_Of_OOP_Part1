public class NewClocks {
    static int minutes, hours, seconds;

    public static void main(String[] args) {
        System.out.println(String.format("%s:%s:%s", getHours(), getMinutes(), getSeconds()));
    }

    static public String getMinutes() {
        return minutes < 10 ? "0" + minutes : Integer.toString(minutes);
    }

    static public void addToMinutes(int intToAdd) {
        addToHours((minutes + intToAdd) / 60);
        minutes = intToAdd + minutes > 59 ? (minutes + intToAdd) % 60 : minutes + intToAdd;
    }

    static public void setMinutes(int inputMinutes) {
         minutes= inputMinutes >= 0 && inputMinutes < 60 ? inputMinutes : 0;
    }

    static public String getHours() {
        return hours < 10 ? "0" + hours : Integer.toString(hours);

    }

    static public void setHours(int setHours) {
        hours = setHours >= 0 && setHours < 24 ? setHours : 0;
    }

    static public String getSeconds() {
        return seconds < 10 ? "0" + seconds : Integer.toString(seconds);

    }

    static public void setSeconds(int setSeconds) {
        seconds = setSeconds >= 0 && setSeconds < 60 ? setSeconds : 0;
    }

    static public void addToSeconds(int intToAdd) {
        addToMinutes((seconds + intToAdd) / 60);
        seconds = intToAdd + seconds > 59 ? (seconds + intToAdd) % 60 : seconds + intToAdd;
    }

    static public void addToHours(int intToAdd) {
        hours = intToAdd + hours > 23 ? (hours + intToAdd) % 24 : hours + intToAdd;
    }
}

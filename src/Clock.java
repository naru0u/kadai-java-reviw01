
public class Clock {

    public static void main(String[] args) {

        int second = getSecond(18,32,47);
        System.out.println(second);
    }
    public static int getSecond(int hour, int minute, int second) {
        int result = hour*3600+minute*60+second;
        return result;


    }

}

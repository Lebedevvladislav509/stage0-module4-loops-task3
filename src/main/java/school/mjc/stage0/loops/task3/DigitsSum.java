package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        if (t < 0) {
            t = Math.abs(t);
        }
        int sum = 0;
        int ost;
        String s = Integer.toString(t);
        for (int i = 0; i < s.length(); i++) {
            ost = t % 10;
            t = t / 10;
            sum = sum + ost;
        }
        System.out.println(sum);
    }
}

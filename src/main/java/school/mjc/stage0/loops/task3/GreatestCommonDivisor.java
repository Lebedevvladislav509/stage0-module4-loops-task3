package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min = first < second ? first : second;
        int max = first > second ? first : second;
        if (first == second) {
            System.out.println(first);
        } else if (first == 0 || second == 0) {
            System.out.println(max);
        } else {
            int maxNOD = 0;
            for (int i = 1; i < min; i++) {
                if (min % i == 0) {
                    if (max % i == 0) {
                        maxNOD = i;
                    }
                }
            }
            System.out.println(maxNOD);
        }
    }
}

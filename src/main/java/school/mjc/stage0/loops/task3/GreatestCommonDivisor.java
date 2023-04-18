package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int min;
        int max;
        int maxNOD = 0;
        min = first < second ? first : second;
        max = first > second ? first : second;

        for (int i = 1; i < min; i++) {
            if (min % i == 0) {
                if (max % i == 0){
                    maxNOD =i;
                }
            }
        }
        System.out.println(maxNOD);
    }
}

package exercises01;

public class Counter {
    public static void main(String[] args) {
        long start, spent = 0;

        start = System.nanoTime();
	int num = 0;
        for (int i = 0; i < 101; i++) {
            num += i;
        }

        spent += System.nanoTime() - start;

        System.out.println("Time spent: " + spent + " ns" + ". Number is: " + num);
    }
}

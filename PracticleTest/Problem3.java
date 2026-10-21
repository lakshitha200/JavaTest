package PracticleTest;

public class Problem3 {

    public static void fibFunction() {
        int a = 0;
        int b = 1;

        for (int i = 0; i < 100; i++) {
            System.out.print(a + ", ");

            int nextVal = a + b;
            a = b;
            b = nextVal;
        }
    }

    public static void main(String[] args) {

        fibFunction();
    }
}

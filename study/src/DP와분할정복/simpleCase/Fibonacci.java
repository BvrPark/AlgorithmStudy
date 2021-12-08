package DP와분할정복.simpleCase;

public class Fibonacci {
    public int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }else{
            return this.fibo(n-1) + this.fibo(n-2);
        }
    }

    public static void main(String[] args) {
        Fibonacci test = new Fibonacci();
        System.out.println(test.fibo(0));
        System.out.println(test.fibo(1));
        System.out.println(test.fibo(2));
        System.out.println(test.fibo(3));
        System.out.println(test.fibo(4));
        System.out.println(test.fibo(5));
        System.out.println(test.fibo(6));
        System.out.println(test.fibo(7));
        System.out.println(test.fibo(8));
        System.out.println(test.fibo(9));


    }
}

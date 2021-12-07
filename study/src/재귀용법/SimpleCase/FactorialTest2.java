package 재귀용법.SimpleCase;

public class FactorialTest2 {
    public int Factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n*this.Factorial(n-1);
        }
    }

    public static void main(String[] args) {
        FactorialTest2 test = new FactorialTest2();
        System.out.println(test.Factorial(5));
    }
}

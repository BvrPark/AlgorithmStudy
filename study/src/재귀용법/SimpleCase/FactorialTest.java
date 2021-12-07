package 재귀용법.SimpleCase;

public class FactorialTest {
    public int Factorial(int n) {
       if(n>1){
           return n*this.Factorial(n-1);
       }else{
           return 1;
       }
    }


    public static void main(String[] args) {
       FactorialTest test = new FactorialTest();
        System.out.println(test.Factorial(6));
    }
}

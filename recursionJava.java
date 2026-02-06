public class recursionJava {
    public static void main(String[] args) {
        // int n = 1;
        // printNumber(n);

        //sumOfNumbers(1, 5, 0);

        //calFact(5, 1);

        fibo(0, 1, 8);
    }

    //

    public static void printNumber(int n) {
        if(n == 6){
            return;
        }

        System.out.println(n);
        printNumber(n+1);
    }

    //

    public static void sumOfNumbers(int i, int n, int sum ) {
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumOfNumbers(i+1, n, sum);
    }

    //

    public static void calFact(int n, int fact) {
        
        if(n==0){
            System.out.println(fact);
            return;
        }

        fact *= n;
        calFact(n-1, fact);
    }

    //

    public static void fibo(int a, int b, int n) {
        if(n == 0){
            return;
        }

        System.out.println(a);
        fibo(b, b+a, n-1);
    }

    //




}

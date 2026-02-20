public class recursionJava {
    public static void main(String[] args) {
        // int n = 1;
        // printNumber(n);

        //sumOfNumbers(1, 5, 0);

        //calFact(5, 1);

        //fibo(0, 1, 8);
        
        System.out.println(calPower(2, 5));
        System.out.println(power(2, 5));
        towerOfHanoi(3, "S", "H", "D");
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

    // X^n stack height = n

    public static int calPower(int x, int n) {
        
        if(n==0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        int xPownm1 = calPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    // // X^n stack height = logn

    public static int power(int x, int n) {
        
        if(n==0){
            return 1;
        }

        if(n % 2 == 0){
            return power(x, n/2) * power(x, n/2);
        }else{
            return x * power(x, n/2) * power(x, n/2);
        }

        
    }

    //TOwer of hanoi

    public static void towerOfHanoi(int n, String Source, String Helper, String Destination) {
        
        if( n == 1){
            System.out.println("Disk " + n + " had been tranferred from " + Source + " to " + Destination );
            return;
        }

        towerOfHanoi(n-1, Source, Destination, Helper);
        System.out.println("Disk " + n + " had been tranferred from " + Source + " to " + Destination);
        towerOfHanoi(n-1, Helper, Source, Destination);
    }







    






}

import java.util.HashSet;

public class recursionJava {
    public static void main(String[] args) {
        // int n = 1;
        // printNumber(n);

        //sumOfNumbers(1, 5, 0);

        //calFact(5, 1);

        //fibo(0, 1, 8);
        
        //System.out.println(calPower(2, 5));
        //System.out.println(power(2, 5));
        //towerOfHanoi(3, "S", "H", "D");
        //String str = "abcd\n";
       // revString(str, str.length()-1);

    //    String str = "tabcdfghijakkk";
    //    char el = 'a';
    //    firstAndLastOccurance(0, str, el);

    //    System.out.println(first);
    //    System.out.println(last);

    //    int arr[] = {1,3,4,5};
    //    System.out.println(sortedArray(arr, 0));

    //    String str = "axbcdxxef";
    //    moveAllX(str, 0, 0, "");

    // String str = "aaabbccaaaddddefffeg";
    // removeDuplicates(str, 0, "");

    // String str = "abc";
    // Subsequnece(str, 0, "");
 
    // String str = "aaa";
    // HashSet<String> set = new HashSet<>();
    // uniqueSubsequnece(str, 0, "", set);

    String str = "23";
    keypadCombination(str, 0, "");



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

    // reversed String

    public static void revString(String str, int idx) {

        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        revString(str, idx-1);
    }

    // First and last occurance

    public static int first = -1;
    public static int last = -1;

    public static void firstAndLastOccurance(int idx, String str, char el) {
        
        if(idx == str.length()){
            return;
        }

        if(str.charAt(idx) == el){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }

        firstAndLastOccurance(idx+1, str, el);
    }

    //array is sorted
  
    public static boolean sortedArray(int arr[], int idx) {

        if(idx == arr.length-1){
            return true;
        }

        if (arr[idx] >= arr[idx+1]) {
            return false;
        }
        return sortedArray(arr, idx+1);
         
    }


    public static void moveAllX(String str, int idx, int count, String newString) {
        
        if(idx == str.length()){

            for(int i = 0; i< count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }


         char currChar = str.charAt(idx);

         if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
         }else{
            newString += currChar;
            moveAllX(str, idx+1, count, newString);
         }
    }

    public static boolean[] map = new boolean[26]; 

    public static void removeDuplicates(String str, int idx, String newString) {
        
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }


        char currentChar = str.charAt(idx);

        if(map[currentChar - 'a'] == true){
            removeDuplicates(str, idx+1, newString);
        }else{
            newString += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }

    // UniqueSubsequnece

    public static void uniqueSubsequnece(String str, int idx, String newStr, HashSet<String> set) {
        
        if(idx == str.length()){

            if(set.contains(newStr)){
                return;
            }
            set.add(newStr);
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        uniqueSubsequnece(str, idx+1, newStr+currChar, set);

        uniqueSubsequnece(str, idx+1, newStr, set);
    }

  //  Subsequence

  public static void Subsequnece(String str, int idx, String newStr) {
        
    if(idx == str.length()){
        System.out.println(newStr);
        return;
    }

    char currChar = str.charAt(idx);

    Subsequnece(str, idx+1, newStr+currChar);

    Subsequnece(str, idx+1, newStr);
}



// keypad combination
public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"}; 
public static void keypadCombination(String str, int idx, String combination) {
    
    if(idx == str.length()){
        System.out.println(combination);
        return;
    }

    char currChar = str.charAt(idx);
    String mapping = keypad[currChar - '0'];

    for(int i = 0; i<mapping.length();i++){
        keypadCombination(str, idx+1, combination+mapping.charAt(i));
    }
}



/// Advance recursion
/// 




    






}

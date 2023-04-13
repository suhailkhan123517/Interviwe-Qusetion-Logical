import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



public class Saturday{

  // static int factorial(int n){ // Qustion No line 179
  //   if(n == 0){
  //     return 1;
  //   }else{
  //     return( n * factorial(n-1));
  //   }
  // }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 1.Reverse String 
    // String original = "Suhail";
    // String reverse = "";
    // int leng = original.length();

    // for(int i = leng-1; i>=0; i--){
    //   reverse = reverse + original.charAt(i);
    // }
    // System.out.println(reverse);

    // 2.swap two number without third variable
    // int a = 10;
    // int b = 20;

    // a = a + b;
    // b = a - b;
    // a = a - b;

    // System.out.println("value of  a : " + a);
    // System.out.println("vlaue of  b : " + b);

    // 3.check all the present vawels in a string in java
    // String str = new String("Hi Welcome to my world");
    // for(int i = 0; i < str.length(); i++){
    //   if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
    //     System.out.println("Given string contains " + str.charAt(i) + " at the index " + i);
    //   }
    // }

    // 4.check given number is prime or not
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter Number ");
    // int n = sc.nextInt();
    // int count = 0;

    // for(int i=1; i<=n; i++){
    //   if(n % i == 0){
    //     count++;
    //   }
    // }

    // if(count == 2){
    //   System.out.println("Number is prime ");
    // }else{
    //   System.out.println("not prime");
    // }

    // 5.check odd number

    // int a[] = {1,2,3,4,5,6,7,8,9,0};

    // for(int i=0; i<a.length; i++){
    //   if(a[i] % 2 != 0){
    //     System.out.println("Odd number" + a[i]);
    //   }
    // }

    // 6.check even number
    // int b[] = {1,2,3,4,5,6,7,8,9,0};

    // for(int i=0; i<a.length; i++){
    //   if(a[i] % 2 == 0){
    //     System.out.println("Even number" + a[i]);
    //   }
    // }

    //  7.palindrome as String
    // String original = "121";
    // String reverse = "";
    // int leng = original.length();
    // for(int i=leng-1;  i>= 0; i--){
    //   reverse = reverse + original.charAt(i);
    // }
    // if(original.equals(reverse)){
    //   System.out.println("is Palindrome ");
    // }else{
    //   System.out.println("not palindrome");
    // }

    // 8.palindrome as Number
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // int rev = 0;
    // int backUp = num;

    // while(num > 0){
    //   rev = rev  * 10 + num % 10;
    //   num = num / 10;
    // }

    // if(backUp == rev){
    //   System.out.println("Palindrome");
    // }else{
    //   System.out.println("Not palindrome");
    // }

    // 9.Reverse Number 
    // int number = sc.nextInt();
    // int reveser = 0;

    // while(number != 0){
    //   reveser = reveser * 10 + number % 10;
    //   number = number / 10;
    // }

    // System.out.print(reveser);


    // 10 How do you remove spaces from a string in Java?

    // String str = "    Mohammad    Suhail    ";
    // str = str.replaceAll("\\s", "");
    // System.out.println(str);

    // 11 How do you remove leading and trailing spaces from a string in Java?

    // String  str = "  Mohammad Suhail  ";
    // str = str.trim();
    // System.out.println(str);

    // 12  How do you sort an array in Java without defined method ?

    // int arr[] = {12,3,34, 53, 534, 53, 52,56,47,90};
    // int length = arr.length;

    // for(int i = 0; i < length; i++){
    //   for(int j= i + 1; j < length; j++){
    //     if(arr[i]> arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }

    // for(int i = 0; i<length; i++){
    //   System.out.print(arr[i] + " ");
    // }


    // 13  How do you sort an array in Java with predefiend method?

    // int arr[] = {12,3,34, 53, 534, 53, 52,56,47,90};

    // Arrays.sort(arr);

    // for(int i = 0; i < arr.length; i++){
    //   System.out.print(arr[i] + " ");
    // }

    // 14.How can you find the factorial of an integer in Java using loop?

    // int fact = 1;
    // int number = 5;
    // for(int i = 1; i <=number; i++){
    //   fact = fact * i;
    // }
    // System.out.println("factorial of  " + number + "is :" + fact);

    // 15.How can you find the factorial of an integer in Java using recursion?

    // int fact = 1;
    // int number = 4;
    // fact = factorial(number);
    // System.out.println("foctorial of " + number + "is " + fact);

    // 16.How do you get the sum of all elements in an integer array in Java?

    // int arr[] = {1,2,3,4,5,5,6,};
    // int sum = 0;
    // int arrlength = arr.length;

    // for(int i = 0; i<arrlength; i++){
    //   sum = sum + arr[i];
    // }

    // System.out.println(sum);

    // 17.How do you find the second largest number in an array in Java?

    // int arr[] = {12,33,5,3,26,63};
    // int arrLength = arr.length;

    // for(int i = 0 ; i<arrLength; i++){
    //   for(int j  = i+1; j< arrLength; j++){
    //     if(arr[i]> arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }
    // System.out.println("secound larget Number : " + arr[arrLength-1]);


    // 18.How do you print a date in specific format in Java?

    // DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    // Date date = new Date();
    // System.out.println(dateFormat.format(date));

    // 19.How do you remove all occurrences of a given character from an input string in Java?

    // String  str = "SuhailDilshadAhmad";

    // str = str.replace("a", "");

    // System.out.println(str);


    // search of x index 
    // System.out.println("Enter size of Array");
    // int size = sc.nextInt();
    // int arr[] = new int[size];

    // for(int i=0; i<size; i++){
    //   arr[i] = sc.nextInt();
    // }

    // System.out.println("which value of index given you ");
    // int x = sc.nextInt();

    // for(int i=0; i<arr.length; i++){
    //   if(arr[i] == x){
    //     System.out.println("Index of arr x : " + i);
    //   }
    // }

    // search of 2d array x of index

    // System.out.println("inter size of 2d array");
    // int row = sc.nextInt();
    // int col = sc.nextInt();

    // int arr[][]  = new int[row][col];

    // for(int i=0; i<row; i++){
    //   for(int j=0; j<col; j++){
    //     arr[i][j] = sc.nextInt();
    //   }
    // }

    // int x  = sc.nextInt();

    // for(int i=0; i<row; i++){
    //   for(int j=0; j<col; j++){
    //     if(arr[i][j] == x ){
    //       System.out.println("x fount at location : " + i + " " + j);
    //     }
      // }
    // }































    





    




                   

    
    



  }
}
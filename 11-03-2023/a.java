import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class a {

  // public static int multiple(int a, int b){
  //   return a * b;
  // }



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // find x array 2d index number
    // System.out.println("Enter number of row");
    // int row = sc.nextInt();
    // System.out.println("Enter number of col");
    // int col = sc.nextInt();
    // int arr[][]  = new int[row][col];
    // System.out.println("input value of array");
    // for(int i=0; i<row; i++){
    //   for(int j=0; j<col; j++){
    //     arr[i][j] = sc.nextInt();
    //   }
    // }
    // System.out.println("which take index number");
    // int x = sc.nextInt();
    // for(int i=0; i<row; i++ ){
    //   for(int j=0; j<col; j++){
    //     if(arr[i][j] == x){
    //       System.out.println("Index number of array x  " + i +  " " + j);
    //     }
    //   }

    // }

    


    // find x index of array
    // System.out.println("Enter number of size");
    // int size = sc.nextInt();
    // int arr[] = new int[size];

    // for(int i=0; i<size; i++){
    //   arr[i] = sc.nextInt();
    // }

    // int x = sc.nextInt();

    // for(int i=0; i<arr.length; i++){
    //   if(arr[i] == x) {
    //     System.out.println(i);
    //   }
    // }





    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // System.out.println(multiple(a, b));


    // table print input from user 
    // System.out.println("Enter any Number");
    // int n  = sc.nextInt();
    // for(int i=1; i<=10; i++){
    //   System.out.println( n * i);
    // }

    // Dimond pattern 
    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   int star = 2 * i-1;
    //   for(int j=1; j<= star; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // for(int i=n; i>=1; i--){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   int star = 2 * i-1;
    //   for(int j=1; j<= star; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // palindrome pyramid
    // int n = 5; 
    // for(int i=1; i<=n ; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   for(int j=i; j>=1; j--){
    //     System.out.print(j);
    //   }
    //   for(int j=2; j<=i; j++){
    //     System.out.print(j);
    //   }
    //   System.out.println();
    // }


    // Number pyramid 
    // int n = 5;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   for(int j= 1; j<=i; j++){
    //     System.out.print(i + " ");
    //   }
    //   System.out.println();
    // }





    // solid rombus
    // int n = 5;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   for(int j=1; j<=n; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }




    // butterfly pattern 
    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   int spaces = 2* (n-i);
    //   for(int j=1; j<= spaces; j++){
    //     System.out.print(" ");
    //   }

    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // for(int i=n; i>=1; i--){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   int spaces = 2* (n-i);
    //   for(int j=1; j<= spaces; j++){
    //     System.out.print(" ");
    //   }

    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // 0-1 tringle 
    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     if((i + j) % 2 == 0){
    //       System.out.print(1 + " ");
    //     }else{
    //       System.out.print(0 + " ");
    //     }
    //   }
    //   System.out.println();
    // }


    // floyed pyramid 
    // int n = 5;
    // int number = 1;
    // for(int i =1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print(number++ + " ");
    //   }
    //   System.out.println();
    // }


    // half pyramid with number 
    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print(j);
    //   }
    //   System.out.println();
    // }


    // inverted pyramid roteted 180 deg
    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }





    // inverted pyramid 
    // int n = 4;
    // for(int i=n; i>=1; i--){
    //   for(int j=1; j<= i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }




    // half pyramid 
    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j =1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // hollow reactangle
    // int n = 4;
    // int m = 5;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=m; j++){
    //     if(i == 1 || i == n|| j == 1 || j == m){
    //       System.out.print("*");
    //     }else{
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }


    // solid reactangel
    // int n = 4;
    // int m = 5;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=m; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // int arr[] = {1,0,2,0,4};
    // for(int i=0; i<arr.length; i++){
    //   if(arr[i] == 0){
    //     for(int j=i+1; j<arr.length; j++){
    //       if(arr[j] != 0 ){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         break;
    //       }
    //     }
    //   }
    // }
    // for(int i=0; i<arr.length; i++){
    //   System.out.print(arr[i] + " ");
    // }



    // remove all occurrences 
    // String  str = "Suhail";
    // str = str.replace("S", "");
    // System.out.println(str);



    // date format
    // DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    // Date date = new Date();
    // System.out.println(dateFormat.format(date));


    // secound largest array
    // int arr[] = {32,4,35,67,55};
    // for(int i=0; i<arr.length; i++){
    //   for(int j=i+1; j<arr.length; j++){
    //     if(arr[i] > arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }
    // System.out.println("secoud largest arrays " + arr[arr.length-2] );


    


    // sum of all arrays
    // int arr[] = {1,2,3,4,5};
    // int sum = 0;
    // for(int i=0; i<arr.length; i++){
    //   sum = sum + arr[i];
    // }
    // System.out.println("Sum of all array " + sum);


    // factorial take 
    // System.out.println("Enter any Number ");
    // int number = sc.nextInt();
    // int fact = 1;
    // for(int i=1; i<=number; i++){
    //   fact = fact * i;
    // } 
    // System.out.println("Factorial Number " + number + " and value " + fact);


    // sorting arrays with inbuild method
    // int arr[]  = {5,43,345,2,21};
    // Arrays.sort(arr);
    // for(int i=0; i<arr.length; i++){
    //   System.out.print(arr[i] + " ");
    // }



    // sorting arrays without inbuild method 
    // int arr[]  = {5,43,345,2,21};
    // for(int i =0; i<arr.length; i++){
    //   for(int j=i +1; j<arr.length; j++){
    //     if(arr[i] > arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }
    // for(int i =0 ; i<arr.length; i++){
    //   System.out.print(arr[i] + " ");
    // }

    



    // trim spaces
    // System.out.println("Enter a Sring with many space ");
    // String  str = sc.nextLine();
    // str = str.replaceAll("\\s", "");
    // System.out.println(str);

    // palindrome
    // System.out.println("Enter any number ");
    // int number = sc.nextInt();
    // int reverse = 0;
    // int n = number;
    // while(number != 0){
    //   reverse = reverse * 10 + number % 10;
    //   number = number / 10;
    // }
    // if( n == reverse ){
    //   System.out.println("This is palindrome " + reverse);
    // }else{
    //   System.out.println("this is not palindrome " + reverse );
    // }

    // check if the given number is prime Number
    // System.out.println("Enter any Number ");
    // int n = sc.nextInt();
    // int count = 0;
    // for(int i=0; i<=n; i++){
    //   if(i % 2 == 0){
    //     count++;
    //   }
    // }
    // if(count == 2){
    //   System.out.println("This is prime Number : " + n);
    // }else{
    //   System.out.println("This is not prime Number : " + n);
    // }

    // find vowel in String given you 
    // String str = "Mohammad Suhail";
    // for(int i=0; i<str.length(); i++ ){
    //   if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
    //     System.out.println("Sting Contains vowel  " + str.charAt(i) + " at Index " + i);
    //   }
    // }


    // find Largest Number of 
    // int arr[] = {1,2,3,4,5};
    // int length = arr.length;
    // for(int i=0; i<length; i++){
    //   for(int j=0; j<length; j++){
    //     if(arr[i] < arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }
    // System.out.println("Largest Number of Arrays " + arr[length-1]);


    // Even number of natural Number
    // System.out.println("Enter Number till you take even number");
    // int n = sc.nextInt();
    // for(int i =1 ; i<=n; i++){
    //   if(i % 2 == 0){
    //     System.out.println("Even Number of this : " + i);
    //   }
    // }


    // Even Number of Arrays
    // System.out.println("Enter Number of Arrays size");
    // int size = sc.nextInt();
    // int arr[] = new int[size];
    // System.out.println("Enter your value of Arrays");
    // for(int i=0; i<size; i++){
    //   arr[i] = sc.nextInt();
    // }
    // for(int i=0; i<arr.length; i++){
    //   if(arr[i] % 2 == 0){
    //     System.out.println("Even Number is : " + arr[i]);
    //   }
    // }



    // find odd number n natural Number  till from user
    // System.out.println("Enter Number till you take odd Number");
    // int  n = sc.nextInt();
    // for(int i=0; i<=n; i++){
    //   if( i % 2 != 0){
    //     System.out.print(i + " ");
    //   }
    // }


    // find odd number in arrays
    // System.out.println("Enter Number of Arrays size");
    // int size = sc.nextInt();
    // int arr[] = new int[size];
    // System.out.println("Enter Value of Arrays Number");
    // for(int i=0; i<size; i++){
    //   arr[i] = sc.nextInt();
    // }
    // for(int i=0; i<arr.length; i++){
    //   if(arr[i] % 2 != 0 ){
    //     System.out.println("This is odd Number " + arr[i]);
    //   }
    // }
    



    // print number till 1 to n
    // System.out.println("Enter any Number till printed");
    // int n = sc.nextInt();
    // for(int i=1; i<= n; i++){
    //   System.out.print(i + " ");
    // }


    // swap number without third variable
    // System.out.println("Enter Number of A : ");
    // int a = sc.nextInt();
    // System.out.println("Enter Number of B : ");
    // int b = sc.nextInt();
    // a = a + b;
    // b = a - b;
    // a = a - b;
    // System.out.println("Value of A : " + a);
    // System.out.println("Value of B : " + b);


    // reverse Number
    // int number = sc.nextInt();
    // int reverse = 0;
    // while(number != 0){
    //   reverse = reverse * 10 + number % 10;
    //   number = number / 10;
    // }
    // System.out.println(reverse);

    // reverse String
    // String original = sc.nextLine();
    // String reverse = "";
    // int length = original.length();
    // for(int i= length-1; i>=0; i--){
    //   reverse = reverse + original.charAt(i);
    // }
    // System.out.println(reverse);






  }
}

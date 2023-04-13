import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class B {
  public static void main(String[] args){
    Scanner  sc = new Scanner(System.in);

    // int arr[] = {2,7,11,15};
    // int length = arr.length;
    // int target = 9;

    // for(int i=0; i<length; i++){
    //   for(int j=i+1; j<length; j++){
    //     if(arr[i] + arr[j] == target ){
    //      System.out.println(i + " " + j); 
    //     }
    //   }
    // }

    




    // System.out.println("Enter Number array of row");
    // int row = sc.nextInt();
    // System.out.println("Enter Number of arraya col");
    // int col  = sc.nextInt();
    // int arr[][] = new int[row][col];
    // System.out.println("Enter value of Array");
    // for(int i=0; i<row; i++){
    //   for(int j=0; j<col; j++){
    //     arr[i][j] = sc.nextInt();
    //   }
    // }
    // System.out.println("Enter Number of x ");
    // int x = sc.nextInt();
    // for(int i =0; i<row; i++){
    //   for(int j= 0; j<col; j++ ){
    //     if(arr[i][j] == x ){
    //       System.out.println("Index of Number " + i + " " + j);
    //     }
    //   }
    // }





    // System.out.println("Enter size of array");
    // int size = sc.nextInt();
    // int arr[] = new int[size];
    // System.out.println("Enter value of Array");
    // for(int i=0; i<size; i++){
    //   arr[i] = sc.nextInt(); 
    // }
    // System.out.println("Enter Number of x ");
    // int x = sc.nextInt();
    // for(int i = 0; i<arr.length; i++){
    //   if(arr[i]  == x){
    //     System.out.println("Array of index : " + i);
    //   }
    // }


    // int n = sc.nextInt();
    // for(int i=1; i<=10; i++){
    //   System.out.println(n * i);
    // }



    // int n = 4;
    // for(int i=1; i<=n ; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   int star = 2 * i-1;
    //   for(int j=1; j<=star; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // for(int i=n; i>=1 ; i--){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   int star = 2 * i-1;
    //   for(int j=1; j<=star; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // int n = 5;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   for(int j=i;j>=1; j--){
    //     System.out.print(j);
    //   }
    //   for(int j=2; j<=i; j++){
    //     System.out.print(j);
    //   }
    //   System.out.println();
    // }




    // int n = 5;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   for(int j=1; j<=i; j++){
    //     System.out.print(i + " ");
    //   }
    //   System.out.println();
    // }



    // int n = 5;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   for(int j = 1; j<=n; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }



    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   int spaces = 2 * (n-i);
    //   for(int j=1; j<=spaces; j++){
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
    //   int spaces = 2 * (n-i);
    //   for(int j=1; j<=spaces; j++){
    //     System.out.print(" ");
    //   }
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     if((i+j) % 2 == 0){
    //       System.out.print(1 + " ");
    //     }else{
    //       System.out.print(0 + " ");
    //     }
    //   }
    //   System.out.println();
    // }

    // int n = 5;
    // int number = 1;
    // for(int i=1; i<=n; i++){
    //   for(int j=1;j<=i; j++){
    //     System.out.print(number++);
    //   }
    //   System.out.println();
    // }




    // int n = 4;
    // for(int i=n; i>=1; i--){
    //   for(int j=1; j<= i; j++){
    //     System.out.print(j);
    //   }
    //   System.out.println();
    // }

    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print(j);
    //   }
    //   System.out.println();
    // }




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


    // int n = 4; 
    // for(int i = n; i>=1; i--){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // int n = 4;
    // for(int i =1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // int n = 4;
    // int m = 5;

    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=m; j++){
    //     if(i == 1 || j == 1 || i == n || j == m){
    //       System.out.print("*");
    //     }else{
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }

    // int n = 4;
    // int m = 5;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=m; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // int arr[] = {1,0,3,0,4,0,5};
    // int length = arr.length;
    // for(int i =0 ; i<length; i++){
    //   if(arr[i] == 0){
    //     for(int j=i + 1; j<length; j++){
    //       if(arr[j] != 0){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         break;
    //       }
    //     }
    //   }
    // }
    // for(int i=0; i<length; i++){
    //   System.out.print(arr[i] + " ");
    // }




    // String str = "Mohammad Suhail";
    // str = str.replace("a", " ");
    // System.out.println(str);




    // DateFormat dateFormat  = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
    // Date date = new Date();
    // System.out.println(dateFormat.format(date));




    // int arr[] = {1,2,34,353,232,565};
    // int length = arr.length;
    // for(int i = 0; i<length; i++){
    //   for(int j= i+ 1; j<length; j++){
    //     if(arr[i] > arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }
    // System.out.println(arr[length-2]);



    // int arr[] = {1,2,3,4,5};
    // int length = arr.length;
    // int sum = 0;
    // for(int i = 0; i<length; i++){
    //   sum = sum + arr[i];
    // }
    // System.out.println(sum);
    



    // int fact = 1;
    // int number = 5;
    // for(int i = 1; i<= number; i++){
    //   fact = fact * i;
    // }
    // System.out.println(number + "  " + fact);




    // int arr[] = {2,4,53,23,67};
    // int length = arr.length;
    // for(int i =0; i<length; i++){
    //   for(int j=i+1; j<length; j++){
    //     if(arr[i] > arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }
    // for(int i=0; i<length; i++){
    //   System.out.println(arr[i] + " ");
    // }




    // String str = "  Mohammad   Suhail   Ansari  ";
    // str = str.replaceAll("\\s", "");
    // System.out.println(str);




    // int number = sc.nextInt();
    // int reverse = 0;
    // int temp = number;
    // while( number != 0){
    //   reverse = reverse * 10 + number % 10;
    //   number = number / 10;
    // }
    // if( temp == reverse){
    //   System.out.println("this is palindrome :" + reverse);
    // }else{
    //   System.out.println("This is not palindrome :" + reverse);
    // }
    






    // System.out.println("Enter any number");
    // int  n = sc.nextInt();
    // int count = 0;
    // for(int i=0; i<=n; i++){
    //   if(i % 2 == 0){
    //     count++;
    //   }
    // }
    // if(count == 2){
    //   System.out.println("this is prime Number : " + n );
    // }else{
    //   System.out.println("this is not prime Number : " + n );
    // }



    // String str = "Mohammad Suhail";
    // int length = str.length();
    // for(int i=0; i<length; i++){
    //   if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
    //     System.out.println(str.charAt(i) + " " + i);
    //   }
    // }



    // int arr[] = {1,2,4,3,25,6};
    // int length = arr.length;
    // for(int i=0; i<length; i++){
    //   for(int j=i + 1; j<length; j++){
    //     if(arr[i] > arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }
    // System.out.println(arr[length-1]);


    // int n = 10; 
    // int sum  = 0;
    // for(int i = 0 ; i<=n; i++){
    //   sum = sum + i;
    // }
    // System.out.println(sum);


    // int arr[] = {1,3,2,4,5,6,7,8};
    // int length = arr.length;
    // for(int i=0; i<length; i++){
    //   if(arr[i] % 2 == 0){
    //     System.out.println(arr[i]);
    //   }
    // }

    


    // int arr[] = {1,3,2,4,5,6,7,8};
    // int length = arr.length;
    // for(int i =0; i<length; i++){
    //   if(arr[i] % 2 != 0){
    //     System.out.println(arr[i]);
    //   }
    // }
 

    // for(int i = 1; i<=100; i++){
    //   System.out.println(i);
    // }




    // int a = 10; 
    // int b = 23;
    // a = a + b;
    // b = a - b;
    // a = a - b;
    // System.out.println(a);
    // System.out.println(b);




    // int number = 12345;
    // int reverse = 0;
    // while(number != 0){
    //   reverse = reverse * 10 + number % 10;
    //   number = number / 10;
    // }
    // System.out.println(reverse);



    // String str = "Suhail";
    // String reverse = "";
    // int length = str.length();
    // for(int i=length-1; i>=0; i--){
    //   reverse = reverse + str.charAt(i);
    // }
    // System.out.println(reverse);
  }
}

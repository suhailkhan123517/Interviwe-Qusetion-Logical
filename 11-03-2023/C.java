import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class C {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // two sum
    // int arr[] = {4,7,11,5,3,6,13};
    // int length = arr.length;
    // int target = 9;

    // for(int i=0; i<length; i++){
    //   for(int j=i+1; j<length; j++){
    //     if(arr[i] + arr[j]  == target){
    //       System.out.println("index : " + i + " " + j  );
    //     }
    //   }
    // }


    // System.out.println("Enter row of array");
    // int row = sc.nextInt();
    // System.out.println("Enter col of array");
    // int col = sc.nextInt();

    // int arr[][] = new int[row][col];

    // System.out.println("Enter value of array");
    // for(int i=0; i<row; i++){
    //   for(int j=0; j<col; j++){
    //     arr[i][j] = sc.nextInt();
    //   }
    // }

    // System.out.println("Enter value of x");
    // int x = sc.nextInt();

    // for(int i=0; i<row; i++){
    //   for(int j=0; j<col; j++){
    //     if(arr[i][j] == x){
    //       System.out.println("Arraay of index " + i + " " + j);
    //     }
    //   }
    // }




    // System.out.println("Enter size of array");
    // int size = sc.nextInt();
    // int arr[] = new  int[size];
    
    // for(int i=0; i< size; i++){
    //   arr[i] = sc.nextInt();
    // }

    // System.out.println("Enter number of x");
    // int x = sc.nextInt();

    // for(int i=0; i<arr.length; i++){
    //   if(arr[i] == x){
    //     System.out.println("index of array " + " " + i);
    //   }
    // }



    // System.out.println("Enter any Number ");
    // int n = sc.nextInt();
    // int sum = 0;
    // for(int i=0; i<=n; i++ ){
    //   sum = sum + i;
    // }
    // System.out.println(sum);


    // System.out.println("Enter any Number");
    // int n  = sc.nextInt();
    // for(int i=1; i<=10; i++){
    //   System.out.println(n * i);
    // }

    // int n = 5;
    // for(int i = 1; i<=n; i++){
    //   for(int j=1; j<=n-i; j++){
    //     System.out.print(" ");
    //   }
    //   int star = 2 * i-1;
    //   for(int j=1; j<=star; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // for(int i = n; i>=1; i--){
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
    // for(int i = 1; i<=n; i++){
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



    // int n = 5;
    // for(int i = 1; i<=n; i++){
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
    //   for(int j=1; j<=n; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   int spaces  = 2*(n-i);
    //   for(int j =1; j<=spaces; j++){
    //     System.out.print(" ");
    //   }
    // for(int j =1; j<=i; j++){
    //   System.out.print("*");
    // }
    // System.out.println();
    // }
    // for(int i=n; i>=1; i--){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   int spaces  = 2* (n-i);
    //   for(int j =1; j<=spaces; j++){
    //     System.out.print(" ");
    //   }
    // for(int j =1; j<=i; j++){
    //   System.out.print("*");
    // }
    // System.out.println();
    // }


    

    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     if((i+j) % 2 == 0){
    //       System.out.print(1+ " ");
    //     }else{
    //       System.out.print(0+" ");
    //     }
    //   }
     
    //   System.out.println();
    // }


    // int n = 4;
    // int number = 1;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print(number++);
    //   }
     
    //   System.out.println();
    // }

    // int n = 4;
    // for(int i=n; i>=1; i--){
    //   for(int j=1; j<=i; j++){
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
    // for(int i=n; i>=1; i--){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }


    // int n = 4;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }




    // int n = 4;
    // int m = 5;
    // for(int i =1; i<=n; i++){
    //   for(int j=1; j<=m; j++){
    //     if(i == 1 || j == 1 || i == n || j == m ){
    //       System.out.print("*");
    //     }else
    //     System.out.print(" ");
    //   }
    //   System.out.println();
    // }




    // int n = 4;
    // int m = 5;
    // for(int i=1; i<=n; i++){
    //   for(int j=1; j<=m ; j++){
    //     System.out.print("*");

    //   }
    //   System.out.println();
    // }




    // int  arr[] = {1,0,2,0,3,0};
    // int length = arr.length;
    // for(int i=0; i<length; i++){
    //   if(arr[i] == 0){
    //     for(int j=i+1; j<length; j++){
    //       if(arr[j] != 0){
    //         int temp = arr[i];
    //         arr[i] = arr[j];
    //         arr[j] = temp;
    //         break;
    //       }

    //     }
    //   }
    // }
    // for(int  i =0; i<length; i++){

    //   System.out.print(arr[i] + " ");
    // }


    // String str = "Mohammad Suhail";
    // str = str.replace("a", "");
    // System.out.println(str);




    // DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss");
    // Date date = new Date();
    // System.out.println(dateFormat.format(date));


    // int arr[] = {23,43,534,54};
    // int length = arr.length;
    // for(int i=0; i<length; i++){
    //   for(int j=i+1; j<length; j++){
    //     if(arr[i] > arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }
    // System.out.println("Secound last array " + arr[length-2]);




    // int arr[] = {1,2,3,4,5};
    // int length = arr.length;
    // int sum  = 0;
    // for(int i=0; i<length; i++){
    //   sum = sum + arr[i];
    // }
    // System.out.println("sum all array : " + sum);


    // int fact = 1;
    // int number = 5;
    // for(int i =1; i<=number; i++){
    //   fact = fact * i;
    // }
    // System.out.println("this factorial Number : " + number + " at its value" + fact);

    // int  arr[] = {78,22,563};
    // int length = arr.length;
    // for(int i=0; i<length; i++){
    //   for(int j= i+1; j<length; j++){
    //     if(arr[i] > arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // }
    // for(int i =0; i<length; i++){
    //   System.out.print(arr[i] + " ");
    // }


    // String  str = "   Mohammad     suhai     An   sa  ri";
    // str = str.replaceAll("\\s", "");
    // System.out.println(str);



    // System.out.println("Enter any number");
    // int n  = sc.nextInt();
    // int reverse = 0;
    // int temp = n;
    // while(n != 0){
    //   reverse = reverse * 10 + n % 10;
    //   n = n /10;
    // }
    // if(temp == reverse){
    //   System.out.println("this is palindrome " + reverse);
    // }else{
    //   System.out.println("this is not palindrome " + reverse);

    // }


    // System.out.println("Enter any Number ");
    // int n = sc.nextInt();
    // int count = 0;

    // for(int i=0; i<=n; i++){
    //   if(i % 2 == 0){
    //     count++;
    //   }
    // }
    // if(count == 2){
    //   System.out.println("this is prime Number : " + n);
    // }else{
    //   System.out.println("this is not prime Number : " + n);

    // }

    // String str = "Mohammad Suhail";
    // int length = str.length();
    // for(int i =0; i<length; i++){
    //   if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
    //     System.out.println("String Contains vowel : " + str.charAt(i) + " at Index : " + i);
    //   }
    // }




    // int arr[] = {9,8,34,232,54};
    // int length = arr.length;
    // for(int i=0; i<length; i++){
    //   for(int j=i+1; j<length; j++){
    //     if(arr[i] > arr[j]){
    //       int temp = arr[i];
    //       arr[i] = arr[j];
    //       arr[j] = temp;
    //     }
    //   }
    // } 
    // System.out.println("this is largest array : " + arr[length-1]);
   

    // System.out.println("Enter any number");
    // int n = sc.nextInt();
    // int sum = 0;
    // for(int i=0; i<=n; i++){
    //   sum = sum + i;
    // }
    // System.out.println(sum);

    // int arr[] = {1,2,3,4,5,6,7,8,9};
    // int length = arr.length;
    // for(int i =0; i<length; i++){
    //   if(arr[i] % 2 == 0){
    //     System.out.println("this is even number : " + arr[i]);
    //   }
    // }



    

    // int arr[] = {1,2,3,4,5,6,7,8,9};
    // int length = arr.length;
    // for(int i=0; i<length; i++){
    //   if(arr[i] % 2 != 0){
    //     System.out.println("this is odd Number : " + arr[i] );
    //   }

    // }


    // for(int i=1; i<=100;i++){
    //   System.out.print(i + " ");
    // }






    // int a = 1;
    // int b = 2;
    // a = a + b;
    // b = a - b;
    // a = a - b;
    // System.out.println(a);
    // System.out.println(b);



    // int number = 12345;
    // int reverse = 0;
    // while(number != 0){
    //   reverse = reverse * 10 + number % 10;
    //   number = number /10;
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

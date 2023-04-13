import java.util.Scanner;

public class p{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array");
    int size = sc.nextInt();
    int arr[] = new int[size];

    for(int i=1; i<size; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println("which value of index given you ");
    int x = sc.nextInt();
    for(int i=0; i<arr.length; i++){
      if(arr[i] == x){
        System.out.println("Index of arr x : " + i);
      }
    }
   
    
  }
}
import java.util.Scanner;
class sum{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
    int sum=0;
    int i=1;
    while (i<=num){
      sum+=i;
      i++;
    }
   System.out.println("Sum of "+num+" natural numbers is: "+sum);
  }
}

import java.util.Scanner; 
  
public class Pkg1 { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
  
        System.out.print("Enter your name: "); 
        String name = input.nextLine(); 
  
        System.out.println("Hey " + name ); 
  
        input.close(); 
    } 
} 

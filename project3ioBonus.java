
import java.util.Scanner;
 
public class project3ioBonus{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter desired height: ");
 
        int noOfRows = sc.nextInt();
 
        int r = 1;
 
        for (int i = noOfRows; i > 0; i--)
        {
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= r; j++)
            {
                System.out.print("D ");
            }
 
            System.out.println();
 
            r++;
        }
    }
}

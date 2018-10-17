import java.util.Scanner;

public class EmailApp
{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        String response;
        do{
            System.out.print("Please enter your first name: ");
            String fname = in.nextLine();
            System.out.print("Please enter your last name: ");
            String lname = in.nextLine();
            Email em1 = new Email(fname, lname);
            
            System.out.println(em1.showInfo());
            System.out.print("Would you like to continue (y/n): ");
            response = in.nextLine();
        }while(response.charAt(0) == 'y' || response.charAt(0) == 'Y');
    }
}

import java.util.Scanner;

public class Email
{
    private String fName;
    private String lName;
    private String pwd;
    private String dept;
    private String email;
    private int mailboxCap = 500;
    private int defaultPasswordLength = 10;
    private String altEmail;
    private String compSuffix = "dxtcompany.com";
    
    //Constructor to receive the first name and last kname
    public Email(String fname, String lname)
    {
        this.fName = fname;
        this.lName = lname;
        
        //Call method asking for department - return department
        this.dept = setDept();
        
        
        //Call method that returns random password can includ eprint statement to verify
        this.pwd = randPassword(defaultPasswordLength);
        //System.out.println("Your password is " + this.pwd);
        
        //Generate email
        email = fname.toLowerCase()+ "." + lname.toLowerCase() + "@" + dept + "." + compSuffix;
    }
    
    //Ask for deptartment
    private String setDept()
    {
        System.out.print("New Worker: " + fName + "\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter depatment code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1)
            return "sales";
        else if(depChoice == 2)
            return "dev";
        else if(depChoice == 3)
            return "acct";
        else 
            return "";
    }
    
    //Generate random password
    private String randPassword(int length)
    {
        String pwdSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
        char[] password = new char[length];
        
        for(int i = 0; i < length; i++)
        {
            int rand = (int)(Math.random()* pwdSet.length());
            password[i] = pwdSet.charAt(rand);
        }
        return new String(password);
    }
    
    //Set mailbox capacity
    public void setCapacity(int capacity)
    {
        this.mailboxCap = capacity;
    }
    
    //Set alternate email
    public void setAltEmail(String altEmail)
    {
        this.altEmail = altEmail;
    }
    
    //Change password
    public void changePwd(String password)
    {
        this.pwd = password;
    }
    
    public int getCapacity()
    {
        return mailboxCap;
    }
    
    public String getAltEmail()
    {
        return altEmail;
    }
    
    public String getPassword()
    {
        return pwd;
    }
    
    public String showInfo()
    {
        return "DISPLAY NAME: " + fName + " " + lName+ "\n" +
                "COMPANY EMAIL: " + email + "\n" +
                "MAILBOX CAPACITY: " + mailboxCap + "mb";
    }
}

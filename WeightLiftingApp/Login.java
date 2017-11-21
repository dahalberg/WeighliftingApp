import java.util.Scanner;


public class Login
{
    public Login()
    {

    }
    
    public void loginDisplay()
    {
        Scanner enterName = new Scanner(System.in);
        String username;
        String name;
        
        
        System.out.println("Welcome! Please enter your username.");
        System.out.println("To create a new account, type create");
        username = enterName.next();
        if (username.toLowerCase().equals("create"))
        {
            System.out.println("HelloWorld");
        }
        else
        {
            System.out.println("Hello " + username + ".");
        }
    }
}

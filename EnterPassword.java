/* Objective: The purpose of this program is to utilize the reading of a user input
 * string as a layer of password protection.
 * 
 * Author: Sean Ortiz
 * Created: 12/19/2018
 */

import java.util.Scanner;
public class EnterPassword
{
    public static void main (String []args)
    {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter password:");
        String password;
        password = keyboard.nextLine();
        while (!password.equals("Password"))
        {
            System.out.println("Access denied. Try again.");
            password=keyboard.nextLine();
        }
        System.out.println("Access Granted!");
    }
}


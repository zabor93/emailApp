package emailApp;

import java.util.Random;
import java.util.Scanner;

public class Email {

    private String firstname;
    private String lastName;
    private String password;
    private String email;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private String companySuffix = ".company.com";

    public Email(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
//        System.out.println("EMAIL CREATED:" + this.firstname + " " + this.lastName);
        this.department = setDepartment();
//        System.out.println("DEPARTMENTS CODE EQUAL:  \n" + this.department);
        this.password = randomPassword(8);
//        System.out.println("Your password id: "+this.password);
        email = firstname.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        System.out.println("Your e-mail is:"+email);
    }

    private String setDepartment(){
        System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting \n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        }
        else if (depChoice == 2) {
            return "dev";
        }
        else if (depChoice == 3) {
            return "acct";
        }
        else {
            return "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGIJKLMNOPQRSTUQYZ01123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", mailboxCapacity=" + mailboxCapacity +
                '}';
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
}

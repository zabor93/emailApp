package emailApp;

public class EmialApp {
    public static void main(String[] args) {

        Email email1 = new Email("John", "Smith");
        email1.setMailboxCapacity(100);
        System.out.println(email1);
    }
}

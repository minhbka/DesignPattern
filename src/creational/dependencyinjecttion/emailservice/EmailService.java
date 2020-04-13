package creational.dependencyinjecttion.emailservice;

public class EmailService implements MessageService {
    public void sendMail(String message){
        System.out.println("Message: " + message);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sms message: " + message);
    }
}

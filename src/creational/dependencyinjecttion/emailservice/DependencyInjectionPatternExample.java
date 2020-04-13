package creational.dependencyinjecttion.emailservice;

import javax.management.InstanceNotFoundException;

public class DependencyInjectionPatternExample {
    public static void main(String[] args) throws InstanceNotFoundException {
        //MessageService messageService = new EmailService();
        MessageService messageService = (MessageService) Injector.getInstance("messageService") ;
        UserController userController = new UserController(messageService);
        userController.send();
    }
}

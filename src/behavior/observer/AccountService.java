package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject{

    private User user;
    private List<Observer> observers = new ArrayList<>();

    public AccountService(User user) {
        this.user = user;
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer:observers){
            observer.update(user);
        }

    }

    public void changeStatus(LoginStatus status){
        user.setStatus(status);
        System.out.println("Status is changed");
        this.notifyAllObserver();
    }

    public void login(){
        if (!this.isValidIp()){
            user.setStatus(LoginStatus.INVALID);
        }
        else if(this.isEmailValid()){
            user.setStatus(LoginStatus.SUCCESS);
        }
        else{
            user.setStatus(LoginStatus.FAILURE);
        }
        System.out.println("Login is handled");
        this.notifyAllObserver();
    }

    private boolean isValidIp() {
        return "127.0.0.1".equals(user.getIp());
    }

    private boolean isEmailValid(){
        return "minhpv@gmail.com".equalsIgnoreCase(user.getEmail());
    }
}


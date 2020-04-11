package structural.proxy.protection_proxy;

public class UserServiceProxy implements UserService {

    private UserService userService;
    private String role;

    public UserServiceProxy(String name, String role) {
        this.userService = new UserServiceImpl(name);
        this.role = role;
    }

    @Override
    public void load() {
        userService.load();
    }

    @Override
    public void insert() {
        if (isAdmin()){
            userService.insert();
        }
        else {
            throw new IllegalAccessError("Access denied");
        }
    }

    private boolean isAdmin() {
        return "admin".equalsIgnoreCase(this.role);
    }
}

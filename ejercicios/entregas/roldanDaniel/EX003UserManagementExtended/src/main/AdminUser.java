package src.main;

public class AdminUser extends User{

    private boolean isAdmin;

    public AdminUser(String login, String password, String name){

        super();
        this.isAdmin=true;

    }
}

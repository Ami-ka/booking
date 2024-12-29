public class User extends Hotel {
    private String login;
    private String password;


    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public String get_login(){
        return login;
    }
    public String get_password(){
        return password;
    }
}
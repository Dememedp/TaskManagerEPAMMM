package beans;

public class User {
    private String name;
    private Role role;
    private String login;
    private String password;

    public String getName(){
        return name;
    }

    public Role getRole(){
        return role;
    }

    public String getLogin(){ return login; }

    public String getPassword(){ return password; }

    @Override
    public String toString(){
        return "User name: " + name + ", role: " + role;
    }

    @Override
    public boolean equals(Object user){
        if (user == this){
            return true;
        }
        if (user == null || user.getClass() != this.getClass()) {
            return false;
        }
        return name.equals(((User) user).name)
                && role == ((User) user).role
                && login.equals(((User) user).login)
                && password.equals(((User) user).password);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((login == null) ? 0 : login.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        return result;
    }
    
    public User(){}

    public User(String name, Role role){
        this.name = name;
        this.role = role;
        this.login = null;
        this.password = null;
    }

    public User(String name, Role role, String login, String password){
        this.name = name;
        this.role = role;
        this.login = login;
        this.password = password;
    }
}

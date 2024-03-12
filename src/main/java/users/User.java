package users;

public class User {
    private String username;
    private String email;
    private String password;

    // CONSTRUCTOR
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }


    // GETTERS AND SETTERS
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // toString method to represent User as a string
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

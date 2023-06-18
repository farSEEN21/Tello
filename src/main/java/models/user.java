package models;

public class user {
    String email;
    String password;

    public String getPassword() {
        return password;
    }

    public user  withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public user withEmail(String email) {
        this.email = email;
        return this;
    }
}

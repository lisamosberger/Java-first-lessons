package com.example.java26.oop2.auth;

public abstract class Authenticator {
    public abstract boolean supports(String authType);
    public abstract boolean authenticate(String userName, String secret);
}

class UserNameAndPasswordAuthenticator extends Authenticator {

    @Override
    public boolean supports(String authType) {
        return authType.equalsIgnoreCase("password");
    }

    @Override
    public boolean authenticate(String userName, String secret) {
        return userName.equalsIgnoreCase("Lisa") && secret.equals("1234");
    }
}

class LoginSystem {
    static void main (){
        Authenticator auth = new UserNameAndPasswordAuthenticator();
        if (auth.supports("password")) {
            String username = IO.readln("Username: ");
            String password = IO.readln("Password: ");
            if (auth.authenticate(username, password)) {
                IO.println("Welcome " + username);
            }
            else {
                IO.println("Invalid username or password");
            }
        }
    }
}
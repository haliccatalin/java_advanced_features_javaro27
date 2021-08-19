package com.sda.inheritance;

public class Parent {
    //    private
    //    protected
    //    public
    //         - cand in fata metodei, constructorului sau properitetii nu se afla nici unul din cele de mai sus inseaman ca e default

    private String username;
    private String email;

    // constructor default
//    public Parent() {}

    public Parent(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
}

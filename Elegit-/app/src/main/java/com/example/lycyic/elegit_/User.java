package com.example.lycyic.elegit_;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Lycyic on 24/3/2017.
 */

public class User {
    public String name;
    public String surname;
    public String age;
    public String username;
    public String password;
    public String email;

    private DatabaseReference mDatabase;

//    public User() {
//        // Constructor
//    }

    public User(String name, String surname, String age, String username, String password, String email) {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void addUser() {
        //User user = new User( name,  surname,  age,  username,  password,  email);
        mDatabase.child("users").push().setValue(this);
    }
}

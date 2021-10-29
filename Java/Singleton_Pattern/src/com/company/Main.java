package com.company;

// Singleton Pattern is used when we want to make sure we have only instance of some class in our entire application

import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {
        // A case of using Singleton pattern is when you are using a database in your application

        // instantiating the database
        Database database = Database.getInstance("db_school"); // notice that because we have declared this getInstance method as static we can use the database class with the capital D
       /*
        // declaring the database class in the sense of another user
        Database newdatabase = new Database("db_participant");
        */ // This code was commented out because the access modifier of the constructor was changed fom public to private, therefore declaring the database again would give an error

        System.out.println(database.toString()); // this shows us the address of the database class
        // you can change it in your database class by overriding the two string method

        // after overriding some more information would be printed out


    }
}

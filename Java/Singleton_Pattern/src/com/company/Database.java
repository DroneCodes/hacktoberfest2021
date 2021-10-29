package com.company;

public class Database {
    private  String name;

    // to make sure you only have only one instance of the Database class, Declare another field

    private  static Database instance;

    // to create a getter method for the newly created field, the instance must be static and synchronized to stop duplicates declaration

    public static synchronized Database getInstance(String name) { // to make this method thread safe add a keyword named synchronized.
       /* if (null == instance) {
            instance = new Database(name);
            return instance;
        }else {  // incase the instance is not null
            return instance;
        }  // the if statement checks if the database is null
        */

        // a shorter way of writing the if statement above
        if (null == instance) {
            instance = new Database(name);
        }
        return instance; // this assure us if our instance is not null
    }

    // to restrict users from using your get instance method change the access modifier to private (i.e it would only be usable inside the database class)

    private Database(String name) {
        this.name = name;
    } // change the access modifier to private so the constructor would be accessible only inside this class, it restricts others from creating multiple instances of the class

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String text = "Database Claas\n" +
                "Name: " + this.name;
        return text;
    } // this prints some details about the database class
}

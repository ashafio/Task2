package shafi;        //package of my name (1)

public class Student {          //Student class(2)
    String name;         //Instance variable (3)
    int id;  //Instance variable (3)
    static String universityName="Leading University";        //Class variable (3)

    Student()          //Default constructor (4)
    {
        System.out.println("\nStudent Info: ");
    }

    public void Student(String name) {         //Parameterized constructor(4)
        this.name=name;         //this keyword (5)
    }
    public void Student(int id){          //Parameterized constructor(4)
        this.id=id;          //this keyword (5)
    }

    void display()        //method display(void) (6)
    { 
        System.out.println("Name of the university: "+universityName);
    }
}

/*
---------------------------------------
Name: Md. Abidur Rahman Shafi
ID: 2012020121
Section: C (53rd)
Email: cse_2012020121@lus.ac.bd
Date: 08 August 2021
---------------------------------------
 */
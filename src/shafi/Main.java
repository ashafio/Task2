package shafi; //package of my name (1)

public class Main{  //Main class(2)
    public static void main(String[] args) {

        //creating 3 objects (7)

        Student S1=new Student();
        S1.name="Shafi";  //object initialization (7)
        S1.id=2012020121;
        System.out.println("Name: "+ S1.name + "\nId: "+S1.id);
        S1.display();

        Student S2=new Student();
        S2.name="Yusof";
        S2.id=1001002002;
        System.out.println("Name: "+ S2.name + "\nId: "+S2.id);
        S2.display();

        Student S3=new Student();
        S3.name="Yosua";
        S3.id=1012013014;
        System.out.println("Name: "+ S3.name + "\nId: "+S3.id);
        S3.display();
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
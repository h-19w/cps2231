package ch4;

import java.util.Scanner;
public class Student {
    String name;
    int age;
    double mark1, mark2,mark3,maximum, average;
    String grade;

    public Student(String n, int i, double p, double q, double r, double m,double g, String grd){
        name = n;
        age = i;
        mark1 = p;
        mark2 = q;
        mark3 = r;
        maximum = m;
        average = g;
        grade = grd;
    }

    public Student(){
        name = "";
        age = 0;
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
        maximum = 0;
        average = 0;
        grade = "";
    }
     void accept(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter name: ");
        name = input.nextLine();
        System.out.println("enter age: ");
         age = input.nextInt();
        System.out.println("enter mark 1: ");
         mark1 = input.nextDouble();
        System.out.println("enter mark 2: ");
         mark2 = input.nextDouble();
        System.out.println("enter mark 3: ");
         mark3 = input.nextDouble();
    }
    void compute(){
        average = (mark1 + mark2 + mark3) % 3.0;

        if(mark1 < mark2 && mark3 < mark2){
            maximum = mark2;
        }
        else if (mark2< mark3 && mark1< mark3) {
            maximum = mark3;
        }
        else{
            maximum = mark1;
        }


    }
    void GradeLetter(){
        if (average >=94){
            grade = "A";
        }
        else if (average >=90){
            grade = "A-";
        }
        else if (average >=87){
            grade = "B+";
        }
        else if (average >=84){
            grade = "B";
        }
        else if (average >=80){
            grade = "B-";
        }
        else if (average >=77){
            grade = "C+";
        }
        else if (average >=70){
            grade = "C";
        }
        else if (average >=60){
            grade = "D";
        }
        else {
            grade = "F";
        }
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: "+age);
        System.out.println("Subject 1: "+mark1);
        System.out.println("Subject 2: "+mark2);
        System.out.println("Subject 3: "+mark3);
        System.out.println("Maximum grade: "+maximum);
        System.out.println("Average grade: "+average);
        System.out.println("Grade: "+grade);
    }
    public static void main(String[] args){
        Student obj = new Student();
        obj.accept();
        obj.compute();
        obj.GradeLetter();
        obj.display();

    }
}

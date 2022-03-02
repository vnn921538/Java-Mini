package javamini;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher Ram = new Teacher(1,"Ram",500);
        Teacher Aditya = new Teacher(2,"Aditys",780);
        Teacher Sunil = new Teacher(3,"Sunil",1000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Ram);
        teacherList.add(Aditya);
        teacherList.add(Sunil);


        Student Pranav = new Student(1,"Pranav",7);
        Student Rahul = new Student(2,"Rahul",9);
        Student Rohith = new Student(3,"Rabbi",4);
        Student Vivek = new Student(4, "Vivek", 8);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Pranav);
        studentList.add(Rahul);
        studentList.add(Rohith);
        studentList.add(Vivek);




        College Gitam = new College(teacherList,studentList);

        Teacher Sam = new Teacher(6,"Sam", 800);

        Gitam.addTeacher(Sam);


        Pranav.payFee(5000);
        Rahul.payFee(6000);
        Vivek.payFee(5000);
        Rohith.payFee(6000);
        System.out.println("Gitam has earned Total amount of Rs"+ Gitam.getTotalMoneyEarned());

       ;


        
       System.out.println("/n-------------------------student details-------------------------") ;
       System.out.println(Rahul);
       System.out.println(Pranav);
       System.out.println(Rohith);
       System.out.println(Vivek);


       System.out.println("/n--------------------------The Teacher details------------------------------");
       Aditya.receiveSalary(Aditya.getSalary());
       System.out.println(Aditya);
       Sunil.receiveSalary(Sunil.getSalary());
       System.out.println(Sunil);
       Ram.receiveSalary(Ram.getSalary());
       System.out.println(Ram);
       
    
    
}
}
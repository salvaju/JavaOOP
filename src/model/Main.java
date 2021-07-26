package model;

public class Main {

    public static void main(String[] args) {
        Student jc = new Student("Juan Carlos", 22, "Male", 1);
        System.out.println("Student Name: " + jc.getName());
        System.out.println("Student Age: " + jc.getAge());
        System.out.println("Student Gender: " + jc.getGender());
        System.out.println("Student ID-Number: " + jc.getIdNo());
    }

}

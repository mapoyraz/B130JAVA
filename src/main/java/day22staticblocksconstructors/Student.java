package day22staticblocksconstructors;

public class Student {

    String name;
    int age;
    int grade;
    String stId;
    String address;

    public Student(String name, int age, int grade, String stId, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stId = stId;
        this.address = address;
    }

    public Student(String name, int age, String stId) {
        this.name = name;
        this.age = age;
        this.stId = stId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", stId='" + stId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }



}

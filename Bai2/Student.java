package Bai2;


import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student>{
    public String lastName;
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String firstName;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer birthDay;
    public Integer getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public Float gpa;
    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    public Student(String lastName, String firstName, int birthDay, float gpa){
        this.lastName = lastName;
        this.firstName  = firstName;
        this.birthDay = birthDay;
        this.gpa = gpa;
    }

    public String toString(){
        return String.format("%-20s %-10s  %d   %.2f", this.getLastName(), this.getFirstName(), this.getBirthDay(), this.getGpa());
    }


    @Override
    public int compareTo(Student o) {
        int temp = this.getFirstName().compareTo(o.getFirstName());
        if(temp == 0){
            temp = this.getLastName().compareTo(o.getLastName());
        }
        return temp;
    }

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static Comparator<Student> compBybYearObj = new Comparator<Student>() {
        @Override
        public int compare(Student stu1, Student stu2){
            return stu1.getBirthDay().compareTo(stu2.getBirthDay());
        }
    };

    public static Comparator<Student> compByGpaObj = new Comparator<Student>() {
        @Override
        public int compare(Student stu1, Student stu2){
            return stu1.getGpa().compareTo(stu2.getGpa());
        }
    };

    public static Comparator<Student> compByName = new Comparator<Student>() {
        @Override
        public int compare(Student stu1, Student stu2){
            return (stu1.getFirstName()+stu1.getLastName()).compareTo(stu2.getFirstName()+stu2.getLastName());
        }
    };

    
}

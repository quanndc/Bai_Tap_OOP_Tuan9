package Bai2;

import java.util.ArrayList;
import java.util.Collections;


public class StudentList{
    ArrayList<Student> list;

    public ArrayList<Student> getList() {
        return list;
    }
    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public StudentList(){
        this.list = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.list.add(student);
    }

    public void output(){
        System.out.println(this.list.toString());
    }
    // @Override
    // public int compare(StudentList o1, StudentList o2) {
    //     // TODO Auto-generated method stub
    //     return 0;
    // }

    public void sortByBirthDay(){
        Collections.sort(this.getList(),Student.compBybYearObj);
    }

    public void sortByGpa(){
        Collections.sort(this.getList(), Student.compByGpaObj);
    }

    public void sortByName(){
        Collections.sort(this.getList(), Student.compByName);
    }

    
    public Student getMaxGpa(){
        return Collections.max(this.getList(), Student.compByGpaObj);
    }

    public Student getMinGpa(){
        return Collections.min(this.getList(), Student.compByGpaObj);
    }

    
}

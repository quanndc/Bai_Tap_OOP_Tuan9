package Bai2;


public class Program{
    public static void main(String[] args){
        StudentList list = new StudentList();
        list.addStudent(new Student("Tran", "Quan", 2003, 10));
        list.addStudent(new Student("Tran", "Binh", 2003, 4));
        list.addStudent(new Student("Tran", "An", 2003, 9));
        
        list.sortByName();
        for(int i=0;i<list.getList().size();i++){
            System.out.println(list.getList().get(i));
        }

        list.sortByGpa();
        System.out.println(list.getMaxGpa());
        System.out.println(list.getMinGpa());
        
        Integer a = 8103250400I;



    }
}
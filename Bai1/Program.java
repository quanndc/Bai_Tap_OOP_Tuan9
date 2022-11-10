package Bai1;


import java.util.TreeSet;

public class Program {
    public static void main(String[] args){
        //Instructor a = new Instructor("1", "Minh Quan", 10);
        //Instructor b = new Instructor("1", "Chuyen cac", 10);

        // ArrayList<Instructor> arr1 = new ArrayList<>();
        // arr1.add(new Instructor("1", "Minh Quan", 10));
        // arr1.add(new Instructor("2", "Ich Chuyen", 10));
        // arr1.add(new Instructor("3", "Dang Khoa", 10));
        // Instructor.printTitle();
        // for(Instructor obj : arr1){
        //     obj.printDetail();
        // }

        TreeSet<Instructor> tree1 = new TreeSet<Instructor>();
        tree1.add(new Instructor("1", "Minh Quan", 10));
        tree1.add(new Instructor("2", "Ich Chuyen", 8));
        tree1.add(new Instructor("3", "Dang Khoa", 7));

        Instructor.printTitle();
         for(Instructor obj : tree1){
            obj.printDetail();
        }
    }

}

package Bai1;

public class Instructor implements Comparable<Instructor>{
    public String code;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Float feedback;
    public Float getFeedback() {
        return feedback;
    }
    public void setFeedback(Float feedback) {
        this.feedback = feedback;
    }

    public String email;
    public String getEmail() {
        return String.format("%s@abc.com", this.code) ;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public static String course = "OOP-Java";

    public Instructor(String code, String name, float feedback){
        this.code = code;
        this.name = name;
        this.feedback = feedback;
    }

    public static void printTitle(){
        System.out.println("COURSE              NAME        CODE        FEEDBACK        EMAIL");
    }

    public String toString(){
        return String.format("%s      %s           %.1f          ", this.getName(), this.getCode(), this.getFeedback());
    }
    public void printDetail(){
        System.out.println(course + "          " + this.toString() + this.getEmail());;
    }
    @Override
    public int compareTo(Instructor obj) {
        if(this.getFeedback() > obj.getFeedback()){
            return 1;
        }
        else if(this.getFeedback() == obj.getFeedback()){
            return 0;
        }
        else{
            return -1;
        }
        //return this.feedback.compareTo(obj.feedback);
        //return 0;
    }
}

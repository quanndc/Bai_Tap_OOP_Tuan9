package Bai3;

import java.util.Comparator;
import java.util.Scanner;

public class Account {
    private Scanner input = new Scanner(System.in);
    private static long accNumberDefault = 8103000000L;

    private long accNumber;
    public long getAccNumber() {
        return accNumber;
    }

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) throws Exception {
        try{
            if(balance < 0) {
                throw new Exception("So du khong the am");
            }
            else{
                this.balance = balance;
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private String cellPhone;
    public String getCellPhone() {
        return cellPhone;
    }
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }


    public Account(){
        this.accNumber += (++accNumberDefault);
        this.name = "";
        this.balance = 0;
        this.cellPhone = "";
    }

    public Account(String name,String cellPhone, double balance) throws Exception {
        try{
            if(balance < 0) {
                throw new Exception("So du khong the am");
            }else{
                this.name = name;
                this.balance = balance;
                this.cellPhone = cellPhone;
                this.accNumber += (++accNumberDefault);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void deposit(double amount) throws Exception {
        while(true){
            try{
                if(amount <= 0) {
                    throw new Exception("So tien khong hop le");
                }else{
                    this.balance += amount;
                    break;
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    public void input(){
        System.out.println("Nhap ten: ");
        this.name = input.nextLine();
        System.out.println("Nhap so dien thoai: ");
        this.cellPhone = input.nextLine();
        do{
            System.out.println("Nhap so du: ");
            this.balance = Double.parseDouble(input.nextLine());
        }while(this.balance <=0 );
    }

    public void withdraw(double amount) throws Exception {
        while(true){
            try{
                if(amount <= 0) {
                    throw new Exception("So tien khong hop le");
                }else if(amount > this.balance){
                    throw new Exception("Tai khoan khong du tien");
                }else{
                    this.balance -= amount;
                    break;
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                break;
            }
        }
    }

    public static Comparator<Account> compareByName = new Comparator<Account>() {
        @Override
        public int compare(Account o1, Account o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Account> compareByBalance = new Comparator<Account>() {
        @Override
        public int compare(Account o1, Account o2) {
            if(o1.getBalance() < o2.getBalance()){
                return 1;
            }
            else if(o1.getBalance() > o2.getBalance()){
                return -1;
            }
            else{
                return 0;
            }
        }
    };
    
    public static void printTitle(){
        System.out.format("%-20s %-20s %-15s %-15s%n", "AccountNumber" ,"Name", "CellPhone", "Balance");
    }

    public String displayAccount() {
        return String.format("%-20d %-20s %-15s %-15.2f",getAccNumber(),this.getName(), this.getCellPhone(), this.getBalance());
    }
}

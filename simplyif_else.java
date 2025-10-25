import java.util.*;
public class simplyif_else {
    public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhạp tu ban phim: " );
        double tax = scanner.nextDouble();
        if (tax <10){
            System.out.println("Khong dong thue");}
        else if (10<=tax && tax <15){
            tax += tax*0.1;
            System.out.println("In thue " + tax);}
        else if (15 < tax && tax<= 30){
            tax += tax *0.2;
            System.out.println ("In thue: " + tax);}
        else 
            tax += tax*0.5;
            System.out.println("In thue " + tax);
        scanner.close();
        }
        }
    


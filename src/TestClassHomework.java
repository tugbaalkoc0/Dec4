import java.util.Calendar;
import java.util.Date;

public class TestClassHomework {
    public static void main(String[] args){
        Date now = new Date();

        Homework hw1 = new Homework("SENG 211 -OOP","Prepare a slide about array ve arraylist and date class",now);
        hw1.printInfo();

        Calendar cal = Calendar.getInstance();
        cal.set(2025,Calendar.DECEMBER,10,23,59);
        Date deadline =cal.getTime();
        Homework hw2 = new Homework("CENG 201 - ALGORİTHMS" ,"BST" ,deadline);
        hw2.printInfo();



    }
}

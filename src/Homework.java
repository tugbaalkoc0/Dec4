import java.util.Date;
import java.text.SimpleDateFormat;
public class Homework {
    protected String courseName;
    protected String describtion;
    protected Date dueDate;

    public Homework(String courseName,String describtion,Date dueDate){
        this.courseName = courseName;
        this.describtion = describtion;
        this.dueDate = dueDate;

    }
    public String getFormattedDueDate(){
        SimpleDateFormat sdf =new SimpleDateFormat("dd.MM.yyyy HH : mm");
        return sdf.format(dueDate);
    }
    public void printInfo(){
        System.out.println("Course  : " + courseName);
        System.out.println("Details : " + describtion);
        System.out.println("Due date : " + getFormattedDueDate());
    }
}

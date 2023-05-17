import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void enterPatchStud()
    {
        
    }

    public static void enterStudData() throws IOException
    {
        System.out.println("Enter the students data in the following order each on a new line (NAME, ID, COURSES)");
        String name,id,coursesStr;
        ArrayList<String> courses;


        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        id   = scanner.nextLine();
        coursesStr = scanner.nextLine();
        String[] coursesSplit = coursesStr.split(",\\s*");
        courses = new ArrayList<>(Arrays.asList(coursesSplit));

        Student student = new Student(name, id, courses);
        Model.storeStudent(student);

    }

    public static void mainMenu() throws IOException
    {
        System.out.println("Hello, student.");
        System.out.println("Choose the correct action:");
        System.out.println("1- Add student data\n" +
                "2- Add batch students data");

        int option =0;
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();

        switch (option)
        {
            case 1:
            {
                enterStudData();
                break;
            }
            default:
            {
                System.out.println("not implemented");
                break;
            }
        }

    }
    public static void main(String[] args) throws IOException
    {
        Model.readFilePath = "1.csv";
        mainMenu();
    }
}
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main
{
    public static void enterBatchStud() throws IOException
    {
        System.out.println("Choose the batch file to load: ");
        ArrayList<String> fileNames = Model.getFilesInPath(Model.readFolderPath);
        fileNames = (ArrayList<String>) fileNames.stream().filter(s -> s.contains("verified")).collect(Collectors.toList());
        for(String s: fileNames)
            System.out.println(s);

        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        if(!fileNames.contains(option))
        {
            System.out.println("File does not exist or not verified!");
            return;
        }
        ArrayList<Student> students =  Model.readBatch(option);
        for(Student s: students)
            Model.storeStudent(s);
        System.out.println("Done");
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
                enterBatchStud();
                break;
            }
        }

    }
    public static void main(String[] args) throws IOException
    {
        Model.writeFilePath = "/app/data/database/db.csv";
        Model.readFolderPath = "/app/data/batch/";
        mainMenu();
    }
}
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Model
{
    public static String readFilePath;
    public static String writeFilePath;
    public static void storeStudent(Student student) throws IOException
    {
        File file = new File(readFilePath);
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter br = new BufferedWriter(fr);
        br.write(String.valueOf(student));

        br.close();
        fr.close();
    }

//    public static ArrayList<Student> readPatch()
//    {
//
//    }
}

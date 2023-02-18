import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    static int lineCounter = 0;
    public static String[] readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner s = new Scanner(file);

        String[] lines = new String[1000];
        while(s.hasNextLine()) {
            String line = s.nextLine();
            lines[lineCounter] = line;
            lineCounter++;
        }
        return lines;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String filename = "input.txt";
            String[] lines = readFile(filename);
            for (int i=0;i<=lineCounter-1;i++) {
                System.out.println(lines[i]);
            }
    }
}

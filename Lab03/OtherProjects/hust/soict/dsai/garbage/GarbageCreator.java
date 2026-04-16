package Lab03.OtherProjects.hust.soict.dsai.garbage;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "C:\\Users\\Admin\\OneDrive\\Documents\\OOP_Lab\\Lab03\\OtherProjects\\hust\\soict\\dsai\\garbage\\test.exe"; 
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char)b;
            }
            endTime = System.currentTimeMillis();
            System.out.println("Processing time with +: " + (endTime - startTime) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

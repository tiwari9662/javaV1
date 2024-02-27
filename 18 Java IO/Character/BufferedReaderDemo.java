import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) 
    {
        String s;
        int i;
        try 
        {
            // BufferedReader in = new BufferedReader(new FileReader("Read.txt"));
            // BufferedReader in = new BufferedReader(System.in);//error bcz System.in is not a object of Reader
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("UNIX : type ctrl+d to exit cmd" + 
            "\nWINDOWS : Type ctrl+C to exit cmd"+ 
            "\nWINDOWS : Type ctrl+Z to exit code");
            // while ((i = in.read()) != -1)
            // System.out.print((char)i);

            while ((s = in.readLine()) != null)
                System.out.println(s);

            System.out.println("Program terminated");
            in.close();
        } catch (IOException e) 
        {
            System.out.println("Problem reading file.");
        }

    }
}

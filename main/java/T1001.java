import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.Writer;
import java.util.Scanner;
import java.util.Stack;

public class T1001 {

    public static void main(String[] args) {
        String input = " put string type device;Name device;Ip device delimiter ;";
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(input);

            while(true){
                String addDevice =sc.nextLine();
                System.out.println(addDevice);
            }
        }catch (Exception e){
            System.out.println("Не корректные данные");
        }finally {
            sc.close();

        }

    }
}
 
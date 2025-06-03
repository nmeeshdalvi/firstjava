import java.io.*;
public class Concatention {
    public static void main(String[] args) {
        String str1 = "Nmeesh";
        String str2 = "kya";
        String str3 = "bolte";
        String str4 = str1.concat(str3).concat(str2);
        String result = str1 + " " + str3 + " " +str2;
        System.out.println("Concatenated String using concat method: " + result);
        System.out.println("Concatenated String: " + str4);

    }
}
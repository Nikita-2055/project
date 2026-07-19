import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class orinak {
    public static void main(String argv[]){
        try {
            File f = new File("C:\\Users\\User\\Desktop\\test\\myfile.txt");
            if (!f.exists()) {
                f.createNewFile();
            }
            FileReader fileReader = new FileReader(f);

            BufferedReader br = new BufferedReader(fileReader);
            String str;
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\test\\myfile2.txt"));
            Pattern p = Pattern.compile("\\b([0-9]{3}[A-Z]{2}[0-9]{2}|[0-9]{2}[A-Z]{2}[0-9]{3})\\b");
            while ((str = br.readLine())!=null) {
                Matcher hamapat = p.matcher(str);
                while (hamapat.find()) {
                    String found = hamapat.group();
                    System.out.println(found);
                    bw.write(found+ "\n");
                }
            }
            br.close();
            bw.close();




        }catch(IOException e){
            System.out.println("dont have this file:");
        }
    }
}

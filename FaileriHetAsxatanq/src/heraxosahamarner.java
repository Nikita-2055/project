import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class heraxosahamarner {
    public static void main(String argv[]){
        try{
            File f = new File("C:\\Users\\User\\Desktop\\test\\text.txt");
            FileReader fr = new FileReader(f);
            String str;
            File f2 = new File("C:\\Users\\User\\Desktop\\test\\heraxosahamaner.txt");
            if(!f2.exists()){
                f2.createNewFile();
            }
            FileReader fileReader = new FileReader(f);
            BufferedReader br = new BufferedReader(fileReader);
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\test\\heraxosahamaner.txt"));

            BufferedWriter bw2 = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\test\\viva.txt"));
            BufferedWriter bw3 = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\test\\ucom.txt"));
            BufferedWriter bw4 = new BufferedWriter(new FileWriter("C:\\Users\\User\\Desktop\\test\\beeline.txt"));
            Pattern p = Pattern.compile("((\\+374|0)([0-9]{8}|[0-9]{2}(\\-|\\s)[0-9]{3}(\\-|\\s)[0-9]{3}))");
            Pattern p2 = Pattern.compile("((\\+374|0)((77|91|93|94|98)[0-9]{6}|(\\-|\\s)[0-9]{3}(\\-|\\s)[0-9]{3}))");
            Pattern p3 = Pattern.compile("((\\+374|0)((55|95|96|99|41)[0-9]{6}|(\\-|\\s)[0-9]{3}(\\-|\\s)[0-9]{3}))");
            Pattern p4 = Pattern.compile("((\\+374|0)((43|44)[0-9]{6}|(\\-|\\s)[0-9]{3}(\\-|\\s)[0-9]{3}))");

            while ((str = br.readLine())!=null){
                Matcher m = p.matcher(str);
                Matcher m2 = p2.matcher(str);
                Matcher m3 = p3.matcher(str);
                Matcher m4 = p4.matcher(str);
                while (m.find()) {
                    String found = m.group();
                    System.out.println(found);
                    bw.write(found+ "\n");
                }
                while (m2.find()){
                    String found = m2.group();
                    bw2.write(found+ "\n");
                }
                while (m3.find()){
                    String found = m3.group();
                    bw3.write(found+ "\n");
                }
                while (m4.find()){
                    String found = m4.group();
                    bw4.write(found+ "\n");
                }
            }
            bw.close();
            br.close();
            fileReader.close();
            fr.close();
            bw2.close();
            bw3.close();
            bw4.close();

        }catch(IOException e){
            System.out.println("dont have this file:");
        }
    }
}

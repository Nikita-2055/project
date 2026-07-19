import java.io.*;

public class Main {
    public static void main(String argv[]) {
        try {
            File f = new File("C:\\Users\\User\\Desktop\\test\\orinak.txt");

            if (!f.exists()) {
                f.createNewFile();
            }

            FileWriter fw = new FileWriter(f);
            for(int i=0; i<10; i++){
                fw.write("some text \n");
            }
            fw.close();

            FileReader fr = new FileReader(f);

            int c;
            while ((c = fr.read())!=-1) {
                System.out.println((char)c);
            }

            fr.close();
            FileReader fileReader = new FileReader(f);

            BufferedReader br = new BufferedReader(fileReader);

            String s;
            while ((s= br.readLine())!=null){
                System.out.println(s);
            }
            br.close();
            fileReader.close();

        }catch(IOException x){

        }
    }
}

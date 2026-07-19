import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
//import java.util.LinkedList;



public class Main {
    public static void main(String argv[]) throws InvocationTargetException, IllegalAccessException {

        LinkedList<Integer> k = new LinkedList<>();


        Person person = new Person("jora", "hanesoxlyan", 100);

        Class<?> klass = person.getClass();

        Method methodner[] = klass.getMethods();
        System.out.println("----------------");
        for(Method n : methodner){
            System.out.println(n);
        }
        System.out.println("----------------");
        for(Method  m :methodner){
            if(m.getParameterCount()==0){

                m.invoke(person);
            }else{
                Parameter parameters[] = m.getParameters();
                for(var par: parameters){
                    System.out.println("---"+par);
                }

               // m.invoke(person, 500);
            }
        }


    }

}

public class Person {
    private String name;
    private String surname;
    private int age;


    public Person(){}
    public Person(String a, String b, int c){
        this.name = a;
        this.surname = b;
        this.age = c;
    }

    public void print(){
        System.out.println("Person class:");
        System.out.print(name);
        System.out.print(" "+surname);
        System.out.print(" "+age);
        System.out.println();

    }
    public void setName(String n){
        name = n;
    }
    public void setSurname(String s){
        surname = s;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
}

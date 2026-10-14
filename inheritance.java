class parent
{
    String name;
    void display(){
        System.out.println("Name: "+name);
    }
}
class child extends parent
{
    int age;
    void display1(){
        System.out.println("Age: "+age);
    }
}
public class Main
{
    public static void main(String[]args){
    System.out.println("Student details");
    child s1 = new child();
    s1.name = "Rahul";
    s1.age = 20;
    s1.display1();
}
}
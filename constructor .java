class students
{
    int rollno;
    String name;
    String department;
    students(int rollno,String name,String department){
        this.rollno = rollno;
        this.name = name;
        this.department = department;
    }
    void display(){
        System.out.println("Rollno: "+rollno+"Name: "+name+"department: "+department);
    }
    
}
class Main
{
    public static void main(String[]args){
        System.out.println("The students details are");
        students s1 = new students(101 ,"Raju ","CSE ");
        students s2 = new students(102 ,"Ramu ","ECE ");
        students s3 = new students(103 ,"Rahul ","CSE ");
        s1.display();
        s2.display();
        s3.display();
    }
}
    

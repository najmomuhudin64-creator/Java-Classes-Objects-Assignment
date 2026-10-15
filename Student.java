public class Student {
    String id;
    String name;
    public Student(String id,String name){
        this.id=id;
        this.name=name;
    }
    public void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
    }
}
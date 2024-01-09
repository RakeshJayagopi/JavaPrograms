package Class_Object;

public class Student {
	
	    String name;
	    int age;
	    int mark;
//	    constructor
	    public Student(String name,int age, int mark){
	        System.out.println("student constructor is running");
	        this.name=name;
	        this.age=age;
	        this.mark=mark;
	    }   
	    public void display(){
	        System.out.println("Student name: "+this.name+"\nage: "+this.age+"\nmark: "+this.mark);
	    }
	    public void setProperty(String name,int age,int mark){
	        this.name=name;
	        this.age=age;
	        this.mark=mark;
	    }
	    public static void main(String[] args) {
	        Student s1=new Student("arul", 20, 450);
//	        s1.setProperty("arul", 20, 450);
	        s1.display();
	        Student s2=new Student("ajay", 20, 450);
	        s2.display();
	    }
}

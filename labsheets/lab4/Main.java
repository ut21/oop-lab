class Student{
public int id;
public String name;
Student(int id, String name)
{
this.id = id;
this.name = name;
}
}
public class Main{
public static void main (String[] args)
{
Student[] arr;
arr = new Student[4];
System.out.println("Before Initialization");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
arr[0] = new Student(234,"surya");
arr[1] = new Student(345,"ravi");
arr[2] = new Student(456,"aman");
arr[3] = new Student(567,"amit");
System.out.println("Students Details!");
for(Student stud: arr){
System.out.println(stud.id +" "+ stud.name);
}
}

}
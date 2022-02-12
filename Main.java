// public class Main{

//     public static class Node{
//         //Data
//         int data;

//         //Address
//         Node next; //Node is used as a reference variable

//         Node(){

//         }
//         Node(int n,Node neigh){
//             data = n;
//             next = neigh;
//         }
//     }

//     public static void main(String [] args){
//             int age =30;
//             Node greenNode= new Node(age,null);
//     }f
//euerjgjgjgkjerioj
// }
public class Main{

    public static class student{
        String name="nameTemp";     //----------
        int id=3333;                //default const will be called
        int batch=000;              //----------
    
    student(){
        System.out.println("const1");   //default
    }

    student(String n){
        name=n;                         //parameterized
        System.out.println("const2");
    }

    student(String n, int ID, int bat){
        name=n;
        id = ID;                         //parameterized
        batch = bat;
        System.out.println("const3");
    }

    }


 public static void main(String [] args){
    //student saksham = new student (); //saksham ek object bn gya h jisko new memory mili h
    student saksham = new student ("Saksham",7,4);
     student cr= saksham;           //cr saksham h , ye kabhi new nhi bn rha ye sirf point kr rha h saksham ko
    //  saksham.id =7;              //---------
    //  saksham.name="Saksham";     //default cons-----const 1 will be called because we are not passing the values
    //  saksham.batch= 4;           //---------

     System.out.println("Name " + saksham.name);
     System.out.println("ID " + saksham.id);
     System.out.println("Batch " + saksham.batch);
     
     System.out.println("----------------------");
     System.out.println("Name " + cr.name);
     System.out.println("ID " + cr.id);
     System.out.println("Batch " + cr.batch);
 }
}
    
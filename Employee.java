
public class Employee{
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    //default constructor
    Employee(){
        this.firstName="Vaishnavi";
        this.lastName="Khurana";
        this.age=21;
        this.designation="Software Engineer Trainee";

    }

    //parameterized constructor
    Employee(String firstName,String lastName,int age,String designation){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.designation=designation;
    }

    Employee(String fn,String ln){ //partially paramterized constructor
        this.firstName=fn;
        this.lastName=ln;
        this.age=21;
        this.designation="SDE";
    }

    //setter functions
    public void setFirstName(String fn){
        this.firstName=fn;
    }
    public void setLastNameName(String ln){
        this.lastName=ln;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }

    public void getter(){
        System.out.println("My name is "+this.firstName+" "+this.lastName+". My age is "+this.age+". My designation is "+this.designation);
    }

    //toString method
    @Override
    public String toString(){
        return firstName+" "+lastName+" "+age+" "+designation;
    }

    public static void main(String[] args){
//        Employee e1=new Employee("V","k",21,"sd"); //invocation using parametrized constructor
//
        Employee e1=new Employee();//invocation using default parameter
        e1.setFirstName("Jiya");
        e1.getter();// We can print using getter method
//        System.out.println(e1.toString());// we can print using toString method
    }

}




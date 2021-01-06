
package constructor;
public class Constructor5 
{
    int eid;        // {we can use instance variable in the class}
    String ename;
    float esalary;
    
    Constructor5(int eid,String ename,float esalary)  //local variable in parameterized bracket can use only within the constructor.
    {
        this.eid=eid;  //this keyword is to access the same power of instance variable.
        this.ename=ename;
        this.esalary=esalary;
    }
    void display()
    {
        System.out.println("EmployeeId: "+eid+", EmployeeName: "+ename+", EmployeeSalary: "+esalary);
    }
    public static void main(String[] args) 
    {
        Constructor5 cc = new Constructor5(101,"Dinesh",10000.00f);
        cc.display();
        Constructor5 cc1 = new Constructor5(102,"Vignesh",12000.09f);
        cc1.display();
        
    }
}

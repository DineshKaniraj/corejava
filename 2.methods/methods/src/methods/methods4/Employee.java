package methods.methods4;



class Employee  //another class with instance method in same package
{
    String Name;
    double Salary;
    int EmployeeId;
public void employee(String name, double salary, int employeeid)  //instance method
   {
       this.Name=name;
       this.Salary=salary;
       this.EmployeeId=employeeid;
       
       System.out.println("Name: "+name+"\n"+"EmployeeId: "+employeeid+"\n"+"Salary: "+salary);
   }
}  


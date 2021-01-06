

package variables;
public class Variables 
{
    int a=100;
    int b=200;  //Instance variables
    public static void main(String[] args) //static method
    {
        int z=10;     //Local variables
        System.out.println(z);
        Variables var = new Variables();
        System.out.println(var.a);                //static area
        System.out.println(var.b); 
       
        var.m1();    //Instance method called by an object.
    }
    
    void m1()   //Instance method
    {
        System.out.println(a);        //Instance area
        System.out.println(b); 
        //System.out.println(z);  calling local variables in other method is not possible
    }
         
}

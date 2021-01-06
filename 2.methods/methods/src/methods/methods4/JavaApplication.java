package methods.methods4;
public class JavaApplication 
{
   
   
   void print()
   {
       Employee ee = new Employee();
       ee.employee("Dinesh", 150000,10); 
       ee.employee("vignesh", 1500000,11); 
       ee.employee("logesh", 150000,12); 
       ee.employee("vinesh", 250000,13); 
   }
   
   public static void main(String[] args)
   {
      JavaApplication ja = new JavaApplication();
       ja.print();
       
               
   }
   
   
}

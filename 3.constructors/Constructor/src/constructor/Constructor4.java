package constructor;
public class Constructor4 
{
  int a=100;
  String b= "Dinesh";
  float c= 209.02f;

    public Constructor4() 
    {
        a=110;
        b="ramesh";
        c=222.33f;
    }
  
  
  
  void m1()
  {
      System.out.println("a:"+a);
      System.out.println("b:"+b);
      System.out.println("c:"+c);
  }
    public static void main(String[] args) 
    {
        Constructor4 cc = new Constructor4();
        cc.m1();
        Constructor4 cc1 = new Constructor4();
        cc1.m1();
    }
}

public class Main
{
   public static void main (String[]args)
   {
      Pila2 p1;
      String a="Programa";
      p1=new Pila2();
      char b; 
      b=Console.readChar();
      p1.meter(b);
      b=Console.readChar();
      p1.meter(b);
      b=Console.readChar();
      p1.meter(b);
      b=Console.readChar();
      p1.meter(b);
      b=Console.readChar();
      p1.meter(b); 
      
      System.out.println(p1.meter2('c'));
      
      System.out.println(p1.sacar());
      System.out.println(p1.sacar());
      System.out.println(p1.sacar());
                                
      
   }
   
}
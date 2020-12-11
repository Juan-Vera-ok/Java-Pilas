public class Main2
{
   public static void main (String[]args)
   {
      Pila3 p1;
      p1=new Pila3();
      char b; 
      char x;
      int i,N;
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
      b=Console.readChar();
      p1.meter(b);
      System.out.println(p1.elementoCima());
      
      N=Console.readInt("Ingrese N");
      p1.copiaPila(N);
      char aux;
      while(!estaVacia())
      aux=p1.sacar();
      System.out.println(aux);}
      
      
     /* for(i=0;i<N;i++)
      {
      x=p1.mostrar();
      System.out.println(x); 
      }
      
      
      
      for(i=0;i<N;i++)
      {
      x=p1.sacar();
      System.out.println(x); 
      }
      */
      
      
   }
   
}
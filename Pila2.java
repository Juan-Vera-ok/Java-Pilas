public class Pila2
{
   private final int maxPila=5;
   private char[] elementos;
   private int cima;
   
   public Pila2()
   {
      elementos=new char [maxPila];
      cima=-1;
   }
   
   public boolean estaVacia()
   {
      return (cima==-1);
   }
   public boolean estaLlena()
   {
      return (cima==maxPila-1);
   }
   public void meter(char elem)
   {
      cima++;
      elementos[cima]=elem;
   }
   public void llenar()
   {
      for(int i=0;i<maxPila;i++)
      {
         if(cima!=maxPila)
         {
         char elem=Console.readChar();
         meter(elem);
         }
         
      }
   } 
   
   public boolean meter2(char elem)
   {
      if(cima!=maxPila-1){
      meter(elem);
      return false;}
         else
            return true;
   }
   
   
   public char sacar()
   {
      char aux=elementos[cima];
      cima--;
      return aux;
   }
}
public class Pila
{
   private final int maxPila=100;
   private char[] elementos;
   private int cima;
   
   public Pila()
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
   public char sacar()
   {
      char aux=elementos[cima];
      cima--;
      return aux;
   }
}
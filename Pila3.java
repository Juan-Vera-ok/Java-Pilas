public class Pila3
{
   private final int maxPila=10;
   private char[] elementos;
   private int cima,pos;
   
   public Pila3()
   {
      elementos=new char [maxPila];
      cima=-1;
      pos=0;
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
      pos++;
      elementos[cima]=elem;
      System.out.println("Hay "+(pos)+" posiciones ocupadas");
      System.out.println("Quedan "+(maxPila-pos)+" posiciones restantes");
      
   }   
   public char sacar()
   {
      char aux=elementos[cima];
      cima--;
      pos--;
      System.out.println("Hay "+(pos)+" posiciones ocupadas");
      System.out.println("Quedan "+(maxPila-pos)+" posiciones restantes");
      return aux;
   }
   public char mostrar()
   {
      pos--;
      char aux=elementos[pos];
   
      return aux;
   }
   public void copiaPila(int N)
   {
      Pila3 elementosCopia=new Pila3();
      char aux;
      for(int i=0;i<N;i++){
      aux=sacar();
      elementosCopia.meter(aux);
      System.out.println(aux);}
      
      for(int i=0;i<N;i++){
      aux=elementosCopia.sacar();
      meter(aux);
      System.out.println(aux);}
      
      
   }
   
   
   
   public char elementoCima()
   {
      return elementos[cima];
   }
}
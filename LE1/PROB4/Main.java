class One
{
    int x;
   One(int x)
   {
       this.x=x;
   }
   }
class Two extends One{
    Two(int x)
    {
        super(x);
    }
    
}
class Main
{
    public static void main(String args[])
    {
        Two ob=new Two(5);
        System.out.println("value of two is="+ob.x);
      
    }
}
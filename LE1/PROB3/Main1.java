class Mother
{
    int x;
   static  void show()
    {
        System.out.println("Hello World");
    }
}
class Child extends Mother{
    static void show()
    {
        System.out.println("Hello JUET");
    }
    
}
class Main1
{
    public static void main(String args[])
    {
        Mother ob=new Mother();
        ob.show();
        Child ob1=new Child();
        ob1.show();
        Mother m1=new Child();
        m1.show();
    }
}
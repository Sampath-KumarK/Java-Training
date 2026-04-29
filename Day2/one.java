    //You can not create the static variable in side the methods they belongs to class
    //Similary local variable are belong to in side the method only
    //By using the class name to acsss the staticc variable but non static variable cannot be accessed by using the class name
    //But Ststic variable cannot be accessed by non static methods without creating object of the class
    //Sttic field can globally change by every object of the class but non static field can not change by every object of the class
    //Ststic varible can be acessed by only static methods
    //Non static methods are called by creating object of the class but static methods can be called without creating object of the class
    //static variable are shared by all the objects of the class and non static variable are not shared by all the objects of the class
class one{
    public static void main(String[] args) {
        System.out.println("Hello World");
        samp o = new samp();
        samp o1 = new samp();
        o.add();
        o.a=100;
        System.out.println(o.a);
        samp.b=6000000;
        o.b=70345654;
        System.out.println(samp.b);
        System.out.println(o.b);//Why we can access static variable by using object reference but it is not recommended because it may cause confusion and it may lead to error in case of inheritancem

        System.out.println("Final variable printing: "+o.f);
    }
}
class samp{
    //Final variable can be also static but it is not necessary to be static because final variable can be assigned value only once and it cannot be changed later so it does not matter whether it is static or non static
    final int f=77;//Final variable cannot be changed once it is assigned a value it like constant
    static int b=50;
    int a=20;//I am edited
    void add(){
        final int mf=999;
        System.out.println("Final variable is print inside the method: "+mf);
        int a=10;
        
        System.out.println(a);
    }
}
// class sampath{
//     Static 
// }
public class Constructor{
    public static void main(String[] args) {
        Const c = new Const();
        Const c1 = new Const("Kumar");
        Const c2 = new Const("Sampath");
        Const c3 = new Const(c);

        // System.out.println(c.name);
        // System.out.println(c.name1);

        // System.out.println(c1.name);
        // System.out.println(c1.name1);
        // System.out.println(c2.name);
        System.out.println(c3.name1);
    }
}
class Const{
    String name;
    String name1;
    Const(){
        name = "Default";
        name1="Default";
    }
    Const(String n){
        name = n;
        name1 = n;
    }
    //Copy Constructor
    Const(Const j){
        name1 = j.name;
    }
}
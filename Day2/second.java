class second{
    public static void main(String args[]){
        String name = new String("Sampath");
        //SCP is inside the Heap memory
        //Stack memory is quickest method to acess  it contains variable name 
        //Heap memory to store objects and datas
        String n="Sampath";

        System.out.println(name);
        System.out.println(n == name);
        System.out.println(name.equals(n));

    }
}
public class ArrayOutBoundEx {
    public static void main(String args[]){
        int a[] = new int [5];
        try {
            a[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("These are the value of Array: ");
        for(int i=0;i<a.length;i++){
            a[i]=i+1;
            System.out.print(" "+a[i]);
        }
    }
}

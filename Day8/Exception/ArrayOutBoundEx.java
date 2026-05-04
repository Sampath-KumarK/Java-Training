public class ArrayOutBoundEx {
    public static void main(String args[]){
        int marks[] = {85, 90, 78};
        try {
            int a = marks[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("These are the value of Array: ");
        for(int i=0;i<marks.length;i++){
            marks[i]=i+1;
            System.out.print(" "+marks[i]);
        }
    }
}
// ●	Create an array: int marks[] = {85, 90, 78};
// ●	Try to access marks[5]
// ●	Handle the exception

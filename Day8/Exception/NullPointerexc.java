class NullPointerexc{
    public static void main(String args[]){
        try {
            String name = null;
            System.err.println(name.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
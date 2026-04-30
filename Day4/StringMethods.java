class StringMethods{
    public static void main(String[] args) {
        String n = "Hello World  ";
        String a = "  Welocome to java";
        String m = " ";
        System.out.println(n.length());
        System.out.println(n.isEmpty());
        System.out.println(n.isBlank());
        System.out.println(n.equals(a));
        System.out.println(n.equalsIgnoreCase(a));
        a=a.strip();
        System.out.println(a);
        n=n.trim();
        System.out.println(n);
        System.out.println(n.repeat(10));

        System.out.println(m.contains("World"));

        System.out.println(n.charAt(0));
        System.out.println(n.indexOf("World"));

        System.out.println(n.toLowerCase());
        System.out.println(n.toUpperCase());
    }
}
public class Main {
    public static void main(String[] args) {
        NameClass nameClass = new NameClass();
        String[] strings = new String[]{"C0898G", "C89345", "A8495K", "A234234234K"};
        for (String s: strings){
            boolean is = nameClass.check(s);
            System.out.println(is);
        }
    }
}

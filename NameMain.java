public class NameMain {
    public static void main(String[] args) {
        Name n = new Name("Abi", "bailey");
        System.out.println(n.fullName());

        Name n2 = new Name("Abi", "");
        System.out.println(n2.fullName());
    }
}

package CP;

public class BaseConversion {
    public static String convertBase(String num, int toBase, int fromBase) {
        return Integer.toString(Integer.parseInt(num, fromBase), toBase);
    }
    public static void main(String[] args) {
        System.out.println(convertBase("255", 16, 10));
    }
}

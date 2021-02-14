public class AddMethod {
    public static void main(String[] args) {


        int result = add(6, 12);


        System.out.println("Das Ergebnis der Addition lautet " + result);

    }

    public static int add(int var1, int var2) {
        return var1 + var2;
    }

    public static boolean checkIfGreaterThan100(int var1, int var2) {
        if (var1 < 100 || var2 < 100) {
            return true;
        } else {
            return false;
        }

    }
}

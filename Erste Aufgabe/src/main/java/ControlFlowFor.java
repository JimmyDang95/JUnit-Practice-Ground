public class ControlFlowFor {
    public static void main(String[] args) {

    }

    public static int faculty(int var){
        int result = 1; // Result wird mit 1 deklariert
        for(int i = 1; i <= var; i++){ //erst wird die 1 als Anfangswert übergeben, da
            result = result * i;
        }
        return result;
    }
}

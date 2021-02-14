public class ControlFlowWhileFaculty {
    public static void main(String[] args) {

    }

    public static int calculateFaculty(int num){
        int i = 1;
        int result = 1;
        while (i <= num){
            result = result * i;
            i++;
        }
        return result;
    }
}

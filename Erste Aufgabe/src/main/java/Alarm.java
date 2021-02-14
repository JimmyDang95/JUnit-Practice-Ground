public class Alarm {
    public static void main(String[] args) {

    }

    public static String alarmForPersons(int person) {
        if (person > 30){
            return "Zu viele Peronen im Raum";
        } else {
            return "Maximale Personenanzahl noch nicht überschritten";
        }

    }
}

public class Alarm {
    public static void main(String[] args) {
    }

    public static String alarmForPersons(int person) {
        if (person > 30) {
            return "Zu viele Peronen im Raum";
        } else {
            return "Maximale Personenanzahl noch nicht überschritten";
        }

    }

    public static String returnSwitchAlarm(int person) {
        switch (person) {
            case 60:
                return "Zu viele Personen im Raum";
            case 30:
               return "Noch 30 Plätze";
            case 0:
                return "Noch genug massig Platz in diesem Raum";
            default:
                return "Kein gültiger Wert";
        }
    }
}
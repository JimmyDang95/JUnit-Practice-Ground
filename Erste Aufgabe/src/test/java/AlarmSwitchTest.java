import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmSwitchTest {

    @Test
    @DisplayName("Return red")

    public void returnRedForNoMorePersons(){
        //Given
        int person = 60;

        //When
        String actual;
        actual = Alarm.returnSwitchAlarm(60);

        //Then
        assertEquals("Zu viele Personen im Raum", actual);
    }

    @Test
    @DisplayName("Return yellow")

    public void returnYellowForMax30Persons(){
        int person = 30;

        //When
        String actual = Alarm.returnSwitchAlarm(30);

        //Then
        assertEquals("Noch 30 Plätze", actual);
    }

    @Test
    @DisplayName("Return green")

    public void returnGreenForMax60Persons(){
        int person = 0;

        //When
        String actual = Alarm.returnSwitchAlarm(0);

        //Then
        assertEquals("Noch genug massig Platz in diesem Raum", actual);
    }


}
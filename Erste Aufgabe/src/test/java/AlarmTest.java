import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    @DisplayName("Return that there are too much people in a room")

    public void thereAreMoreThan30Person(){
        //Given
        int personInRoomIsOver30 = 50;

        //When
        String actual = Alarm.alarmForPersons(personInRoomIsOver30);


        //Then
        assertEquals("Zu viele Peronen im Raum", actual);
    }

    @Test
    @DisplayName("Return that there is still space")

    public void thereAreUnderThan30Person(){
        //Given
        int personInRoomIsUnder30 = 25;

        //When
        String actual = Alarm.alarmForPersons(personInRoomIsUnder30);


        //Then
        assertEquals("Maximale Personenanzahl noch nicht überschritten", actual);
    }

}
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlFlowWhileFacultyTest {

    @Test
    @DisplayName("Calculate faculty of 0 with while loop")

    public void calculateFacultyOf0(){

        //Given
        int num = 0;

        //When
        int result = ControlFlowWhileFaculty.calculateFaculty(num);

        //Then
        assertEquals(1, result);
    }

}
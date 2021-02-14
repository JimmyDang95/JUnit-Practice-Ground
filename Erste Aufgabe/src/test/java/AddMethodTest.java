import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddMethodTest {

    @Test
    @DisplayName("Testing Add Method")

    public void addTwoNumbers(){

        //Given
        int var1 = 5;
        int var2 = 5;

        //When

        int actual = AddMethod.add(5,5);


        //Then
        assertEquals(10, actual);
    }

    @Test
    @DisplayName("Test if number is greater than 100")

    public void checkIfNumberIsGreaterThan100ReturnFalse(){

        //GIVEN
        int var1 = 5;
        int var2 = 5;

        //WHEN
        boolean actual = AddMethod.checkIfGreaterThan100(5,5);

        //Then
        assertEquals(false, actual);
    }
    @Test
    @DisplayName("Test if number is greater than 100 return true")

    public void checkIfNumberIsGreaterThan100ReturnTrue(){

        //GIVEN
        int var1 = 100;
        int var2 = 5;

        //WHEN
        boolean actual = AddMethod.checkIfGreaterThan100(100,5);

        //Then
        assertEquals(true, actual);
    }




}
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllFlowForTest {


    @Test
    @DisplayName("Calculate Faculty of 0")
    public void calculateFacultyOf0(){
        //Given
        int num1 = 0;

        //When
        int actual = ControllFlowFor.faculty(0);

        //Then
        assertEquals(1, actual);
    }

    @Test
    @DisplayName("Calculate Faculty of 1")
    public void calculateFacultyOf1(){
        //Given
        int num1 = 1;

        //When
        int actual = ControllFlowFor.faculty(1);

        //Then
        assertEquals(1, actual);


    }
    @Test
    @DisplayName("Calculate Faculty of 2")
    public void calculateFacultyOf2(){
        //Given
        int num1 = 2;

        //When
        int actual = ControllFlowFor.faculty(2);

        //Then
        assertEquals(2, actual);
    }
    @Test
    @DisplayName("Calculate Faculty of 3")
    public void calculateFacultyOf3(){
        //Given
        int num3 = 3;

        //When
        int actual = ControllFlowFor.faculty(num3);

        //Then
        assertEquals(6, actual);


    }

}
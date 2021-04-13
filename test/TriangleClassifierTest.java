import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("case firstSide = 2, secondSide = 2, thirdSide = 2")
    void testFirstSide2SecondSide2ThirdSide2(){
        int firstSide = 2;
        int secondSide = 2;
        int thirdSide = 2;
        String expected = TriangleClassifier.EQUILATERAL_TRIANGLE;
        String result = TriangleClassifier.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case firstSide = 2, secondSide = 2, thirdSide = 3")
    void testFirstSide2SecondSide2ThirdSide3(){
        int firstSide = 2;
        int secondSide = 2;
        int thirdSide = 3;
        String expected = TriangleClassifier.ISOSCELES_TRIANGLE;
        String result = TriangleClassifier.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case firstSide = 3, secondSide = 4, thirdSide = 5")
    void testFirstSide3SecondSide4ThirdSide5(){
        int firstSide = 3;
        int secondSide = 4;
        int thirdSide = 5;
        String expected = TriangleClassifier.NORMAL_TRIANGLE;
        String result = TriangleClassifier.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case firstSide = 8, secondSide = 2, thirdSide = 3")
    void testFirstSide8SecondSide2ThirdSide3(){
        int firstSide = 8;
        int secondSide = 2;
        int thirdSide = 3;
        String expected = TriangleClassifier.NOT_TRIANGLE;
        String result = TriangleClassifier.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case firstSide = -1, secondSide = 2, thirdSide = 1")
    void testFirstSideNegative1SecondSide2ThirdSide1(){
        int firstSide = -1;
        int secondSide = 2;
        int thirdSide = 1;
        String expected = TriangleClassifier.NOT_TRIANGLE;
        String result = TriangleClassifier.checkTriangle(firstSide,secondSide,thirdSide);
        assertEquals(expected,result);
    }
}
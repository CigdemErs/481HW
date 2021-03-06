/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hw;

import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    
    @Test
    public void testTrueInput() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,2,6,5,8));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(4,2,9,6,5,8));
        assertEquals(App.myDemoFunction(arr, 2, 9),result);
    }

    @Test
    public void testBiggerThanSize() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,2,6,5,8));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(4,2,6,5,8,9));
        assertEquals(result, App.myDemoFunction(arr, 10, 9));
    }

    @Test
    public void testValueIsChar() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,2,6,5,8));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(4,2,6,97,5,8));
        assertEquals(result, App.myDemoFunction(arr, 3, 'a'));
    }

    @Test
    public void testPlaceIsNegative() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,2,6,5,8));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(4,2,6,5,8,9));
        assertEquals(result, App.myDemoFunction(arr, -1, 9));
    }

    @Test
    public void testIfArrayIsNull() {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(9));
        assertEquals(result, App.myDemoFunction(arr, 1, 9));
    }
}

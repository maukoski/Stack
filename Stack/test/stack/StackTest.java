/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package stack;

import java.util.NoSuchElementException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author William
 */
public class StackTest {

    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack(5); // A stack of size 5 is created before each test
    }

    @Test
    public void testPush() {
        stack.push(10);
        stack.printTop(); // Expected to print 10
    }

    @Test
    public void testPop() {
        stack.push(10);
        assertEquals(10, stack.pop()); // Expected to return 10
    }

    @Test(expected = IllegalStateException.class)
    public void testPushWhenStackIsFull() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // Should throw IllegalStateException
    }

    @Test(expected = NoSuchElementException.class)
    public void testPopWhenStackIsEmpty() {
        stack.pop(); // Should throw NoSuchElementException
    }

    @Test(expected = NoSuchElementException.class)
    public void testPrintTopWhenStackIsEmpty() {
        stack.printTop(); // Should throw NoSuchElementException
    }

    @Test
    public void testPrintTop() {
        stack.push(10);
        stack.printTop(); // Expected to print 10
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidStackSize() {
        Stack invalidStack = new Stack(-5); // Should throw IllegalArgumentException
    }
}

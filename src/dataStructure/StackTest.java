package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp(){
        stack = new Stack();
    }

    @Test
    public void testThatStackIsEmpty(){
        boolean isEmpty = stack.isEmpty();
        assertTrue(isEmpty);
    }

    @Test
    public void testThatItemsCanBeAddedToStack(){
        stack.push("Jerry");
        boolean isEmpty = stack.isEmpty();
        assertFalse(isEmpty);
    }

    @Test
    public void testToRemoveTheLastElementAddedToStack(){
        stack.push("Jerry");
        stack.push("Abe");
        stack.push("Ogo");

        assertEquals("Ogo", stack.pop());
        assertEquals(2, stack.size());
    }

    @Test
    public void testToShowTheLastElementInTheStack(){
        stack.push("Jo");
        stack.push("Ade");
        stack.push("Jerry");

        assertEquals("Jerry", stack.peek());
    }

    @Test
    public void testToSearchStackElementsAndReturnItemPosition(){
        stack.push("Kay");
        stack.push("Jo");
        stack.push("Pop");
        stack.search("Kay");
        stack.search("Pop");
    }
}

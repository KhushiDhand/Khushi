import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerSetTest {
    IntegerSet testSet;

    @Before
    public void setUp() {
        testSet = new IntegerSet();
    }

    @Test
    public void insertAlreadyThere(){
        //check number is not already in the set
        assertEquals(testSet.size(), 0);
        assertFalse(testSet.contains(3));
        //insert a number
        testSet.insert(3);
        //check the number is in the set
        assertEquals(testSet.size(), 1);
    }


    @Test
    public void removeNotThere () {
        assertEquals(testSet.size(), 0);
        testSet.insert(15);
        assertEquals(testSet.size(), 1);
        testSet.remove(3);
        assertFalse(testSet.contains(3));
    }

    @Test
    public void removeAlreadyThere () {
        assertEquals(testSet.size(), 0);
        testSet.insert(3);
        assertEquals(testSet.size(), 1);
        testSet.remove(3);
        assertFalse(testSet.contains(3));
    }
}

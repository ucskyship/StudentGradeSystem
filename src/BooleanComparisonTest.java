import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooleanComparisonTest {
    @Test
    void testThatBoolean(){
        BooleanComparison eden = new BooleanComparison();
        String[] a=new String[5];
        String[] b=new String[5];

        boolean result =eden.compare(a,b);
        assertEquals(result,false);
        //assertFalse(result);
    }

}
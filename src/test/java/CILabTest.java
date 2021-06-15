import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
       CILab test = new CILab();
       test.setString("TESTING");
       assertEquals(true, test.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest2() {
        CILab test = new CILab();
        test.setString("testing");
        assertEquals(true, test.detectCapitalUse());
    }
}

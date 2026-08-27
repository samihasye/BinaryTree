import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import com.inflectra.spiratest.addons.junitextension.SpiraTestCase;
import com.inflectra.spiratest.addons.junitextension.SpiraTestConfiguration;

@SpiraTestConfiguration (
//following are REQUIRED
        url = "https://rmit.spiraservice.net/",
        login = "S4170949",
        rssToken = "{BBD86176-216E-470F-95BD-1A5A8ED6E299}",
        projectId = 1229
//following are OPTIONAL
//        releaseId = 7,
//        testSetId = 1
)

class BTTest {


    BT bt;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @BeforeEach
    public void setup() {
        this.bt = new BT();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    @SpiraTestCase(testCaseId = 46552)
    public void isEmpty(){

    }

    @Test
    public void search() {
    }

    @Test
    public void countOneNodeTreeTest() {
    }

    @Test
    public void countMultiNodesTreeTest() {
    }

    @Test
    void inorderEmptyTree() {
    }

}
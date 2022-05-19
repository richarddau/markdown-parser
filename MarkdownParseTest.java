import static org.junit.Assert.*;

import java.nio.file.Files;

import org.junit.*;

public class MarkdownParseTest {
@Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
@Test
    public void getLinkstestfiles(){
        String file = Files.readString(filePath);
        assertEquals(expected, getLinks(Files));
    } 
}


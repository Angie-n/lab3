import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class FileExampleTests {
    File fileA = new File("some-files/a.txt");
    File fileB = new File("some-files/more-files/b.txt");
    File fileC = new File("some-files/more-files/c.java");
    File fileD = new File("some-files/even-more-files/d.java");
    File fileEvenMoreA = new File("some-files/even-more-a.txt");

    @Test
        public void test() throws IOException {
            File f = new File("some-files/");
            List<File> files = new ArrayList<File>();
            files.add(fileA);
            files.add(fileB);
            files.add(fileC);
            files.add(fileD);
            files.add(fileEvenMoreA);
            assertEquals(files, FileExample.getFiles(f));
        }
    
    @Test
        public void test2() throws IOException {
            File f = new File("some-files/more-files");
            List<File> files = new ArrayList<File>();
            files.add(fileB);
            files.add(fileC);
            assertEquals(files, FileExample.getFiles(f));
        }

    @Test
        public void test3() throws IOException {
            File f = new File("some-files/a.txt");
            List<File> files = new ArrayList<File>();
            files.add(fileA);
            assertEquals(files, FileExample.getFiles(f));
        }
}

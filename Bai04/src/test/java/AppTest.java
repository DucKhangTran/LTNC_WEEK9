import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
  @Test
  // Window dung \
  // Mac/Linux dung /
  public void testWindow() {
    String path = "data" + File.separator + "input.txt";
    File file = new File(path);
    assertTrue(file.exists());
  }
}
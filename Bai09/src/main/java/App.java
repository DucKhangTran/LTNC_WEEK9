import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
  public static final Logger LOGGER = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    String name = "Huy";
    String id = "25021794";
    LOGGER.info("Name : {}" , name);
    LOGGER.info("ID : {}" , id);
  }
}

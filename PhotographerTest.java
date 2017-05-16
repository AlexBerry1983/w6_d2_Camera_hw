import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest {
    Photographer photographer;

  @Before
  public void before() {
    photographer = new Photographer();
  }  

  @Test
  public void photographerClassExists() {
    assertNotNull(photographer);
  }

  

}
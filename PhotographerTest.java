import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest {
    Photographer photographer;
    Camera camera;
    DigitalCamera digitalCamera;
    AnalogCamera analogCamera;

  @Before
  public void before() {
    photographer = new Photographer();
    camera = new Camera();
  }  

  @Test
  public void photographerClassExists() {
    assertNotNull(photographer);
  }

  @Test
  public void cameraArrayStartsEmpty() {
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canAddCamera() {
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera(camera);
    photographer.addCamera(camera);
    photographer.addCamera(camera);
    photographer.removeCamera();
    assertEquals(2, photographer.cameraCount());
  }

}
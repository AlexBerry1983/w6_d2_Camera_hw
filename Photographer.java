import java.util.*;

public class Photographer {

  private ArrayList<Cameras> cameraArray;

  public Photographer() { 
  this.cameraArray = new ArrayList<Cameras>();
  }

  public int cameraCount() {
    return cameraArray.size();
  }

  public void addCamera(Cameras camera) {
    cameraArray.add(camera);
  }

}
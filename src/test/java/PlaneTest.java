import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before

    public void before() {
        plane = new Plane("Boeing", "EasyJet", 50);

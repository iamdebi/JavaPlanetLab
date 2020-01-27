import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class PlanetTest {

   private Planet mars;

    @Before
        public void before(){
            mars = new Planet("Mars", 908973.0 );
        }
    @Test
        public void hasName(){
            assertEquals("Mars", mars.name);
        }


}


//      mars = Planet.new("Mars", 908973)
//          puts "#{mars.get_name()} is #{mars.get_size()}"
//          mars.explode()
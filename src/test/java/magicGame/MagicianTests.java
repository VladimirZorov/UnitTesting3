package magicGame;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class MagicianTests {

   private Magic magic;
   private Magician magician;
   private List<Magic> magics;

   @Before
    public void setUp() {
       this.magic = new Magic("Gogo", 10);
       this.magician = new Magician("Bobo", 5);
       this.magics = new ArrayList<>();
       Magic magic11 = new Magic("A", 1);
       Magic magic12 = new Magic("B", 2);
       Magic magic13 = new Magic("C", 3);
       magics.add(magic11);
       magics.add(magic12);
       magics.add(magic13);
   }


    @Test
    public void getName() {
       Assert.assertEquals("Gogo", magic.getName());
    }

    @Test
    public void getBullets() {
       Assert.assertEquals(10, magic.getBullets());
    }

    @Test
    public void getUsername() {
       Assert.assertEquals("Bobo", magician.getUsername());
    }

    @Test(expected = NullPointerException.class)
    public void nullUsername() {
       Magician magician1 = new Magician(null , 10);
       Assert.assertEquals(10, magician1.getHealth());
    }

    @Test
    public void getHealt() {
        Assert.assertEquals(5, magician.getHealth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void belowZeroHealth() {
       Magician magician1 = new Magician("Koko", -1);
       Assert.assertEquals(5,magician1.getHealth());
    }

    @Test(expected = NullPointerException.class)
    public void addMagic(){
       magics.add(null);
//
    }

    @Test
    public void addMagic1() {
        Magic magic14 = new Magic("D", 44);
        magics.add(magic);
        Assert.assertEquals(4, magics.size(), 0.00);
    }

}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Artwork_Test {
    Artwork StarryNight;

    @BeforeEach
    public void setUp() {StarryNight = new Artwork("StarryNight", "VanGogh", 100)}

    @Test
    public void hasName(){assertThat(StarryNight.getName())isEqualTo("StarryNight");}
@Test
    public void hasArtist(){assertThat(StarryNight.getArtist())isEqualTo("VanGogh");}

@Test
public void hasPrice(){assertThat(StarryNight.getPrice()).isEqualTo(100);}
}

@Test
    public void canSetPrice(){
    StarryNight.setPrice(100);
    assertThat(StarryNight.getPrice()).isEqualTo(100)
    }









package GuessingGame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {

    @Test
    public void shouldGenerate() {
        int sum = 0;
        int times = 1000;
        for (int i = 0; i < times; i++) {
            int secret = Model.generateRandom();
            sum += secret;
            assertTrue(Model.MIN_INT <= secret && secret <= Model.MAX_INT);
        }
        int avg = sum / times;
        int range = (Model.MAX_INT - Model.MIN_INT) / 10;
        int absAvg = (Model.MAX_INT + Model.MIN_INT) / 2;
        System.out.println(avg);
        System.out.println(absAvg);
        System.out.println(range);
        assertTrue(absAvg - range <= avg && avg <= absAvg + range);
    }

    @Test
    public void shouldCompare() {
        Model model = new Model();
        int secret = model.getSecretNumber();
        int size = 0;
        for (int i = 10; i > 0; i--) {
            model.compareGuess(secret + i);
            assertThat(model.getCurrentMax()).isEqualTo(secret + i);
            assertEquals(model.getUserHistory().size(), ++size);
        }
        for (int i = 10; i > 0; i--) {
            model.compareGuess(secret - i);
            assertThat(model.getCurrentMin()).isEqualTo(secret - i);
            assertEquals(model.getUserHistory().size(), ++size);
        }
    }

    @Test
    public void shouldSetBarriers() {
        Model model = new Model();
        for (int i = 1; i < 20; i++) {
            model.setBarriers(i, i * 5);
            assertEquals(model.getCurrentMin(), i);
            assertEquals(model.getCurrentMax(), i* 5);
        }
    }
}

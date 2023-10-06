import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PneuTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Pneu pneu = new Pneu(170, 70, new Aro(13, "Liga"));

        Pneu pneuClone = pneu.clone();
        pneuClone.setLargura(175);
        pneuClone.setAltura(75);
        pneuClone.getAro().setTamanho(14);

        assertEquals("Pneu{largura=170, altura=70, aro=Aro{tamanho=13, tipo='Liga'}}", pneu.toString());
        assertEquals("Pneu{largura=175, altura=75, aro=Aro{tamanho=14, tipo='Liga'}}", pneuClone.toString());
    }
}
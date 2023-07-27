package listeners;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import lab.projektmw.Dieta;

/**
 * Listener osblugujacy enter wcisniety przy wpisywaniu ilosci/produktu
 */
public class KlawiszeListener implements KeyListener
{
    private Dieta dieta;

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public KlawiszeListener(Dieta dieta) 
    {
        this.dieta = dieta;
    }
    @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) 
            {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    getDieta().getWyslij().doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
}
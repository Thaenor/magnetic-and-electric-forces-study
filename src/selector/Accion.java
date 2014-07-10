package selector;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Accion
  implements ActionListener
{
  SelectorApplet applet;

  public Accion(SelectorApplet applet)
  {
    this.applet = applet;
  }
  public void actionPerformed(ActionEvent e) {
    String titulo = e.getActionCommand();
    if (titulo.equals("Início"))
      this.applet.btnEmpieza_actionPerformed(e);
    /*else if (titulo.equals("Passo"))
      this.applet.btnPaso_actionPerformed(e);*/
    else
      this.applet.btnPausa_actionPerformed(e);
  }
}
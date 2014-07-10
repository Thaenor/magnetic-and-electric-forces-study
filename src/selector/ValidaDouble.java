package selector;

import java.awt.Component;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.EventObject;

class ValidaDouble extends FocusAdapter
{
  public void focusLost(FocusEvent ev)
  {
    TextField tEntrada = (TextField)ev.getSource();
    try {
      Double.valueOf(tEntrada.getText()).doubleValue();
    } catch (NumberFormatException e) {
      tEntrada.requestFocus();
      tEntrada.selectAll();
    }
  }
}
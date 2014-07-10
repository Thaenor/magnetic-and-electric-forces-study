package selector;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.AdjustmentEvent;

public class SelectorApplet extends Panel
{
Panel bevelPanel1 = new Panel();
  Panel bevelPanel2 = new Panel();
  Panel bevelPanel3 = new Panel();
  Panel bevelPanel4 = new Panel();
  Panel bevelPanel5 = new Panel();
  Panel bevelPanel6 = new Panel();
  Label label1 = new Label();
  TextField textElectrico = new TextField();
  Scrollbar sbElectrico = new Scrollbar();
  Label label2 = new Label();
  TextField textMagnetico = new TextField();
  Scrollbar sbMagnetico = new Scrollbar();
  Button btnEmpieza = new Button();
  Button btnPausa = new Button();
  //Button btnPaso = new Button();
  FlowLayout flowLayout2 = new FlowLayout();
  BorderLayout borderLayout1 = new BorderLayout();
  FlowLayout flowLayout3 = new FlowLayout();
  BorderLayout borderLayout2 = new BorderLayout();
  Panel bevelPanel8 = new Panel();
  Label label3 = new Label();
  Choice chCarga = new Choice();
  Label label4 = new Label();
  Choice chMasa = new Choice();
  FlowLayout flowLayout1 = new FlowLayout();
  Panel bevelPanel9 = new Panel();
  Panel bevelPanel10 = new Panel();
  Panel bevelPanel11 = new Panel();
  Label label5 = new Label();
  TextField textVelocidad = new TextField();
  Scrollbar sbVelocidad = new Scrollbar();
  FlowLayout flowLayout5 = new FlowLayout();
  BorderLayout borderLayout3 = new BorderLayout();
  BorderLayout borderLayout6 = new BorderLayout();
  MiCanvas canvas;
  Hilo hilo;
  boolean bPausa = true;
  Panel bevelPanel12 = new Panel();
  FlowLayout flowLayout4 = new FlowLayout();
  BorderLayout borderLayout4 = new BorderLayout();
  BorderLayout borderLayout5 = new BorderLayout();
  BorderLayout borderLayout7 = new BorderLayout();

  public static void Gerar_grafico () {
  Frame f = new Frame();
    f.addWindowListener(new java.awt.event.WindowAdapter() {
  
        public void windowClosing(java.awt.event.WindowEvent e) {
        System.exit(0);
        };
    });
  SelectorApplet sel = new SelectorApplet();
  sel.setSize(640,400); // same size as defined in the HTML APPLET
  f.add(sel);
  f.pack();
  sel.init();
  f.setSize(650,410); // add 20, seems enough for the Frame title,
  f.show();
  }
  
  public void init()
  {
    try {
      jbInit();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void jbInit() throws Exception {
    int ancho = 640;
    int alto = 400;
    setSize(new Dimension(ancho, alto));
    this.canvas = new MiCanvas(this);
    this.hilo = new Hilo(this);
    this.bevelPanel1.setBackground(Color.lightGray);
    this.bevelPanel1.setLayout(this.borderLayout5);
    this.bevelPanel2.setLayout(this.borderLayout2);
    this.bevelPanel5.setLayout(this.flowLayout3);
    this.bevelPanel3.setLayout(this.borderLayout1);
    this.bevelPanel6.setLayout(this.flowLayout2);
    this.bevelPanel4.setLayout(this.flowLayout4);
    this.bevelPanel4.setBackground(Color.gray);
    this.label1.setText("C. eléctrico (N/C)");
    this.bevelPanel9.setLayout(this.borderLayout6);
    this.bevelPanel10.setLayout(this.borderLayout3);
    this.bevelPanel11.setLayout(this.flowLayout5);
    this.label5.setText("Velocidad(*1.0e5)m/s");
    this.textVelocidad.setText("2.0");
    this.textVelocidad.setColumns(3);
    this.sbVelocidad.setValue(18);
    this.sbVelocidad.setOrientation(0);
    this.flowLayout5.setAlignment(2);
    this.flowLayout5.setVgap(1);
    this.bevelPanel12.setLayout(this.borderLayout4);
    this.flowLayout4.setVgap(25);
    this.chCarga.add("+1");
    this.chCarga.add("-1");
    this.chCarga.add("+2");
    this.chCarga.add("-2");
    this.chCarga.add("+3");
    this.chCarga.add("-3");
    this.chCarga.select(0);
    for (int i = 1; i < 5; i++) {
      this.chMasa.add(String.valueOf(i));
    }
    this.chMasa.select(0);
    Accion accion = new Accion(this);
    this.btnEmpieza.addActionListener(accion);
    //this.btnPaso.addActionListener(accion);
    this.btnPausa.addActionListener(accion);
    Barra barra = new Barra(this);
    this.sbElectrico.addAdjustmentListener(barra);
    this.sbMagnetico.addAdjustmentListener(barra);
    this.sbVelocidad.addAdjustmentListener(barra);

    ValidaDouble valDouble = new ValidaDouble();
    this.textElectrico.addFocusListener(valDouble);
    this.textMagnetico.addFocusListener(valDouble);
    this.textVelocidad.addFocusListener(valDouble);

    this.textElectrico.setText("2000");
    this.textElectrico.setColumns(4);
    this.sbElectrico.setValue(75);
    this.sbElectrico.setMaximum(110);
    this.sbElectrico.setOrientation(0);
    this.label2.setText("C. magnético (gauss)");
    this.textMagnetico.setText("0");
    this.textMagnetico.setColumns(4);
    this.sbMagnetico.setValue(50);
    this.sbMagnetico.setOrientation(0);
    this.btnEmpieza.setLabel("Início");
    this.btnPausa.setLabel("  Pausa  ");
    //this.btnPaso.setLabel("Passo");
    this.flowLayout2.setAlignment(2);
    this.flowLayout2.setVgap(1);
    this.flowLayout3.setAlignment(2);
    this.flowLayout3.setVgap(1);
    this.bevelPanel8.setLayout(this.flowLayout1);
    this.label3.setText("Carga");
    this.label4.setText("Masa (uma)");
    this.flowLayout1.setVgap(1);
    setLayout(this.borderLayout7);
    add(this.bevelPanel1, "South");
    add(this.canvas, "Center");
    this.bevelPanel1.add(this.bevelPanel4, "East");
    this.bevelPanel4.add(this.btnEmpieza, null);
    this.bevelPanel4.add(this.btnPausa, null);
    //this.bevelPanel4.add(this.btnPaso, null);
    this.bevelPanel1.add(this.bevelPanel9, "West");
    this.bevelPanel9.add(this.bevelPanel2, "South");
    this.bevelPanel2.add(this.bevelPanel5, "Center");
    this.bevelPanel5.add(this.label1, null);
    this.bevelPanel5.add(this.textElectrico, null);
    this.bevelPanel2.add(this.sbElectrico, "South");
    this.bevelPanel9.add(this.bevelPanel3, "Center");
    this.bevelPanel3.add(this.bevelPanel6, "West");
    this.bevelPanel6.add(this.label2, null);
    this.bevelPanel6.add(this.textMagnetico, null);
    this.bevelPanel3.add(this.sbMagnetico, "South");
    this.bevelPanel1.add(this.bevelPanel12, "Center");
    this.bevelPanel12.add(this.bevelPanel8, "South");
    this.bevelPanel8.add(this.label3, null);
    this.bevelPanel8.add(this.chCarga, null);
    this.bevelPanel8.add(this.label4, null);
    this.bevelPanel8.add(this.chMasa, null);
    this.bevelPanel12.add(this.bevelPanel10, "Center");
    this.bevelPanel10.add(this.sbVelocidad, "South");
    this.bevelPanel10.add(this.bevelPanel11, "Center");
    this.bevelPanel11.add(this.label5, null);
    this.bevelPanel11.add(this.textVelocidad, null);
    this.btnPausa.setEnabled(false);
    //this.btnPaso.setEnabled(false);
    this.hilo.start();
    this.setVisible(true);
  }

  void btnEmpieza_actionPerformed(ActionEvent e)
  {
    this.btnPausa.setEnabled(true);
    //this.btnPaso.setEnabled(true);
    this.btnPausa.setLabel("  Pausa  ");
    this.bPausa = true;
    double elec = Double.valueOf(this.textElectrico.getText()).doubleValue();
    double magnetico = Double.valueOf(this.textMagnetico.getText()).doubleValue();
    double velocidad = Double.valueOf(this.textVelocidad.getText()).doubleValue();
    int carga = this.chCarga.getSelectedIndex() / 2 + 1;
    if (this.chCarga.getSelectedIndex() % 2 == 1) {
      carga = -carga;
    }
    int masa = this.chMasa.getSelectedIndex() + 1;
    this.canvas.setNuevo(elec, magnetico, velocidad, carga, masa);
    this.hilo.putMsg(2);
  }

  void btnPausa_actionPerformed(ActionEvent e) {
    if (this.bPausa == true) {
      this.hilo.putMsg(0);
      this.btnPausa.setLabel("Continua");
      this.bPausa = false;
    } else {
      this.btnPausa.setLabel("  Pausa  ");
      this.hilo.putMsg(2);
      this.bPausa = true;
    }
  }

  /*void btnPaso_actionPerformed(ActionEvent e) {
    this.hilo.putMsg(1);
    this.btnPausa.setLabel("Continua");
    this.bPausa = false;
  }*/
  void sbElectrico_adjustmentValueChanged(AdjustmentEvent e) {
    int valor = -4000 + this.sbElectrico.getValue() * 80;
    this.textElectrico.setText(String.valueOf(valor));
  }
  void sbMagnetico_adjustmentValueChanged(AdjustmentEvent e) {
    int valor = -4000 + this.sbMagnetico.getValue() * 80;
    this.textMagnetico.setText(String.valueOf(valor));
  }
  void sbVelocidad_adjustmentValueChanged(AdjustmentEvent e) {
    double valor = 1.0D + 5.0D * this.sbVelocidad.getValue() / 90;
    this.textVelocidad.setText(String.valueOf(Math.round(valor * 100) / 100));
  }

  public String getAppletInfo()
  {
    return " ";
  }
}
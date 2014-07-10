package selector;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;

public class MiCanvas extends Canvas
{
  SelectorApplet parent;
  int wAncho;
  int wAlto;
  int cAlto;
  int cAncho;
  int orgX;
  int orgY;
  double escalaX;
  double escalaY;
  double electrico;
  double magnetico;
  double carga = 1.6E-019D;
  double masa = 1.67E-027D;
  double v0;
  double x;
  double y;
  double t;
  Polygon puntos = new Polygon();
  Image imag;
  Graphics gBuffer;
  Dimension dim;

  public MiCanvas(SelectorApplet p)
  {
    this.parent = p;
    setBackground(Color.white);
    this.v0 = ((1.0D + 5.0D * Math.random()) * 100000.0D);
  }
  void origenEscalas(Graphics g) {
    this.wAncho = getSize().width;
    this.wAlto = getSize().height;

    this.cAlto = g.getFontMetrics().getHeight();
    this.cAncho = g.getFontMetrics().stringWidth("0");

    this.orgX = (2 * this.cAlto);
    this.orgY = (this.wAlto / 2);
    this.escalaY = ((this.wAlto / 2 - this.cAlto) / 0.05D);
    this.escalaX = ((this.wAncho - this.orgX - 2 * this.cAncho) / 0.25D);
  }
  void setNuevo(double elec, double magnet, double velocidad, int q, int m) {
    this.electrico = elec;
    this.magnetico = (magnet / 10000);
    this.carga = (q * 1.6E-019D);
    this.masa = (m * 1.67E-027D);
    this.v0 = (velocidad * 100000.0D);
    this.t = 0.0D;

    this.puntos.npoints = 0;
  }

  void mover() {
    this.t += 5.E-009D;
    if (this.magnetico == 0.0D) {
      this.x = (this.v0 * this.t);
      this.y = (this.carga * this.electrico * this.t * this.t / (2 * this.masa));
    } else {
      double frec = this.carga * this.magnetico / this.masa;
      this.y = (-(this.electrico / this.magnetico + this.v0) * (Math.cos(frec * this.t) - 1) / frec);
      this.x = (-this.electrico * this.t / this.magnetico + (this.electrico / this.magnetico + this.v0) * Math.sin(frec * this.t) / frec);
    }
    if ((this.x > 0.25D) || (this.y < -0.05D) || (this.y > 0.05D)) {
      this.parent.hilo.putMsg(0);
    }
    repaint();
  }
  void dispositivo(Graphics g) {
    int y1 = (int)(0.05D * this.escalaY);
    if (this.magnetico < 0.0D) {
      g.setColor(Color.pink);
      g.fillRect(this.orgX, this.orgY - y1, this.wAncho - 2 * this.cAncho - this.orgX, 2 * y1);
      dibujaFlecha(g, 3.926990816987241D, 2 * this.cAlto, this.orgX + 2 * this.cAlto, this.orgY - 3 * this.cAlto, Color.blue);
    } else if (this.magnetico > 0.0D) {
      g.setColor(Color.cyan);
      g.fillRect(this.orgX, this.orgY - y1, this.wAncho - 2 * this.cAncho - this.orgX, 2 * y1);
      dibujaFlecha(g, 0.7853981633974483D, 2 * this.cAlto, this.orgX + 2 * this.cAlto, this.orgY - 3 * this.cAlto, Color.blue);
    }

    if (this.electrico > 0.0D) {
      g.setColor(Color.blue);
      g.fillRect(this.orgX, this.orgY - y1 - this.cAncho, this.wAncho - 2 * this.cAncho - this.orgX, this.cAncho);
      g.setColor(Color.red);
      g.fillRect(this.orgX, this.orgY + y1, this.wAncho - 2 * this.cAncho - this.orgX, this.cAncho);
      dibujaFlecha(g, 1.570796326794897D, 2 * this.cAlto, this.orgX + 2 * this.cAlto, this.orgY - 3 * this.cAlto, Color.red);
    }
    else if (this.electrico < 0.0D) {
      g.setColor(Color.red);
      g.fillRect(this.orgX, this.orgY - y1 - this.cAncho, this.wAncho - 2 * this.cAncho - this.orgX, this.cAncho);
      g.setColor(Color.blue);
      g.fillRect(this.orgX, this.orgY + y1, this.wAncho - 2 * this.cAncho - this.orgX, this.cAncho);
      dibujaFlecha(g, -1.570796326794897D, 2 * this.cAlto, this.orgX + 2 * this.cAlto, this.orgY - 3 * this.cAlto, Color.red);
    } else {
      g.setColor(Color.gray);
      g.fillRect(this.orgX, this.orgY - y1 - this.cAncho, this.wAncho - 2 * this.cAncho - this.orgX, this.cAncho);
      g.fillRect(this.orgX, this.orgY + y1, this.wAncho - 2 * this.cAncho - this.orgX, this.cAncho);
    }
    g.setColor(Color.gray);
    g.fillOval(0, this.orgY - this.cAncho, 2 * this.cAncho, 2 * this.cAncho);
    g.setColor(Color.black);
    dibujaFlecha(g, 0.0D, 2 * this.cAlto, this.orgX + 2 * this.cAlto, this.orgY - 3 * this.cAlto, Color.black);

    g.drawLine(this.orgX, 0, this.orgX, this.wAlto);
    for (int i = -5; i <= 5; i++) {
      y1 = this.orgY - (int)(i * this.escalaY / 100);
      g.drawLine(this.orgX, y1, this.orgX - this.cAncho, y1);
      String texto = String.valueOf(i);
      g.drawString(texto, this.orgX - this.cAncho - g.getFontMetrics().stringWidth(texto), y1 + this.cAlto / 4);
    }

    g.drawString("X", this.wAncho - this.cAncho, this.orgY - this.cAncho / 2);
    g.drawLine(2 * this.cAncho, this.orgY, this.wAncho, this.orgY);
    for (int i = 0; i <= 25; i += 5) {
      int x1 = this.orgX + (int)(i * this.escalaX / 100);
      g.drawLine(x1, this.orgY + this.cAncho, x1, this.orgY);
      String texto = String.valueOf(i);
      if (i != 0) g.drawString(texto, x1 - g.getFontMetrics().stringWidth(texto) / 2, this.orgY + this.cAncho + this.cAlto);
      if (i == 50) break;
      for (int j = 1; j < 5; j++) {
        x1 = this.orgX + (int)((i + j) * this.escalaX / 100);
        g.drawLine(x1, this.orgY + this.cAncho / 2, x1, this.orgY);
      }
    }
    trayectoria(g);
  }

  void dibujaFlecha(Graphics g, double fi, int lon, int x1, int y1, Color c)
  {
    int cap = g.getFontMetrics().getHeight() / 2;
    int x2 = x1 + (int)(lon * Math.cos(fi));
    int y2 = y1 - (int)(lon * Math.sin(fi));
    g.setColor(c);
    g.drawLine(x1, y1, x2, y2);
    int x3 = x2 - (int)(cap * Math.cos(fi - 0.5235987755982988D));
    int y3 = y2 + (int)(cap * Math.sin(fi - 0.5235987755982988D));
    g.drawLine(x2, y2, x3, y3);
    x3 = x2 - (int)(cap * Math.sin(-fi + 1.047197551196598D));
    y3 = y2 + (int)(cap * Math.cos(-fi + 1.047197551196598D));
    g.drawLine(x2, y2, x3, y3);
  }

  void trayectoria(Graphics g) {
    int y1 = this.orgY - (int)(this.escalaY * 0.05D);
    String texto = String.valueOf(Math.round(this.t * 1000000000.0D));
    g.drawString(String.valueOf(String.valueOf("t(s): ").concat(String.valueOf(texto))).concat(String.valueOf("e-9")), this.orgX + this.cAncho, y1 + this.cAlto);
    texto = String.valueOf(Math.round(this.x * 10000) / 100);
    g.drawString(String.valueOf("x(cm):").concat(String.valueOf(texto)), this.orgX + this.cAncho, y1 + 2 * this.cAlto);
    texto = String.valueOf(Math.round(this.y * 10000) / 100);
    g.drawString(String.valueOf("y(cm):").concat(String.valueOf(texto)), this.orgX + this.cAncho, y1 + 3 * this.cAlto);

    int x1 = this.orgX + (int)(this.x * this.escalaX);
    y1 = this.orgY - (int)(this.y * this.escalaY);
    g.setColor(Color.red);
    g.fillOval(x1 - 2, y1 - 2, 4, 4);
    this.puntos.addPoint(x1, y1);
    g.drawPolyline(this.puntos.xpoints, this.puntos.ypoints, this.puntos.npoints);
  }

  public void paint(Graphics g)
  {
    origenEscalas(g);
    update(g);
  }
  public void update(Graphics g) {
    Dimension d = getSize();
    if ((this.gBuffer == null) || (d.width != this.dim.width) || (d.height != this.dim.height)) {
      this.dim = d;
      this.imag = createImage(d.width, d.height);
      this.gBuffer = this.imag.getGraphics();
    }
    this.gBuffer.setColor(getBackground());
    this.gBuffer.fillRect(0, 0, d.width, d.height);
    this.gBuffer.setColor(Color.black);
    dispositivo(this.gBuffer);

    g.drawImage(this.imag, 0, 0, null);
  }
}
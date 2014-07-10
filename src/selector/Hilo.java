package selector;

public class Hilo extends Thread
{
  SelectorApplet parent;
  public static final int PAUSE = 0;
  public static final int STEP = 1;
  public static final int RUN = 2;
  int msg = 0;
  boolean pause = true;

  public Hilo(SelectorApplet p) {
    this.parent = p;
  }

  public void run()
  {
    long time = System.currentTimeMillis();
    while (true) {
      int m = getMsg();
      this.parent.canvas.mover();
      if (m == 1) this.pause = true; try
      {
        Thread.sleep(Math.max(80L, time - System.currentTimeMillis()));
      } catch (InterruptedException e) {
        break;
      }
    }
  }

  public synchronized int getMsg() {
    while (this.pause == true)
      try {
        wait(1000L);
      } catch (InterruptedException localInterruptedException) {
      }
    return this.msg;
  }

  public synchronized void putMsg(int m) {
    this.msg = m;
    this.pause = (this.msg != 2);
    notify();
  }
}
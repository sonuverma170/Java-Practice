import java.applet.*;
import java.awt.*;
import java.awt.event.*;

 class mousemotionListner extends Applet implements MouseMotionListener
{
int vx,vy;
public void init()
{
    setLayout(new GridLayout(5,2));
    vx=0;
    vy=0;
    addMouseMotionListener(this);
}
public void mouseDragged(MouseEvent meve)
{
    vx=meve.getX();
    vy=meve.getY();
    repaint();
}
public void mouseMoved(MouseEvent meve)
{}
public void update(Graphics g)
{
    paint(g);
}
public void paint(Graphics g)
{
    g.fillOval(vx,vy,5,5);
}
}
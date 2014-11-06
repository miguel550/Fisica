/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import static java.lang.Math.abs;
import static java.lang.Math.atan;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class CampoElectrico2D {
    private Point2D p;
    private ArrayList<Carga> l;
    private final double K = 8.9875517873681764*pow(10,9);
    private double ex, ey;
    public CampoElectrico2D(Point2D point){
        this.p = point;
        ex = ey = 0;
        l = new ArrayList();
    }
    public CampoElectrico2D(ArrayList<Carga> cargas){
        this.l = cargas;
        ex = ey = 0;
    }
    public void addCarga(Carga c){
        l.add(c);
        Point2D g = (Point2D) c.getPoint();
        g = (Point2D) g.diference(p);
        Point2D pp = (Point2D) this.p.diference((Point2D) c.getPoint());
        double escalar = abs(c.getCarga()) / pow(g.abs(), 3);
        ex += abs(escalar * pp.getX());
        ey += abs(escalar * pp.getY());
    }
    public void deleteCarga(Carga c){
        l.remove(c);
        Point2D g = (Point2D) c.getPoint();
        g = (Point2D) g.diference(p);
        Point2D pp = (Point2D) this.p.diference((Point2D) c.getPoint());
        double escalar = abs(c.getCarga()) / pow(g.abs(), 3);
        ex -= abs(escalar * pp.getX());
        ey -= abs(escalar * pp.getY());
    }
    private void reCalculate(){
        Point2D g, pp;
        double escalar;
        ex = ey = 0.0;
        for(Carga c: l){
            g = (Point2D) c.getPoint();
            g = (Point2D) g.diference(p);
            pp = (Point2D) this.p.diference((Point2D) c.getPoint());
            escalar = abs(c.getCarga()) / pow(g.abs(), 3);
            ex += abs(escalar * pp.getX());
            ey += abs(escalar * pp.getY());
        }
    }
    public Point2D getPuntoDeCarga() {
        return p;
    }

    public void setPuntoDeCarga(Point2D p) {
        this.p = p;
        reCalculate();
    }

    public ArrayList<Carga> getList() {
        return l;
    }

    public void setList(ArrayList<Carga> l) {
        this.l = l;
    }
    
    public double getE(){
        double x = getEx(), y = getEy();
        return sqrt(x*x + y*y);
    }
    public double getAngleE(){
        return atan(getEy()/getEx()) * 180 / Math.PI;
    }
    public double getEx(){
        return K*ex;
    }
    public double getEy(){
        return K*ey;
    }
    @Override
    public String toString(){
        return null;
    }
}

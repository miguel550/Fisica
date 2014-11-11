/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class CampoElectrico3D {
    private Point3D p;
    private ArrayList<Carga> l;
    private final double K = 8.9876*pow(10,9);
    private double ex, ey, ez;
    public CampoElectrico3D(Point3D point){
        this.p = point;
        ex = ey = ez = 0;
        l = new ArrayList();
    }
        
    public CampoElectrico3D(ArrayList<Carga> cargas){
        this.l = cargas;
        ex = ey = ez = 0;
        //reCalculate();
    }
    public void addCarga(Carga c){
        Point3D g = (Point3D) c.getPoint();
        g = (Point3D) g.diference(p);
        Point3D pp = (Point3D) this.p.diference((Point3D) c.getPoint());
        double escalar = abs(c.getCarga()) / pow(g.abs(), 3);
        ex += abs(escalar * g.getX());
        ey += abs(escalar * g.getY());
        ez += abs(escalar * g.getZ());
    }
    public void deleteCarga(Carga c){
        Point3D g = (Point3D) c.getPoint();
        g = (Point3D) g.diference(p);
        Point3D pp = (Point3D) this.p.diference((Point3D) c.getPoint());
        double escalar = abs(c.getCarga()) / pow(g.abs(), 3);
        ex -= abs(escalar * g.getX());
        ey -= abs(escalar * g.getY());
        ez -= abs(escalar * g.getZ());
    }
    private void reCalculate(){
        Point3D g, pp;
        double escalar;
        ex = ey = ez = 0.0;
        for(Carga c: l){
            g = (Point3D) c.getPoint();
            g = (Point3D) g.diference(p);
            pp = (Point3D) this.p.diference((Point3D) c.getPoint());
            escalar = abs(c.getCarga()) / pow(g.abs(), 3);
            ex += escalar * pp.getX();
            ey += escalar * pp.getY();
            ez += escalar * pp.getZ();
        }
    }
    public Point3D getPuntoDeCarga() {
        return p;
    }

    public void setPuntoDeCarga(Point3D p) {
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
        double x = getEx(), y = getEy(), z = getEz();
        return sqrt(x*x + y*y + z*z);
    }
    public double getEx(){
        return K*ex;
    }
    public double getEy(){
        return K*ey;
    }
    public double getEz(){
        return K*ez;
    }
    @Override
    public String toString(){
        String endl = "\n";
        String s = "Cargas" + endl;
        for(Carga c: l) s += c.toString() + endl;
        s += endl;
        s += "Punto de carga: " + this.p.toString() +"m"+ endl;
        s += "El campo electrico en x es " +String.format("%.02E",this.getEx()) + " n/c"+endl;
        s +="El campo electrico en y es "+ String.format("%.02E",this.getEy()) + " n/c"+endl;
        s += "El campo electrico en z es "+ String.format("%.02E",this.getEz()) + " n/c"+endl;
        s += "El campo electrico neto es "+ String.format("%.02E",this.getE()) + " n/c"+endl;
        return s;
    }
}

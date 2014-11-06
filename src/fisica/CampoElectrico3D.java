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
    Point3D p;
    private final double K = 8.9876*pow(10,9);
    private double ex, ey, ez;
    public CampoElectrico3D(Point3D point){
        this.p = point;
        ex = ey = ez = 0;
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
}

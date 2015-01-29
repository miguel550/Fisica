/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import static java.lang.Math.sqrt;

/**
 *
 * @author Miguel
 */
public class Point3D extends Point{
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double abs() {
        return sqrt(x*x + y*y + z*z);
    }

    @Override
    public Point diference(Point p) {
        Point3D np = (Point3D) p, res = new Point3D(this.x - np.getX(), this.y - np.getY(), this.z - np.getZ());
        return res;
    }

    public Point3D add(Point3D p) {
        return new Point3D(this.x + p.getX(), this.y + p.getY(), this.z + p.getZ());
    }

    public Point3D multEscalar(double escalar) {
        return new Point3D (this.x*escalar, this.y*escalar, this.z*escalar);
    }
    @Override
    public String toString(){
        return "("+this.x+", "+this.y+", "+this.z+")";
    }
}

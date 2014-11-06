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
public class Point2D extends Point{

    public Point2D(double x, double y) {
        super(x,y);
    }

    public Point2D add(Point2D p){
        return new Point2D(this.x + p.getX(), this.y + p.getY());
    }
    @Override
    public double abs() {
        return sqrt(x*x + y*y);
    }

    @Override
    public Point diference(Point p) {
        Point2D np = (Point2D) p, res = new Point2D(this.x - np.getX(), this.y - np.getY());
        return res;
    }
    @Override
    public String toString(){
        return "("+this.x+", "+this.y+")";
    }
}

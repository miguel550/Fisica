/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

import static java.lang.Math.pow;

/**
 *
 * @author Miguel
 * @param <T>
 */
public class Carga<T extends Point> {
   private double carga;
   private T point;

    public Carga(double carga, T point) {
        this.carga = carga*pow(10,-6);
        this.point = point;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public T getPoint() {
        return point;
    }

    public void setPoint(T point) {
        this.point = point;
    }
}

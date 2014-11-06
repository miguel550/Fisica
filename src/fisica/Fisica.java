/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fisica;

/**
 *
 * @author Miguel
 */
public class Fisica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* CampoElectrico2D ce2d = new CampoElectrico2D(new Point2D(3, 4));
        //ce2d.addCarga(new Carga(-1, new Point2D(3.5, 0)));
        //ce2d.addCarga(new Carga(2, new Point2D(-5,0)));
        //ce2d.addCarga(new Carga(-1.5, new Point2D(0,4)));
        //ce2d.addCarga(new Carga(2, new Point2D(0, 0)));
        ce2d.addCarga(new Carga(+4, new Point2D(0, 3)));
        ce2d.addCarga(new Carga(-4, new Point2D(4, 0)));
        String format = "%s %.2f\n";
        System.out.printf(format, "El angulo del campo es", ce2d.getAngleE());
        System.out.printf(format, "El campo electrico en x es", ce2d.getEx());
        System.out.printf(format, "El campo electrico en y es", ce2d.getEy());
        System.out.printf(format, "El campo electrico neto es", ce2d.getE());
         */
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminal;

/**
 *
 * @author DELL
 */
public class Criminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Pbp obj =new Pbp();
        obj.setVisible(true);
         for(int i=0; i<=100; i++)
             try {
                 Thread.sleep(50);
                 obj.jProgressBar1.setValue(i);
                 obj.jLabel2.setText("Please Wait.....");
                 if (i==50)
                 {
                 obj.setVisible(false);
                window wd= new window();
                  wd.setVisible(true);
                 
                 }                 
             } catch (Exception e) {
             }
    
    }
    
}

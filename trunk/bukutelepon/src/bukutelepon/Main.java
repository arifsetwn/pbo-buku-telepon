/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bukutelepon;

import bukutelepon.frame.frame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author genius
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        // TODO code application logic here
        try {
// TODO code application logic here
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new frame().setVisible(true);
            } catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(null, ex, "Error",
              JOptionPane.ERROR_MESSAGE);
            } catch (InstantiationException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error",
            JOptionPane.ERROR_MESSAGE);
            } catch (IllegalAccessException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error",
            JOptionPane.ERROR_MESSAGE);
            } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error",
            JOptionPane.ERROR_MESSAGE);
            }
    }

}

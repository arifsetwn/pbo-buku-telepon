/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bukutelepon.table;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author genius
 */
   public class tablemodelbukutelepon extends AbstractTableModel {

       private List<bukutelepon> list = new ArrayList<bukutelepon>();

    public int getRowCount() {
        return list.size();
    }

    public int getColumnCount() {
        return 3;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0: return list.get(rowIndex).getNomor();
           case 1: return list.get(rowIndex).getNama();
           case 2: return list.get(rowIndex).getAlamat();
           default:return null;
         }
    }

    @Override
    public String getColumnName(int column){
        switch (column){
            case 0: return "Nomor";
            case 1: return "Nama";
            case 2: return "Alamat";
            default:return null;        }

    }

    public void add(bukutelepon BukuTelepon){
        list.add(BukuTelepon);
        fireTableRowsInserted(getRowCount(),getColumnCount());
    }

    public void delete (int i, int row){
        list.remove(i);
        fireTableRowsDeleted(i,row);
    }

    public  bukutelepon get(int row){
    return (bukutelepon) list.get(row);
    }

}

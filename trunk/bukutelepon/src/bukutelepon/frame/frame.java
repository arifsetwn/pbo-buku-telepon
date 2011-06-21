/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frame.java
 *
 * Created on Jun 20, 2011, 7:18:30 PM
 */

package bukutelepon.frame;
import bukutelepon.table.bukutelepon;
import bukutelepon.table.tablemodelbukutelepon;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author genius
 */
public class frame extends javax.swing.JFrame {
    private tablemodelbukutelepon modelbukutelepon;
    private Connection connection;
    private Statement statement;

    /** Creates new form frame */
    public frame() {
        initComponents();
          initForm();
    }


    private void OpenDB(){ //koneksi ke database
    try {
        Class.forName("com.mysql.jdbc.Driver");

        connection = DriverManager.getConnection("jdbc:mysql://localhost/db_bukutelepon","root","");
        statement = connection.createStatement();
    }
   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error",
            JOptionPane.ERROR_MESSAGE);
    }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error",
            JOptionPane.ERROR_MESSAGE);

    }}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtno = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbukutelepon = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        btntambah = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        cmbpilihan = new javax.swing.JComboBox();
        btnrefresh = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnabout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buku Telepon");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("No");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 150, -1, -1));

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 178, -1, -1));

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 198, -1, -1));
        getContentPane().add(txtno, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 150, 171, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 184, 171, -1));

        tabelbukutelepon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelbukutelepon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbukuteleponMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbukutelepon);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 52, 432, 360));
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 94, -1));

        btncari.setText("search");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane2.setViewportView(txtalamat);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 210, 171, -1));

        btnedit.setText("simpan");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setText("delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnclear.setText("clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btninsert.setText("insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btntambah.setText("tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntambah)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnedit)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnclear)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btntambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit)
                    .addComponent(btndelete)
                    .addComponent(btnclear)
                    .addComponent(btninsert))
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 80));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 370, 10));

        cmbpilihan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "nomor", "nama", "alamat" }));
        getContentPane().add(cmbpilihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        btnrefresh.setText("refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 70, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 793, 13));

        btnabout.setText("about");
        btnabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaboutActionPerformed(evt);
            }
        });
        getContentPane().add(btnabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        if (txtno.getText().equals("") && txtnama.getText().equals("") ) {
            JOptionPane.showMessageDialog(null,"field No atau Nama harus diisi");
        }else{

            insert();
            awal();}
    }//GEN-LAST:event_btninsertActionPerformed


    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        edit();
    }//GEN-LAST:event_btneditActionPerformed


    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
        delete();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void insert (){
     try{
            String sql= "INSERT INTO data (nomor,nama,alamat) VALUES ('"+txtno.getText()+"','"+txtnama.getText()+"','"+txtalamat.getText()+"')";
            statement.execute(sql);
            JOptionPane.showMessageDialog(null,"data disimpan");
            refresh();
            clearForm();

        }
        catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }


     private void edit(){
    try{
            int app,result;
            if ((app=JOptionPane.showConfirmDialog(null,"Ubah data ?" ,"Perhatian",JOptionPane.YES_NO_OPTION))==0)
                {
                    String sql= "UPDATE DATA set nama='"+txtnama.getText()+"', alamat='"+txtalamat.getText()+"' where nomor='"+txtno.getText()+"' ";
                    result = statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Data berhasil diubah");
                    refresh();
                    clearForm();

                    }

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error",JOptionPane.ERROR_MESSAGE);}
    }


    private void delete(){
    try{
            int app,result;
            if ((app=JOptionPane.showConfirmDialog(null,"hapus data?","Perhatian",JOptionPane.YES_NO_OPTION ))== 0)
            {
                String sql= "DELETE FROM data where nomor='"+txtno.getText()+"' ";
                result = statement.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Data dihapus");
                refresh();
                clearForm();
            }
        }
       catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error",JOptionPane.ERROR_MESSAGE);}
    }

    private void tabelbukuteleponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbukuteleponMouseClicked
        // TODO add your handling code here:
        txtno.setEditable(false);
        txtnama.setEditable(true);
        txtalamat.setEditable(true);
        
        tabelbukutelepon.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

            public void valueChanged(ListSelectionEvent e){
                int baris = tabelbukutelepon.getSelectedRow();
                if (baris !=-1){
                bukutelepon anggota = modelbukutelepon.get(baris);
                txtno.setText(anggota.getNomor());
                txtnama.setText(anggota.getNama());
                txtalamat.setText(anggota.getAlamat());

                  }
            }
        });

    }//GEN-LAST:event_tabelbukuteleponMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        txtno.setEditable(true);
        txtnama.setEditable(true);
        txtalamat.setEditable(true);
        btninsert.setEnabled(true);
        btntambah.setEnabled(false);
        clearForm();
    }//GEN-LAST:event_btntambahActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
         try
        {
            int row = tabelbukutelepon.getRowCount();
            for (int i = 0; i < row; i++)
            {
                modelbukutelepon.delete(0, row);
            }
            if (cmbpilihan.getSelectedItem()=="nomor")
            {
                String sql = "select * from data where nomor like '%"+txtcari.getText().trim()+"%' ";
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next())
                {

                        bukutelepon BukuTelepon = new bukutelepon();
                        BukuTelepon.setNomor(rs.getString(2));
                        BukuTelepon.setNama(rs.getString(3));
                        BukuTelepon.setAlamat(rs.getString(4));
                        modelbukutelepon.add(BukuTelepon);

                }
            }
           if (cmbpilihan.getSelectedItem()=="nama")
            {
                String sql = "select * from data where nama like '%"+txtcari.getText().trim()+"%' ";
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next())
                {
                         bukutelepon BukuTelepon = new bukutelepon();
                        BukuTelepon.setNomor(rs.getString(2));
                        BukuTelepon.setNama(rs.getString(3));
                        BukuTelepon.setAlamat(rs.getString(4));
                        modelbukutelepon.add(BukuTelepon);
                }
            }
           if (cmbpilihan.getSelectedItem()=="alamat")
            {
                String sql = "select * from data where alamat like '%"+txtcari.getText().trim()+"%' ";
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next())
                {
                    bukutelepon BukuTelepon = new bukutelepon();
                        BukuTelepon.setNomor(rs.getString(2));
                        BukuTelepon.setNama(rs.getString(3));
                        BukuTelepon.setAlamat(rs.getString(4));
                        modelbukutelepon.add(BukuTelepon);
                }
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex,"Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btncariActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        // TODO add your handling code here:
        refresh();
        awal();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaboutActionPerformed
        // TODO add your handling code here:
        new about().setVisible(true);
    }//GEN-LAST:event_btnaboutActionPerformed

    private void awal(){
        txtno.setEditable(false);
        txtnama.setEditable(false);
        txtalamat.setEditable(false);
        btninsert.setEnabled(false);
        btntambah.setEnabled(true);

    }
    private void clearForm(){
        txtno.setText("");
        txtnama.setText("");
        txtalamat.setText("");

    }

    private void refresh(){
    try{
        int row = tabelbukutelepon.getRowCount();
        for (int i=0;i<row;i++){
            modelbukutelepon.delete(0, row);
        }
        String sql="SELECT * FROM data";
        ResultSet rs=statement.executeQuery(sql);
        while (rs.next()){
                bukutelepon BukuTelepon = new bukutelepon();
                BukuTelepon.setNomor(rs.getString(2));
                BukuTelepon.setNama(rs.getString(3));
                BukuTelepon.setAlamat(rs.getString(4));
                modelbukutelepon.add(BukuTelepon);

                }
                txtno.setEditable(true);

    }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex,"Error", JOptionPane.ERROR_MESSAGE);
}


    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnabout;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox cmbpilihan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabelbukutelepon;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno;
    // End of variables declaration//GEN-END:variables

    private void initForm() {
        modelbukutelepon = new tablemodelbukutelepon();
        tabelbukutelepon.setModel(modelbukutelepon);
        setLocationRelativeTo(this);
        OpenDB();
        refresh();
        awal();
    }


}


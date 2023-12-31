/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package RegitroAlum;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Neczus PC
 */
public class RegistroAlumnos extends javax.swing.JFrame {

   DefaultTableModel modelo=new DefaultTableModel(); 
   ArrayList<Alumno> listaAlumnos=new ArrayList<Alumno>();
   
    public RegistroAlumnos() {
        initComponents();
        this.setTitle("Registro Alumnos");
        this.setSize(720, 570);
        this.setLocationRelativeTo(null);
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CARRERA");
        modelo.addColumn("GRUPO");
        modelo.addColumn("SEMESTRE");
        modelo.addColumn("PROMEDIO");
        refrescarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        cboCarreraAlumno = new javax.swing.JComboBox<>();
        cboGrupoAlumno = new javax.swing.JComboBox<>();
        cboSemestreAlumno = new javax.swing.JComboBox<>();
        spnPromedioAlumno = new javax.swing.JSpinner();
        btnBorrar = new javax.swing.JButton();
        btnAgregarAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRegistroAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRegistroAlumnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 560, 220));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Promedio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Carrera");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 60, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Grupo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 50, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Semestre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 20));
        getContentPane().add(txtNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 200, -1));

        cboCarreraAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Developer Front-End", "Developer Back-End", "Data Engineer", "Cloud Engineer ", "Data Analyst" }));
        getContentPane().add(cboCarreraAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, -1));

        cboGrupoAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "202", "303", "404", "505" }));
        getContentPane().add(cboGrupoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 110, -1));

        cboSemestreAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semestre 1", "Semestre 2", "Semestre 3", "Semestre 4", "Semestre 5 " }));
        getContentPane().add(cboSemestreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        spnPromedioAlumno.setModel(new javax.swing.SpinnerNumberModel(10.0d, 5.0d, 10.0d, 0.1d));
        getContentPane().add(spnPromedioAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 90, 30));

        btnAgregarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregarAlumno.setText("Agregar");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        try{
            
        Alumno alumno=new Alumno();
        alumno.setNombre(txtNombreAlumno.getText());
        alumno.setCarrera(cboCarreraAlumno.getSelectedItem().toString());
        alumno.setGrupo(Integer.parseInt(cboGrupoAlumno.getSelectedItem().toString()));
        alumno.setSemestre(cboSemestreAlumno.getSelectedItem().toString());
        alumno.setPromedio(Double.parseDouble(spnPromedioAlumno.getValue().toString()));
        listaAlumnos.add(alumno);
        refrescarTabla();
     } catch (Exception e){
         JOptionPane.showMessageDialog(this,"Error al agrerar alumno");
         }  
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtNombreAlumno.setText("");
        cboCarreraAlumno.setSelectedIndex(0);
        cboGrupoAlumno.setSelectedIndex(0);
        cboSemestreAlumno.setSelectedIndex(0);
        spnPromedioAlumno.setValue(10);
    }//GEN-LAST:event_btnBorrarActionPerformed

    public void  refrescarTabla(){
        //Borrar todos los elementos del modelo
        while(modelo.getRowCount()> 0){
            modelo.removeRow(0);
    }
        for(Alumno alumno : listaAlumnos){
            Object a[]=new Object[5];
            a[0]=alumno.getNombre();
            a[1]=alumno.getCarrera();
            a[2]=alumno.getGrupo();
            a[3]=alumno.getSemestre();
            a[4]=alumno.getPromedio();
            modelo.addRow(a);
        }
        
        tblRegistroAlumnos.setModel(modelo);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JComboBox<String> cboCarreraAlumno;
    private javax.swing.JComboBox<String> cboGrupoAlumno;
    private javax.swing.JComboBox<String> cboSemestreAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnPromedioAlumno;
    private javax.swing.JTable tblRegistroAlumnos;
    private javax.swing.JTextField txtNombreAlumno;
    // End of variables declaration//GEN-END:variables
}

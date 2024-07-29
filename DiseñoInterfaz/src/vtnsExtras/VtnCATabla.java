/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vtnsExtras;

import javax.swing.table.DefaultTableModel;
import poo.Alumnos;
import ventanaprincipal.VtnPrincipal;

/**
 *
 * @author nolas
 */
public class VtnCATabla extends javax.swing.JFrame
{

    DefaultTableModel modelo;

    /**
     * Creates new form VtnCATabla
     */
    public VtnCATabla()
    {
        initComponents();
        modelo = new DefaultTableModel();
        
        modelo.addColumn("Clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Sexo");
        modelo.addColumn("Desnutricion");
        modelo.addColumn("Sobrepeso");
        modelo.addColumn("Alergias");
        modelo.addColumn("Obesidad");
        modelo.addColumn("Diabetes");
        modelo.addColumn("Otras");
        modelo.addColumn("Vive con");
        modelo.addColumn("Carrera");
        
        this.tabla.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 320));
        setPreferredSize(new java.awt.Dimension(1100, 320));
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Clave", "Nombre", "Apellido Paterno", "Apellido Materno", "Sexo", "Desnutricion", "Sobrepeso", "Alergias", "Obesidad", "Diabetes", "Otros", "Vive Con", "Carrera"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 1100, 260));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("CONSULTA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("ALUMNOS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.angeru.images/Paneles/PanelMorado.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -20, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.angeru.images/Icons/Consulta2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened

        String sexo;
        String desnutricion;
        String sobrepeso;
        String alergias;
        String obesidad;
        String diabetes;
        String viveCon="";
        String carrera="";
        String[] info = new String[13];
        for (int i = 0; i < VtnPrincipal.arrDatos.length; i++)
        {
            if (VtnPrincipal.arrDatos[i] instanceof Alumnos)
            {

                Alumnos obj = new Alumnos();
                obj = (Alumnos) VtnPrincipal.arrDatos[i];
                if (obj.getSexo() == 'M')
                {
                    sexo = "Masculino";
                } else
                {
                    sexo = "Femenino";
                }
                if (obj.isDesnutricion() == true)
                {
                    desnutricion = "Si";
                } else
                {
                    desnutricion = "No";
                }
                if (obj.isSobrepeso() == true)
                {
                    sobrepeso = "Si";
                } else
                {
                    sobrepeso = "No";
                }
                if (obj.isAlergias() == true)
                {
                    alergias = "Si";
                } else
                {
                    alergias = "No";
                }
                if (obj.isObesidad() == true)
                {
                    obesidad = "Si";
                } else
                {
                    obesidad = "No";
                }
                if (obj.isDiabetes() == true)
                {
                    diabetes = "Si";
                } else
                {
                    diabetes = "No";
                }
                switch (obj.getViveCon())
                {
                    case 1:
                        viveCon = "Mamá y Papá";
                        break;
                    case 2:
                        viveCon = "Solo Mamá";
                        break;
                    case 3:
                        viveCon = "Solo Papá";
                        break;
                    case 4:
                        viveCon = "Otros";
                        break;
                }
                switch (obj.getCarrera())
                {
                    case 1:
                        carrera = "Ing. Electromecanica";
                        break;
                    case 2:
                        carrera = "Ing. Electronica";
                        break;
                    case 3:
                        carrera = "Ing. Gestion Empresarial";
                        break;
                    case 4:
                        carrera = "Ing. Industrial";
                        break;
                    case 5:
                        carrera = "Ing. Logistica";
                        break;
                    case 6:
                        carrera = "Ing. Mecatronica";
                        break;
                    case 7:
                        carrera = "Ing. Química";
                        break;
                    case 8:
                        carrera = "Ing. Sistemas Computacionales";
                        break;
                    case 9:
                        carrera = "Ing. TIC'S";
                        break;
                }

         
                info[0] = obj.getCve();
                info[1] = obj.getNom();
                info[2] = obj.getPrimerAp();
                info[3] = obj.getSegundoAp();
                info[4] = sexo;
                info[5] = desnutricion;
                info[6] = sobrepeso;
                info[7] = alergias;
                info[8] = obesidad;
                info[9] = diabetes;
                info[10] = obj.getOtras();
                info[11] = viveCon;
                info[12] = carrera;
                
                modelo.addRow(info);
            }

        }

    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnCATabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnCATabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnCATabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnCATabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnCATabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

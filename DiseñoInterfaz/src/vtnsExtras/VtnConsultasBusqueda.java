/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vtnsExtras;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;
import ventanaprincipal.VtnPrincipal;
import poo.ManipulacionProyecto;
/**
 *
 * @author nolas
 */
public class VtnConsultasBusqueda extends javax.swing.JFrame
{

    /**
     * Creates new form VtnConsultasBusqueda
     */
    public VtnConsultasBusqueda()
    {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoScroll = new javax.swing.JTextArea();
        reset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("CONSULTAS MÉDICAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Clave:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 94, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("HISTORIAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        clave.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                claveKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                claveKeyTyped(evt);
            }
        });
        jPanel1.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 95, 141, -1));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(294, 116));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(294, 116));

        textoScroll.setColumns(20);
        textoScroll.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        textoScroll.setRows(5);
        jScrollPane1.setViewportView(textoScroll);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 146, 375, 250));

        reset.setBackground(new java.awt.Color(86, 86, 252));
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.setToolTipText("");
        reset.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.angeru.images/Icons Ventana/desplegar.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.angeru.images/Imagen Ventana/Ventana480square.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void claveKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_claveKeyTyped
    {//GEN-HEADEREND:event_claveKeyTyped
        Validaciones.validaAlfanumerico(evt, 9, clave.getText());
    }//GEN-LAST:event_claveKeyTyped

    private void claveKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_claveKeyPressed
    {//GEN-HEADEREND:event_claveKeyPressed
        if (evt.getKeyChar() == '\n')
        {
            if (VtnPrincipal.matH == null || VtnPrincipal.arrDatos == null)
            {
                Mensajes.error(this, "No hay datos registrados aun");
                CtrlInterfaz.limpia(clave);
            } else
            {
                if (ManipulacionProyecto.buscarCve(VtnPrincipal.arrDatos, clave.getText()) == -1)
                {
                    Mensajes.error(this, "La clave no se encuentra registrada");
                    CtrlInterfaz.limpia(clave);
                } else
                {
                    int pos = ManipulacionProyecto.buscarCve(VtnPrincipal.arrDatos, clave.getText());
                    //ManipulacionProyecto.despHistorialInterface(VtnPrincipal.matH, VtnPrincipal.arrDatos, pos);
                    textoScroll.setText(ManipulacionProyecto.despHistorialInterface(VtnPrincipal.matH, VtnPrincipal.arrDatos, pos));
                    textoScroll.setEditable(false);
                }

            }

        }
        Validaciones.enterCadenaNoVacia(this, evt, clave, clave);
    }//GEN-LAST:event_claveKeyPressed

    private void resetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resetActionPerformed
    {//GEN-HEADEREND:event_resetActionPerformed
        textoScroll.setText("");
        CtrlInterfaz.limpia(clave);
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(VtnConsultasBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultasBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultasBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnConsultasBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnConsultasBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset;
    private javax.swing.JTextArea textoScroll;
    // End of variables declaration//GEN-END:variables
}

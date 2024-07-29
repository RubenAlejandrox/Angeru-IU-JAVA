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
public class VtnHC extends javax.swing.JFrame
{

    /**
     * Creates new form VtnHC
     */
    public VtnHC()
    {
        initComponents();
        mostrarTiempo();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        clave = new javax.swing.JTextField();
        padecimientos = new javax.swing.JTextField();
        antecedentes = new javax.swing.JTextField();
        medicamento = new javax.swing.JTextField();
        planTratamiento = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 300));
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(480, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("CONSULTAS MÉDICAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 40));

        jLabel8.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel8.setText("Fecha:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel2.setText("Clave:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 141, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel3.setText("Padecimiento:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 183, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel4.setText("Antecedentes:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 225, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel5.setText("Medicamento:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 268, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel6.setText("Plan de ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 311, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel7.setText("Tratamiento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 337, -1, -1));

        Fecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fecha.setText("asdfadsf");
        jPanel1.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 120, -1));

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
        jPanel1.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 144, 90, 25));

        padecimientos.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                padecimientosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                padecimientosKeyTyped(evt);
            }
        });
        jPanel1.add(padecimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 183, 217, -1));

        antecedentes.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                antecedentesKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                antecedentesKeyTyped(evt);
            }
        });
        jPanel1.add(antecedentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 228, 217, -1));

        medicamento.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                medicamentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                medicamentoKeyTyped(evt);
            }
        });
        jPanel1.add(medicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 271, 217, -1));

        planTratamiento.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                planTratamientoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                planTratamientoKeyTyped(evt);
            }
        });
        jPanel1.add(planTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 314, 217, -1));

        aceptar.setBackground(new java.awt.Color(86, 86, 252));
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 379, -1, -1));

        cancelar.setBackground(new java.awt.Color(86, 86, 252));
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 379, -1, -1));

        jLabel10.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 255));
        jLabel10.setText("REGISTRO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.angeru.images/Icons Ventana/historial.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.angeru.images/Imagen Ventana/Ventana480square.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

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
            if (ManipulacionProyecto.buscarCve(VtnPrincipal.arrDatos, clave.getText()) == -1)
            {
                Mensajes.error(this, "La clave no se encuentra registrada");
                cancelarActionPerformed(null);

            }

        }
        Validaciones.enterCadenaNoVacia(this, evt, clave, padecimientos);
    }//GEN-LAST:event_claveKeyPressed

    private void padecimientosKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_padecimientosKeyTyped
    {//GEN-HEADEREND:event_padecimientosKeyTyped
        Validaciones.validaAlfanumerico(evt, 300, padecimientos.getText());
        
    }//GEN-LAST:event_padecimientosKeyTyped

    private void padecimientosKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_padecimientosKeyPressed
    {//GEN-HEADEREND:event_padecimientosKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, padecimientos, antecedentes);
    }//GEN-LAST:event_padecimientosKeyPressed

    private void antecedentesKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_antecedentesKeyTyped
    {//GEN-HEADEREND:event_antecedentesKeyTyped
        Validaciones.validaAlfanumerico(evt, 300, antecedentes.getText());
    }//GEN-LAST:event_antecedentesKeyTyped

    private void antecedentesKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_antecedentesKeyPressed
    {//GEN-HEADEREND:event_antecedentesKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, antecedentes, medicamento);
    }//GEN-LAST:event_antecedentesKeyPressed

    private void medicamentoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_medicamentoKeyTyped
    {//GEN-HEADEREND:event_medicamentoKeyTyped
        Validaciones.validaAlfanumerico(evt, 100, medicamento.getText());
    }//GEN-LAST:event_medicamentoKeyTyped

    private void medicamentoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_medicamentoKeyPressed
    {//GEN-HEADEREND:event_medicamentoKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, medicamento, planTratamiento);
    }//GEN-LAST:event_medicamentoKeyPressed

    private void planTratamientoKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_planTratamientoKeyTyped
    {//GEN-HEADEREND:event_planTratamientoKeyTyped
        Validaciones.validaAlfanumerico(evt, 100, planTratamiento.getText());
    }//GEN-LAST:event_planTratamientoKeyTyped

    private void planTratamientoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_planTratamientoKeyPressed
    {//GEN-HEADEREND:event_planTratamientoKeyPressed
       Validaciones.enterCadenaNoVacia(this, evt, planTratamiento, aceptar);
    }//GEN-LAST:event_planTratamientoKeyPressed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aceptarActionPerformed
    {//GEN-HEADEREND:event_aceptarActionPerformed
        int pos = ManipulacionProyecto.buscarCve(VtnPrincipal.arrDatos, clave.getText());

        if (VtnPrincipal.matH == null || VtnPrincipal.arrDatos == null)
        {
            Mensajes.error(this, "No hay datos registrados aun");
        } else
        {
            if (ManipulacionProyecto.buscarCve(VtnPrincipal.arrDatos, clave.getText()) == -1)
            {
                Mensajes.error(this, "La clave no se encuentra registrada");
                cancelarActionPerformed(null);

            } else
            {
                if (padecimientos.getText().equals("") || antecedentes.getText().equals("") || medicamento.getText().equals("") || planTratamiento.getText().equals(""))
                {
                    Mensajes.error(this, "Por favor no deje espacios vacios");
                } else
                {
                    VtnPrincipal.matH = ManipulacionProyecto.agregarColumnaHC(VtnPrincipal.matH, VtnPrincipal.arrDatos, pos, padecimientos.getText(), antecedentes.getText(), medicamento.getText(), planTratamiento.getText());
                    Mensajes.exito(this, "Consulta medica registrada correctamente");
                    cancelarActionPerformed(null);

                }

            }

        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelarActionPerformed
    {//GEN-HEADEREND:event_cancelarActionPerformed
        CtrlInterfaz.limpia(clave, padecimientos, antecedentes, medicamento, planTratamiento);
        CtrlInterfaz.habilita(false, padecimientos, antecedentes, medicamento, planTratamiento, aceptar);
        CtrlInterfaz.cambia(clave);
    }//GEN-LAST:event_cancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        CtrlInterfaz.habilita(false, padecimientos, antecedentes, medicamento, planTratamiento, aceptar);
        CtrlInterfaz.cambia(clave);
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
            java.util.logging.Logger.getLogger(VtnHC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnHC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnHC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnHC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VtnHC().setVisible(true);
            }
        });
    }
    Fecha time = new Fecha();

    public void mostrarTiempo()
    {

        Fecha.setText(time.fechaCompleta);
        //Hora.setText(time.horaCompleta);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField antecedentes;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField medicamento;
    private javax.swing.JTextField padecimientos;
    private javax.swing.JTextField planTratamiento;
    // End of variables declaration//GEN-END:variables
}

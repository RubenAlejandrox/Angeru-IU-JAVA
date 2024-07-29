/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensajes;
import cjb.ci.Validaciones;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 0));
        setPreferredSize(new java.awt.Dimension(480, 300));
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jPanel1.setMinimumSize(new java.awt.Dimension(480, 480));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 480));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE CONSULTAS MEDICAS");

        jLabel8.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel8.setText("Fecha:");

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel2.setText("Clave:");

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel3.setText("Padecimiento:");

        jLabel4.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel4.setText("Antecedentes:");

        jLabel5.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel5.setText("Medicamento:");

        jLabel6.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel6.setText("Plan de ");

        jLabel7.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        jLabel7.setText("tratamiento:");

        Fecha.setText("asdfadsf");

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

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(aceptar, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(5, 5, 5))
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(jLabel8))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(padecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(planTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Fecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(padecimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(antecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(planTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(cancelar))
                .addContainerGap(77, Short.MAX_VALUE))
        );

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField medicamento;
    private javax.swing.JTextField padecimientos;
    private javax.swing.JTextField planTratamiento;
    // End of variables declaration//GEN-END:variables
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaFormulario;

import Negocio.App;
import Negocio.Ciudad;
import Negocio.DigrafoPesado;
import Negocio.FordFulkerson2;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author BRAYAN
 */
public class FlujosEncomiendas extends javax.swing.JFrame {

    /**
     * Creates new form FlujosEncomiendas
     */
    Vista2 anterior;
  
    FordFulkerson2 mapaFlujos;
    DigrafoPesado<Ciudad> mapaOriginal;
    
    public FlujosEncomiendas(Vista2 aThis) {
        this.anterior = aThis;
        initComponents();
        redimensionarObj();
    }

       private void redimensionarObj() {
        // Obtén la imagen desde el archivo o recurso
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/Imagenes/rutas.jpg"));
        Image originalImage = originalIcon.getImage(); // Obtiene la imagen

// Obtén el tamaño del JLabel
        int labelWidth = fondo2.getWidth();
        int labelHeight = fondo2.getHeight();

// Redimensiona la imagen para ajustarse al tamaño del JLabel
        Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

// Crea un nuevo ImageIcon con la imagen redimensionada
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

// Asigna el ImageIcon redimensionado al JLabel
        fondo2.setIcon(resizedIcon);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("VOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 130, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("MOSTRAR MAPA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 200, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("EJECUTAR ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 620, 220));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("FLUJO MAXIMO");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, -1));

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("RUTAS AUMENTADORAS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 200, -1));

        jTextField1.setBackground(new java.awt.Color(201, 232, 252));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("ORIGEN...");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 140, 30));

        jTextField2.setBackground(new java.awt.Color(201, 232, 252));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("DESTINO...");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 140, 30));
        jPanel1.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.anterior.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(mapaOriginal.toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Ciudad fuente = new Ciudad(jTextField1.getText().trim());
        Ciudad sumidero = new Ciudad(jTextField2.getText().trim());
       mapaOriginal = new DigrafoPesado<>();

        // Definir vértices
        Ciudad SantaCruz = new Ciudad("Santa Cruz");
        Ciudad Beni = new Ciudad("Beni");
        Ciudad Cochabamba = new Ciudad("Cochabamba");
        Ciudad Chuquisaca = new Ciudad("Chuquisaca");
        Ciudad Pando = new Ciudad("Pando");
        Ciudad LaPaz = new Ciudad("La Paz");
        Ciudad Oruro = new Ciudad("Oruro");
        Ciudad Potosi = new Ciudad("Potosi");
        Ciudad Tarija = new Ciudad("Tarija");
        mapaOriginal.insertarVertice(Beni);
        mapaOriginal.insertarVertice(Cochabamba);
        mapaOriginal.insertarVertice(Chuquisaca);
        mapaOriginal.insertarVertice(Pando);
        mapaOriginal.insertarVertice(LaPaz);
        mapaOriginal.insertarVertice(SantaCruz);
        mapaOriginal.insertarVertice(Oruro);
        mapaOriginal.insertarVertice(Potosi);
        mapaOriginal.insertarVertice(Tarija);
        mapaOriginal.insertarArista(LaPaz, Pando, 1400);
        mapaOriginal.insertarArista(LaPaz, Beni, 680);
        mapaOriginal.insertarArista(LaPaz, Cochabamba, 900);
        mapaOriginal.insertarArista(LaPaz, Oruro, 870);
        mapaOriginal.insertarArista(Oruro, Cochabamba, 1890);
        mapaOriginal.insertarArista(Oruro, Potosi, 600);
        mapaOriginal.insertarArista(Oruro, Tarija, 417);
        mapaOriginal.insertarArista(Potosi, Cochabamba, 3652);
        mapaOriginal.insertarArista(Potosi, Chuquisaca, 50);
        mapaOriginal.insertarArista(Potosi, Tarija, 692);
        mapaOriginal.insertarArista(Chuquisaca, Cochabamba, 6333);
        mapaOriginal.insertarArista(Chuquisaca, Tarija, 5810);
        mapaOriginal.insertarArista(Chuquisaca, SantaCruz, 2140);
        mapaOriginal.insertarArista(Cochabamba, Beni, 600);
        mapaOriginal.insertarArista(Cochabamba, SantaCruz, 8000);
        mapaOriginal.insertarArista(LaPaz, SantaCruz, 862);
        mapaOriginal.insertarArista(LaPaz, Potosi, 5963);
        mapaOriginal.insertarArista(LaPaz, Chuquisaca, 1455);
        mapaOriginal.insertarArista(LaPaz, Tarija, 6982);
        //this.insertarTramo(Oruro,Tarija,796);
        mapaOriginal.insertarArista(Oruro, Chuquisaca, 555);
        mapaOriginal.insertarArista(Oruro, SantaCruz, 4820);
        mapaOriginal.insertarArista(Oruro, Beni, 369);
        mapaOriginal.insertarArista(Oruro, Pando, 250);
        mapaOriginal.insertarArista(Tarija, Pando, 1753);
        mapaOriginal.insertarArista(Tarija, Beni, 1116);
        mapaOriginal.insertarArista(Tarija, SantaCruz, 718);
        mapaOriginal.insertarArista(SantaCruz, Pando, 1395);
        mapaOriginal.insertarArista(Potosi, SantaCruz, 9000);
        this.mapaFlujos = new FordFulkerson2(mapaOriginal, SantaCruz, Pando);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(String.valueOf(this.mapaFlujos.getFlujoMaximo()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText(mapaFlujos.obtenerCaminosAumentadores());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
          jTextField1.setText("");
         jTextField1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
          jTextField2.setText("");
         jTextField2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextField2MouseClicked

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
            java.util.logging.Logger.getLogger(FlujosEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlujosEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlujosEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlujosEncomiendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            Vista2 anterior = new Vista2();  
            @Override
            public void run() {
                new FlujosEncomiendas(anterior).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistaCine;

import controladorCine.MovieController;
import vista.cineTablas.TablaCine;

/**
 *
 * @author jona
 */
public class FrmCine extends javax.swing.JDialog {

    private MovieController mv = new  MovieController();
    private TablaCine tc = new TablaCine();
    
    /**
     * Creates new form FrmCine
     */
    public FrmCine(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Limpiar();
    }
    public void Limpiar (){
        mv.setMovie(null);
        CargarTabla();
    
    }
    public void Agregar(){
        
           try {
               mv.getMovie().setTitle(txttitulo.getText());
            mv.getMovie().setYear(Short.parseShort(txtanio.getValue().toString()));
           mv.getMovie().setRated(txtcalifica.getText());
           mv.getMovie().setActors(txtactores.getText());
           mv.getMovie().setAwards(txtpremios.getText());
           mv.getMovie().setCountry(txtpremios.getText());
           mv.getMovie().setLenguaje(txtlenguaje.getText());
           mv.getMovie().setProducion(txtproductora.getText());
           mv.getMovie().setDirector(txtdirector.getText());
           mv.getMovie().setPoster(txtposte.getText());
           mv.getMovie().setDVD(cbxdvd.getSelectedItem().toString());
           mv.getMovie().setReleased(txtliberado.getText());
           mv.getMovie().setGenre(cbxgenero.getSelectedItem().toString());
           mv.getMovie().setImdbID(imbdid.getText());
           mv.getMovie().setPlot(txttrama.getText());
           mv.getMovie().setImdbRating(Double.parseDouble(txtimdbcali.getText()));
           mv.getMovie().setImdbVotes(Double.parseDouble(txtimdbvotos.getText()));
           mv.getMovie().setTyte(cbxtipo1.getSelectedItem().toString());
           mv.getMovie().setMetascore(Integer.parseInt(txtpuntuacion.getText()));
           mv.getMovie().setBoxoffice(Double.parseDouble(txttaquilla.getText()));
           mv.getMovie().setResponse(Boolean.TRUE);
           mv.getMovie().setWebsite(txtsitioweb.getText());
           mv.getMovie().setRuntime(txtduracion.getText());
//           mv.getRatings().setSourse("patato");
//           mv.getRatings().setValue("100%");
           mv.guardar();
        } catch (Exception e) {
        }
    }
    public void CargarTabla(){
     tc.setLista(mv.getLismovie());
            tbltabla.setModel(tc);
            tbltabla.updateUI();
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
        jLabel1 = new javax.swing.JLabel();
        txtliberado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcalifica = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtduracion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdirector = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtescritor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtactores = new javax.swing.JTextField();
        txttitulo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txttrama = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtlenguaje = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtpais = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtpremios = new javax.swing.JTextField();
        txtposte = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtpuntuacion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtimdbcali = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtimdbvotos = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        imbdid = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txttaquilla = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtproductora = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtsitioweb = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltabla = new javax.swing.JTable();
        txtanio = new javax.swing.JSpinner();
        cbxgenero = new javax.swing.JComboBox<>();
        cbxdvd = new javax.swing.JComboBox<>();
        checkres = new javax.swing.JCheckBox();
        cbxtipo1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de Peliculas"));
        jPanel1.setLayout(null);

        jLabel1.setText("Liberado");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 160, 80, 17);
        jPanel1.add(txtliberado);
        txtliberado.setBounds(120, 160, 130, 23);

        jLabel2.setText("Año");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 80, 25, 17);
        jPanel1.add(txtcalifica);
        txtcalifica.setBounds(120, 120, 130, 23);

        jLabel3.setText("Calificacion");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 90, 17);

        jLabel4.setText("Titulo:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 40, 38, 17);

        jLabel5.setText("Tiempo ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 200, 80, 17);
        jPanel1.add(txtduracion);
        txtduracion.setBounds(120, 200, 130, 23);

        jLabel6.setText("Genero");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 240, 80, 17);

        jLabel7.setText("Director");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 280, 80, 17);
        jPanel1.add(txtdirector);
        txtdirector.setBounds(120, 280, 130, 23);

        jLabel8.setText("Escritor");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 320, 80, 17);
        jPanel1.add(txtescritor);
        txtescritor.setBounds(120, 320, 130, 23);

        jLabel9.setText("Actores");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 360, 80, 17);
        jPanel1.add(txtactores);
        txtactores.setBounds(120, 360, 130, 23);
        jPanel1.add(txttitulo);
        txttitulo.setBounds(120, 40, 130, 23);

        jLabel11.setText("Trama");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(270, 40, 80, 17);

        txttrama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttramaActionPerformed(evt);
            }
        });
        jPanel1.add(txttrama);
        txttrama.setBounds(360, 40, 130, 23);

        jLabel12.setText("Lenguaje");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(270, 80, 80, 17);
        jPanel1.add(txtlenguaje);
        txtlenguaje.setBounds(360, 80, 130, 23);

        jLabel13.setText("Pais");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(270, 120, 80, 17);
        jPanel1.add(txtpais);
        txtpais.setBounds(360, 120, 130, 23);

        jLabel14.setText("Premios");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(270, 160, 80, 17);
        jPanel1.add(txtpremios);
        txtpremios.setBounds(360, 160, 130, 23);
        jPanel1.add(txtposte);
        txtposte.setBounds(360, 200, 130, 23);

        jLabel15.setText("Poster");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(270, 200, 80, 17);
        jPanel1.add(txtpuntuacion);
        txtpuntuacion.setBounds(360, 240, 130, 23);

        jLabel16.setText("Puntuacion");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(270, 240, 80, 17);

        jLabel17.setText("imdbCalificacion");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(270, 280, 80, 17);
        jPanel1.add(txtimdbcali);
        txtimdbcali.setBounds(360, 280, 130, 23);

        jLabel18.setText("imdb Votos");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(270, 320, 80, 17);
        jPanel1.add(txtimdbvotos);
        txtimdbvotos.setBounds(360, 320, 130, 23);

        jLabel19.setText("imdb ID");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(270, 360, 80, 17);

        imbdid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imbdidActionPerformed(evt);
            }
        });
        jPanel1.add(imbdid);
        imbdid.setBounds(360, 360, 130, 23);

        jLabel20.setText("Tipo");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(30, 400, 80, 17);

        jLabel21.setText("DvD");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(30, 440, 80, 17);

        jLabel22.setText("Taquilla %");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(270, 400, 80, 17);
        jPanel1.add(txttaquilla);
        txttaquilla.setBounds(360, 400, 130, 23);

        jLabel23.setText("Productora");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(30, 480, 80, 17);
        jPanel1.add(txtproductora);
        txtproductora.setBounds(120, 480, 130, 23);

        jLabel24.setText("Sitio Web");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(270, 440, 80, 17);
        jPanel1.add(txtsitioweb);
        txtsitioweb.setBounds(360, 440, 130, 23);

        jLabel25.setText("Respuesta");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(270, 480, 80, 17);

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar);
        btnguardar.setBounds(360, 520, 130, 23);

        tbltabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbltabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(510, 70, 510, 402);

        txtanio.setModel(new javax.swing.SpinnerNumberModel(1800, null, 2100, 1));
        jPanel1.add(txtanio);
        txtanio.setBounds(120, 80, 130, 23);

        cbxgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Accion", "Fantasia", "Terror", "Aventura", "Romance", "Comedia" }));
        jPanel1.add(cbxgenero);
        cbxgenero.setBounds(120, 240, 130, 23);

        cbxdvd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Si", "No" }));
        jPanel1.add(cbxdvd);
        cbxdvd.setBounds(120, 440, 130, 23);

        checkres.setText("SI");
        jPanel1.add(checkres);
        checkres.setBounds(360, 480, 102, 21);

        cbxtipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Pelicula", "Serie" }));
        jPanel1.add(cbxtipo1);
        cbxtipo1.setBounds(120, 400, 130, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 1030, 560);

        setSize(new java.awt.Dimension(1059, 604));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imbdidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imbdidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imbdidActionPerformed

    private void txttramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttramaActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        Agregar();
    }//GEN-LAST:event_btnguardarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCine dialog = new FrmCine(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbxdvd;
    private javax.swing.JComboBox<String> cbxgenero;
    private javax.swing.JComboBox<String> cbxtipo1;
    private javax.swing.JCheckBox checkres;
    private javax.swing.JTextField imbdid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbltabla;
    private javax.swing.JTextField txtactores;
    private javax.swing.JSpinner txtanio;
    private javax.swing.JTextField txtcalifica;
    private javax.swing.JTextField txtdirector;
    private javax.swing.JTextField txtduracion;
    private javax.swing.JTextField txtescritor;
    private javax.swing.JTextField txtimdbcali;
    private javax.swing.JTextField txtimdbvotos;
    private javax.swing.JTextField txtlenguaje;
    private javax.swing.JTextField txtliberado;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txtposte;
    private javax.swing.JTextField txtpremios;
    private javax.swing.JTextField txtproductora;
    private javax.swing.JTextField txtpuntuacion;
    private javax.swing.JTextField txtsitioweb;
    private javax.swing.JTextField txttaquilla;
    private javax.swing.JTextField txttitulo;
    private javax.swing.JTextField txttrama;
    // End of variables declaration//GEN-END:variables
}

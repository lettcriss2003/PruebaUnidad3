/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.actividades.ActividadesController;
import controlador.adaptadorDao.ActividadesDao;
import controlador.listas.ListaEnlazada;
import javax.swing.JOptionPane;
import modelo.Actividades;
import vista.modeloTabla.TablaActividades;

/**
 *
 * @author lettc
 */
public class FrmActividades extends javax.swing.JFrame {

    private TablaActividades mta = new TablaActividades();
    private ActividadesController ac;
    Actividades aux = new Actividades();
//    ActividadesDao Activida = new ActividadesDao();


    public FrmActividades() {
        initComponents();
        btnModificar.setEnabled(false);
        ac = new ActividadesController();
        cargarTabla();
        cargarComboVertice();
        jPanel_B.setVisible(false);
    }
    
    private void limpiar() {
        txtFin.setText("");
        txtInicio.setText("");
        txtNombres.setText("");
        spinNroEstudiantes.setValue(0);
        btnModificar.setEnabled(false);
        ac.SinActividades();
        cargarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtInicio = new javax.swing.JTextField();
        txtFin = new javax.swing.JTextField();
        spinNroEstudiantes = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxDestino = new javax.swing.JComboBox<>();
        btnVincular = new javax.swing.JButton();
        cbxOrigen = new javax.swing.JComboBox<>();
        btnCamino = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaCaminos = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblActividades = new javax.swing.JTable();
        btn_mostrar = new javax.swing.JButton();
        jPanel_B = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnAnchura = new javax.swing.JButton();
        cbxBuscar = new javax.swing.JComboBox<>();
        btnProfundidad = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaRecorridos = new javax.swing.JTextArea();
        btnFloyd = new javax.swing.JButton();
        btnDisjktra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ciudades");
        setBackground(new java.awt.Color(102, 153, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACTIVIDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Nombres :");

        btnModificar.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 102));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Hora fin");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Hora Inicio");

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Nro Estudiantes:");

        txtNombres.setBorder(null);

        txtInicio.setBorder(null);
        txtInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInicioActionPerformed(evt);
            }
        });

        txtFin.setBorder(null);

        spinNroEstudiantes.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 2));
        spinNroEstudiantes.setBorder(null);

        btnAgregar.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 102));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinNroEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinNroEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnAgregar))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENLAZAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Origen:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Destino");

        cbxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "10" }));
        cbxDestino.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnVincular.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnVincular.setForeground(new java.awt.Color(0, 0, 102));
        btnVincular.setText("Vincular");
        btnVincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVincularActionPerformed(evt);
            }
        });

        cbxOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "10" }));
        cbxOrigen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cbxOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrigenActionPerformed(evt);
            }
        });

        btnCamino.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnCamino.setForeground(new java.awt.Color(0, 0, 102));
        btnCamino.setText("Camino");
        btnCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaminoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtAreaCaminos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVincular, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btnCamino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVincular)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCamino)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tblActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblActividades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblActividadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblActividades);

        btn_mostrar.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btn_mostrar.setForeground(new java.awt.Color(0, 0, 102));
        btn_mostrar.setText("MOSTRAR");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_mostrar)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_mostrar))
        );

        jPanel_B.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_B.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Inicio :");

        btnAnchura.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnAnchura.setForeground(new java.awt.Color(0, 0, 102));
        btnAnchura.setText("ANCHURA");
        btnAnchura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnchuraActionPerformed(evt);
            }
        });

        cbxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "10" }));
        cbxBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnProfundidad.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnProfundidad.setForeground(new java.awt.Color(0, 0, 102));
        btnProfundidad.setText("PROFUNDIDAD");
        btnProfundidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfundidadActionPerformed(evt);
            }
        });

        txtAreaRecorridos.setColumns(20);
        txtAreaRecorridos.setRows(5);
        txtAreaRecorridos.setBorder(null);
        jScrollPane3.setViewportView(txtAreaRecorridos);

        btnFloyd.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnFloyd.setForeground(new java.awt.Color(0, 0, 102));
        btnFloyd.setText("FLOYD");
        btnFloyd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFloydActionPerformed(evt);
            }
        });

        btnDisjktra.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btnDisjktra.setForeground(new java.awt.Color(0, 0, 102));
        btnDisjktra.setText("DIJSTRACK");
        btnDisjktra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisjktraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BLayout = new javax.swing.GroupLayout(jPanel_B);
        jPanel_B.setLayout(jPanel_BLayout);
        jPanel_BLayout.setHorizontalGroup(
            jPanel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BLayout.createSequentialGroup()
                        .addComponent(btnDisjktra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFloyd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel_BLayout.createSequentialGroup()
                        .addGroup(jPanel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_BLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(cbxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_BLayout.createSequentialGroup()
                                .addComponent(btnAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProfundidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel_BLayout.setVerticalGroup(
            jPanel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnchura)
                    .addComponent(btnProfundidad))
                .addGap(18, 18, 18)
                .addGroup(jPanel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisjktra)
                    .addComponent(btnFloyd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void nuevoVertice() {
        if (txtNombres.getText().trim().length() == 0 || txtInicio.getText().trim().length() == 0 || txtFin.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Datos incompletos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Integer pos = ac.getGnde().numVertices()+1;
                System.out.println(pos);
                ac.getActividad().setNombre(txtNombres.getText());
                ac.getActividad().setId(pos);
                ac.getActividad().setNumEstudiantes(Integer.valueOf(spinNroEstudiantes.getValue().toString()));
                ac.getActividad().getTiempo().setInicio(Double.parseDouble(txtFin.getText()));
                ac.getActividad().getTiempo().setFin(Double.parseDouble(txtInicio.getText()));
                if (ac.NuevaActividad()) {
                    cargarComboVertice();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "SE HA GUARDADO CORRECTAMENTE!!", "OK", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
       
    private void adyacencias() {
        Integer origen = (cbxOrigen.getSelectedIndex() + 1);
        Integer destino = (cbxDestino.getSelectedIndex() + 1);
        if (origen == destino) {
            JOptionPane.showMessageDialog(null, "LOS HOTELES SON IGUALES", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Double distancia = ac.calcularTiempos(ac.getGnde().obtenerEtiqueta(origen), ac.getGnde().obtenerEtiqueta(destino));
                ac.getGnde().insertarAristaE(ac.getGnde().obtenerEtiqueta(origen), ac.getGnde().obtenerEtiqueta(destino), distancia);
                System.out.println("----------------");
                System.out.println(ac.getGnde().toString());
                System.out.println("----------------");
                cargarTabla();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se puede insertar", "ERROR", JOptionPane.ERROR_MESSAGE);
                
            }
        }
       
    }

    private void btnVincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVincularActionPerformed
        adyacencias();
        jPanel_B.setVisible(true);
    }//GEN-LAST:event_btnVincularActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        FrmGrafoActividades frm = new FrmGrafoActividades(ac.getGnde());
        frm.setSize(400, 400);
        frm.setVisible(true);
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btnCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaminoActionPerformed
        camino();
    }//GEN-LAST:event_btnCaminoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        nuevoVertice();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblActividadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblActividadesMouseClicked
         if (evt.getClickCount() == 2) {
            cargarVista();
        }
    }//GEN-LAST:event_tblActividadesMouseClicked

    private void btnAnchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnchuraActionPerformed
       BusquedaEnAnchura();
    }//GEN-LAST:event_btnAnchuraActionPerformed

    private void btnProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfundidadActionPerformed
        BusquedaEnProfundidad();
    }//GEN-LAST:event_btnProfundidadActionPerformed

    private void cbxOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOrigenActionPerformed

    private void txtInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInicioActionPerformed

    private void btnFloydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFloydActionPerformed
        caminoFloyd();
    }//GEN-LAST:event_btnFloydActionPerformed

    private void btnDisjktraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisjktraActionPerformed
        
    }//GEN-LAST:event_btnDisjktraActionPerformed

    public void cargarVista() {
        Integer fila = -1;
        fila = tblActividades.getSelectedRow();
        if (fila >= 0) {
            try {
                ac.setActividad(ac.getGnde().obtenerEtiqueta(fila + 1));
                txtNombres.setText(ac.getActividad().getNombre());
                spinNroEstudiantes.setValue(ac.getActividad().getNumEstudiantes());
                txtInicio.setText(String.valueOf(ac.getActividad().getTiempo().getFin()));
                txtFin.setText(String.valueOf(ac.getActividad().getTiempo().getInicio()));
                btnModificar.setEnabled(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "ESCOGA UNA FILA DE LA TABLA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    public void camino() {
        Integer origen = (cbxOrigen.getSelectedIndex() + 1);
        Integer destino = (cbxDestino.getSelectedIndex() + 1);
        if (origen == destino) {
            JOptionPane.showMessageDialog(null, "ESCOJA ACTIVIDADES DIFERENTES", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ListaEnlazada<Integer> lista = ac.getGnde().floyd(origen, destino);
                String[] aux = new String[lista.getSize()];
                for (int i = 0; i < lista.getSize(); i++) {
                    aux[i] = ac.getGnde().obtenerEtiqueta(lista.obtenerDato(i)).getNombre();
                }
                txtAreaCaminos.setListData(aux);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
    
    private void cargarTabla() {
        tblActividades.updateUI();
        mta.setActividadesGrafo(ac.getGnde());
        mta.fireTableStructureChanged();
        mta.fireTableDataChanged();
        tblActividades.setModel(mta);
        tblActividades.updateUI();
        System.out.println(ac.getGnde().toString());
    }

    private void modificar() {
        if (txtNombres.getText().trim().length() == 0 || txtInicio.getText().trim().length() == 0 || txtFin.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Datos incompletos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Integer pos = ac.getGnde().obtenerCodigo(ac.getActividad());
                ac.getActividad().setNombre(txtNombres.getText());
                ac.getActividad().setNumEstudiantes(Integer.valueOf(spinNroEstudiantes.getValue().toString()));
                ac.getActividad().getTiempo().setInicio(Double.parseDouble(txtFin.getText()));
                ac.getActividad().getTiempo().setFin(Double.parseDouble(txtInicio.getText()));
                if (ac.getGnde().modificarGrafo(ac.getGnde().obtenerEtiqueta(pos), ac.getActividad())) {
                    cargarComboVertice();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "MODIFICADO!", "OK", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "NO SE PUDO MODIFICAR", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void cargarComboVertice() {
        cbxOrigen.removeAllItems();
        cbxDestino.removeAllItems();
        cbxBuscar.removeAllItems();
        try {
            for (int i = 1; i <= ac.getGnde().numVertices(); i++) {
                cbxOrigen.addItem(ac.getGnde().obtenerEtiqueta(i).getNombre());
                cbxDestino.addItem(ac.getGnde().obtenerEtiqueta(i).getNombre());
                cbxBuscar.addItem(ac.getGnde().obtenerEtiqueta(i).getNombre());
            }
        } catch (Exception e) {
            System.out.println("ERROR EN CARGAR COMBO");
        }
    }
    
    private void BusquedaEnAnchura() {
        Integer origen = (cbxBuscar.getSelectedIndex() + 1);
        try {
            txtAreaRecorridos.setText(ac.getGnde().toStringBusquedaEnAnchura(origen));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void BusquedaEnProfundidad() {
        
        try {
            txtAreaRecorridos.setText(ac.getGnde().toStringBusquedaEnProfundidad());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void caminoFloyd() {
        Integer origen = (cbxOrigen.getSelectedIndex() + 1);
        Integer destino = (cbxDestino.getSelectedIndex() + 1);
        if (origen == destino) {
            JOptionPane.showMessageDialog(null, "ESCOJA ACTIVIDADES DIFERENTES", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ListaEnlazada<Integer> lista = ac.getGnde().floyd(origen, destino);
                String[] aux = new String[lista.getSize()];
                for (int i = 0; i < lista.getSize(); i++) {
                    aux[i] = ac.getGnde().obtenerEtiqueta(lista.obtenerDato(i)).getNombre();
                }
                txtAreaCaminos.setListData(aux);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
    
        public void caminoDijstrack() {
        Integer origen = (cbxOrigen.getSelectedIndex() + 1);
        Integer destino = (cbxDestino.getSelectedIndex() + 1);
        if (origen == destino) {
            JOptionPane.showMessageDialog(null, "ESCOJA AACTIVIDADES DIFERENTES", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ListaEnlazada<Integer> lista = ac.getGnde().floyd(origen, destino);
                String[] aux = new String[lista.getSize()];
                for (int i = 0; i < lista.getSize(); i++) {
                    aux[i] = ac.getGnde().obtenerEtiqueta(lista.obtenerDato(i)).getNombre();
                }
                txtAreaCaminos.setListData(aux);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }
     
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new FrmActividades().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnchura;
    private javax.swing.JButton btnCamino;
    private javax.swing.JButton btnDisjktra;
    private javax.swing.JButton btnFloyd;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnProfundidad;
    private javax.swing.JButton btnVincular;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JComboBox<String> cbxBuscar;
    private javax.swing.JComboBox<String> cbxDestino;
    private javax.swing.JComboBox<String> cbxOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel_B;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spinNroEstudiantes;
    private javax.swing.JTable tblActividades;
    private javax.swing.JList<String> txtAreaCaminos;
    private javax.swing.JTextArea txtAreaRecorridos;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}

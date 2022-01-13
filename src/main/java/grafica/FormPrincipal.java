package grafica;
import java.util.ArrayList;
import logic.*;
import persistencia.Registro;
import javax.swing.JInternalFrame;
import static grafica.FormLogin.empleado1;
import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {
    
    
    public FormPrincipal() {
        
        initComponents();
        factura=new Factura();
        listaP = Registro.getInstancia().getArchivo();   
        registroC = new RegistroCliente();
        registroE = new RegistroEmpleado();
        registroV = new RegistroVen();
        registroF = new RegistroFactura();
        btnSeguro.setEnabled(false);
        
        //articulos creados para ver si funciona las cosas cuando probamos
        Fecha f=new Fecha();
        Importado i=new Importado(50, 2010, 10, "fiambre", 700, f, 5);
        Nacional n=new Nacional(true, "canelones", 11, "manometro", 20000, f, 1);
        Articulo a=new Articulo(12, "short", 900, 2);
        //listaP.insertar(a);
        //listaP.insertar(i);
        //listaP.insertar(n);
        
        //lo mismo pero con personas
        empleado1.setAntiguedad(f);
        empleado1.setCategoria(2);
        cliente1 = new Cliente (true, 234567890, "Bruno");      
        factura.setVendedor(empleado1);
        factura.setComprador(cliente1);
        
        registroV.setVisible(true);
        panePrincipal.add(registroV);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        panePrincipal = new javax.swing.JDesktopPane();
        btnSiguiente = new javax.swing.JButton();
        btnEleRegList = new javax.swing.JButton();
        btnSeguro = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        itemEmpleado = new javax.swing.JMenuItem();
        itemVenta = new javax.swing.JMenuItem();
        itemCliente = new javax.swing.JMenuItem();
        itemFactura = new javax.swing.JMenuItem();

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frog Ventas");

        btnSiguiente.setMnemonic('S');
        btnSiguiente.setText("SIGUIENTE (S)");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnEleRegList.setText("Eliminar Registro Lista");
        btnEleRegList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEleRegListActionPerformed(evt);
            }
        });

        panePrincipal.setLayer(btnSiguiente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panePrincipal.setLayer(btnEleRegList, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panePrincipal.setLayer(btnSeguro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panePrincipalLayout = new javax.swing.GroupLayout(panePrincipal);
        panePrincipal.setLayout(panePrincipalLayout);
        panePrincipalLayout.setHorizontalGroup(
            panePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panePrincipalLayout.createSequentialGroup()
                .addContainerGap(689, Short.MAX_VALUE)
                .addGroup(panePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panePrincipalLayout.createSequentialGroup()
                        .addComponent(btnSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnEleRegList, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panePrincipalLayout.createSequentialGroup()
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        panePrincipalLayout.setVerticalGroup(
            panePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panePrincipalLayout.createSequentialGroup()
                .addGroup(panePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panePrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panePrincipalLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(btnEleRegList, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        jMenu6.setText("Select Type");

        itemEmpleado.setText("Empleado");
        itemEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmpleadoActionPerformed(evt);
            }
        });
        jMenu6.add(itemEmpleado);

        itemVenta.setText("Venta");
        itemVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVentaActionPerformed(evt);
            }
        });
        jMenu6.add(itemVenta);

        itemCliente.setText("Cliente");
        itemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClienteActionPerformed(evt);
            }
        });
        jMenu6.add(itemCliente);

        itemFactura.setText("Factura");
        itemFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFacturaActionPerformed(evt);
            }
        });
        jMenu6.add(itemFactura);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panePrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed
        cerrarVentanas();
        registroC.setVisible(true);
        panePrincipal.add(registroC);
    }//GEN-LAST:event_itemClienteActionPerformed

    private void itemEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmpleadoActionPerformed
       cerrarVentanas();
        registroE.setVisible(true);
        panePrincipal.add(registroE);
    }//GEN-LAST:event_itemEmpleadoActionPerformed

    private void itemVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVentaActionPerformed
        cerrarVentanas();
        registroV.setVisible(true);
        panePrincipal.add(registroV);
    }//GEN-LAST:event_itemVentaActionPerformed

    private void itemFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFacturaActionPerformed
        cerrarVentanas();
        registroF.setVisible(true);
        panePrincipal.add(registroF);
    }//GEN-LAST:event_itemFacturaActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
        if(registroF.isVisible()){
            registroF.setVisible(false); registroV.setVisible(true);panePrincipal.add(registroV);
            }else{
                if(registroE.isVisible()){
                    registroE.setVisible(false); registroC.setVisible(true);panePrincipal.add(registroC);
                    }else{
                        if(registroC.isVisible()){
                            registroC.setVisible(false); registroF.setVisible(true);panePrincipal.add(registroF);
                            }else{
                                if(registroV.isVisible()){
                                   registroV.setVisible(false); registroE.setVisible(true); panePrincipal.add(registroE);
                                    }
                                }
                        }
                }
    
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnEleRegListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleRegListActionPerformed
        JOptionPane.showMessageDialog(null, "Presiona el seguro para eliminar la lista definitivamente");
        btnSeguro.setEnabled(true);
        if(btnSeguro.isEnabled()){
            //no se como se eliina el archivo
        }
    }//GEN-LAST:event_btnEleRegListActionPerformed

    
    
    public void cerrarVentanas() {
        registroC.setVisible(false);
        registroE.setVisible(false);
        registroV.setVisible(false);
        registroF.setVisible(false);
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEleRegList;
    private javax.swing.JToggleButton btnSeguro;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JMenuItem itemEmpleado;
    private javax.swing.JMenuItem itemFactura;
    private javax.swing.JMenuItem itemVenta;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane panePrincipal;
    // End of variables declaration//GEN-END:variables
    private RegistroVen registroV;
    private RegistroFactura registroF;
    public static Productos listaP;
    //public static ArrayList<Factura> cuaderno; 
    public static Factura factura; //lo declaro estatico porque lo necesito en la clases RegCliente RegEmpleado RegFactura
    private RegistroCliente registroC;
    private RegistroEmpleado registroE;
    
    public static Cliente cliente1;
    
    //hay q declararlo estatico para que permanezaca 
    //todo el programa y para poder importarlo desde factura
}

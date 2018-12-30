/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2.view;

import javax.swing.JOptionPane;
import worksheet2.model.Employee;
import worksheet2.model.Sucursal;

public class SucursalWindow extends javax.swing.JFrame {
    
    Employee[] employeesList = new Employee[100];
    Employee currentEmployee;
    public static Sucursal[] sucursalList = new Sucursal[100];

    
    public SucursalWindow() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        generateEmployeeCb();
    }

    private void generateEmployeeCb(){
        for(Employee employee: EmployeeWindow.currentEmployeeList){
            if(employee!=null){
                employeeCb.addItem(employee.getName());
            }
        }
    }
    
    private Employee getCurrentEmployee(){
        for(Employee employee: EmployeeWindow.currentEmployeeList){
            if(employee!=null){
                if(employee.getName().equalsIgnoreCase((String) employeeCb.getSelectedItem())){
                    return employee;
                }
            }
        }
        return null;
    }
    
    private int sucursalPointer(){
        int count = 0;
        for(Sucursal sucursal: sucursalList){
            if(sucursal!=null){
                count++;
            }
        }return count;
    }
    
    private int employeePointer(){
        int count =0;
        for(Employee employee: employeesList){
            if(employee!=null){
                count++;
            }
        }
        return count;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeCb = new javax.swing.JComboBox<>();
        addEmployeeBtn = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        cancelBtn = new javax.swing.JButton();
        addSucursalBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Direccion");

        jLabel3.setText("Empleados");

        employeeCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        addEmployeeBtn.setText("Agregar empleado");
        addEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancelar");

        addSucursalBtn.setText("Agregar sucursal");
        addSucursalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSucursalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTxt)
                    .addComponent(addressTxt)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(employeeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addSucursalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addEmployeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(employeeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmployeeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(addSucursalBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeBtnActionPerformed
        try{            
            currentEmployee = getCurrentEmployee();
            if(currentEmployee!=null){
                employeesList[employeePointer()] = currentEmployee;
                JOptionPane.showMessageDialog(this, "Empleado agregado correctamente", "Agregado",
                            JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error al agregar el empleado, por favor inténtelo de nuevo", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }           
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al agregar el empleado, por favor inténtelo de nuevo", "Error",
                            JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_addEmployeeBtnActionPerformed

    private void addSucursalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSucursalBtnActionPerformed
        try{
            Sucursal sucursal = new Sucursal(sucursalPointer()+1, nameTxt.getText(), addressTxt.getText(),
            employeesList);
            sucursalList[sucursalPointer()] = sucursal;
            JOptionPane.showMessageDialog(this, "Sucursal agregada correctamente", "Agregado",
                            JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            MainWindow mainWindow = new MainWindow();
            mainWindow.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error al agregar la sucursal, por favor inténtelo de nuevo", "Error",
                            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addSucursalBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SucursalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SucursalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SucursalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SucursalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SucursalWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeBtn;
    private javax.swing.JButton addSucursalBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> employeeCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameTxt;
    // End of variables declaration//GEN-END:variables
}

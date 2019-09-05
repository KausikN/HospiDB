
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kausik N
 */
public class TableChoose extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public TableChoose() {
        initComponents();
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
        l_c = new javax.swing.JLabel();
        l_t = new javax.swing.JLabel();
        Go = new javax.swing.JButton();
        home = new javax.swing.JButton();
        table_dropdown = new javax.swing.JComboBox<>();
        l_n1 = new javax.swing.JLabel();
        l_ID = new javax.swing.JLabel();
        l_Username = new javax.swing.JLabel();
        choice_dropdown = new javax.swing.JComboBox<>();
        l_c1 = new javax.swing.JLabel();
        nav = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        l_c.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        l_c.setForeground(new java.awt.Color(255, 204, 0));
        l_c.setText("What would you like to do?");
        jPanel1.add(l_c);
        l_c.setBounds(180, 410, 360, 40);

        l_t.setFont(new java.awt.Font("Tempus Sans ITC", 3, 36)); // NOI18N
        l_t.setForeground(new java.awt.Color(255, 204, 51));
        l_t.setText("HospiDB");
        jPanel1.add(l_t);
        l_t.setBounds(310, 40, 217, 48);

        Go.setBackground(new java.awt.Color(0, 255, 255));
        Go.setForeground(new java.awt.Color(0, 0, 255));
        Go.setText("Go");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });
        jPanel1.add(Go);
        Go.setBounds(380, 560, 111, 25);

        home.setBackground(new java.awt.Color(0, 255, 255));
        home.setForeground(new java.awt.Color(0, 51, 204));
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home);
        home.setBounds(10, 10, 60, 60);

        table_dropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                table_dropdownItemStateChanged(evt);
            }
        });
        jPanel1.add(table_dropdown);
        table_dropdown.setBounds(290, 350, 270, 31);

        l_n1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        l_n1.setForeground(new java.awt.Color(255, 204, 0));
        l_n1.setText("Welcome ");
        jPanel1.add(l_n1);
        l_n1.setBounds(180, 130, 90, 30);

        l_ID.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        l_ID.setForeground(new java.awt.Color(255, 204, 0));
        l_ID.setText("Id");
        jPanel1.add(l_ID);
        l_ID.setBounds(180, 200, 230, 30);

        l_Username.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        l_Username.setForeground(new java.awt.Color(255, 204, 0));
        l_Username.setText("Mr");
        jPanel1.add(l_Username);
        l_Username.setBounds(290, 130, 230, 30);

        choice_dropdown.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice_dropdownItemStateChanged(evt);
            }
        });
        jPanel1.add(choice_dropdown);
        choice_dropdown.setBounds(290, 470, 270, 31);

        l_c1.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        l_c1.setForeground(new java.awt.Color(255, 204, 0));
        l_c1.setText("Which table would you like to work on?");
        jPanel1.add(l_c1);
        l_c1.setBounds(180, 280, 360, 40);

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jPanel1.add(nav);
        nav.setBounds(0, 0, 110, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String Table;
String Username;
String Password;
String Id;
String Category;
String Choice;

String[] viewable_tables = new String[10];
int viewable_tables_size = 0;
String[] updatable_tables = new String[10];
int updatable_tables_size = 0;
String[] deletable_tables = new String[10];
int deletable_tables_size = 0;

void MySQLConnector_GetUser(){
    try {
    Class.forName("java.sql.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","mysql");
    String s1="select Username, Password, Id, Category from LoginDetails where LoggedIn = 1;";
    Statement st1 = con.createStatement();
    ResultSet rs = st1.executeQuery(s1);
    int rs_size = 0;
    while(rs.next()){
        Username = rs.getString("Username");
        Password = rs.getString("Password");
        Id = rs.getString("Id");
        Category = rs.getString("Category");
        
        rs_size++;
    }
    
    if(rs_size != 1){
        System.out.println("ERROR: Multiple LoggedIn users.");
    }
    
    rs.close();
    con.close();
    }
    catch(ClassNotFoundException | SQLException e){
        System.out.println(e.getMessage());
    }
}

void FindAccesibleTables(String category){
    if(category.equals("Admin")){
        viewable_tables[0] = "Doctors";
        viewable_tables[1] = "Patients";
        viewable_tables[2] = "Rooms";
        viewable_tables[3] = "Staff";
        viewable_tables[4] = "Lab";
        viewable_tables[5] = "Equipment";
        viewable_tables[6] = "MedicalStock";
        viewable_tables[7] = "PatientReport";
        viewable_tables_size = 8;
        
        updatable_tables[0] = "Doctors";
        updatable_tables[1] = "Patients";
        updatable_tables[2] = "Rooms";
        updatable_tables[3] = "Staff";
        updatable_tables[4] = "Lab";
        updatable_tables[5] = "Equipment";
        updatable_tables[6] = "MedicalStock";
        updatable_tables[7] = "PatientReport";
        updatable_tables_size = 8;
        
        deletable_tables[0] = "Doctors";
        deletable_tables[1] = "Patients";
        deletable_tables[2] = "Rooms";
        deletable_tables[3] = "Staff";
        deletable_tables[4] = "Lab";
        deletable_tables[5] = "Equipment";
        deletable_tables[6] = "MedicalStock";
        deletable_tables[7] = "PatientReport";
        deletable_tables_size = 8;
    }
    else if(category.equals("Doctor")){
        viewable_tables[0] = "Doctors";
        viewable_tables[1] = "Patients";
        viewable_tables[2] = "Rooms";
        viewable_tables[3] = "Staff";
        viewable_tables[4] = "Lab";
        viewable_tables[5] = "Equipment";
        viewable_tables[6] = "MedicalStock";
        viewable_tables[7] = "PatientReport";
        viewable_tables_size = 8;
        
        updatable_tables[0] = "PatientReport";
        updatable_tables_size = 1;
        
        deletable_tables_size = 0;
    }
    else if(category.equals("Staff")){
        viewable_tables[0] = "Doctors";
        viewable_tables[1] = "Patients";
        viewable_tables[2] = "Rooms";
        viewable_tables[3] = "Staff";
        viewable_tables[4] = "Lab";
        viewable_tables[5] = "Equipment";
        viewable_tables[6] = "MedicalStock";
        viewable_tables[7] = "PatientReport";
        viewable_tables_size = 8;

        updatable_tables[0] = "Equipment";
        updatable_tables[1] = "MedicalStock";
        updatable_tables_size = 2;

        deletable_tables[0] = "Equipment";
        deletable_tables[1] = "MedicalStock";
        deletable_tables_size = 2;
    }
    else if(category.equals("Patient")){
        viewable_tables[0] = "Doctors";
        viewable_tables[1] = "PatientReport";
        viewable_tables_size = 2;

        updatable_tables_size = 0;

        deletable_tables_size = 0;
    }
}
    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
if(Choice.equals("View")){
    Table_View tv = new Table_View();
    TableChoose.this.setVisible(false);
    tv.setVisible(true);
}
    }//GEN-LAST:event_GoActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
LoginPage h = new LoginPage();
TableChoose.this.setVisible(false);
h.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
int table_index = 0;
Table = table_dropdown.getItemAt(table_index);

int choice_index = 0;
Choice = choice_dropdown.getItemAt(choice_index);

MySQLConnector_GetUser();
l_Username.setText(Username+"!");
l_ID.setText("ID - "+Id);

FindAccesibleTables(Category);
for(int i=0;i<viewable_tables_size;i++){
    table_dropdown.addItem(viewable_tables[i]);
}
    }//GEN-LAST:event_formWindowOpened

    private void table_dropdownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_table_dropdownItemStateChanged
int table_index = table_dropdown.getSelectedIndex();
Table = table_dropdown.getItemAt(table_index);

choice_dropdown.removeAllItems();
for(int i=0;i<viewable_tables_size;i++){
    if(viewable_tables[i].equals(Table)){
        choice_dropdown.addItem("View");
        break;
    }
}
for(int i=0;i<updatable_tables_size;i++){
    if(updatable_tables[i].equals(Table)){
        choice_dropdown.addItem("Update");
        break;
    }
}
for(int i=0;i<deletable_tables_size;i++){
    if(deletable_tables[i].equals(Table)){
        choice_dropdown.addItem("Delete");
        break;
    }
}
    }//GEN-LAST:event_table_dropdownItemStateChanged

    private void choice_dropdownItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice_dropdownItemStateChanged
int choice_index = choice_dropdown.getSelectedIndex();
Choice = choice_dropdown.getItemAt(choice_index);
    }//GEN-LAST:event_choice_dropdownItemStateChanged

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Go;
    private javax.swing.JComboBox<String> choice_dropdown;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_ID;
    private javax.swing.JLabel l_Username;
    private javax.swing.JLabel l_c;
    private javax.swing.JLabel l_c1;
    private javax.swing.JLabel l_n1;
    private javax.swing.JLabel l_t;
    private javax.swing.JPanel nav;
    private javax.swing.JComboBox<String> table_dropdown;
    // End of variables declaration//GEN-END:variables
}

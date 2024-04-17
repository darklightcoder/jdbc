  
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
//

import java.util.ArrayList;

/**
 * @author 1bestcsharp.blogspot.com
 */
public class StudentInfo extends javax.swing.JFrame {

    /**
     * Creates new form Java_JTable_Add_Row_Using_TextBoxes
     */
    public StudentInfo() {
        initComponents();
       // showList();
    }
  
  
  
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                        
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldFN = new javax.swing.JTextField();
        jTextFieldLN = new javax.swing.JTextField();
        jTextFieldAGE = new javax.swing.JTextField();
        btnAddRow = new javax.swing.JButton();
        btnDeleteRow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel1.setText("Id :");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel2.setText("First Name :");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel3.setText("Last Name :");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel4.setText("Age :");

        btnAddRow.setText("Add Student");
        btnDeleteRow.setText("Delete Student");

        btnAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRowActionPerformed(evt);
            }
        });

         btnDeleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRowActionPerformed(evt);
            }
        });

    
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Age"
            }
        ));
       showList();
     
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldFN, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddRow, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(btnDeleteRow, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                      
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldAGE, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldLN, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAGE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddRow, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
               
                
                            //  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addComponent(btnDeleteRow, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)

               
                
                )


               



            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
        setTitle("Java Insert Delete in Mysql");
        setVisible(true);
    }
    

 public Connection getConnection()
   {
       Connection con;
       try {

Class.forName("com.mysql.jdbc.Driver");  
 con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/studentdb","admin","1234");  



            return con;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }



     public void executeSQlQuery(String query, String message)
   {
       Connection con = getConnection();
       Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data

              DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
              model.setRowCount(0);
              initComponents();

             // showList();
             x.dispose();
                x = new StudentInfo();
 
               JOptionPane.showMessageDialog(null, "Student "+message+" Succefully");
               
            
           }else{
               JOptionPane.showMessageDialog(null, "Student Not "+message);
           }
       }catch(Exception ex){
           ex.printStackTrace();JOptionPane.showMessageDialog(null, "Something went wwrong..");
       }
   }

   //
   public void jTable_Display_UsersMouseClicked(java.awt.event.MouseEvent evt) {                                                  
       // Get The Index Of The Slected Row 
      // model = (DefaultTableModel)jTable1.getModel();
       
     // jTable1 = new JTable(model);
         int i=jTable1.getSelectedRow();
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
     
      //  System.out.println(i);
      //  System.out.println(jTable1.getRowCount());
      //  model.setRowCount(jTable1.getRowCount());
      //  TableModel model = jTable1.getModel();
      
         // Display Slected Row In JTexteFields
        jTextFieldID.setText(model.getValueAt(i,0).toString());

        jTextFieldFN.setText(model.getValueAt(i,1).toString());

        jTextFieldLN.setText(model.getValueAt(i,2).toString());

        jTextFieldAGE.setText(model.getValueAt(i,3).toString());
     
    }                                                 
    // button to add the row to the jtable 
    private void btnAddRowActionPerformed(java.awt.event.ActionEvent evt) {                                          
       // get the model from the jtable
       // DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

         // insert row to the model from jtextfields using addRow method
       // model.addRow(new Object[]{jTextFieldID.getText(), jTextFieldFN.getText(),
        //                          jTextFieldLN.getText(), jTextFieldAGE.getText()});
        if(jTextFieldID.getText().equals("") ||jTextFieldLN.getText().equals("") || jTextFieldFN.getText().equals("") || jTextFieldAGE.getText().equals(""))
               JOptionPane.showMessageDialog(null, "Please complete entries...");
        else{
        String sql="insert into students (id,lastname,firstname,age) values ("+jTextFieldID.getText()+",'"+jTextFieldLN.getText()+"','"+jTextFieldFN.getText()+"',"+jTextFieldAGE.getText()+")";
        executeSQlQuery(sql,"inserted");
        }
       // showList();
       
        // initComponents();
    }                                       
    
        // button to add the row to the jtable 
    private void btnDeleteRowActionPerformed(java.awt.event.ActionEvent evt) {                                          
       // get the model from the jtable
       // DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

         // insert row to the model from jtextfields using addRow method
       // model.addRow(new Object[]{jTextFieldID.getText(), jTextFieldFN.getText(),
        //                          jTextFieldLN.getText(), jTextFieldAGE.getText()});
          if(jTextFieldID.getText().equals(""))
               JOptionPane.showMessageDialog(null, "Id No. needed. Enter id or Please select a record from table...");
        else{
        String sql="delete from students where id="+jTextFieldID.getText();
        executeSQlQuery(sql,"Deleted");}
        //showList();
        // initComponents();
    }              
    //
private void showList(){
 
  int rcount=0;
  
  //data = new Vector();
  //DefaultTableModel model = new DefaultTableModel(null, columnNames);
  
 //  columnNames = new Vector();
  // data = new Vector();
try 
{

Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/studentdb","admin","1234");  


String sql = "Select * from students";
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery( sql );
ResultSetMetaData md = rs.getMetaData();
int columns = md.getColumnCount();

//model.setRowCount(0);

 //model = (DefaultTableModel)jTable1.getModel();

for (int i = 1; i <= columns; i++) {
columnNames.addElement( md.getColumnName(i) );
}

while (rs.next()) {
Vector row = new Vector(columns);
for (int i = 1; i <= columns; i++){
row.addElement( rs.getObject(i) );
}
data.addElement( row );
//model.addRow(row);
//rcount++;
}
rs.close();
stmt.close();
}
catch(Exception e){
System.out.println(e);
}

//model = new DefaultTableModel(data, columnNames);

DefaultTableModel model = new DefaultTableModel(data, columnNames);

jTable1.setModel(model);
//jTable1 = new JTable(data, columnNames);
jTable1.setDefaultEditor(Object.class,null);
TableColumn col;
for (int i = 0; i < jTable1.getColumnCount(); i++) {
col = jTable1.getColumnModel().getColumn(i);
col.setMaxWidth(250);
}

 
 jScrollPane1 = new JScrollPane( jTable1 );
 jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Display_UsersMouseClicked(evt);

          
            }
        });
}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        x = new StudentInfo();
               
        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                x = new StudentInfo();
               
            }
        });*/
    }

    // Variables declaration - do not modify                  
    private javax.swing.JButton btnAddRow;
    private javax.swing.JButton btnDeleteRow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAGE;
    private javax.swing.JTextField jTextFieldFN;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLN;
    Vector columnNames = new Vector();
    Vector data = new Vector();
    static StudentInfo x;
    // End of variables declaration                
}
    
    
   

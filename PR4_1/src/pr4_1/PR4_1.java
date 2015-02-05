/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr4_1;
import java.io.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
/**
 *
 * @author Eli Gavett
 */
public class PR4_1 extends javax.swing.JFrame {
    static ArrayList<Restaurant> restaurants = new ArrayList<>();
    /**
     * Creates new form PR4_1
     */
    public PR4_1() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jLblTitle = new javax.swing.JLabel();
        jLblAccess = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstReviews = new javax.swing.JList();
        jBtnGo = new javax.swing.JButton();
        jLblNew = new javax.swing.JLabel();
        jLblName = new javax.swing.JLabel();
        jLblAddress = new javax.swing.JLabel();
        jLblRating = new javax.swing.JLabel();
        jLblNotes = new javax.swing.JLabel();
        jTFName = new javax.swing.JTextField();
        jTFAddress = new javax.swing.JTextField();
        jSpnrRating = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTANotes = new javax.swing.JTextArea();
        jBtnSave = new javax.swing.JButton();
        jLblDisTitle = new javax.swing.JLabel();
        jLblDisName = new javax.swing.JLabel();
        jLblDisAddress = new javax.swing.JLabel();
        jLblDisRating = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTADisNotes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLblTitle.setText("Restaurant Reviewer");

        jLblAccess.setText("Access previous reviews:");

        jLstReviews.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLstReviews);

        jBtnGo.setText("Go!");
        jBtnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGoActionPerformed(evt);
            }
        });

        jLblNew.setText("Create new review:");

        jLblName.setText("Name:");

        jLblAddress.setText("Address:");

        jLblRating.setText("Rating:");

        jLblNotes.setText("Notes:");

        jTFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNameActionPerformed(evt);
            }
        });

        jTFAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFAddressActionPerformed(evt);
            }
        });

        jSpnrRating.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jTANotes.setColumns(20);
        jTANotes.setRows(5);
        jScrollPane2.setViewportView(jTANotes);

        jBtnSave.setText("Save");
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });

        jLblDisTitle.setText("Display Old Review:");

        jLblDisName.setText("Name: ---");

        jLblDisAddress.setText("Address: ---");

        jLblDisRating.setText("Rating: -");

        jTADisNotes.setColumns(20);
        jTADisNotes.setRows(5);
        jTADisNotes.setText("Notes: ---");
        jScrollPane3.setViewportView(jTADisNotes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLblTitle)
                            .addComponent(jLblAccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jBtnGo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnSave)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblName)
                                .addGap(18, 18, 18)
                                .addComponent(jTFName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFAddress))
                            .addComponent(jLblNew)
                            .addComponent(jLblNotes)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLblRating)
                                .addGap(18, 18, 18)
                                .addComponent(jSpnrRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblDisTitle)
                            .addComponent(jLblDisName)
                            .addComponent(jLblDisAddress)
                            .addComponent(jLblDisRating)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblAccess)
                    .addComponent(jLblNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnGo)
                            .addComponent(jBtnSave))
                        .addGap(88, 88, 88)
                        .addComponent(jLblDisTitle)
                        .addGap(18, 18, 18)
                        .addComponent(jLblDisName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblDisAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLblDisRating))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblName)
                            .addComponent(jTFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblAddress)
                            .addComponent(jTFAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblRating)
                            .addComponent(jSpnrRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addComponent(jLblNotes)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNameActionPerformed

    private void jTFAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFAddressActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        String n = jTFName.getText();
        String a = jTFAddress.getText();
        int r = (Integer)jSpnrRating.getValue();
        String no = jTANotes.getText();
        
        Restaurant rest = new Restaurant(n, a, no, r);
        
        restaurants.add(rest);
        updateList();
        displayReview(rest);
        writeFile("C:\\Users\\Eli Gavett\\Documents\\GitHub\\CS372\\PR4_1\\Reviews.txt");
    }//GEN-LAST:event_jBtnSaveActionPerformed

    private void jBtnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGoActionPerformed
        try{
            int index = jLstReviews.getSelectedIndex();
            Restaurant r = restaurants.get(index);
            displayReview(r);
        }
        catch (Exception ex){
            System.out.printf("Exception encountered finding review: %s\n", ex.getMessage());
        }
    }//GEN-LAST:event_jBtnGoActionPerformed

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
            java.util.logging.Logger.getLogger(PR4_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PR4_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PR4_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PR4_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PR4_1().setVisible(true);
                readFile("C:\\Users\\Eli Gavett\\Documents\\GitHub\\CS372\\PR4_1\\Reviews.txt");
                updateList();
            }
        });
    }
    
    /*
    * imports revies information from a txt file and stores them in an arraylist
    * @param String loc the file location
    */
    public static void readFile(String loc){
        try{
            File file = new File(loc);
            BufferedReader rdr = new BufferedReader(new FileReader(file));
            String line;
            while((line = rdr.readLine()) != null){
                String n = line;
                String a = rdr.readLine();
                int r = Integer.parseInt(rdr.readLine());
                String no = rdr.readLine();
                restaurants.add(new Restaurant(n, a, no, r));
            }
            rdr.close();
        }
        catch (Exception ex){
            System.out.printf("Unexpected error reading from disk: %s\n", ex.getMessage());
        }
    }
    
    /*
    * takes review information and stores them in a txt file
    * @param String loc the file location
    */
    public static void writeFile(String loc){
        try{
            File file = new File(loc);
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(file));
            for(int a = 0; a < restaurants.size(); a++){
                restaurants.get(a).writeReivew(wrtr);
            }
            wrtr.close();
        }
        catch (Exception ex){
            System.out.printf("Unexpected error writing to disk: %s\n", ex.getMessage());
        }
    }
    
    /*
    * updates jLstReviews with a list of all current reviews
    */
    public static void updateList(){
        DefaultListModel listModel = new DefaultListModel();
        for(int a = 0; a < restaurants.size(); a++)
            listModel.addElement(restaurants.get(a).getName());
        jLstReviews.setModel(listModel);
    }
    
    /*
    * Displays reviews information in the bottom portion of the screen
    * @param Restaurant r the restaurant whose information we want to display
    */
    public void displayReview(Restaurant r){
        jLblDisName.setText("Name: " + r.getName());
        jLblDisAddress.setText("Address: " + r.getAddress());
        jLblDisRating.setText("Rating: " + r.getRating());
        jTADisNotes.setText("Notes: " + r.getNotes());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGo;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JLabel jLblAccess;
    private javax.swing.JLabel jLblAddress;
    private javax.swing.JLabel jLblDisAddress;
    private javax.swing.JLabel jLblDisName;
    private javax.swing.JLabel jLblDisRating;
    private javax.swing.JLabel jLblDisTitle;
    private javax.swing.JLabel jLblName;
    private javax.swing.JLabel jLblNew;
    private javax.swing.JLabel jLblNotes;
    private javax.swing.JLabel jLblRating;
    private javax.swing.JLabel jLblTitle;
    private static javax.swing.JList jLstReviews;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpnrRating;
    private javax.swing.JTextArea jTADisNotes;
    private javax.swing.JTextArea jTANotes;
    private javax.swing.JTextField jTFAddress;
    private javax.swing.JTextField jTFName;
    // End of variables declaration//GEN-END:variables
}
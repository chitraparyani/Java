/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CriminalCheckRole;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HomeStudyEnterprise;
import Business.Network.Network;
import Business.Organization.CriminalCheckOrganization;
import Business.Organization.FinancialCheckOrganization;
import Business.Organization.ManagementOrganization;
import Business.Organization.Organization;
import Business.ProspectiveParent.ProspectiveParent;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CriminalCheckWorkRequest;
import Business.WorkQueue.FinancialCheckWorkRequest;
import Business.WorkQueue.WorkRequest;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static userInterface.RegisterParentRole.RegisterParent1JPanel.sendEmail;

/**
 *
 * @author kinnari
 */
public class CriminalCheckWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CriminalCheckWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private CriminalCheckOrganization organization;
    private HomeStudyEnterprise enterprise;
    private EcoSystem business;

    public CriminalCheckWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CriminalCheckOrganization criminalCheckOrganization, HomeStudyEnterprise homeStudyEnterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = homeStudyEnterprise;
        this.organization = criminalCheckOrganization;
        this.business = business;
        refreshData();
        populateRequestTable();
        populateRequestAssignedToMeJTable();
        populateFinancialRequestTable();

    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request.getReceiver() == null) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getStatus();
                row[4] = request.isProcessedFlag();
                row[5] = request.getParent().getEmailId();

                // String result = ((FinancialCheckWorkRequest) request).getStatus();
                //row[3] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }

    }

    public void populateRequestAssignedToMeJTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestAssignedToMeJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request.isProcessedFlag() == false && request.getReceiver() != null) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getStatus();
                row[4] = request.isProcessedFlag();
                row[5] = request.getParent().getEmailId();
                // String result = ((FinancialCheckWorkRequest) request).getStatus();
                //row[3] = result == null ? "Waiting" : result;
                model.addRow(row);
            }
        }

    }

    public void populateFinancialRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workFinancialRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            if (request.isProcessedFlag() == true) {
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();               
                String result = ((FinancialCheckWorkRequest) request).getStatus();
                row[3] = result == null ? "Waiting" : result;
                row[4] = request.getParent().getEmailId();
             
                model.addRow(row);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        workFinancialRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestAssignedToMeJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parent", "Sender", "Receiver", "Status", "processed", "EmailID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        workFinancialRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parent", "Sender", "Receiver", "Status", "processed", "EmailId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workFinancialRequestJTable);

        jLabel1.setText("Request sent for Financial Check");

        jLabel2.setText("Request from management office for criminal check:");

        workRequestAssignedToMeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parent", "Sender", "Receiver", "Status", "processed", "EmailId"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestAssignedToMeJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(workRequestAssignedToMeJTable);

        jLabel3.setText("Request Assigned To Me:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(367, 367, 367)
                                        .addComponent(refreshJButton))
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(assignJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(processJButton)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(refreshJButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(assignJButton)
                        .addGap(120, 120, 120)
                        .addComponent(processJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestAssignedToMeJTable.getSelectedRow();

        if (selectedRow < 0) {

            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
        } else {

            CriminalCheckWorkRequest request = (CriminalCheckWorkRequest) workRequestAssignedToMeJTable.getValueAt(selectedRow, 0);

            ProspectiveParent p1 = request.getParent();

            if (p1.isCrime() == true) {
                request.setStatus("Parent is not eligible for adoption");
                sendEmail("parent2202@gmail.com", "Parent@2202", request.getParent().getEmailId().toString(), "Status Update || Criminal Check Request Rejected", "Dear " + request.getParent().toString() + "," + "Sorry, Your Application has been rejected by Criminal Check Organization and you are not eligible for adoption");
                JOptionPane.showMessageDialog(null, "Parent is not eligible for adoption ");
            } else {

                FinancialCheckWorkRequest req = new FinancialCheckWorkRequest();

                req.setSender(account);
                req.setParent(request.getParent());
                String email = request.getParent().getEmailId();
                req.setStatus("Initiate financial check");
                request.setProcessedFlag(true);
                req.setProcessedFlag(true);

                changeStatusOncompletion(request);
                Organization org = null;
                for (Organization organiz : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organiz instanceof FinancialCheckOrganization) {
                        org = organiz;
                        break;
                    }

                }
                if (org != null) {

                    org.getWorkQueue().getWorkRequestList().add(req);
                    account.getWorkQueue().getWorkRequestList().add(req);
                    JOptionPane.showMessageDialog(null, "Request message sent to Financial check Organization");
                    sendEmail("parent2202@gmail.com", "Parent@2202", email, "Status Update || Criminal Check Request Approved", "Dear " + req.getParent().toString() + "," + "Congrats, Your Application status has been Approved by Criminal Check Organization and Now, it is under pending with financial check organization");
                    populateRequestTable();
                }

            }
        }
        populateRequestAssignedToMeJTable();
        populateFinancialRequestTable();

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateRequestTable();
        populateRequestAssignedToMeJTable();
        populateFinancialRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Criminal Check Initiated");
        request.setProcessedFlag(false);
        populateRequestTable();
        populateRequestAssignedToMeJTable();

    }//GEN-LAST:event_assignJButtonActionPerformed
    public void refreshData() {

        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getWorkQueue().getWorkRequestList() != null) {
                for (WorkRequest w : o.getWorkQueue().getWorkRequestList()) {
                    if (w.getReceiver() != null && account.getWorkQueue().getWorkRequestList() != null) {
                        for (WorkRequest Req : account.getWorkQueue().getWorkRequestList()) {
                            //w.setStatus(c);
                            if (w.getParent().equals(Req.getParent())) {
                                String status = Req.getStatus();
                                w.setStatus(status);
                            }
                        }
                    }

                }
            }
        }
    }

    public void changeStatusOncompletion(WorkRequest request) {

        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                if (e instanceof AdoptionEnterprise) {

                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {

                        if (o instanceof ManagementOrganization) {

                            for (WorkRequest w : o.getWorkQueue().getWorkRequestList()) {
                                if (request.getParent().equals(w.getParent())) {
                                    w.setStatus("criminal check complete");
                                }
                                w.setMessage("Financial check intiated");
                            }
                        }
                    }
                }
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workFinancialRequestJTable;
    private javax.swing.JTable workRequestAssignedToMeJTable;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}

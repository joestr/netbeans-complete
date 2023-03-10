/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * PropertyEditorPanel.java
 *
 * Created on 01.04.2011, 20:25:24
 */
package org.netbeans.modules.db.util;

import java.util.Arrays;
import java.util.Properties;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 * Custom implentation for a property editor, as the build in doesn't work to
 * well with international characters
 *
 * @author Matthias BlÃ¤sing
 */
public class PropertyEditorPanel extends javax.swing.JPanel {

    public static final String PROP_VALUE = "value";
    private Properties value;
    private boolean editable;
    private boolean updateing;

    public PropertyEditorPanel(Properties initalValue, boolean editable) {
        initComponents();
        this.value = initalValue;
        this.editable = editable;
        propertyTable.putClientProperty(
                "terminateEditOnFocusLost", Boolean.TRUE);              //NOI18N
        updateTableFromEditor();
        final TableModel tm = propertyTable.getModel();
        tm.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent tme) {
                synchronized (PropertyEditorPanel.this) {
                    if (updateing) {
                        return;
                    }
                    updateing = true;
                    Properties p = new Properties();
                    for (int i = 0; i < tm.getRowCount(); i++) {
                        p.setProperty((String) tm.getValueAt(i, 0), (String) tm.getValueAt(i, 1));
                    }
                    Properties oldValue = value;
                    value = p;
                    firePropertyChange(PROP_VALUE, oldValue, value);
                    updateing = false;
                }
            }
        });
        propertyTable.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent lse) {
                        updateRemoveButtonSensible();
                    }
                });
        updateAddButtonSensible();
        updateRemoveButtonSensible();
    }

    private void updateAddButtonSensible() {
        if (this.editable) {
            addRowButton.setEnabled(true);
        } else {
            addRowButton.setEnabled(false);
        }
    }

    private void updateRemoveButtonSensible() {
        if (this.editable && propertyTable.getSelectedRowCount() > 0) {
            removeRowButton.setEnabled(true);
        } else {
            removeRowButton.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    private void updateTableFromEditor() {
        synchronized (this) {
            if (updateing) {
                return;
            }
            updateing = true;
            DefaultTableModel dtm = (DefaultTableModel) propertyTable.getModel();
            Vector columns = new Vector(2);
            Vector values = new Vector();
            columns.add(dtm.getColumnName(0));
            columns.add(dtm.getColumnName(1));
            if (value != null) {
                for (String key : value.stringPropertyNames()) {
                    Vector row = new Vector(2);
                    row.add(key);
                    row.add(value.getProperty(key, ""));
                    values.add(row);
                }
            }
            dtm.setDataVector(values, columns);
            updateing = false;
        }
    }

    public Properties getValue() {
        return value;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        addRowButton = new javax.swing.JButton();
        removeRowButton = new javax.swing.JButton();
        propertyScrollPane = new javax.swing.JScrollPane();
        propertyTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        buttonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        addRowButton.setText(org.openide.util.NbBundle.getMessage(PropertyEditorPanel.class, "PropertyEditorPanel.addRowButton.text")); // NOI18N
        addRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRowButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(addRowButton);

        removeRowButton.setText(org.openide.util.NbBundle.getMessage(PropertyEditorPanel.class, "PropertyEditorPanel.removeRowButton.text")); // NOI18N
        removeRowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRowButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(removeRowButton);

        add(buttonPanel, java.awt.BorderLayout.PAGE_END);

        propertyTable.setAutoCreateRowSorter(true);
        propertyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Property", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return PropertyEditorPanel.this.editable;
            }
        });
        propertyTable.setColumnSelectionAllowed(true);
        propertyTable.setShowGrid(true);
        propertyScrollPane.setViewportView(propertyTable);
        propertyTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (propertyTable.getColumnModel().getColumnCount() > 0) {
            propertyTable.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(PropertyEditorPanel.class, "PropertyEditorPanel.propertyTable.columnModel.title0")); // NOI18N
            propertyTable.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(PropertyEditorPanel.class, "PropertyEditorPanel.propertyTable.columnModel.title1")); // NOI18N
        }

        add(propertyScrollPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addRowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRowButtonActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) propertyTable.getModel();
        dtm.addRow(new Object[]{"", ""});
    }//GEN-LAST:event_addRowButtonActionPerformed

    private void removeRowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRowButtonActionPerformed
        int[] viewRows = propertyTable.getSelectedRows();
        int[] modelRows = new int[viewRows.length];

        for (int i = 0; i < viewRows.length; i++) {
            modelRows[i] = propertyTable.convertRowIndexToModel(viewRows[i]);
        }

        Arrays.sort(modelRows);

        DefaultTableModel dtm = (DefaultTableModel) propertyTable.getModel();

        for (int i = modelRows.length - 1; i >= 0; i--) {
            dtm.removeRow(modelRows[i]);
        }
    }//GEN-LAST:event_removeRowButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRowButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JScrollPane propertyScrollPane;
    private javax.swing.JTable propertyTable;
    private javax.swing.JButton removeRowButton;
    // End of variables declaration//GEN-END:variables
}

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
package org.netbeans.modules.uihandler;

import java.awt.Cursor;
import java.net.MalformedURLException;
import java.net.URL;
import org.openide.util.NbBundle;

/**
 * Created on December 11, 2007, 4:01 PM
 * @author  Marek Slama
 */
public class ReminderPanel extends javax.swing.JPanel {
    
    /** Creates new form ReminderPanel */
    public ReminderPanel() {
        initComponents();
        setText();
    }
    
    private void setText () {
        jBottomLabel1.setText(NbBundle.getMessage(ReminderPanel.class, "LBL_BottomText1"));
        jBottomLabel2.setText(NbBundle.getMessage(ReminderPanel.class, "LBL_BottomText2"));
        jBottomLabel3.setText(NbBundle.getMessage(ReminderPanel.class, "LBL_BottomText3"));
        
        lblLearnMore.setText(NbBundle.getMessage(ReminderPanel.class, "LBL_LearnMore"));
        lblLearnMore.getAccessibleContext().setAccessibleName
        (NbBundle.getMessage(ReminderPanel.class, "ACSN_LearnMore"));
        lblLearnMore.getAccessibleContext().setAccessibleDescription
        (NbBundle.getMessage(ReminderPanel.class, "ACSD_LearnMore"));
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBottomLabel1 = new javax.swing.JLabel();
        jBottomLabel2 = new javax.swing.JLabel();
        jBottomLabel3 = new javax.swing.JLabel();
        lblLearnMore = new javax.swing.JLabel();

        setFocusable(false);

        jBottomLabel1.setText("<html>Help us improve the NetBeans IDE by providing anonymous usage data.</html>"); // NOI18N
        jBottomLabel1.setFocusable(false);
        jBottomLabel1.setRequestFocusEnabled(false);

        jBottomLabel2.setText("<html>If you agree to participate, the IDE will send anonymous information about the high-level features that you use to a database at netbeans.org.</html>"); // NOI18N
        jBottomLabel2.setFocusable(false);
        jBottomLabel2.setRequestFocusEnabled(false);

        jBottomLabel3.setText("<html>The usage statistics help us better understand user requirements and prioritize improvements in future releases. We will never reverse-engineer the collected data to find specific details about your projects.</html>"); // NOI18N
        jBottomLabel3.setFocusable(false);
        jBottomLabel3.setRequestFocusEnabled(false);

        lblLearnMore.setText("<html><font color=\"#0000FF\" <u>Learn more</u></font></html>"); // NOI18N
        lblLearnMore.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLearnMoreMouseEntered(evt);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLearnMoreMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBottomLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addComponent(jBottomLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addComponent(lblLearnMore, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                    .addComponent(jBottomLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBottomLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBottomLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBottomLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLearnMore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBottomLabel1.getAccessibleContext().setAccessibleName(""); // NOI18N
        jBottomLabel2.getAccessibleContext().setAccessibleName(""); // NOI18N
        jBottomLabel3.getAccessibleContext().setAccessibleName(""); // NOI18N
        lblLearnMore.getAccessibleContext().setAccessibleName(""); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void lblLearnMoreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLearnMoreMouseEntered
        evt.getComponent().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
}//GEN-LAST:event_lblLearnMoreMouseEntered

    private void lblLearnMoreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLearnMoreMousePressed
        URL u = null;
        try {
            u = new URL(NbBundle.getMessage(ReminderPanel.class, "METRICS_INFO_URL"));
        } catch (MalformedURLException exc) {
        }
        if (u != null) {
            org.openide.awt.HtmlBrowser.URLDisplayer.getDefault().showURL(u);
        }
    }//GEN-LAST:event_lblLearnMoreMousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBottomLabel1;
    private javax.swing.JLabel jBottomLabel2;
    private javax.swing.JLabel jBottomLabel3;
    private javax.swing.JLabel lblLearnMore;
    // End of variables declaration//GEN-END:variables
    
}

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

package org.netbeans.modules.java.ui;

import static org.netbeans.modules.java.ui.FmtOptions.*;
import static org.netbeans.modules.java.ui.CategorySupport.OPTION_ID;
import org.netbeans.modules.options.editor.spi.PreferencesCustomizer;

/**
 *
 * @author  phrebejk
 */
public class FmtTabsIndents extends javax.swing.JPanel {
   
    /** Creates new form FmtTabsIndents */
    public FmtTabsIndents() {
        initComponents();
        
//        expandTabCheckBox.putClientProperty(OPTION_ID, expandTabToSpaces);
//        tabSizeField.putClientProperty(OPTION_ID, tabSize);
//        indentSizeField.putClientProperty(OPTION_ID, new String [] { indentSize, spacesPerTab });
        continuationIndentSizeField.putClientProperty(OPTION_ID, continuationIndentSize);
        labelIndentField.putClientProperty(OPTION_ID, labelIndent);
        absoluteLabelIndentCheckBox.putClientProperty(OPTION_ID, absoluteLabelIndent);
        indentTopLevelClassMembersCheckBox.putClientProperty(OPTION_ID, indentTopLevelClassMembers);
        indentCasesFromSwitchCheckBox.putClientProperty(OPTION_ID, indentCasesFromSwitch);
//        rightMarginField.putClientProperty(OPTION_ID, rightMargin);
    }
    
    public static PreferencesCustomizer.Factory getController() {
        return new CategorySupport.Factory(PreferencesCustomizer.TABS_AND_INDENTS_ID, FmtTabsIndents.class, //NOI18N
                org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "SAMPLE_TabsIndents"), // NOI18N
                new String[] { FmtOptions.blankLinesBeforeClass, "0" }
                );
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        continuationIndentSizeLabel = new javax.swing.JLabel();
        continuationIndentSizeField = new javax.swing.JTextField();
        labelIndentLabel = new javax.swing.JLabel();
        labelIndentField = new javax.swing.JTextField();
        absoluteLabelIndentCheckBox = new javax.swing.JCheckBox();
        indentTopLevelClassMembersCheckBox = new javax.swing.JCheckBox();
        indentCasesFromSwitchCheckBox = new javax.swing.JCheckBox();

        setName(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "LBL_TabsAndIndents")); // NOI18N
        setOpaque(false);

        continuationIndentSizeLabel.setLabelFor(continuationIndentSizeField);
        org.openide.awt.Mnemonics.setLocalizedText(continuationIndentSizeLabel, org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "LBL_ContinuationIndentSize")); // NOI18N

        labelIndentLabel.setLabelFor(labelIndentField);
        org.openide.awt.Mnemonics.setLocalizedText(labelIndentLabel, org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "LBL_LabelIndent")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(absoluteLabelIndentCheckBox, org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "LBL_AbsoluteLabelIndent")); // NOI18N
        absoluteLabelIndentCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(indentTopLevelClassMembersCheckBox, org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "LBL_IndentTopLevelClassMemberts")); // NOI18N
        indentTopLevelClassMembersCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        org.openide.awt.Mnemonics.setLocalizedText(indentCasesFromSwitchCheckBox, org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "LBL_IndentCasesFromSwitch")); // NOI18N
        indentCasesFromSwitchCheckBox.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(continuationIndentSizeLabel)
                            .addComponent(labelIndentLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(continuationIndentSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelIndentField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indentCasesFromSwitchCheckBox)
                            .addComponent(indentTopLevelClassMembersCheckBox)
                            .addComponent(absoluteLabelIndentCheckBox))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {continuationIndentSizeField, labelIndentField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continuationIndentSizeLabel)
                    .addComponent(continuationIndentSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIndentLabel)
                    .addComponent(labelIndentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(absoluteLabelIndentCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indentTopLevelClassMembersCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(indentCasesFromSwitchCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        continuationIndentSizeField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.continuationIndentSizeField.AccessibleContext.accessibleDescription")); // NOI18N
        labelIndentField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.labelIndentField.AccessibleContext.accessibleDescription")); // NOI18N
        absoluteLabelIndentCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.absoluteLabelIndentCheckBox.AccessibleContext.accessibleDescription")); // NOI18N
        indentTopLevelClassMembersCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.indentTopLevelClassMembersCheckBox.AccessibleContext.accessibleDescription")); // NOI18N
        indentCasesFromSwitchCheckBox.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.indentCasesFromSwitchCheckBox.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox absoluteLabelIndentCheckBox;
    private javax.swing.JTextField continuationIndentSizeField;
    private javax.swing.JLabel continuationIndentSizeLabel;
    private javax.swing.JCheckBox indentCasesFromSwitchCheckBox;
    private javax.swing.JCheckBox indentTopLevelClassMembersCheckBox;
    private javax.swing.JTextField labelIndentField;
    private javax.swing.JLabel labelIndentLabel;
    // End of variables declaration//GEN-END:variables
    
}

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
public class FmtBlankLines extends javax.swing.JPanel {
    
    /** Creates new form FmtBlankLines */
    public FmtBlankLines() {
        initComponents();

        inDeclarationsField.putClientProperty(OPTION_ID, blankLinesInDeclarations);
        inCodeField.putClientProperty(OPTION_ID, blankLinesInCode);
        bPackageField.putClientProperty(OPTION_ID, blankLinesBeforePackage );
        aPackageField.putClientProperty(OPTION_ID, blankLinesAfterPackage);
        bImportsField.putClientProperty(OPTION_ID, blankLinesBeforeImports);
        aImportsField.putClientProperty(OPTION_ID, blankLinesAfterImports);
        bClassField.putClientProperty(OPTION_ID, blankLinesBeforeClass);
        aClassField.putClientProperty(OPTION_ID, blankLinesAfterClass);
        aClassHeaderField.putClientProperty(OPTION_ID, blankLinesAfterClassHeader);
        anAnonymousClassHeaderField.putClientProperty(OPTION_ID, blankLinesAfterAnonymousClassHeader);
        anEnumHeaderField.putClientProperty(OPTION_ID, blankLinesAfterEnumHeader);
        aClassFooterField.putClientProperty(OPTION_ID, blankLinesBeforeClassClosingBrace);
        anAnonymousClassFooterField.putClientProperty(OPTION_ID, blankLinesBeforeAnonymousClosingBrace);
        anEnumFooterField.putClientProperty(OPTION_ID, blankLinesBeforeEnumClosingBrace);
        bFieldsField.putClientProperty(OPTION_ID, blankLinesBeforeFields);
        aFieldsField.putClientProperty(OPTION_ID, blankLinesAfterFields);
        bMethodsField.putClientProperty(OPTION_ID, blankLinesBeforeMethods );
        aMethodsField.putClientProperty(OPTION_ID, blankLinesAfterMethods);
        
        inDeclarationsField.addKeyListener(new NumericKeyListener());
        inCodeField.addKeyListener(new NumericKeyListener());
        bPackageField.addKeyListener(new NumericKeyListener());
        aPackageField.addKeyListener(new NumericKeyListener());
        bImportsField.addKeyListener(new NumericKeyListener());
        aImportsField.addKeyListener(new NumericKeyListener());
        bClassField.addKeyListener(new NumericKeyListener());
        aClassField.addKeyListener(new NumericKeyListener());
        aClassHeaderField.addKeyListener(new NumericKeyListener());
        anAnonymousClassHeaderField.addKeyListener(new NumericKeyListener());
        aClassFooterField.addKeyListener(new NumericKeyListener());
        anAnonymousClassFooterField.addKeyListener(new NumericKeyListener());
        bFieldsField.addKeyListener(new NumericKeyListener());
        aFieldsField.addKeyListener(new NumericKeyListener());
        bMethodsField.addKeyListener(new NumericKeyListener());
        aMethodsField.addKeyListener(new NumericKeyListener());
        
    }
    
    public static PreferencesCustomizer.Factory getController() {
        return new CategorySupport.Factory("blank-lines", FmtBlankLines.class, //NOI18N
                 org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "SAMPLE_BlankLines")); // NOI18N
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maxLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        inDeclarationsLabel = new javax.swing.JLabel();
        inDeclarationsField = new javax.swing.JTextField();
        inCodeLabel = new javax.swing.JLabel();
        inCodeField = new javax.swing.JTextField();
        minLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        bPackageLabel = new javax.swing.JLabel();
        bPackageField = new javax.swing.JTextField();
        aPackageLabel = new javax.swing.JLabel();
        aPackageField = new javax.swing.JTextField();
        bImportsLabel = new javax.swing.JLabel();
        bImportsField = new javax.swing.JTextField();
        aImports = new javax.swing.JLabel();
        aImportsField = new javax.swing.JTextField();
        bClassLabel = new javax.swing.JLabel();
        bClassField = new javax.swing.JTextField();
        aClassLabel = new javax.swing.JLabel();
        aClassField = new javax.swing.JTextField();
        aClassHeaderLabel = new javax.swing.JLabel();
        aClassHeaderField = new javax.swing.JTextField();
        anAnonymousClassHeaderLabel = new javax.swing.JLabel();
        anAnonymousClassHeaderField = new javax.swing.JTextField();
        aClassFooterLabel = new javax.swing.JLabel();
        aClassFooterField = new javax.swing.JTextField();
        anAnonymousClassFooterLabel = new javax.swing.JLabel();
        anAnonymousClassFooterField = new javax.swing.JTextField();
        bFieldsLabel = new javax.swing.JLabel();
        bFieldsField = new javax.swing.JTextField();
        aFieldsLabel = new javax.swing.JLabel();
        aFieldsField = new javax.swing.JTextField();
        bMethodsLabel = new javax.swing.JLabel();
        bMethodsField = new javax.swing.JTextField();
        aMethodsLabel = new javax.swing.JLabel();
        aMethodsField = new javax.swing.JTextField();
        anEnumHeaderLabel = new javax.swing.JLabel();
        anEnumHeaderField = new javax.swing.JTextField();
        anEnumFooterLabel = new javax.swing.JLabel();
        anEnumFooterField = new javax.swing.JTextField();

        setName(org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_BlankLines")); // NOI18N
        setOpaque(false);

        org.openide.awt.Mnemonics.setLocalizedText(maxLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blMax")); // NOI18N

        inDeclarationsLabel.setLabelFor(inDeclarationsField);
        org.openide.awt.Mnemonics.setLocalizedText(inDeclarationsLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blInDeclarations")); // NOI18N

        inCodeLabel.setLabelFor(inCodeField);
        org.openide.awt.Mnemonics.setLocalizedText(inCodeLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blInCode")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(minLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blMin")); // NOI18N

        bPackageLabel.setLabelFor(bPackageField);
        org.openide.awt.Mnemonics.setLocalizedText(bPackageLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blBeforePackage")); // NOI18N

        bPackageField.setColumns(2);

        aPackageLabel.setLabelFor(aPackageField);
        org.openide.awt.Mnemonics.setLocalizedText(aPackageLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blAfterPackage")); // NOI18N

        aPackageField.setColumns(5);

        bImportsLabel.setLabelFor(bImportsField);
        org.openide.awt.Mnemonics.setLocalizedText(bImportsLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blBeforeImports")); // NOI18N

        bImportsField.setColumns(5);

        aImports.setLabelFor(aImportsField);
        org.openide.awt.Mnemonics.setLocalizedText(aImports, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blAfterImports")); // NOI18N

        aImportsField.setColumns(5);

        bClassLabel.setLabelFor(bClassField);
        org.openide.awt.Mnemonics.setLocalizedText(bClassLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blBeforeClass")); // NOI18N

        bClassField.setColumns(5);

        aClassLabel.setLabelFor(aClassField);
        org.openide.awt.Mnemonics.setLocalizedText(aClassLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blAfterClass")); // NOI18N

        aClassField.setColumns(5);

        aClassHeaderLabel.setLabelFor(aClassHeaderField);
        org.openide.awt.Mnemonics.setLocalizedText(aClassHeaderLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blAfterClassHeader")); // NOI18N

        aClassHeaderField.setColumns(5);

        anAnonymousClassHeaderLabel.setLabelFor(anAnonymousClassHeaderField);
        org.openide.awt.Mnemonics.setLocalizedText(anAnonymousClassHeaderLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blAfterAnonymousClassHeader")); // NOI18N

        aClassFooterLabel.setLabelFor(aClassFooterField);
        org.openide.awt.Mnemonics.setLocalizedText(aClassFooterLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blBeforeClassFooter")); // NOI18N

        aClassFooterField.setColumns(5);

        anAnonymousClassFooterLabel.setLabelFor(anAnonymousClassFooterField);
        org.openide.awt.Mnemonics.setLocalizedText(anAnonymousClassFooterLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blBeforeAnonymousClassFooter")); // NOI18N

        bFieldsLabel.setLabelFor(bFieldsField);
        org.openide.awt.Mnemonics.setLocalizedText(bFieldsLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blBeforeFields")); // NOI18N

        bFieldsField.setColumns(5);

        aFieldsLabel.setLabelFor(aFieldsField);
        org.openide.awt.Mnemonics.setLocalizedText(aFieldsLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blAfterFields")); // NOI18N

        aFieldsField.setColumns(5);

        bMethodsLabel.setLabelFor(bMethodsField);
        org.openide.awt.Mnemonics.setLocalizedText(bMethodsLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blBeforeMethods")); // NOI18N

        bMethodsField.setColumns(5);

        aMethodsLabel.setLabelFor(aMethodsField);
        org.openide.awt.Mnemonics.setLocalizedText(aMethodsLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blAfterMethods")); // NOI18N

        aMethodsField.setColumns(5);

        anEnumHeaderLabel.setLabelFor(anEnumHeaderField);
        org.openide.awt.Mnemonics.setLocalizedText(anEnumHeaderLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blAfterEnumHeader")); // NOI18N

        anEnumFooterLabel.setLabelFor(anEnumFooterField);
        org.openide.awt.Mnemonics.setLocalizedText(anEnumFooterLabel, org.openide.util.NbBundle.getMessage(FmtBlankLines.class, "LBL_blBeforeEnumFooter")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maxLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bMethodsLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inCodeLabel)
                                    .addComponent(inDeclarationsLabel)
                                    .addComponent(anAnonymousClassHeaderLabel)
                                    .addComponent(anEnumHeaderLabel)
                                    .addComponent(aClassFooterLabel)
                                    .addComponent(anAnonymousClassFooterLabel)
                                    .addComponent(aMethodsLabel)
                                    .addComponent(aFieldsLabel)
                                    .addComponent(bPackageLabel)
                                    .addComponent(aPackageLabel)
                                    .addComponent(bImportsLabel)
                                    .addComponent(aImports)
                                    .addComponent(bClassLabel)
                                    .addComponent(aClassLabel)
                                    .addComponent(aClassHeaderLabel)
                                    .addComponent(anEnumFooterLabel)
                                    .addComponent(bFieldsLabel))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(aClassHeaderField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(aClassField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(bClassField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(aImportsField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(bImportsField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(aPackageField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(bPackageField)
                                    .addComponent(inCodeField)
                                    .addComponent(inDeclarationsField)
                                    .addComponent(anAnonymousClassHeaderField)
                                    .addComponent(anEnumHeaderField)
                                    .addComponent(aClassFooterField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(anAnonymousClassFooterField)
                                    .addComponent(anEnumFooterField)
                                    .addComponent(bFieldsField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(aFieldsField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(bMethodsField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(aMethodsField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(maxLabel)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inDeclarationsLabel)
                    .addComponent(inDeclarationsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inCodeLabel)
                    .addComponent(inCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPackageLabel)
                    .addComponent(bPackageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aPackageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aPackageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bImportsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bImportsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aImportsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aImports))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bClassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bClassLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aClassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aClassLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aClassHeaderLabel)
                    .addComponent(aClassHeaderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anAnonymousClassHeaderLabel)
                    .addComponent(anAnonymousClassHeaderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anEnumHeaderLabel)
                    .addComponent(anEnumHeaderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aClassFooterLabel)
                    .addComponent(aClassFooterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anAnonymousClassFooterLabel)
                    .addComponent(anAnonymousClassFooterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anEnumFooterLabel)
                    .addComponent(anEnumFooterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFieldsLabel)
                    .addComponent(bFieldsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aFieldsLabel)
                    .addComponent(aFieldsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bMethodsLabel)
                    .addComponent(bMethodsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aMethodsLabel)
                    .addComponent(aMethodsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {aClassField, aClassHeaderField, aImportsField, aMethodsField, aPackageField, bClassField, bFieldsField, bImportsField, bMethodsField, bPackageField});

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aClassField;
    private javax.swing.JTextField aClassFooterField;
    private javax.swing.JLabel aClassFooterLabel;
    private javax.swing.JTextField aClassHeaderField;
    private javax.swing.JLabel aClassHeaderLabel;
    private javax.swing.JLabel aClassLabel;
    private javax.swing.JTextField aFieldsField;
    private javax.swing.JLabel aFieldsLabel;
    private javax.swing.JLabel aImports;
    private javax.swing.JTextField aImportsField;
    private javax.swing.JTextField aMethodsField;
    private javax.swing.JLabel aMethodsLabel;
    private javax.swing.JTextField aPackageField;
    private javax.swing.JLabel aPackageLabel;
    private javax.swing.JTextField anAnonymousClassFooterField;
    private javax.swing.JLabel anAnonymousClassFooterLabel;
    private javax.swing.JTextField anAnonymousClassHeaderField;
    private javax.swing.JLabel anAnonymousClassHeaderLabel;
    private javax.swing.JTextField anEnumFooterField;
    private javax.swing.JLabel anEnumFooterLabel;
    private javax.swing.JTextField anEnumHeaderField;
    private javax.swing.JLabel anEnumHeaderLabel;
    private javax.swing.JTextField bClassField;
    private javax.swing.JLabel bClassLabel;
    private javax.swing.JTextField bFieldsField;
    private javax.swing.JLabel bFieldsLabel;
    private javax.swing.JTextField bImportsField;
    private javax.swing.JLabel bImportsLabel;
    private javax.swing.JTextField bMethodsField;
    private javax.swing.JLabel bMethodsLabel;
    private javax.swing.JTextField bPackageField;
    private javax.swing.JLabel bPackageLabel;
    private javax.swing.JTextField inCodeField;
    private javax.swing.JLabel inCodeLabel;
    private javax.swing.JTextField inDeclarationsField;
    private javax.swing.JLabel inDeclarationsLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel maxLabel;
    private javax.swing.JLabel minLabel;
    // End of variables declaration//GEN-END:variables
    
}

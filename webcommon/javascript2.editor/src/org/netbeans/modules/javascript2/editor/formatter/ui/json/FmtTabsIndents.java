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

package org.netbeans.modules.javascript2.editor.formatter.ui.json;

import java.io.IOException;
import org.netbeans.modules.options.editor.spi.PreferencesCustomizer;
import org.netbeans.modules.javascript2.editor.formatter.FmtOptions;
import org.netbeans.modules.javascript2.editor.formatter.FmtOptions.CategorySupport;
import static org.netbeans.modules.javascript2.editor.formatter.FmtOptions.CategorySupport.OPTION_ID;
import org.netbeans.modules.javascript2.lexer.api.JsTokenId;
import org.netbeans.modules.javascript2.editor.formatter.Utils;

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
//        rightMarginField.putClientProperty(OPTION_ID, rightMargin);
        continuationIndentSizeField.putClientProperty(OPTION_ID, FmtOptions.continuationIndentSize);
        initialIndentSizeField.putClientProperty(OPTION_ID, FmtOptions.initialIndent);
        //arrayItemsIndentationField.putClientProperty(OPTION_ID, FmtOptions.itemsInArrayDeclarationIndentSize);
    }

    public static PreferencesCustomizer.Factory getController() {
        String preview = "";
        try {
            preview = Utils.loadPreviewText(FmtTabsIndents.class.getClassLoader().getResourceAsStream("org/netbeans/modules/javascript2/editor/formatter/ui/json/TabsIndents.json"));
        } catch (IOException ex) {
            // TODO log it
        }
        return new CategorySupport.Factory(JsTokenId.JSON_MIME_TYPE, PreferencesCustomizer.TABS_AND_INDENTS_ID, FmtTabsIndents.class,
                preview,
                new String[] { FmtOptions.rightMargin, "30" }, //NOI18N
                new String[] { FmtOptions.initialIndent, "0" } //NOI18N
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
        initialIndentLabel = new javax.swing.JLabel();
        initialIndentSizeField = new javax.swing.JTextField();

        setName(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "LBL_TabsAndIndents")); // NOI18N
        setOpaque(false);

        continuationIndentSizeLabel.setLabelFor(continuationIndentSizeField);
        org.openide.awt.Mnemonics.setLocalizedText(continuationIndentSizeLabel, org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "LBL_ContinuationIndentSize")); // NOI18N

        initialIndentLabel.setLabelFor(initialIndentSizeField);
        org.openide.awt.Mnemonics.setLocalizedText(initialIndentLabel, org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.initialIndentLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(continuationIndentSizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(continuationIndentSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(initialIndentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(initialIndentSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(initialIndentLabel)
                    .addComponent(initialIndentSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continuationIndentSizeLabel)
                    .addComponent(continuationIndentSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        continuationIndentSizeLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.continuationIndentSizeLabel.AccessibleContext.accessibleName")); // NOI18N
        continuationIndentSizeLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.continuationIndentSizeLabel.AccessibleContext.accessibleDescription")); // NOI18N
        continuationIndentSizeField.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.continuationIndentSizeField.AccessibleContext.accessibleName")); // NOI18N
        continuationIndentSizeField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.continuationIndentSizeField.AccessibleContext.accessibleDescription")); // NOI18N
        initialIndentLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.initialIndentLabel.AccessibleContext.accessibleName")); // NOI18N
        initialIndentLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.initialIndentLabel.AccessibleContext.accessibleDescription")); // NOI18N
        initialIndentSizeField.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.initialIndentSizeField.AccessibleContext.accessibleName")); // NOI18N
        initialIndentSizeField.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.initialIndentSizeField.AccessibleContext.accessibleDescription")); // NOI18N

        getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.AccessibleContext.accessibleName")); // NOI18N
        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtTabsIndents.class, "FmtTabsIndents.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField continuationIndentSizeField;
    private javax.swing.JLabel continuationIndentSizeLabel;
    private javax.swing.JLabel initialIndentLabel;
    private javax.swing.JTextField initialIndentSizeField;
    // End of variables declaration//GEN-END:variables

}

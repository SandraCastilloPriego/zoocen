/*
 * Copyright 2008-2010 The Zoocen Development Team
 *
 * This file is part of Zoocen.
 *
 * Zoocen is free software; you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * Zoocen is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Zoocen; if not, write to the Free Software Foundation, Inc., 51 Franklin St,
 * Fifth Floor, Boston, MA 02110-1301 USA
 */

package graphics.configuration;

import zoocen.Cell;
import zoocen.specie;

/**
 *
 * @author  sandra
 */
public class ChooseParametersPanel extends javax.swing.JPanel {
    String SpecieName;
    int SpecieIndex;    
    Cell cell;
    /** Creates new form ChooseCellPanel
     * @param cell 
     */
    public ChooseParametersPanel(Cell cell) {
        initComponents();
       // this.NewSData = new Hashtable<String,SpecieData>();
        this.cell = cell;
        this.SetSpecieCombo();
    }
     
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSliderInhabitants = new javax.swing.JSlider();
        jSliderMaxInhabitants = new javax.swing.JSlider();
        jSliderMortality = new javax.swing.JSlider();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldMaxInhabitants = new javax.swing.JTextField();
        jTextFieldMortalityRate = new javax.swing.JTextField();
        jTextFieldInhabitants = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxCompetence = new javax.swing.JComboBox();
        jSliderCompetence = new javax.swing.JSlider();
        jTextFieldCompetence = new javax.swing.JTextField();
        jComboBoxSpecies = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(729, 399));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Parameters"));

        jLabel3.setText("Inhabitants:");

        jLabel4.setText("Max Inhabitants:");

        jLabel5.setText("Mortality rate:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel5.setLayout(new java.awt.GridLayout(3, 1));

        jSliderInhabitants.setFont(new java.awt.Font("DejaVu Sans", 0, 10));
        jSliderInhabitants.setMajorTickSpacing(20);
        jSliderInhabitants.setMinorTickSpacing(10);
        jSliderInhabitants.setPaintLabels(true);
        jSliderInhabitants.setPaintTicks(true);
        jSliderInhabitants.setValue(2);
        jSliderInhabitants.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderInhabitantsStateChanged(evt);
            }
        });
        jPanel5.add(jSliderInhabitants);

        jSliderMaxInhabitants.setFont(new java.awt.Font("DejaVu Sans", 0, 10));
        jSliderMaxInhabitants.setMajorTickSpacing(20);
        jSliderMaxInhabitants.setMinorTickSpacing(10);
        jSliderMaxInhabitants.setPaintLabels(true);
        jSliderMaxInhabitants.setPaintTicks(true);
        jSliderMaxInhabitants.setValue(30);
        jSliderMaxInhabitants.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderMaxInhabitantsStateChanged(evt);
            }
        });
        jPanel5.add(jSliderMaxInhabitants);

        jSliderMortality.setFont(new java.awt.Font("DejaVu Sans", 0, 10));
        jSliderMortality.setMajorTickSpacing(20);
        jSliderMortality.setMinorTickSpacing(10);
        jSliderMortality.setPaintLabels(true);
        jSliderMortality.setPaintTicks(true);
        jSliderMortality.setValue(15);
        jSliderMortality.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderMortalityStateChanged(evt);
            }
        });
        jPanel5.add(jSliderMortality);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldMortalityRate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldMaxInhabitants, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldInhabitants, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTextFieldInhabitants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jTextFieldMaxInhabitants, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextFieldMortalityRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Competence parameters"));

        jLabel8.setText("Species: ");

        jComboBoxCompetence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCompetenceActionPerformed(evt);
            }
        });

        jSliderCompetence.setFont(new java.awt.Font("DejaVu Sans", 0, 10));
        jSliderCompetence.setMajorTickSpacing(20);
        jSliderCompetence.setMinorTickSpacing(10);
        jSliderCompetence.setPaintLabels(true);
        jSliderCompetence.setPaintTicks(true);
        jSliderCompetence.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderCompetenceStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(41, 41, 41)
                .addComponent(jComboBoxCompetence, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jSliderCompetence, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jTextFieldCompetence, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxCompetence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSliderCompetence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jTextFieldCompetence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jComboBoxSpecies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSpeciesActionPerformed(evt);
            }
        });

        jLabel2.setText("Species: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(jComboBoxSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSpeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSpeciesActionPerformed
       this.FillCompetenceCombo();   
       GetParameters(this.jComboBoxSpecies.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxSpeciesActionPerformed

    private void FillCompetenceCombo(){
    	this.SpecieName = this.jComboBoxSpecies.getSelectedItem().toString();
        this.SpecieIndex = this.jComboBoxSpecies.getSelectedIndex();
        
        this.jComboBoxCompetence.removeAllItems();
        for(int i = 0; i < this.jComboBoxSpecies.getItemCount(); i++){
     	   if(i != this.SpecieIndex){
               this.jComboBoxCompetence.addItem(this.jComboBoxSpecies.getItemAt(i).toString());  		   
     	   }    	   
        }	
    }
    
    private void jComboBoxCompetenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCompetenceActionPerformed
    	try{
            this.GetCompetenceParameters(this.jComboBoxSpecies.getSelectedItem().toString());
        }catch(Exception exception){}
    }//GEN-LAST:event_jComboBoxCompetenceActionPerformed

    private void jSliderCompetenceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderCompetenceStateChanged
        this.SetCompetenceParameters(this.jComboBoxSpecies.getSelectedItem().toString());
        this.jTextFieldCompetence.setText(String.valueOf(Double.valueOf(this.jSliderCompetence.getValue())/100));
    }//GEN-LAST:event_jSliderCompetenceStateChanged

    private void jSliderInhabitantsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderInhabitantsStateChanged
         this.SetParametersInhabitants(this.jComboBoxSpecies.getSelectedItem().toString());
         this.jTextFieldInhabitants.setText(String.valueOf(this.jSliderInhabitants.getValue()));
    }//GEN-LAST:event_jSliderInhabitantsStateChanged

    private void jSliderMaxInhabitantsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderMaxInhabitantsStateChanged
         this.SetParametersMaxInhabitants(this.jComboBoxSpecies.getSelectedItem().toString());
         this.jTextFieldMaxInhabitants.setText(String.valueOf(this.jSliderMaxInhabitants.getValue()));
    }//GEN-LAST:event_jSliderMaxInhabitantsStateChanged

    private void jSliderMortalityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderMortalityStateChanged
         this.SetParametersMortality(this.jComboBoxSpecies.getSelectedItem().toString());
         this.jTextFieldMortalityRate.setText(String.valueOf(Double.valueOf(this.jSliderMortality.getValue())/100));
    }//GEN-LAST:event_jSliderMortalityStateChanged
    
    private void SetParametersInhabitants(String SpecieName){
    	for(int i = 0; i < this.cell.getNSpecies(); i++){
            specie s = this.cell.getSpecie(i);
            if(s.getName().matches(SpecieName)){                
                s.setInhabitants((Integer)this.jSliderInhabitants.getValue());
            }
        }    		
    }
    
    private void SetParametersMaxInhabitants(String SpecieName){
    	for(int i = 0; i < this.cell.getNSpecies(); i++){
            specie s = this.cell.getSpecie(i);
            if(s.getName().matches(SpecieName)){               
                s.setMaximInhabitants((Integer)this.jSliderMaxInhabitants.getValue());
            }
        }    		
    }
    
    private void SetParametersMortality(String SpecieName){
    	for(int i = 0; i < this.cell.getNSpecies(); i++){
            specie s = this.cell.getSpecie(i);
            if(s.getName().matches(SpecieName)){
                s.setMortalityRate(Double.valueOf(this.jSliderMortality.getValue())/100);               
            }
        }    		
    }
    
    private void GetParameters(String SpecieName){
    	try{
            for(int i = 0; i < this.cell.getNSpecies(); i++){
                specie s = this.cell.getSpecie(i);
                if(s.getName().matches(SpecieName)){
                    this.jSliderInhabitants.setValue((int)s.getInhabitants());
                    this.jSliderMaxInhabitants.setValue((int)s.getMaximInhabitants());
                    this.jSliderMortality.setValue((int)(s.getMortalityRate()*100));
                }
            }
    	}catch(Exception exception){
    		
    	}
    	
    }
    
    private void SetCompetenceParameters(String SpecieName1){      
        try{
            String SpecieName2 = this.jComboBoxCompetence.getSelectedItem().toString();           
            cell.addCompetenceParameter(SpecieName1, SpecieName2, Double.valueOf(this.jSliderCompetence.getValue())/100);
        }catch(Exception exception){
            System.out.println("ChooseParametersPanel.java --> SetCompetenceParameters() " + exception);
        }
    }
    
    private void GetCompetenceParameters(String SpecieName){    
    	try{ 
            String Name = this.jComboBoxCompetence.getSelectedItem().toString();
            int value = (int)(this.cell.getCompetenceParameter(SpecieName, Name)*100);
            this.jSliderCompetence.setValue(value);     
            System.out.println(value);
    	}catch(Exception exception){
            // System.out.println("ChooseParametersPanel.java --> GetCompetenceParameters() " + exception);
    	}
    }
    
    public void SetSpecieCombo(){    	
    	if(this.jComboBoxSpecies.getItemCount() == 0){
            for(int i = 0; i < this.cell.getNSpecies(); i++){
                this.jComboBoxSpecies.addItem(this.cell.getSpecie(i).getName());
            }   
            this.FillCompetenceCombo();  
    	}
    } 
  
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox jComboBoxCompetence;
    public javax.swing.JComboBox jComboBoxSpecies;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSlider jSliderCompetence;
    private javax.swing.JSlider jSliderInhabitants;
    private javax.swing.JSlider jSliderMaxInhabitants;
    private javax.swing.JSlider jSliderMortality;
    private javax.swing.JTextField jTextFieldCompetence;
    private javax.swing.JTextField jTextFieldInhabitants;
    private javax.swing.JTextField jTextFieldMaxInhabitants;
    private javax.swing.JTextField jTextFieldMortalityRate;
    // End of variables declaration//GEN-END:variables
    
}
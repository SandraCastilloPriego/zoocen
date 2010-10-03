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
package zoocen;

import java.util.Hashtable;
import java.util.Vector;

/**
 *
 * @author sandra
 */
public class Cell {
    private Vector<specie> species;
    private Hashtable<String, double[]> competence_Parameter; //a    
    private Hashtable<String, CompetitionStruct> CompetenceParameter;
    public int cellID;

    public Cell(int cellID) {
        this.cellID = cellID;
        this.species = new Vector<specie>();	
        this.competence_Parameter = new Hashtable<String, double[]>();
        this.CompetenceParameter = new Hashtable<String, CompetitionStruct>();
       
    }
    
    public void addSpecie(String name, double growing_Rate, double inhabitants, double mortality_Rate, int maxim_Inhabitants){
        this.species.addElement(new specie(name, growing_Rate, inhabitants, mortality_Rate,  maxim_Inhabitants));
    }
    
    public void addSpecie(specie s){
        this.species.addElement(s);
        CompetitionStruct CStruc = new CompetitionStruct();
        this.CompetenceParameter.put(s.getName(), CStruc);        
    }

    public void setDifusionRate(int cellID, String specieName, double difusion_Rate){
        try{
            for(int i = 0; i < this.species.size(); i++){
                if(this.species.elementAt(i).getName().compareTo(specieName) == 0){
                    this.species.elementAt(i).setDifusionRate(cellID, difusion_Rate);
                    break;
                }
            }
        }catch(Exception e){}
    }
    public Vector<DifusionStruct> getDifusionRate(int specie){
        try{
            return this.species.elementAt(specie).getDifusionRate();
        }catch(Exception exception){
            System.out.println("Cell.java --> getDifusionRate() " + exception);
            return null;
        }
     }
    
    public double getDifusionRate(int cellID, int specie){       
        return this.species.elementAt(specie).getDifusionRate(cellID);
     }

    public void addCompetenceParameter(int specie1, int specie2, double a){
        try{            
            double[] Aa;
            String name = "specie" + String.valueOf(specie1);
            if(this.competence_Parameter.containsKey(name)){               
                Aa = this.competence_Parameter.get(name);    
            }else{
                Aa = new double[this.species.size()];                   
            }
            Aa[specie2] = a; 
            this.competence_Parameter.put(name, Aa); 
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
    
    public void addCompetenceParameter(String specieName1, String specieName2, double a){
        try{            
            if(this.CompetenceParameter.containsKey(specieName1)){
                CompetitionStruct CStruct = this.CompetenceParameter.get(specieName1);
                CStruct.setCompetition(specieName2, a);
            }
        }catch(Exception exception){
            System.out.println(exception);
        }
    }
    
    public double getCompetenceParameter(String specie1, String specie2){
         try{            
            if(this.CompetenceParameter.containsKey(specie1)){
                CompetitionStruct CStruct = this.CompetenceParameter.get(specie1);
                return CStruct.getCompetition(specie2);
            }else {
                return 0;
            }            
        }catch(Exception exception){
            System.out.println("Cell.java -->  getcompetenceParameter" + exception);
            return 0;
        }
    }
    
    public double getCompetenceParameter(int specie1, int specie2){
        try{
            String name = "specie" + String.valueOf(specie1);
            System.out.println("get" + name);
            if(this.competence_Parameter.containsKey(name)){
                 double[] Aa = this.competence_Parameter.get(name);
                 return Aa[specie2];
            }else{
                // System.out.println("mierda"+specie1);
                return 0.15;
            }
           
        }catch(Exception exception){
            System.out.println("Cell.java --> getCompetenceParameter()" + exception);
            return 0;
        }
    }

    
    public specie getSpecie(int Index){
        return (specie)this.species.elementAt(Index);
    }

    public double getN(int Index){
        try{
            return this.species.elementAt(Index).getInhabitants();
        }catch(Exception exception){
            System.out.println("Cell.java --> getN() " + exception);
            return 0;
        }
    }

    public double getGrowingRate(int Index) {
        try{
            return this.species.elementAt(Index).getGrowingRate();
        }catch(Exception exception){
            System.out.println("Cell.java --> getGrowingRate() " + exception);
            return 0;
        }
    }

    public double getNSpecies(){
        try{
            return this.species.size();
        }catch(Exception exception){
            System.out.println("Cell.java --> getNSpecies() " + exception);
            return 0;
        }
    }

    public double getMaximInhabitants(int Index){
        return ((specie)this.species.elementAt(Index)).getMaximInhabitants();
    }

    public double getMortalityRate(int Index){
        try{
            return this.species.elementAt(Index).getMortalityRate();
        }catch(Exception exception){
            System.out.println("Cell.java --> getMortalityRate() " + exception);
            return 0;
        }
    }

    public void setOldN(double N, int Index){
        try{
            this.species.elementAt(Index).setOldN(N);
        }catch(Exception exception){
            System.out.println("Cell.java --> setOldN() " + exception);           
        }
    }

    public void updateN() {
        try{
            for(int i = 0; i < this.species.size(); i++){
                this.species.elementAt(i).updateN();
            }
        }catch(Exception exception){
            System.out.println("Cell.java --> updateN() " + exception);           
        }
    }

    public double getSimpsonDiversityIndex(){
        double sumN = 0;
        double Index = 0;
        for(int i = 0; i < this.species.size(); i++){
            sumN += ((specie)this.species.elementAt(i)).getInhabitants();
        }
        for(int i = 0; i < this.species.size(); i++){
            double d = ((specie)this.species.elementAt(i)).getInhabitants()/sumN;
            Index += 1/Math.pow(d, 2);
        }
        return Index;
    }
    
    public String getName(int specie){
        return this.species.elementAt(specie).getName();
    }    
    
}

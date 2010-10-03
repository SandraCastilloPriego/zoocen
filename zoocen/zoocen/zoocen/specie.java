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
import java.util.Vector;

/**
 *
 * @author sandra
 */
public class specie {
    private int ID;
    private double growing_Rate; // r
    private double mortality_Rate; // c
    private double inhabitants; // P (inhanbitants of each specie)	
    private double oldN;
    private Vector<DifusionStruct> difusion_Rate;
    //private Vector<Integer> neighbour;
    private int maxim_Inhabitants; //K
    private String Name;

    public specie() {
    }

    public specie(int ID, String Name, double growing_Rate) {
        this.Name = Name;
        this.growing_Rate = growing_Rate;
        this.difusion_Rate = new Vector<DifusionStruct>();     
        this.ID = ID; //I don't use it
    }    

    public specie(String Name, double growing_Rate, double inhabitants, double mortality_Rate, int maxim_Inhabitants)
    {		
        this.Name = Name;
        this.growing_Rate = growing_Rate;
        this.inhabitants = inhabitants;
        this.mortality_Rate = mortality_Rate;  
        this.difusion_Rate = new Vector<DifusionStruct>();      
        this.maxim_Inhabitants = maxim_Inhabitants;			
    }


    public double getGrowingRate(){
        return growing_Rate;
    }
    public void setGrowingRate(double growing_Rate){
        this.growing_Rate = growing_Rate;
    }

    public double getInhabitants() {
        return this.inhabitants;
    }
    public void setInhabitants(double inhabitants){
        this.inhabitants = inhabitants;
    }

    public double getMortalityRate(){
        return this.mortality_Rate;
    }
    public void setMortalityRate(double mortality_Rate){
        this.mortality_Rate = mortality_Rate;
    }

    public double getMaximInhabitants(){
        return this.maxim_Inhabitants;
    }
    public void setMaximInhabitants(int maxInhabitants){
        this.maxim_Inhabitants = maxInhabitants;
    }
    
   
    /**
     * Set Difusion rate of this specie, from its cell to another neighbour cell
     * @param cellIDNeighbour
     * @param difusion_Rate
     * @return 
     */
    public boolean setDifusionRate(int cellIDNeighbour, double difusion_Rate) {
        try{
           for(int i = 0; i < this.difusion_Rate.size(); i++){
                if(this.difusion_Rate.elementAt(i) != null && this.difusion_Rate.elementAt(i).neighbour == cellIDNeighbour){
                    this.difusion_Rate.elementAt(i).difusionRate = difusion_Rate;                    
                    return true;
                }
            }
            DifusionStruct DS = new DifusionStruct();
            DS.difusionRate = difusion_Rate;
            DS.neighbour = cellIDNeighbour;
            this.difusion_Rate.addElement(DS); 
            return true;
        }catch(Exception e){
            return false;
        }
    }   
    
    public double getDifusionRate(int cellIDNeighbour){
        for(int i = 0; i < this.difusion_Rate.size(); i++){
            if(this.difusion_Rate.elementAt(i) != null && this.difusion_Rate.elementAt(i).neighbour == cellIDNeighbour){
                return this.difusion_Rate.elementAt(i).difusionRate;                
            }
        }
        return 0;
    }
    
    public Vector<DifusionStruct> getDifusionRate() {
        return this.difusion_Rate;
    }
   
    public void setOldN(double N){
        this.oldN = N;
    }

    public void updateN(){
        this.inhabitants = this.oldN;
    }
    
    public String getName(){
        return this.Name;
    }
    
     
}

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

package graphics;
import java.util.Hashtable;
import java.util.Vector;
/**
 *
 * @author sandra
 */
public class SpecieData implements Cloneable{
    public int ID;
    public String Name;
    public double growing_Rate; // r
    public double mortality_Rate; // c
    public Vector difusion_Rate; // w
    public int inhabitants;
    public int maxim_Inhabitants; //K
    public Hashtable<String, Double> competence;
    
    public SpecieData(){
    	this.growing_Rate = 0.2;
    	this.mortality_Rate = 0.2;
    	this.inhabitants = 3;
    	this.maxim_Inhabitants = 30; 
    	this.competence = new Hashtable<String, Double>();
    }
    
    /**
     * Clone all elemente into the class but "difusion_Rate"
     * @return
     */
    @Override
    public SpecieData clone(){
    	SpecieData data = new SpecieData();
    	data.ID = this.ID;
    	data.Name = this.Name;
    	data.growing_Rate = this.growing_Rate;
    	data.mortality_Rate = this.mortality_Rate;
    	data.inhabitants = this.inhabitants;
    	data.maxim_Inhabitants= this.maxim_Inhabitants;
    	//data.difusion_Rate = (Vector)this.difusion_Rate.clone();
    	
    	return data;
    }
    
}

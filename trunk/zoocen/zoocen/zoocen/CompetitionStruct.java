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

/**
 *
 * @author sandra
 */
public class CompetitionStruct {
    private Hashtable<String, Double> competence_Parameter;
    public CompetitionStruct(){
        this.competence_Parameter = new Hashtable<String, Double>();
    }
    
    /**
     * Get competition parameter depending on the specie's name.
     * @param name It is the name of the specie.
     * @return Competition parameter.
     */
    public double getCompetition(String name){
        if(this.competence_Parameter.containsKey(name)){
            return this.competence_Parameter.get(name).doubleValue();
        }else{
            System.out.println("There is no competenceParameter...");
            return 0.2;          
        }
    }
    
    /**
     * Set the competition parameter depending on the name of the specie.
     * @param name It is the name of the specie.
     * @param value Competition parameter.
     */
    public void setCompetition(String name, double value){
        this.competence_Parameter.put(name, new Double(value));
    }
}

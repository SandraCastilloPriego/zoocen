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

import graphics.Chart.SpeciesChart;
import java.util.Vector;
import org.jfree.chart.ChartPanel;

/**
 *
 * @author sandra
 */
public class world implements Runnable {

    public Vector<Cell> cells = new Vector<Cell>();
    GlobalParametersStruct parameters;
    private SpeciesChart[] chart;
    private SpeciesChart[] bigchart;
    private boolean stopSignal, pauseSignal;

    public world(GlobalParametersStruct parameters) {
        this.parameters = parameters;
        this.stopSignal = false;
        this.pauseSignal = false;
    }

    public ChartPanel getChart(int cellID) {
        return this.chart[cellID].getChartPanel();
    }

    public void run() {
        this.runCycles();
    }

    public void makeChart() {
        this.chart = new SpeciesChart[this.cells.size()];
        this.bigchart = new SpeciesChart[this.cells.size()];
        String[] SpecieName = new String[(int) this.cells.elementAt(0).getNSpecies()];
        for (int i = 0; i < this.cells.elementAt(0).getNSpecies(); i++) {
            SpecieName[i] = this.cells.elementAt(0).getName(i);
        }
        for (int i = 0; i < this.cells.size(); i++) {
            this.chart[i] = new SpeciesChart("Cell " + this.cells.elementAt(i).cellID, SpecieName);
            this.chart[i].setVisible(false);
            this.bigchart[i] = new SpeciesChart("Cell " + this.cells.elementAt(i).cellID, SpecieName);
            this.bigchart[i].setVisible(false);
        }
    }

    public void showChart(int cellID) {
        this.bigchart[cellID].setVisible(true);
    }

    public void runCycles() {

        int iterations = 0;

        while (iterations < this.parameters.iterations) {
            if (stopSignal) {
                break;
            }

            if (!pauseSignal) {
                for (int e = 0; e < this.cells.size(); e++) {
                    if (stopSignal) {
                        break;
                    }
                    Cell j = this.cells.elementAt(e);
                    double[] N = new double[(int) j.getNSpecies()];
                    for (int i = 0; i < j.getNSpecies(); i++) {
                        System.out.println("Euler parameter " + this.parameters.Euler);
                        System.out.println("j.getname " + j.getName(i));
                        System.out.println("j.getN " + j.getN(i));
                        System.out.println("this.getCompetence(j, i) " + this.getCompetence(j, i));
                        System.out.println("this.getDifusion(j, i) " + this.getDifusion(j, i));
                        System.out.println("j.getMortalityRate(i) " + j.getMortalityRate(i));

                        N[i] = j.getN(i) + (this.parameters.Euler * ((j.getGrowingRate(i) * j.getN(i) * this.getCompetence(j, i)) + this.getDifusion(j, i) - (j.getMortalityRate(i) * j.getN(i))));
                        if (N[i] / j.getMaximInhabitants(i) > 1) {
                            N[i] = j.getMaximInhabitants(i);
                        }
                        if (N[i] == Double.NaN) {
                            N[i] = 0;
                        }
                        j.setOldN(N[i], i);
                    }

                    this.chart[e].addData(N, iterations);
                    this.bigchart[e].addData(N, iterations);
                }
                for (int i = 0; i < this.cells.size(); i++) {
                    Cell j = this.cells.elementAt(i);
                    j.updateN();
                }
                iterations++;
            }
        }

    }

    public void setPauseSignal(boolean signal){
        this.pauseSignal = signal;
    }

    public void setStopSignal(boolean signal){
        this.stopSignal = signal;
    }

    public double getDifusion(Cell j, int specie) {
        Vector<DifusionStruct> Difusion_Rate = j.getDifusionRate(specie);
        double difusion = 0;
        try {
            for (int i = 0; i < Difusion_Rate.size(); i++) {
                DifusionStruct DS = Difusion_Rate.elementAt(i);
                for (int h = 0; h < this.cells.size(); h++) {
                    Cell e = this.cells.elementAt(h);
                    if (DS.neighbour == e.cellID && j != e) {
                        double N = e.getN(specie) - j.getN(specie);
                        difusion += DS.difusionRate * N;
                    }
                }
            }

            return difusion;
        } catch (Exception exception) {
            System.out.println("world.java -->getDifusion()" + exception);
            return difusion;
        }
    }

    //(K[0]-(a[0][0]*N[0])-(a[0][1]*N[1])-(a[0][2]*N[2]))/K[0]
    public double getCompetence(Cell j, int specie) {
        try {
            double result = j.getMaximInhabitants(specie);
            // System.out.println(j.getNSpecies());
            for (int i = 0; i < j.getNSpecies(); i++) {
                specie s1 = j.getSpecie(specie);
                specie s2 = j.getSpecie(i);
                if (s1 != s2) {
                    System.out.println("competence: " + i + "--> " + j.getCompetenceParameter(s1.getName(), s2.getName()));
                    result -= j.getCompetenceParameter(s1.getName(), s2.getName()) * j.getN(i);
                }
            }
            result /= j.getMaximInhabitants(specie);
            return result;
        } catch (Exception exception) {
            System.out.println("world.java ---> getCompetence() " + exception);
            return 0;
        }
    }

    public boolean contain(int cellID) {
        for (int i = 0; i < this.cells.size(); i++) {
            Cell c = this.cells.elementAt(i);
            if (c.cellID == cellID) {
                return true;
            }
        }
        return false;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import java.util.ArrayList;

/**
 *
 * @author FP
 */
public class Heroes {
    private String hero;
    private ArrayList<HeroesDatos> datosHeroes;
    private String team;
    private ArrayList<Equipo> datosEquipos;

    public Heroes(String hero, String team) {
        this.hero = hero;
        this.team = team;
        this.datosHeroes=new ArrayList<HeroesDatos>();
        this.datosEquipos=new ArrayList<Equipo>();
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public ArrayList<HeroesDatos> getDatosHeroes() {
        return datosHeroes;
    }

    public void setDatosHeroes(ArrayList<HeroesDatos> datosHeroes) {
        this.datosHeroes = datosHeroes;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public ArrayList<Equipo> getDatosEquipos() {
        return datosEquipos;
    }

    public void setDatosEquipos(ArrayList<Equipo> datosEquipos) {
        this.datosEquipos = datosEquipos;
    }

    @Override
    public String toString() {
        return "Heroes{" + "hero=" + hero + ", datosHeroes=" + datosHeroes + ", team=" + team + ", datosEquipos=" + datosEquipos + '}';
    }

    public boolean add(Equipo e) {
        return datosEquipos.add(e);
    }

    public boolean add(HeroesDatos e) {
        return datosHeroes.add(e);
    }
    
    
}

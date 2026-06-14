package team;

import competitions.Title;
import finance.Bank;
import people.Manager;
import people.Person;
import people.Player;
import people.President;

import java.util.*;

public class Team {

    private final String name;
    private final Stadium stadium;
    private final FanClub fanClub;
    private final Bank bank;
    private TrophyRoom trophyRoom;
    private Set<Player> elenco;

    private double teamTotalValue;
    private Manager manager;
    private President president;

    public Team(String teamName, String stadiumName,int stadiumCapacity, double stadiumEntryPrice, String fanclubName) { //construtor manual
        this.name = teamName;
        this.stadium = new Stadium(stadiumName, stadiumCapacity, stadiumEntryPrice);
        this.fanClub = new FanClub(fanclubName);
        this.bank = new Bank();
        this.trophyRoom = new TrophyRoom();
        this.elenco = new HashSet<>();
    }

    double DefinirTeamTotalValue() {
        return teamTotalValue;
    }

    void setManager(Manager manager, int years, double salary ) {
        this.manager = manager;
        contractManager(years, salary, manager);
    }

    void setPlayer(Player player, int anos, double salarioSemanal){
        elenco.add(player);
        contractManager(anos,salarioSemanal, player);

    }

    void setElenco(Queue<Player> players/*,Queue<int> anos, Queue<Double> salarioSemanal*/){
        for(Player player : players){
            elenco.add(player);
            /*contractManager(anos,salarioSemanal, player);*/
            // isso aqui parece nivel medio
            //nada que uma gambiarra não resolva por enquanto
        }
    }

    void setPresident(President president, int years, double salary){
        this.president = president;
        contractManager(years, salary, president);

    }

    private void contractManager(int years, double salary, Person person){
        person.setContract(years,salary);
        person.setTeam(this);
    }


}
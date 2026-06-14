package people;

import competitions.Title;
import finance.Contract;
import team.Team;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Person {

    final String nome;
    final String sobrenome;
    private int age;
    private final List<Title> trophies;
    private final Set<Team> timesEmQueJogou;

    private Contract contract;
    private Team currentTeam;

    Person(String nome, String sobrenome, int age) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.trophies = new ArrayList<>();
        this.timesEmQueJogou = new HashSet<>();
        this.age = age;
    }

    public void setContract(int anos, double salarioSemanal){
        this.contract = new Contract(anos, salarioSemanal);
    }

    public void setTeam(Team team){
        this.timesEmQueJogou.add(team);
        this.currentTeam = team;
    }

    public void setTitle(Title title){
        this.trophies.add(title);
    }


}
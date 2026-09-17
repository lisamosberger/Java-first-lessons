package com.example.java26.oop;

public class Team {
    private String teamName;
    private Employee teamLeader;

    public Team(String teamName, Employee teamLeader) {
        this.teamName = teamName;
        this.teamLeader = teamLeader;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Employee getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Employee teamLeader) {
        this.teamLeader = teamLeader;
    }

    public void copyTo(Team clone) {
            clone.teamName = teamName;

            clone.teamLeader = new Employee(
                    teamLeader.getName(),
                    teamLeader.getSalary(),
                    teamLeader.getDepartment()
            );
    }


    static void main (){

        Employee employee = new Employee("Leader", 3000, "IT");

        Team team1 = new Team("Team 1", employee);
        Team team2 = new Team("Team 2", null);

        team1.copyTo(team2);
        var teamLeader = team2.getTeamLeader();
        teamLeader.setSalary(500);

        IO.println("Team 1: teamName: " + team1.teamName);
        IO.println("Team 2: teamName: " + team2.teamName);

        IO.println("Team 1: teamleader: " + team1.teamLeader.getSalary());
        IO.println("Team 2: teamleader: " + team2.teamLeader.getSalary());


    }

}

package de.exxcellent.challenge.model;

public class Football {
    String team;
    int games;
    int wins;
    int losses;
    int draws;
    int goals;
    int goalsAllowed;
    int points;

    public Football(String team, int games, int wins, int losses, int draws, int goals, int goalsAllowed, int points) {
        this.team = team;
        this.games = games;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
        this.points = points;
    }

    public String getTeam() {
        return team;
    }

    public int getGames() {
        return games;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getDraws() {
        return draws;
    }

    public int getGoals() {
        return goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public int getPoints() {
        return points;
    }
}

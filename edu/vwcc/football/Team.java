package edu.vwcc.football;

public class Team {
	private String nickname;
	private int wins;
	private int losses;

	/*
	 * Constructor for Team
	 */
	public Team(String nickname, int wins, int losses) {
		this.nickname = nickname;
		this.wins = wins;
		this.losses = losses;
	}

	/*
	 * Method to calculate a Team's winning percentage
	 */
	public double winningPercentage() {
		if ((wins + losses) != 0) {
			return ((double) wins / (wins + losses));
		} else {
			return 0.0;
		}
	}

	/*
	 * Assume teams are equal if their nickname is the same
	 */
	public boolean equals(Team t) {
		return nickname.equals(t.nickname);
	}

	@Override
	public String toString() {
		return String.format("Team: %-16s Wins: %-2d Losses: %-2d", nickname, wins, losses);
	}

	// getters and setters
	public String getNickname() {
		return nickname;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public Team setNickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	public Team setWins(int wins) {
		if (wins >= 0)
			this.wins = wins;
		return this;
	}

	public Team setLosses(int losses) {
		if (losses >= 0)
			this.losses = losses;
		return this;
	}

}

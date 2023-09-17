package edu.vwcc.football;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FootballLLTest {

	private FootballLL footballLL;

	@BeforeEach
	public void setUp() {
		footballLL = new FootballLL();
	}

	@Test
	public void testAdd() {
		Team team = new Team("TestTeam", 10, 5);
		footballLL.add(team);
		Team foundTeam = footballLL.find("TestTeam");
		assertEquals(team, foundTeam);
	}

	@Test
	public void testFind() {
		Team team = new Team("FindTeam", 8, 8);
		footballLL.add(team);
		Team foundTeam = footballLL.find("FindTeam");
		assertEquals(team, foundTeam);
	}

	@Test
	public void testMostWins() {
		footballLL.add(new Team("TeamA", 5, 10));
		footballLL.add(new Team("TeamB", 10, 5));
		footballLL.add(new Team("TeamC", 8, 7));
		Team teamWithMostWins = footballLL.mostWins();
		assertEquals("TeamB", teamWithMostWins.getNickname());
	}

	@Test
	public void testWorstWinPct() {
		footballLL.add(new Team("TeamX", 5, 10));
		footballLL.add(new Team("TeamY", 10, 5));
		footballLL.add(new Team("TeamZ", 2, 13));
		Team teamWithWorstWinPct = footballLL.worstWinPct();
		assertEquals("TeamZ", teamWithWorstWinPct.getNickname());
	}

}

package com.kita.first.level3;

public class GameTest {
	public static void main(String[] args) {
		
	
		ProGamer p1 = new ProGamer();
		Game game = new Game();
		p1.playGame(game);
		
		StardewValley sDew = new StardewValley();
		p1.playGame(sDew);
		
		Lol lol = new Lol();
		p1.playGame(lol);
	}
}

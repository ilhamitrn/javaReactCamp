package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" oyunu ,"+game.getGamePrice()+" fiyatıyla eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" güncellendi.");
		
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getGameName()+" silindi.");
		
	}
	
	

}

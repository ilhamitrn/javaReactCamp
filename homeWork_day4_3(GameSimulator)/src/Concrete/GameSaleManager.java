package Concrete;

import Abstract.IGameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements IGameSaleService {

	@Override
	public void gameSell(Game game, Player player, Campaign campaign) {
		double discPrice=game.getGamePrice()-(game.getGamePrice()*campaign.getDiscount()/100);
		
		System.out.println(player.getPlayerFirstName()+" "+player.getPlayerLastName()+" isimli oyuncu, "
				+game.getGameName()+" oyununu "+game.getGamePrice()+" fiyati üzerinden "
				+campaign.getDiscount()+" indirim oranýyla "+discPrice+ "fiyatýna satin alinmistir.");
		
	}

}

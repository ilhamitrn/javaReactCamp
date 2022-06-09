package Concrete;

import Abstract.IPlayerCheckService;
import Abstract.IPlayerService;
import Entities.Player;

public class PlayerManager implements IPlayerService {
	
	IPlayerCheckService playerCheckService;
	
	public PlayerManager(IPlayerCheckService playerCheckService) {
		this.playerCheckService=playerCheckService;
	}

	@Override
	public void add(Player player) {
		if(playerCheckService.CheckIfRealPerson(player)) {
			System.out.println("Oyuncu kaydedildi:  "+player.getPlayerFirstName()+" "+player.getPlayerLastName());
		}
		else {
			System.out.println("KAYIT BASARISIZ");
		}
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getPlayerFirstName()+"  oyuncu güncellendi.");
		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getPlayerFirstName()+"  oyuncu silindi.");
		
	}
	
	

}
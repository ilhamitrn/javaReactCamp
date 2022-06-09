package Adapters;




import Abstract.IPlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService{

	@Override
	public boolean CheckIfRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getPlayerNationalityId()), player.getPlayerFirstName().toUpperCase(),
					player.getPlayerLastName().toUpperCase(), player.getPlayerBirthYear());
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return false;
		
	}
	
	

	
}
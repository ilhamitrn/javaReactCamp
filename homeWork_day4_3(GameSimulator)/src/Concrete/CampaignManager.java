package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getcName()+" kampanyasi "+campaign.getDiscount()+" indirimi eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getcName()+"  güncellendi.");
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println(campaign.getcName()+"  silindi.");
		
	}

}

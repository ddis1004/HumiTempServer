package dataaccess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import model.HumiTemp;

@Repository("HumiTempdao")
public class humitempDataAccssService implements HumiTempdao {

	private List<HumiTemp> fakeDB = new ArrayList<HumiTemp>();

	@Override
	public int getHumiTemp() {
		return 0;
	}

	@Override
	public int insertHumiTemp(HumiTemp humitemp) {
		fakeDB.add(humitemp);
		return 1;
	}
	
}

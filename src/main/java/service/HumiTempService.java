package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dataaccess.HumiTempdao;
import model.HumiTemp;

@Service
public class HumiTempService {
	private final HumiTempdao humitempdao;

	@Autowired
	public HumiTempService(@Qualifier("HumiTempdao")HumiTempdao humitempdao) {
		super();
		this.humitempdao = humitempdao;
	}
	
	public int addHumiTemp(HumiTemp humitemp) {
		return humitempdao.insertHumiTemp(humitemp);
	}
	
	
}

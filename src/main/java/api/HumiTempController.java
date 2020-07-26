package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.HumiTemp;
import service.HumiTempService;

@RequestMapping("api/v1/humitemp")
@RestController
public class HumiTempController {
	private final HumiTempService humitempservice;

	@Autowired
	public HumiTempController(HumiTempService humitempservice) {
		super();
		this.humitempservice = humitempservice;
	}
	
	@PostMapping
	public int addHumiTemp(@RequestBody HumiTemp humitemp) {
		return humitempservice.addHumiTemp(humitemp);
	}
	
}

package bootwildfly;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/rank")
public class RankController {
	
	private RankService service;
	
	public RankController(RankService service) {
		this.service = service;
	}
	
    @RequestMapping(method = RequestMethod.PUT)
    public RankModel update(Long id, RankModel entity){
        return service.update(id, entity);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<RankModel> getAll(){
        return service.getAll();
    }    
}

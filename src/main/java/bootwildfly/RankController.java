package bootwildfly;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rank")
public class RankController {
	
	@Autowired
	private RankService service;
	
	public RankController() {
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

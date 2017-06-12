package bootwildfly;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rank")
public class RankController {
	
	@Autowired
	private RankService service;
	
	public RankController() {
	}
	
    @RequestMapping(method = RequestMethod.POST)
    public RankModel update(@RequestBody RankModel entity){
        return service.update(entity);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<RankModel> getAll(){
        return service.getAll();
    }    
}

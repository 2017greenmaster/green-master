package bootwildfly;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RankService {

	private RankRepo repo;
	
	public RankService(RankRepo repo) {
		this.repo = repo;
	}
	
	public List<RankModel> getAll(){
		return repo.findAll();
	}
	
	public RankModel update(Long id, RankModel entity){
		entity.setId(id);
		return repo.save(entity);
	}
}

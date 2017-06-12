package bootwildfly;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class RankService {
	
	
	public List<RankModel> getAll(){
		return RankRepo.collection;
	}
	
	public RankModel update(Long id, RankModel entity){
		entity.setId(id);
		Optional<RankModel> optModel = RankRepo.collection.stream().filter(e -> e.getId().equals(id)).findFirst();
		
		if(optModel.isPresent()){
			
		}
		RankRepo.collection.add(entity);
		return optModel.orElse(entity);
	}
}

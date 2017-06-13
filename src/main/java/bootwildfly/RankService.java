package bootwildfly;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class RankService {

	public List<RankModel> getAll() {
		RankRepo.collection.sort((o1, o2)-> o2.getPoints().compareTo(o1.getPoints()));
		return RankRepo.collection;
	}

	public RankModel update(RankModel entity) {
		if (entity.getId() == null) {
			System.out.println("null");
			entity.setId(RankRepo.collection.size() + 1);
			RankRepo.collection.add(entity);
		} else {
			Optional<RankModel> optModel = RankRepo.collection
					.stream()
					.filter(e -> e.getId().equals(entity.getId()))
					.findFirst();
			
			if (!optModel.isPresent()) {
				System.out.println("!present");
				RankRepo.collection.add(entity);
			} else {
				System.out.println("present");
				int indexOf = RankRepo.collection.indexOf(entity);
				System.out.println(indexOf);
				RankRepo.collection.remove(indexOf);
				RankRepo.collection.add(entity);
			}
			
		}
		return entity;
	}
}

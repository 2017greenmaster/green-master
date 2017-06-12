package bootwildfly;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RankRepo extends JpaRepository<RankModel, Long> {
	Optional<RankModel> findOneById(Long id);
}

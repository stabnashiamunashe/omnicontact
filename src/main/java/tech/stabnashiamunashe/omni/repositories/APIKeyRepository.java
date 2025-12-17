package tech.stabnashiamunashe.omni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.stabnashiamunashe.omni.models.APIKey;

public interface APIKeyRepository extends JpaRepository<APIKey, Long> {
}
package tech.stabnashiamunashe.omni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.stabnashiamunashe.omni.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
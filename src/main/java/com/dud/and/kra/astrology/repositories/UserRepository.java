package com.dud.and.kra.astrology.repositories;

import com.dud.and.kra.astrology.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Если вам нужны какие-то дополнительные методы для запросов, вы можете добавить их здесь
}

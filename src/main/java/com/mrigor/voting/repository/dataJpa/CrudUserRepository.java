package com.mrigor.voting.repository.dataJpa;

import com.mrigor.voting.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudUserRepository extends JpaRepository<User,Integer> {
}

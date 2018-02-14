package com.mrigor.voting.repository.dataJpa;

import com.mrigor.voting.model.Voting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudVotingRepository extends JpaRepository<Voting, Integer> {
}

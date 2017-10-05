package com.libertymutual.goforcode.voting.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libertymutual.goforcode.voting.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

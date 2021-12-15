package com.server.projet.ressources.bdd;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByPseudo(String pseudo);
    int deleteByPseudo(String pseudo);
}

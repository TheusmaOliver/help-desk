package br.com.theusma.userserviceapi.repository;

import br.com.theusma.userserviceapi.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

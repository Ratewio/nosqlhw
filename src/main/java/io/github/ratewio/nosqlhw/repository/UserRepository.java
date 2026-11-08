package io.github.ratewio.nosqlhw.repository;

import io.github.ratewio.nosqlhw.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}

package com.example.webapitask;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServerRepository extends MongoRepository<Server,String> {


}

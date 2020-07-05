package com.url.shortener.data.repository;
import com.url.shortener.data.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer>{

}

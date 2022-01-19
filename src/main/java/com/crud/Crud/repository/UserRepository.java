package com.crud.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Crud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

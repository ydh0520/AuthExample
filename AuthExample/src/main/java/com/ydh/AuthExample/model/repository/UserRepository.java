package com.ydh.AuthExample.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ydh.AuthExample.model.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
	public List<UserEntity> findAll();

	public UserEntity save(UserEntity user);

	public Optional<UserEntity> findById(String id);
}

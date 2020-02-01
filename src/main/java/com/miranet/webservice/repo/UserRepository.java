package com.miranet.webservice.repo;

import com.miranet.webservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional
    @Query("SELECT r FROM User r WHERE r.username = :username")
    User findByUsername(@Param("username") String username);

    @Transactional
    @Query("SELECT r FROM User r WHERE r.email = :email")
    User findByEmail(@Param("email") String email);

    @Transactional
    @Query("SELECT r FROM User r WHERE r.id = :id")
    User findUserById(@Param("id") Long id);

    @Transactional
    @Query("SELECT r FROM User r WHERE r.id IN :ids")
    List<User> findUserByIds(@Param("ids") List<Long> id);
}

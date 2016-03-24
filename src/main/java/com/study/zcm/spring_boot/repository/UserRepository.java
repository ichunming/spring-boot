/**
 * User Data Access
 * 2016/03/24
 * zhangchunming
 */
package com.study.zcm.spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.zcm.spring_boot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

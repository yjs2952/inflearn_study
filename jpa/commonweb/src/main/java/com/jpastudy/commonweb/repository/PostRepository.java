package com.jpastudy.commonweb.repository;

import com.jpastudy.commonweb.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}

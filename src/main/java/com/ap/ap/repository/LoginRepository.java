package com.ap.ap.repository;

import com.ap.ap.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long> {}

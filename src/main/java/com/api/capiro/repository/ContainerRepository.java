package com.api.capiro.repository;

import com.api.capiro.entities.Container;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContainerRepository extends JpaRepository<Container, Long> {
}

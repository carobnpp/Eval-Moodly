package com.bnpparibas.epita;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHumeur extends JpaRepository<Humeur, Long> {
}

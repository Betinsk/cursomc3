package com.cursobe.cursomc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursobe.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
	
	
	

}

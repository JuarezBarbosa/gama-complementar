package com.projetofinal.projetofinal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepositorio extends JpaRepository<ContaEntidade, Long>{
    
}

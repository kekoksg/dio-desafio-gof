package com.desafiodio.gof.repository;

import com.desafiodio.gof.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends CrudRepository<Cliente, Long> {
}

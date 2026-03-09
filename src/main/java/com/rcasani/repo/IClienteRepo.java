package com.rcasani.repo;

import com.rcasani.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepo extends JpaRepository<Cliente, Integer> {
}

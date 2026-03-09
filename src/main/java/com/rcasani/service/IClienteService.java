package com.rcasani.service;

import com.rcasani.model.Cliente;

import java.util.List;

public interface IClienteService {

    Cliente save(Cliente cliente) throws Exception;

    Cliente update(Integer id, Cliente cliente) throws Exception;

    List<Cliente> findAll() throws Exception;

    Cliente findById(Integer id) throws Exception;

    void delete(Integer id) throws Exception;
}

package com.rcasani.service;

import com.rcasani.model.Cliente;
import com.rcasani.repo.IClienteRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements IClienteService {

    private final IClienteRepo clienteRepo;

    @Override
    public Cliente save(Cliente cliente) throws Exception {
        return clienteRepo.save(cliente);
    }

    @Override
    public Cliente update(Integer id, Cliente cliente) throws Exception {
        cliente.setIdCliente(id);
        return clienteRepo.save(cliente);
    }

    @Override
    public List<Cliente> findAll() throws Exception {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente findById(Integer id) throws Exception {
        return clienteRepo.findById(id).orElse(new Cliente());
    }

    @Override
    public void delete(Integer id) throws Exception {
        clienteRepo.deleteById(id);
    }
}

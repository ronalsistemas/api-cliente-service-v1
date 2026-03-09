package com.rcasani.controller;

import com.rcasani.model.Cliente;
import com.rcasani.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final IClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() throws Exception {
        List<Cliente> list = clienteService.findAll();

        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Integer id) throws Exception {
        Cliente obj = clienteService.findById(id);

        return ResponseEntity.ok(obj);
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Cliente cliente) throws Exception {
        Cliente obj = clienteService.save(cliente);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdCliente()).toUri();

        return ResponseEntity.created(location).build();

    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Integer id, @RequestBody Cliente cliente) throws Exception {
        Cliente obj = clienteService.update(id, cliente);

        return ResponseEntity.ok(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) throws Exception {
        clienteService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
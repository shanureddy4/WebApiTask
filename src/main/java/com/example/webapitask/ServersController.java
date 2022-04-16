package com.example.webapitask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ServersController {

    @Autowired
    private ServerRepository repo;
    @CrossOrigin("http://localhost:4200")
    @GetMapping("/api")
    public ResponseEntity<?> getServers(@RequestParam(required = false)String id, @RequestParam(required = false)String name){
    //checks for ID

        if(id!=null) {
            boolean hasEntry = this.repo.existsById(id);
            if(hasEntry){
                return ResponseEntity.ok(this.repo.findById(id));
            }
            else
            {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Server not found");
            }
        }
    // checks for name
        else if(name!=null){
            Server server = new Server();
            server.setName(name);
            Example<Server> serverEx = Example.of(server);
            List<Server> servers = this.repo.findAll(serverEx);
            if(servers.isEmpty()){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "similar servers not found");
            }
            else
                return ResponseEntity.ok(servers);
        }
    //get all
        else
        {
            return ResponseEntity.ok(this.repo.findAll());
        }
    }
    @CrossOrigin("http://localhost:4200")
    @PostMapping("/api")
    public ResponseEntity<?> addServer(@RequestBody Server server)
    {
        Server save = this.repo.save(server);
        return ResponseEntity.ok(save);
    }
    @CrossOrigin("http://localhost:4200")
    @DeleteMapping("/api")
    public void DeleteServer(@RequestParam(required = true) String id){
        this.repo.deleteById(id);
    }




}


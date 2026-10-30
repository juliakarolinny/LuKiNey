package com.juliaKarol.LuKiNey.Controller;

import com.juliaKarol.LuKiNey.Entity.Pratos;
import com.juliaKarol.LuKiNey.Service.PratosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("Pratos")
public class PratosController {

    private PratosService service;

    public PratosController(PratosService service) {
        this.service = service;
    }
    @GetMapping
    public List<Pratos> exibirPratos(){
        return service.exibirPratos();
    }
    @PostMapping

    public void insertPratos(@RequestBody Pratos p){
        service.cadastrarPratos(p);
    }
}

package com.juliaKarol.LuKiNey.Service;

import com.juliaKarol.LuKiNey.Entity.Pratos;
import com.juliaKarol.LuKiNey.Repository.PratosRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PratosService {

    private final PratosRepository pratosRepository;

    public PratosService(PratosRepository pratosRepository) {
        this.pratosRepository = pratosRepository;
    }

    public List<Pratos> exibirPratos(){
        List<Pratos> pratos = new ArrayList<>();
        return pratosRepository.findAll();
    }

    public void cadastrarPratos(Pratos pratos){
        Pratos  prato = new Pratos();
        pratos.setDescricao(pratos.getDescricao());
        pratos.setEstoque(pratos.getEstoque());
        pratos.setIngredientes(pratos.getIngredientes());
        pratos.setTempoPreparo(pratos.getTempoPreparo());
        pratos.setÑomeP(pratos.getÑomeP());
        pratos.setValor(pratos.getValor());


    }


}

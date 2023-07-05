package com.interview.tienda_patitos.services;

import com.interview.tienda_patitos.models.Patito;
import com.interview.tienda_patitos.repositories.PatitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatitoService {

    @Autowired
    public PatitoRepository repository;

    public Patito addPatito(Patito patito){
        Patito patitoDB = repository.getByPrecioAndColorAndTamaño(patito.getPrecio(),patito.getColor(),patito.getTamaño());
        if(patitoDB!=null){
            patitoDB.addCantidad(patito.getCantidad());
            return repository.saveAndFlush(patitoDB);
        }else{
            return repository.saveAndFlush(patito);
        }
    }

    public Patito updatePatito(Patito patito){
        Optional<Patito> optional = repository.findById(patito.getId());
        if(optional.isPresent()){
            Patito patitoDB=optional.get();
            patitoDB.setCantidad(patito.getCantidad());
            patito.setPrecio(patito.getPrecio());
            return repository.saveAndFlush(patito);
        }
        return null;

    }

    public void removePatito(Integer patito_id){
        Optional<Patito> patitoDB = repository.findById(patito_id);
        if(patitoDB.isPresent()) {
            Patito pato=patitoDB.get();
            pato.setBorrado(true);
            repository.save(pato);
        }
    }

    public List<Patito> getAllPatitos(){
        Sort sort = Sort.by(Sort.Direction.DESC,"precio");
        return repository.findAllByBorrado(sort,false);
    }
}

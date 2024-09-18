package poo2.estoque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo2.estoque.domain.ClasseProduto;
import poo2.estoque.service.ClasseProdutoServicoJPA;

@RestController
@RequestMapping("/api/estoque/classeproduto")
public class ClasseProdutoController {
    
    @Autowired
    private ClasseProdutoServicoJPA servico;

    public ClasseProdutoController(ClasseProdutoServicoJPA s){
        this.servico = s;
    }    

    @GetMapping
    public ResponseEntity<List<ClasseProduto>> getAll(){
        List<ClasseProduto> cp = this.servico.Browse();
        return new ResponseEntity<>(cp, HttpStatus.OK);
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<ClasseProduto> getById(@PathVariable Long codigo){
        Optional<ClasseProduto> opt = this.servico.Read(codigo);
        if (opt.isPresent()){
        return new ResponseEntity<>(opt.get(), HttpStatus.OK);
        }
        else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    } 

    @PostMapping
    public ResponseEntity<ClasseProduto> post(@RequestBody ClasseProduto cp) {
        ClasseProduto cpnew = this.servico.Add(cp);
        return new ResponseEntity<>(cpnew, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ClasseProduto> put(@RequestBody ClasseProduto cp){
        ClasseProduto cpalt = this.servico.Edit(cp);
        if (cpalt != null){
        return new ResponseEntity<>(cpalt, HttpStatus.OK);
        }
        else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<ClasseProduto> delete(@PathVariable Long codigo){
        ClasseProduto cpdel = this.servico.Delete(codigo);
        if (cpdel != null){
        return new ResponseEntity<>(cpdel, HttpStatus.NO_CONTENT);
        }
        else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

package poo2.estoque.service;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poo2.estoque.domain.ClasseProduto;
import poo2.estoque.repository.IClasseProdutoRepositorio;

@Service
public class ClasseProdutoServicoJPA implements IBaseServicoJPA<ClasseProduto> {

    @Autowired
    private IClasseProdutoRepositorio repositorio;

    public ClasseProdutoServicoJPA(IClasseProdutoRepositorio repo){
        this.repositorio = repo;
    }

    @Override
    public ArrayList<ClasseProduto> Browse() {
        return new ArrayList<ClasseProduto>(this.repositorio.findAll());
    }

    @Override
    public Optional<ClasseProduto> Read(Long chave) {
        return this.repositorio.findById(chave);
    }

    @Override
    public ClasseProduto Edit(ClasseProduto obj) {
        Optional<ClasseProduto> old = this.repositorio.findById(obj.getCodigo());
        if (old.isPresent()){
            ClasseProduto cp = old.get();
            cp.setDescricao(obj.getDescricao());
            cp.setDataDeAlteracao(LocalDate.now());
            this.repositorio.save(cp);
            return cp;
        }
        else{
            return null;
        }
    }

    @Override
    public ClasseProduto Add(ClasseProduto obj) {
        return this.repositorio.save(obj);
    }

    @Override
    public ClasseProduto Delete(Long chave) {
        Optional<ClasseProduto> old = this.repositorio.findById(chave);
        if (old.isPresent()){
            ClasseProduto cp = old.get();
            this.repositorio.delete(cp);
            return cp;
        }
        else{
            return null;
        }    
    }
}

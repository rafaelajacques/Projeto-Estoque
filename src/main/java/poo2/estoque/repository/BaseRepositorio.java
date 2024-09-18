package poo2.estoque.repository;

import java.util.List;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseRepositorio<TDominio> {
    protected List<TDominio> storage;
    public abstract TDominio Create(TDominio instancia);
    public abstract TDominio Read(Long codigo);
    public List<TDominio> ReadAll(){
        return storage;
    }
    public abstract TDominio Update(TDominio instancia);
    public abstract TDominio Delete(Long codigo);
}

package poo2.estoque.service;

import java.util.List;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseServico<TRepositorio, TDominio> {
    protected TRepositorio repo;
    public abstract List<TDominio> Browse();
    public abstract TDominio Read(Long codigo);
    public abstract TDominio Edit(TDominio obj);
    public abstract TDominio Add(TDominio obj);
    public abstract TDominio Delete(Long codigo);
}

package repository;

import java.util.Set;

public interface Repository<T> {
    public boolean cadastrar(T entidade);

    public Set<T> listar();

    public T buscar(int codigo);

    public boolean atualizar(T entidade);

    public boolean remover(int codigo);
}

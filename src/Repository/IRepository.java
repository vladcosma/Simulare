package Repository;

import Domain.Entity;

import java.util.List;

public interface IRepository<T extends Entity> {

    T findById(String id);
    void upsert(T cake);

    void remove(String id);
    List<T> getAll();
}

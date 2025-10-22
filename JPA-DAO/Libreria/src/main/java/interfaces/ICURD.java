package interfaces;

import java.util.List;

public interface ICURD {
    <T> List<T> getAll(String namedQuery, Class<T> clazz);
    <T> void insert(T entity);
    <T> void update(T entity);
    <T> void delete(T entity);
    <T> T findById(Integer id, Class<T> clazz);

}

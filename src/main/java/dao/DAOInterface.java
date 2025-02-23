package dao;

import java.util.ArrayList;

public interface DAOInterface <T, U>{
    public boolean insert(T t);
    public int update(T t,U u);
    public ArrayList<T> getAll();
    public T getById(int t);


}

package com.jbeam.repository;

import com.jbeam.entity.DomainObject;

import java.util.List;
import java.util.Set;

public interface Repository<V extends DomainObject> {

    void insert(V object);

    void delete(V object);

    void update(V object);

    V getRowById(int id);

    List<V> getListById(int id);

    Set<String> getAll();

}

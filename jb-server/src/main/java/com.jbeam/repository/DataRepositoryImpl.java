package com.jbeam.repository;

import com.jbeam.entity.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.sql.Types;
import java.util.*;

@org.springframework.stereotype.Repository("dataRespitory")
public class DataRepositoryImpl implements Repository<Data> {

    @Autowired
    protected JdbcOperations jdbcOperations;

    @Override
    public void insert(Data object) {

        Object[] params = new Object[]{object.getId(), object.getDescription()};
        int[] types = new int[]{Types.VARCHAR, Types.VARCHAR};

        jdbcOperations.update("INSERT INTO yourapp_data(\n" +
                "            data_id, data_description)\n" +
                "    VALUES (cast(? as UUID), ?);", params, types);
    }

    @Override
    public void delete(Data object) {
        jdbcOperations.update("DELETE FROM yourapp_data\n" +
                " WHERE data_id = '" + object.getId().toString() + "';");
    }

    @Override
    public void update(Data object) {
    }

    @Override
    public Data getRowById(int id){
        return new Data(UUID.fromString("1"), "D");
    }

    @Override
    public List<Data> getListById(int id){
        return new List<Data>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Data> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Data data) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Data> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Data> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Data get(int index) {
                return null;
            }

            @Override
            public Data set(int index, Data element) {
                return null;
            }

            @Override
            public void add(int index, Data element) {

            }

            @Override
            public Data remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Data> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Data> listIterator(int index) {
                return null;
            }

            @Override
            public List<Data> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }

    @Override
    public Set<String> getAll() {
        Set<String> result = new HashSet<>();
        SqlRowSet rowSet = jdbcOperations.queryForRowSet("SELECT data_description FROM yourapp_data p ORDER BY RANDOM() LIMIT 50;");
        while (rowSet.next()) {
            result.add(rowSet.getString("data_description"));
        }
        return result;
    }


}

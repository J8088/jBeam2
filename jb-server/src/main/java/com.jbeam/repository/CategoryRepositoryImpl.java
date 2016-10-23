package com.jbeam.repository;

import com.jbeam.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;

import java.sql.Types;
import java.util.List;
import java.util.Set;

@org.springframework.stereotype.Repository("categoryRepository")
public class CategoryRepositoryImpl implements Repository<Category> {

    @Autowired
    protected JdbcOperations jdbcOperations;

    @Override
    public void insert(Category object) {
        Object[] params = new Object[]{object.getParentId(), object.getType(),
                object.getCode(), object.getName(), object.getDescription(),
                object.getCreatedBy(), object.getModifiedBy(), object.getCreatedDate(),
                object.getModifiedDate()};

        int[] types = new int[]{Types.INTEGER, Types.VARCHAR,
                Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
                Types.INTEGER, Types.INTEGER, Types.DATE, Types.DATE};

        jdbcOperations.update("INSERT INTO public.categories(\n" +
                "            category_parent_id, category_type, category_code, \n" +
                "            category_name, category_desc, created_by, modified_by, created_date, \n" +
                "            modified_date)\n" +
                "    VALUES (?, ?, ?, \n" +
                "            ?, ?, ?, ?, ?, \n" +
                "            ?);", params, types);


    }

    @Override
    public void delete(Category object) {

    }

    @Override
    public void update(Category object) {

    }

    @Override
    public Category getRowById(int id) {
        return null;
    }

    @Override
    public List<Category> getListById(int id) {
        return null;
    }

    @Override
    public Set<String> getAll() {
        return null;
    }
}

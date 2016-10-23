package com.jbeam.service;


import com.jbeam.entity.Category;
import com.jbeam.repository.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("basicService")
public class CatBusinessServiceImpl implements BasicService<Category> {

    private static final Logger LOG = LoggerFactory.getLogger(DataServiceImpl.class);

    @Autowired
    @Qualifier("categoryRepository")
    private Repository repository;

    @Override
    public boolean set(Category data) {
        try{
            repository.insert(data);
            return true;
        }catch (Exception e){
            LOG.error("ERROR SAVING DATA: " + e.getMessage(), e);
            return false;
        }
    }

    //    @Override
//    public boolean set(Category data) {
//        try {
//            repository.insert(data);
//            return true;
//        } catch (Exception e) {
//            LOG.error("ERROR SAVING Category: " + e.getMessage(), e);
//            return false;
//        }
//    }
}

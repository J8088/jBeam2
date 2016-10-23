package com.jbeam.controller;


import com.jbeam.controller.utils.Json;
import com.jbeam.entity.Category;
import com.jbeam.service.BasicService;
import com.jbeam.utils.ExceptionHandlerController;
import com.jbeam.utils.RestException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class CategoryController extends ExceptionHandlerController{

    private static final Logger LOG = Logger.getLogger(DataController.class);

    @Autowired
    @Qualifier("basicService")
    private BasicService<Category> basicService;

//    @RequestMapping(value = "/a/category/post", method = RequestMethod.POST)
//    public @ResponseBody Map<String, Object> post(@RequestBody(required = false) Map<String, String> data) throws RestException {
//        try {
//            LOG.info(data);
//            if(data == null){
//                return Json.emptyResponse();
//            }
////            basicService.set(data);
//            return Json.emptyResponse();
//        }catch (Exception e){
//            throw  new RestException(e);
//        }
//    };

    //{"id":"", "parentId": "", "type": "ty1", "code": "co1", "name": "Na1", "description": "Desc1", "createdBy": "1", "modifiedBy": "1", "createdDate": "10/10/2016","modifiedDate": "10/10/2016"}
    @RequestMapping(value = "/a/category/post", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> post(@RequestBody(required = false) Category data) throws RestException {
        try {
            LOG.info(data);
            if(data == null){
                return Json.emptyResponse();
            }
            basicService.set(data);
            return Json.emptyResponse();
        }catch (Exception e){
            throw  new RestException(e);
        }
    };

}

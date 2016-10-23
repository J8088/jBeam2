package com.jbeam.controller;

import com.jbeam.controller.utils.Json;
import com.jbeam.service.DataService;
import com.jbeam.utils.ExceptionHandlerController;
import com.jbeam.utils.RestException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
import java.util.Set;

@Controller
public class DataController extends ExceptionHandlerController {

    private static final Logger LOG = Logger.getLogger(DataController.class);

    @Autowired
    @Qualifier("dataService")
    private DataService dataService;

    @RequestMapping(value = "/a/persist", method = RequestMethod.POST)
    public @ResponseBody
    Map<String, Object> persist(@RequestParam("data") String data) throws RestException {
        try {
            if (data == null || data.equals("")) {
                return Json.emptyResponse();
            }
            dataService.set(data);
            return Json.emptyResponse();
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

    @RequestMapping(value = "/a/getRandomData", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> getRandomData() throws RestException {
        try {
            Set<String> result = dataService.getRandomData();
            return Json.successResponse(result);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }

}

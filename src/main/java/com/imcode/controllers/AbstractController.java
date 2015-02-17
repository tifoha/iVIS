package com.imcode.controllers;

import com.imcode.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * Created by vitaly on 17.02.15.
 */
public abstract class AbstractController<T, ID extends Serializable, SERVICE_TYPE extends GenericService<T, ID>> {

    @Autowired
    private SERVICE_TYPE service;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public @ResponseBody T get(@PathVariable("id") ID id) {
        return service.find(id);
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public @ResponseBody List<T> getAll() {
        List<T> result = service.findAll();
        return result;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody T createSchool(@RequestBody T entity) {
        return service.save(entity);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public @ResponseBody void delete(@PathVariable("id") ID id) {
        service.delete(id);
    }
    // Getters & Setters
    public SERVICE_TYPE getService() {
        return service;
    }

    public void setService(SERVICE_TYPE service) {
        this.service = service;
    }
}

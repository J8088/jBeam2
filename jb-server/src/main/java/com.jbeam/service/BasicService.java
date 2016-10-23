package com.jbeam.service;


import com.jbeam.entity.DomainObject;

public interface BasicService<V extends DomainObject> {
    public boolean set(V data);
}

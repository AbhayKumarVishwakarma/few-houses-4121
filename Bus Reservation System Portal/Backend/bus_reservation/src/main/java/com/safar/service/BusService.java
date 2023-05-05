package com.safar.service;

import com.safar.exception.BusException;
import com.safar.model.Bus;

import java.util.List;

public interface BusService {
    //admin methods
    public Bus addBus(Bus bus, String key) throws BusException;
    public Bus updateBus(Bus bus, String key) throws BusException;
    public Bus deleteBus(Integer busId, String key) throws BusException;

    //admin + user methods
    public Bus viewBus(Integer busId) throws BusException;
    public List<Bus> viewBusByBusType(String busType) throws BusException;
    public List<Bus> viewAllBuses() throws BusException;
}

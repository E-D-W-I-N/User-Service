package com.vsk.task.service;

import com.vsk.task.model.Address;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface AddressService {

    Response addAddress(Address address);

    Address getAddress(@PathParam("addressId") String addressId);
}

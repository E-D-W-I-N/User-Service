package com.vsk.task.service.impl;

import com.vsk.task.model.Address;
import com.vsk.task.service.AddressService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/addresservice")
public class AddressServiceImpl implements AddressService {

    Map<Long, Address> addresses = new HashMap<Long, Address>();

    @POST
    @Path("/addresses/")
    public Response addAddress(Address address) {
        System.out.println("----invoking addAddress, Address description is: " + address.getDescription());

        addresses.put(address.getId(), address);

        return Response.ok().type("application/xml").entity(address).build();
    }

    /**
     * This method is mapped to an HTTP GET of 'http://localhost:8181/cxf/crm/addresservice/addresses/{id}'.  The value for
     * {id} will be passed to this message as a parameter, using the @PathParam annotation.
     * <p/>
     * The method returns an Address object - the class for that object includes a few more JAX-RS annotations, allowing it to
     * display one of these two outputs, depending on the actual URI path being used:
     * - display the address information itself in XML format
     * - display details about a product in the address in XML format in a path relative to the URI defined here
     */

    @GET
    @Path("/addresses/{addressId}/")
    public Address getAddress(@PathParam("addressId") String addressId) {
        System.out.println("----invoking getAddress, Address id is: " + addressId);
        long idNumber = Long.parseLong(addressId);
        Address c = addresses.get(idNumber);
        return c;
    }
}

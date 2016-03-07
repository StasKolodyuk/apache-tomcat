package com.epam.jmp.web.service;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;

@Api(value = "/date", description = "Date Service")
@Path("/api")
public class DateService
{
    @GET
    @Path("/date")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Returns Current Date")
    public DateWrapper getDate()
    {
        DateWrapper dateWrapper = new DateWrapper();
        dateWrapper.setCurrentDate(LocalDate.now());

        return dateWrapper;
    }
}

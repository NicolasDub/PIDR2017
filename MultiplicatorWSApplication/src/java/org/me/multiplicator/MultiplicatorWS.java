/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.multiplicator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "MultiplicatorWS")
public class MultiplicatorWS {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicate")
    public int multiplicate(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
    int k = i*j;
    return k;
    }
}

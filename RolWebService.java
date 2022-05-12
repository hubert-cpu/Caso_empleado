/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.edu.upeu.ws001.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.ws001.dao.RolDao;
import pe.edu.upeu.ws001.daoImpl.RolDaoImpl;
import pe.edu.upeu.ws001.model.Rol;

/**
 *
 * @author admin
 */
@WebService(serviceName = "RolWebService")
public class RolWebService {

    RolDao rolDao = new RolDaoImpl();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertar")
    public int insertar(@WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return rolDao.create(new Rol(0, nombre));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "editar")
    public int editar(@WebParam(name = "idrol") int idrol, @WebParam(name = "nombre") String nombre) {
        //TODO write your implementation code here:
        return rolDao.update(new Rol(idrol, nombre));
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "eliminar")
    public int eliminar(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return rolDao.delete(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "read")
    public Rol read(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return rolDao.read(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readAll")
    public List<Rol> readAll() {
        //TODO write your implementation code here:
        return rolDao.readAll();
    }
}

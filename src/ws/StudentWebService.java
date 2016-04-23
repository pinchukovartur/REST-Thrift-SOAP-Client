
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentWebService", targetNamespace = "http://ws/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentWebService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://ws/StudentWebService/deleteStudentByIdRequest", output = "http://ws/StudentWebService/deleteStudentByIdResponse")
    public void deleteStudentById(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws/StudentWebService/setNewStudentInDBRequest", output = "http://ws/StudentWebService/setNewStudentInDBResponse")
    public String setNewStudentInDB(
        @WebParam(name = "arg0", partName = "arg0")
        Student arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ws.model.Student
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws/StudentWebService/searchStudentByIdRequest", output = "http://ws/StudentWebService/searchStudentByIdResponse")
    public Student searchStudentById(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

}
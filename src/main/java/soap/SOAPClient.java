package soap;

import model.Student;
import model.StudentsClient;
import ws.StudentWebService;
import ws.StudentWebServiceImplService;

import java.util.*;
import java.util.ArrayList;

public class SOAPClient implements StudentsClient {

    private StudentWebService soap;

    public SOAPClient(){
        StudentWebServiceImplService helloService = new ws.StudentWebServiceImplService();
        soap = helloService.getStudentWebServiceImplPort();
    }

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<Student>();
        for (int i = 1; i < soap.getDBSize(); i++) {
            if(soap.searchStudentById(i).getIdStudent()!=0){
            Student student = new Student();
            student.setIdStudent(soap.searchStudentById(i).getIdStudent());
            student.setName(soap.searchStudentById(i).getName());
            student.setSurname(soap.searchStudentById(i).getSurname());
            student.setGroup(soap.searchStudentById(i).getGroup());
            student.setScore(soap.searchStudentById(i).getScore());
                students.add(student);
            }
        }
     return students;
    }

    public Student getStudentByID(int idStudent) {
        Student student = new Student();
        student.setIdStudent(soap.searchStudentById(idStudent).getIdStudent());
        student.setName(soap.searchStudentById(idStudent).getName());
        student.setSurname(soap.searchStudentById(idStudent).getSurname());
        student.setGroup(soap.searchStudentById(idStudent).getGroup());
        student.setScore(soap.searchStudentById(idStudent).getScore());
        return student;
    }

    public void deleteStudentByID(int idStudent) {
        soap.deleteStudentById(idStudent);
    }

    public void upgradeStudentByID(Student student) {
        ws.Student student2 = new ws.Student();
        student2.setIdStudent(student.getIdStudent());
        student2.setName(student.getName());
        student2.setSurname(student.getSurname());
        student2.setGroup(student.getGroup());
        student2.setScore(student.getScore());
        System.out.println(student2.getName());
        soap.updateStudentById(student2);
    }

    public void setNewStudent(Student student) {
        ws.Student student2 = new ws.Student();
        student2.setName(student.getName());
        student2.setSurname(student.getSurname());
        student2.setGroup(student.getGroup());
        student2.setScore(student.getScore());
        soap.setNewStudentInDB(student2);
    }
}

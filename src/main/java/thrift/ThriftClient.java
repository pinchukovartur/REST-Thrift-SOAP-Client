package thrift;

import model.*;
import model.Student;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import java.util.ArrayList;
import java.util.List;

public class ThriftClient implements StudentsClient{
    private ThriftService.Client client;

    public ThriftClient(){
            TTransport transport;
            try {
                transport = new TSocket("localhost", 7911);
                transport.open();

                TProtocol protocol = new TBinaryProtocol(transport);
                client = new ThriftService.Client(protocol);

            } catch (TTransportException e) {
                e.printStackTrace();
            }
        }

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<Student>();
        for (int i = 1; i < 99; i++) {
            try {
                if(client.searchStudentById(i).getStudentid()!=0){
                    Student student = new Student();
                    student.setIdStudent(client.searchStudentById(i).getStudentid());
                    student.setName(client.searchStudentById(i).getName());
                    student.setSurname(client.searchStudentById(i).getSurnamename());
                    student.setGroup(client.searchStudentById(i).getGroup());
                    student.setScore(client.searchStudentById(i).getScore());
                    students.add(student);
                }
            } catch (TException e) {
                e.printStackTrace();
            }
        }
        return students;
    }

    public Student getStudentByID(int idStudent) {
        Student student = new Student();
        try {
            student.setIdStudent(client.searchStudentById(idStudent).getStudentid());
            student.setName(client.searchStudentById(idStudent).getName());
            student.setSurname(client.searchStudentById(idStudent).getSurnamename());
            student.setGroup(client.searchStudentById(idStudent).getGroup());
            student.setScore(client.searchStudentById(idStudent).getScore());
        } catch (TException e) {
            e.printStackTrace();
        }
        return student;
    }

    public void deleteStudentByID(int idStudent) {
        try {
            client.deleteStudentById(idStudent);
        } catch (TException e) {
            e.printStackTrace();
        }
    }

    public void upgradeStudentByID(Student student) {
        try {
            thrift.Student student2 = new thrift.Student();
            student2.setStudentid(student.getIdStudent());
            student2.setName(student.getName());
            student2.setSurnamename(student.getSurname());
            student2.setGroup(student.getGroup());
            student2.setScore(student.getScore());
            System.out.println(student2.getName());
            client.updateStudentById(student2);
        } catch (TException e) {
            e.printStackTrace();
        }
    }

    public void setNewStudent(Student student) {
        try {
            thrift.Student student2 = new thrift.Student();
            student2.setStudentid(student.getIdStudent());
            student2.setName(student.getName());
            student2.setSurnamename(student.getSurname());
            student2.setGroup(student.getGroup());
            student2.setScore(student.getScore());
            System.out.println(student2.getName());
            client.setNewStudentInDB(student2);
        } catch (TException e) {
            e.printStackTrace();
        }
    }
}


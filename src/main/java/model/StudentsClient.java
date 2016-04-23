package model;

import model.Student;

import java.util.List;

public interface StudentsClient {

    public List<Student> getAllStudent();

    public Student getStudentByID(int idStudent);

    public void deleteStudentByID(int idStudent);

    public void upgradeStudentByID(Student student);

    public void setNewStudent(Student newStudent);
}

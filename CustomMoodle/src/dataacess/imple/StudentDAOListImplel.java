/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataacess.imple;

import dataacess.StudentDAO;
import java.util.ArrayList;
import java.util.List;
import model.Student;


public class StudentDAOListImplel implements StudentDAO {

    private static List<Student> studentList = new ArrayList<>();
    
    @Override
    public Student save(Student student) {
        String id = Integer.toString(studentList.size() + 1);
        student.setId(id);
        studentList.add(student);
        return student;
    }

    @Override
    public List<Student> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student find(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }
    
    
}

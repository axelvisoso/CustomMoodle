/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussineslogic;

import dataacess.StudentDAO;
import dataacess.imple.StudentDAOListImplel;
import java.util.List;
import model.Student;

/**
 *
 * @author Axelv
 */
public class StudentBLO {
    
    private StudentDAO studentDAO;

    public StudentBLO() {
        studentDAO = new StudentDAOListImplel();
    }
    
    
    
    public Student save(Student student){
        return studentDAO.save(student);
    }
    
    public List<Student> findAll(){
        return studentDAO.findAll();
    }
    
    public Student find(String id){
        return studentDAO.find(id);
    }
    
    public Student findByLastName(String lastName){
        return studentDAO.findByLastName(lastName);
    }
    
    public void delete(Student student){
         studentDAO.delete(student);
    }
    
    public void update(Student student){
         studentDAO.update(student);
    }
}

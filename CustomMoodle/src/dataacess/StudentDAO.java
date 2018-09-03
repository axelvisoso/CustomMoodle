/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataacess;

import java.util.List;
import model.Student;

/**
 *
 * @author Axelv
 */
public interface StudentDAO {
    
    public Student save(Student student);
    
    public List<Student> findAll();
    
    public Student find(String id);
}

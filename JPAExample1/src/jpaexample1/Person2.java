/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaexample1;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Victor
 */
@Entity
public class Person2 implements Serializable {
     private Long id;
    private String name;
    private String alamat;
    private String no;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setNo(String no){
        this.no = no;
    }
    public String getNo(){
        return no;
    }
    
}

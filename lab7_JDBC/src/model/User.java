/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author aditt
 */
public class User {
private int userId;
private String name;
private String college;

private int age;
private String hobby;
//private ImageIcon picture;
//private Date dob;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }



//    public Date getDob() {
//        return dob;
//    }
//
//    public void setDob(Date dob) {
//        this.dob = dob;
//    }
//
//// methods
//
//    public ImageIcon getPicture() {
//        return picture;
//    }
//
//    public void setPicture(ImageIcon picture) {
//        this.picture = picture;
//    }



public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getCollege() {
return college;
}

public void setCollege(String college) {
this.college = college;
}

public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
}

public String getHobby() {
return hobby;
}

public void setHobby(String hobby) {
this.hobby = hobby;
}

@Override
public String toString() {
return "User{" + "name=" + name + ", college=" + college + ", age=" + age + ", hobby=" + hobby + '}';
}
    
}

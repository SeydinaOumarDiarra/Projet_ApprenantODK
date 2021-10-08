/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author seydinaoumar.diarra
 */

@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Entity
public class Utilisateur implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nom;
    private int age;
    private int telephone;
    private String email;
    private String login;
    private String password;
    private String genre;
}

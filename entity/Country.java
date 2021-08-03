package com.DevApp.DevTah.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.istack.NotNull;
import javax.persistence.NamedQueries;


@Entity
@Table(name = "country")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Country.findAll", query = "SELECT c FROM Country c")
    , @NamedQuery(name = "Country.findById", query = "SELECT c FROM Country c WHERE c.id = :id")
    , @NamedQuery(name = "Country.findByName", query = "SELECT c FROM Country c WHERE c.name = :name")
    , @NamedQuery(name = "Country.findByCapital", query = "SELECT c FROM Country c WHERE c.capital = :capital")
   })
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

@Id
@Basic(optional = false)
@NotNull
@Size(max = 10, min = 0)
@Column(name = "id")
private String id;
@Size(max = 50, min = 0)
@Column(name = "name")
private String name;
@Size(max = 50, min = 0)
@Column(name = "capital")
private String capital;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCapital() {
	return capital;
}
public void setCapital(String capital) {
	this.capital = capital;
}
public Country(String name, String capital) {
	super();
	this.name = name;
	this.capital = capital;
}
@Override
public String toString() {
	return "Country [id=" + id + ", name=" + name + ", capital=" + capital + "]";
}
public Country() {
	super();
	// TODO Auto-generated constructor stub
}



}

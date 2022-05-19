package com.huynhuyn25.etherealapp.Model;

import javax.persistence.*;

@Entity
@Table(name = "manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idncc;
    @Column(name = "tenncc")
    private String tenncc;
    @Column(name = "tenctyql")
    private String tenctyql;
    @Column(name = "email")
    private String email;
    @Column(name = "sdt")
    private String sdt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_idAdress")
    private Address address;
    public Manufacturer() {
    }

    public Manufacturer(int idncc, String tenncc, String tenctyql, String email, String sdt, Address address) {
        this.idncc = idncc;
        this.tenncc = tenncc;
        this.tenctyql = tenctyql;
        this.email = email;
        this.sdt = sdt;
        this.address = address;
    }

    public int getIdncc() {
        return idncc;
    }

    public void setIdncc(int idncc) {
        this.idncc = idncc;
    }

    public String getTenncc() {
        return tenncc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public String getTenctyql() {
        return tenctyql;
    }

    public void setTenctyql(String tenctyql) {
        this.tenctyql = tenctyql;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

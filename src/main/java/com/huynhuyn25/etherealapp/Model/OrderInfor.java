package com.huynhuyn25.etherealapp.Model;

import javax.persistence.*;

@Entity
@Table(name = "order_infor")
public class OrderInfor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrderInfor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_idAdress")
    private Address address;
    private String sdt;
    private String tenNguoiNhan;

    public OrderInfor() {
    }

    public OrderInfor(int idOrderInfor, Address address, String sdt, String tenNguoiNhan) {
        this.idOrderInfor = idOrderInfor;
        this.address = address;
        this.sdt = sdt;
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public int getIdOrderInfor() {
        return idOrderInfor;
    }

    public void setIdOrderInfor(int idOrderInfor) {
        this.idOrderInfor = idOrderInfor;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }
}

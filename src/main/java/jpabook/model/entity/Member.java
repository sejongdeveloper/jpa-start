package jpabook.model.entity;

<<<<<<< HEAD
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
>>>>>>> origin/master

@Entity
public class Member {

<<<<<<< HEAD
    @Id
    @GeneratedValue
=======
    @Id @GeneratedValue
>>>>>>> origin/master
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    private String city;
    private String street;
    private String zipcode;

<<<<<<< HEAD
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

=======
>>>>>>> origin/master
    //Getter, Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
<<<<<<< HEAD

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
=======
>>>>>>> origin/master
}

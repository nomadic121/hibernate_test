package hibernate_test.models;

import javax.persistence.*;

@Entity
@Table(name = "user_test_table")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id = 0;
    @Column(name = "name")
    private String name;
    @Column(name = "subname")
    private String subname;
    @Column(name = "age")
    private int age;

    public UserEntity(final String name, final String subname, final int age) {
        this.name = name;
        this.subname = subname;
        this.age = age;
    }

    public UserEntity() {
        this ("name", "subname", 0);
    }

    public String getName() {
        return name;
    }

    public String getSubname() {
        return subname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subname='" + subname + '\'' +
                ", age=" + age +
                '}';
    }
}

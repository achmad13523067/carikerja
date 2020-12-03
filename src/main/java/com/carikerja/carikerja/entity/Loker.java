package com.carikerja.carikerja.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "loker")
@Setter
@Getter
@NoArgsConstructor

public class Loker extends BaseEntity<Loker> {


    private static final long serialVersionUID = -6472562527898776118L;
    @Column(name = "title", columnDefinition = "VARCHAR(150)")
    private String title;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = " author")
    private String author;

    @Column(name = " publisher")
    private String publiser;

    @Column(name = " description")
    private String description;
}

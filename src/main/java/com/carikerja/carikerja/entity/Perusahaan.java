package com.carikerja.carikerja.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "perusahaan")
@Getter
@Setter
@NoArgsConstructor

public class Perusahaan extends BaseEntity<Loker> {


    private static final long serialVersionUID = -2236470504407018580L;

    public enum StatusLoker{
        BORROWED,
        RETURNED
    }

    @Column(name = " type_identuty")
    private String typeIdentity;

    @Column(name = " number_identuty")
    private String numberIdentity;
    @Column(name = " duration")
    private Integer duration;

    @Column(name = "loker_date")
    @Temporal(TemporalType.DATE)
    private Date lokerDate;

    @Column(name = "return_date")
    @Temporal(TemporalType.DATE)
    private Date returnDate;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Date status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loker_id")
    private Loker loker;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}

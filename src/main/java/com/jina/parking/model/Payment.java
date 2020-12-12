package com.jina.parking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String carNum;
    @Column(nullable = false)
    private int sum;
    @Column(nullable = false)
    private int received;
    @Column(nullable = false)
    private int given;
    @Enumerated(EnumType.STRING)
    private PayMethod payMethod;
    @CreationTimestamp
    private Timestamp payTime;

}

package com.example.finals.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Items {
    @Id
    @Column(name = "Icode")
    private String icode;
    private String Catcode;
    private String Idesc;
    private float Price;
}

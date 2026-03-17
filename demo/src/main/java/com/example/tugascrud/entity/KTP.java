package com.example.tugascrud.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "ktp")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KTP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 16, unique = true, nullable = false)
    private String nik;

    private String namaLengkap;
    private String tempatLahir;

    @Temporal(TemporalType.DATE)
    private Date tanggalLahir;

    private String jenisKelamin;
    private String golonganDarah;

    private String alamat;
    private String rtRw;
    private String desa;
    private String kecamatan;

    private String agama;
    private String statusPerkawinan;
    private String pekerjaan;
    private String kewarganegaraan;

    private String berlakuHingga;
}
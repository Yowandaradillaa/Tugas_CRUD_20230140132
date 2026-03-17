package com.example.tugascrud.dto;

import lombok.Data;
import java.util.Date;

@Data
public class KtpDto {

    private Integer id;
    private String nik;
    private String namaLengkap;
    private String tempatLahir;
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
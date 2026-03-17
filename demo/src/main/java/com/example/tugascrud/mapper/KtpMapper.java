package com.example.tugascrud.mapper;

import com.example.tugascrud.dto.KtpDto;
import com.example.tugascrud.entity.KTP;

public class KtpMapper {

    public static KTP toEntity(KtpDto dto) {
        KTP k = new KTP();

        k.setId(dto.getId());
        k.setNik(dto.getNik());
        k.setNamaLengkap(dto.getNamaLengkap());
        k.setTempatLahir(dto.getTempatLahir());
        k.setTanggalLahir(dto.getTanggalLahir());
        k.setJenisKelamin(dto.getJenisKelamin());
        k.setGolonganDarah(dto.getGolonganDarah());
        k.setAlamat(dto.getAlamat());
        k.setRtRw(dto.getRtRw());
        k.setDesa(dto.getDesa());
        k.setKecamatan(dto.getKecamatan());
        k.setAgama(dto.getAgama());
        k.setStatusPerkawinan(dto.getStatusPerkawinan());
        k.setPekerjaan(dto.getPekerjaan());
        k.setKewarganegaraan(dto.getKewarganegaraan());
        k.setBerlakuHingga(dto.getBerlakuHingga());

        return k;
    }

    public static KtpDto toDto(KTP k) {
        KtpDto d = new KtpDto();

        d.setId(k.getId());
        d.setNik(k.getNik());
        d.setNamaLengkap(k.getNamaLengkap());
        d.setTempatLahir(k.getTempatLahir());
        d.setTanggalLahir(k.getTanggalLahir());
        d.setJenisKelamin(k.getJenisKelamin());
        d.setGolonganDarah(k.getGolonganDarah());
        d.setAlamat(k.getAlamat());
        d.setRtRw(k.getRtRw());
        d.setDesa(k.getDesa());
        d.setKecamatan(k.getKecamatan());
        d.setAgama(k.getAgama());
        d.setStatusPerkawinan(k.getStatusPerkawinan());
        d.setPekerjaan(k.getPekerjaan());
        d.setKewarganegaraan(k.getKewarganegaraan());
        d.setBerlakuHingga(k.getBerlakuHingga());

        return d;
    }
}
package com.example.tugascrud.service.impl;

import com.example.tugascrud.dto.KtpDto;
import com.example.tugascrud.entity.KTP;
import com.example.tugascrud.mapper.KtpMapper;
import com.example.tugascrud.repository.KtpRepository;
import com.example.tugascrud.service.KtpService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KtpServiceImpl implements KtpService {

    private final KtpRepository repository;

    public KtpServiceImpl(KtpRepository repository) {
        this.repository = repository;
    }

    @Override
    public KtpDto create(KtpDto dto) {

        if (dto.getNik() == null || dto.getNik().length() != 16) {
            throw new RuntimeException("NIK harus 16 digit!");
        }

        if (repository.findByNik(dto.getNik()).isPresent()) {
            throw new RuntimeException("NIK sudah terdaftar!");
        }

        KTP ktp = repository.save(KtpMapper.toEntity(dto));
        return KtpMapper.toDto(ktp);
    }

    @Override
    public List<KtpDto> getAll() {
        return repository.findAll()
                .stream()
                .map(KtpMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public KtpDto getById(Integer id) {
        KTP ktp = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));
        return KtpMapper.toDto(ktp);
    }

    @Override
    public KtpDto update(Integer id, KtpDto dto) {

        KTP ktp = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Data tidak ditemukan"));

        ktp.setNamaLengkap(dto.getNamaLengkap());
        ktp.setTempatLahir(dto.getTempatLahir());
        ktp.setTanggalLahir(dto.getTanggalLahir());
        ktp.setJenisKelamin(dto.getJenisKelamin());
        ktp.setGolonganDarah(dto.getGolonganDarah());
        ktp.setAlamat(dto.getAlamat());
        ktp.setRtRw(dto.getRtRw());
        ktp.setDesa(dto.getDesa());
        ktp.setKecamatan(dto.getKecamatan());
        ktp.setAgama(dto.getAgama());
        ktp.setStatusPerkawinan(dto.getStatusPerkawinan());
        ktp.setPekerjaan(dto.getPekerjaan());
        ktp.setKewarganegaraan(dto.getKewarganegaraan());
        ktp.setBerlakuHingga(dto.getBerlakuHingga());

        return KtpMapper.toDto(repository.save(ktp));
    }

    @Override
    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Data tidak ditemukan");
        }
        repository.deleteById(id);
    }
}
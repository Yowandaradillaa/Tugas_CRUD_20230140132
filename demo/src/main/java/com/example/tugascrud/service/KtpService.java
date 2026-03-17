package com.example.tugascrud.service;

import com.example.tugascrud.dto.KtpDto;
import java.util.List;

public interface KtpService {

    KtpDto create(KtpDto dto);

    List<KtpDto> getAll();

    KtpDto getById(Integer id);

    KtpDto update(Integer id, KtpDto dto);

    void delete(Integer id);
}
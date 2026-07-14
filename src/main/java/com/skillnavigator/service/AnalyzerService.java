package com.skillnavigator.service;

import com.skillnavigator.dto.AnalyzerResponse;

public interface AnalyzerService {

    AnalyzerResponse analyze(Long userId, Long companyId);

}
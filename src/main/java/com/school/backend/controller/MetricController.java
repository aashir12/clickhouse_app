package com.example.demo.controller;

import com.school.backend.models.Metric;
import com.school.backend.repository.MetricRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MetricController {

    private final MetricRepository metricRepository;

    public MetricController(MetricRepository metricRepository) {
        this.metricRepository = metricRepository;
    }

    @GetMapping("/metrics")
    public List<Metric> getAllMetrics() {
        return metricRepository.findAll();
    }
}

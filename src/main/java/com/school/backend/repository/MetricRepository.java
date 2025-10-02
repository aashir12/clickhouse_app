package com.school.backend.repository;
import com.school.backend.models.Metric;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MetricRepository {

    private final JdbcTemplate jdbcTemplate;

    public MetricRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Metric> findAll() {
        String sql = "SELECT * FROM metrics";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Metric metric = new Metric();
            metric.setMetricId(rs.getLong("metric_id"));
            metric.setClientAppId(rs.getLong("client_app_id"));
            metric.setName(rs.getString("name"));
            metric.setUnit(rs.getString("unit"));
            metric.setType(rs.getString("type"));
            metric.setIsMonotonic(rs.getInt("is_monotonic"));
            metric.setTemporality(rs.getString("temporality"));
            metric.setMetricFingerprint(rs.getString("metric_fingerprint"));
            metric.setScope(rs.getString("scope"));
            return metric;
        });
    }
}


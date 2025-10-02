package com.school.backend.models;

public class Metric {
    private Long metricId;
    private Long clientAppId;
    private String name;
    private String unit;
    private String type;
    private Integer isMonotonic;
    private String temporality;
    private String metricFingerprint;
    private String scope;

    // Getters and setters
    public Long getMetricId() { return metricId; }
    public void setMetricId(Long metricId) { this.metricId = metricId; }

    public Long getClientAppId() { return clientAppId; }
    public void setClientAppId(Long clientAppId) { this.clientAppId = clientAppId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Integer getIsMonotonic() { return isMonotonic; }
    public void setIsMonotonic(Integer isMonotonic) { this.isMonotonic = isMonotonic; }

    public String getTemporality() { return temporality; }
    public void setTemporality(String temporality) { this.temporality = temporality; }

    public String getMetricFingerprint() { return metricFingerprint; }
    public void setMetricFingerprint(String metricFingerprint) { this.metricFingerprint = metricFingerprint; }

    public String getScope() { return scope; }
    public void setScope(String scope) { this.scope = scope; }
}

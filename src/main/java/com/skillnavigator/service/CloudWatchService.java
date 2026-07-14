package com.skillnavigator.service;

import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.cloudwatch.CloudWatchClient;
import software.amazon.awssdk.services.cloudwatch.model.MetricDatum;
import software.amazon.awssdk.services.cloudwatch.model.PutMetricDataRequest;
import software.amazon.awssdk.services.cloudwatch.model.StandardUnit;

@Service
public class CloudWatchService {

    private final CloudWatchClient cloudWatchClient;

    public CloudWatchService() {
        this.cloudWatchClient = CloudWatchClient.create();
    }

    public void putMetric(String metricName, double value) {
        MetricDatum datum = MetricDatum.builder()
                .metricName(metricName)
                .unit(StandardUnit.COUNT)
                .value(value)
                .build();

        PutMetricDataRequest request = PutMetricDataRequest.builder()
                .namespace("SkillNavigator")
                .metricData(datum)
                .build();

        cloudWatchClient.putMetricData(request);
    }
}
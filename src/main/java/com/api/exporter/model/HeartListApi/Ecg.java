
package com.api.exporter.model.HeartListApi;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "signalid",
    "afib"
})
public class Ecg {

    @JsonProperty("signalid")
    @Column(name = "signal_id", nullable = true)
    private Integer signalid;

    @JsonProperty("afib")
    @Column(name = "afib", nullable = true)
    private Integer afib;

}
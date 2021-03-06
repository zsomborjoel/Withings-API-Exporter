
package com.api.exporter.model.HeartListApi;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "diastole",
    "systole"
})
public class Bloodpressure {

    @JsonProperty("diastole")
    @Column(name = "diastole", nullable = true)
    private Integer diastole;

    @JsonProperty("systole")
    @Column(name = "systole", nullable = true)
    private Integer systole;
    
}

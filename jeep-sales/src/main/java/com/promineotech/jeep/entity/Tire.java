/**
 * 
 */
package com.promineotech.jeep.entity;

import java.math.BigDecimal;
import com.promineotech.jeep.entity.Option.OptionBuilder;
import lombok.Builder;
import lombok.Data;

/**
 * @author anili
 *
 */
@Data
@Builder
public class Tire {
  private Long tirePK;
  private String tireId;
  private String tireSize;
  private String manufactrurer;
  private BigDecimal price;
  private Long warrantyMiles;
  
  }
  


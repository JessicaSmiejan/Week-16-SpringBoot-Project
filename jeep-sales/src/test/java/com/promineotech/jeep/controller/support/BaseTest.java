/**
 * 
 */
package com.promineotech.jeep.controller.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import lombok.Getter;
import org.springframework.boot.test.web.server.LocalServerPort;

public class BaseTest {
@LocalServerPort
protected int serverPort;
  
  @Autowired
  @Getter
  protected TestRestTemplate restTemplate;
  // @return
    protected String getBaseUriForJeeps() {
        return String.format("http://localhost:%d/jeeps", serverPort);
  }
    
    // @return
    protected String getBaseUriForOrders() {
      return String.format("http://localhost:%d/orders", serverPort);
}
}
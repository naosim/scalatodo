package com.naosim.scalatodo.infra.api.sample

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}

@Controller
@EnableAutoConfiguration
class SampleApi {
  @RequestMapping(Array("/"))
  @ResponseBody
  def home(): String = {
    return "Hello, Spring Boot Sample Application!"
  }
}

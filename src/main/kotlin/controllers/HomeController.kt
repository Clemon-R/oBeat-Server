package com.obeat.controllers

import models.GreetingViewModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class HomeController {

    val counter = AtomicLong()

    @GetMapping("/home")
    fun home(@RequestParam(value = "name", defaultValue = "World") name: String) =
        GreetingViewModel(counter.incrementAndGet(), "Hello, $name")

}
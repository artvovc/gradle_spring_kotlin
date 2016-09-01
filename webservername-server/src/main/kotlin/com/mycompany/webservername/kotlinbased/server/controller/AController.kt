//package com.mycompany.webservername.kotlinbased.server.controller
//
//import com.mycompany.webservername.kotlinbased.server.facade.Base
//import org.springframework.http.HttpEntity
//import org.springframework.http.HttpStatus
//import org.springframework.http.MediaType
//import org.springframework.http.ResponseEntity
//import org.springframework.stereotype.Controller
//import org.springframework.web.bind.annotation.GetMapping
//import javax.servlet.http.HttpServletRequest
//import javax.servlet.http.HttpServletResponse
//import org.apache.log4j.Logger
//
///**
// * Created by Artemie on 26.08.2016.
// */
//@Controller
//class AController {
//
//    internal val log = Logger.getLogger(AController::class.java)
//
//    @GetMapping(path = arrayOf("/lol"), produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
//    fun work(request: HttpServletRequest, response: HttpServletResponse): HttpEntity<Base> {
//        val base = Base()
//        base.name = "WORK"
//        log.info("LOG WORK")
//        return ResponseEntity(base, HttpStatus.OK)
//    }
//
//}

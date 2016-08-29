package com.mycompany.servername.server.kotlinbased.initializer

import com.mycompany.servername.server.kotlinbased.config.AppContextConfig
import org.springframework.web.WebApplicationInitializer
import org.springframework.web.context.ContextLoaderListener
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext
import org.springframework.web.servlet.DispatcherServlet
import javax.servlet.ServletContext
import javax.servlet.ServletException

/**
 * Created by Artemie on 26.08.2016.
 */
class AppInitializer : WebApplicationInitializer {
    @Throws(ServletException::class)
    override fun onStartup(servletContext: ServletContext) {
        val rootContext = AnnotationConfigWebApplicationContext()
        rootContext.register(AppContextConfig::class.java)

        servletContext.addListener(ContextLoaderListener(rootContext))

        val dispatcherContext = AnnotationConfigWebApplicationContext()
        dispatcherContext.register(DispatcherConfig::class.java)

        val dispatcher = servletContext.addServlet("dispatcher", DispatcherServlet(dispatcherContext))
        dispatcher.setLoadOnStartup(1)
        dispatcher.addMapping("/*")
    }

}

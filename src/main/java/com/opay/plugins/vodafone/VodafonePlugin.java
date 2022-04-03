package com.opay.plugins.vodafone;

import com.opay.plugins.vodafone.config.ApplicationConfiguration;
import org.pf4j.PluginManager;
import org.pf4j.PluginWrapper;
import org.pf4j.spring.SpringPlugin;
import org.pf4j.spring.SpringPluginManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VodafonePlugin extends SpringPlugin {

    private static final Logger log = LoggerFactory.getLogger(VodafonePlugin.class);

    public VodafonePlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        log.info("Onecard plugin.start()");
    }

    @Override
    public void stop() {
        log.info("Onecard plugin.stop()");
        super.stop(); // to close applicationContext
    }

    @Override
    protected ApplicationContext createApplicationContext() {
        AnnotationConfigApplicationContext pluginContext = new AnnotationConfigApplicationContext();
        pluginContext.setClassLoader(getWrapper().getPluginClassLoader());

        PluginManager manager = wrapper.getPluginManager();
        if(manager instanceof SpringPluginManager) {
            ApplicationContext parentApplicationContext = ((SpringPluginManager)manager).getApplicationContext();
            if(parentApplicationContext != null) {
                pluginContext.setParent(parentApplicationContext);
            }
        }

        pluginContext.register(ApplicationConfiguration.class);
        pluginContext.refresh();
        return pluginContext;
    }
}

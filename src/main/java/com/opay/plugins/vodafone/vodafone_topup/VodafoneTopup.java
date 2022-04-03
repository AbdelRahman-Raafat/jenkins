package com.opay.plugins.vodafone.vodafone_topup;

import com.opay.plugins.shared.PluginInterface;
import org.pf4j.Extension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Extension
public class VodafoneTopup implements PluginInterface {
    @Autowired private VodafoneTopupService service;

    @Override
    public String identify() {
        return "VodafoneTopup";
    }

    @Override
    public Object execute(Map<String,Object> parameters) throws Exception {
        return service.execute(parameters);
    }
}

package com.opay.plugins.vodafone.vodafone_topup;

import com.opay.plugins.shared.utils.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class VodafoneTopupService {
    private static Logger log = LoggerFactory.getLogger(VodafoneTopupService.class);
    private final Environment environment;

    public VodafoneTopupService(Environment environment){
        this.environment = environment;
    }

    public Object execute(Map<String,Object> parameters) throws Exception
    {
        try {
            JdbcTemplate jdbcTemplate = (JdbcTemplate) parameters.get(AppConstants.JDBC_TEMPLATE);

            jdbcTemplate.update("insert into test_table(name) values ('Tamer Mohamed')");

            return new HashMap<String, Object>(){{
                put("status","Vodafone Topup Success");
            }};

        }catch (Exception e){
            log.error(e.getMessage(), e);
            throw e;
        }
    }

}



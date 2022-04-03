package com.opay.plugins.vodafone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PluginController {
    private static Logger log = LoggerFactory.getLogger(PluginController.class);

//    @RequestMapping(value = "/plugins/onecard/retrieveProductsList",
//            consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
//    public ResponseEntity<?> retrieveProductsList() throws Exception{
//        try {
//            return new ResponseEntity<>(retrieveProductsListService.execute(null), HttpStatus.OK);
//        }catch (Exception e){
//            log.error(e.getMessage(), e);
//            throw e;
//        }
//    }

}

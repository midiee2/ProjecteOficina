package io.swagger.api;

import io.swagger.model.Tecnic;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-22T16:17:54.505Z")

@Controller
public class TecnicApiController implements TecnicApi {

    private static final Logger log = LoggerFactory.getLogger(TecnicApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TecnicApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addTecnic(@ApiParam(value = "Instancia de tecnic afegit"  )  @Valid @RequestBody Tecnic objecteTecnic) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Tecnic>> findTecnic(@NotNull @ApiParam(value = "Filtrar per nom", required = true) @Valid @RequestParam(value = "nom", required = true) String nom) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Tecnic>>(objectMapper.readValue("[ {  \"projecte\" : {    \"color\" : \"#42f4ce\",    \"descripcio\" : \"Projecte Balearia\",    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"idProjecte\" : 11,    \"nom\" : \"Balearia\",    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"lloc\" : {    \"habilitat\" : true,    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"toma\" : 92,    \"idLloc\" : 222,    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",  \"estat\" : \"noAssignat\",  \"idTecnic\" : 600985,  \"nomCognom\" : \"Ramona Flowers\",  \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"}, {  \"projecte\" : {    \"color\" : \"#42f4ce\",    \"descripcio\" : \"Projecte Balearia\",    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"idProjecte\" : 11,    \"nom\" : \"Balearia\",    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"lloc\" : {    \"habilitat\" : true,    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"toma\" : 92,    \"idLloc\" : 222,    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",  \"estat\" : \"noAssignat\",  \"idTecnic\" : 600985,  \"nomCognom\" : \"Ramona Flowers\",  \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Tecnic>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Tecnic>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Tecnic>> findTecnicByStatus(@NotNull @ApiParam(value = "estats filtrats", required = true) @Valid @RequestParam(value = "status", required = true) String status) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Tecnic>>(objectMapper.readValue("[ {  \"projecte\" : {    \"color\" : \"#42f4ce\",    \"descripcio\" : \"Projecte Balearia\",    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"idProjecte\" : 11,    \"nom\" : \"Balearia\",    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"lloc\" : {    \"habilitat\" : true,    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"toma\" : 92,    \"idLloc\" : 222,    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",  \"estat\" : \"noAssignat\",  \"idTecnic\" : 600985,  \"nomCognom\" : \"Ramona Flowers\",  \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"}, {  \"projecte\" : {    \"color\" : \"#42f4ce\",    \"descripcio\" : \"Projecte Balearia\",    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"idProjecte\" : 11,    \"nom\" : \"Balearia\",    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"lloc\" : {    \"habilitat\" : true,    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"toma\" : 92,    \"idLloc\" : 222,    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",  \"estat\" : \"noAssignat\",  \"idTecnic\" : 600985,  \"nomCognom\" : \"Ramona Flowers\",  \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Tecnic>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Tecnic>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Tecnic> getTecnicById(@ApiParam(value = "ID del tecnic a retornar",required=true) @PathVariable("idTecnic") Integer idTecnic) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Tecnic>(objectMapper.readValue("{  \"projecte\" : {    \"color\" : \"#42f4ce\",    \"descripcio\" : \"Projecte Balearia\",    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"idProjecte\" : 11,    \"nom\" : \"Balearia\",    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"lloc\" : {    \"habilitat\" : true,    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"toma\" : 92,    \"idLloc\" : 222,    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",  \"estat\" : \"noAssignat\",  \"idTecnic\" : 600985,  \"nomCognom\" : \"Ramona Flowers\",  \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"}", Tecnic.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Tecnic>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Tecnic>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Tecnic>> getTecnics() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Tecnic>>(objectMapper.readValue("[ {  \"projecte\" : {    \"color\" : \"#42f4ce\",    \"descripcio\" : \"Projecte Balearia\",    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"idProjecte\" : 11,    \"nom\" : \"Balearia\",    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"lloc\" : {    \"habilitat\" : true,    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"toma\" : 92,    \"idLloc\" : 222,    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",  \"estat\" : \"noAssignat\",  \"idTecnic\" : 600985,  \"nomCognom\" : \"Ramona Flowers\",  \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"}, {  \"projecte\" : {    \"color\" : \"#42f4ce\",    \"descripcio\" : \"Projecte Balearia\",    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"idProjecte\" : 11,    \"nom\" : \"Balearia\",    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"lloc\" : {    \"habilitat\" : true,    \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",    \"toma\" : 92,    \"idLloc\" : 222,    \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"  },  \"dataAlta\" : \"2016-08-29T09:12:33.001Z\",  \"estat\" : \"noAssignat\",  \"idTecnic\" : 600985,  \"nomCognom\" : \"Ramona Flowers\",  \"dataBaixa\" : \"2016-08-29T09:12:33.001Z\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Tecnic>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Tecnic>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateTecnic(@ApiParam(value = "Objecte Tecnic que sha de modificar" ,required=true )  @Valid @RequestBody Tecnic body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

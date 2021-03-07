package com.jumbocash.t7.api;

import com.jumbocash.t7.model.Entity;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-07T11:46:35.995Z[GMT]")
@RestController
public class EntityApiController implements EntityApi {

    private static final Logger log = LoggerFactory.getLogger(EntityApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EntityApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addEntity(@Parameter(in = ParameterIn.DEFAULT, description = "Entity object that needs to be added.", required=true, schema=@Schema()) @Valid @RequestBody Entity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Entity> getEntitiesByEntityId(@Parameter(in = ParameterIn.PATH, description = "Entity ID", required=true, schema=@Schema()) @PathVariable("entityId") Long entityId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Entity>(objectMapper.readValue("{\n  \"zip\" : 1,\n  \"address\" : \"address\",\n  \"phone\" : 6,\n  \"city\" : \"city\",\n  \"entityType\" : \"customer\",\n  \"entityName\" : \"entityName\",\n  \"entityId\" : 0,\n  \"state\" : \"state\"\n}", Entity.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Entity>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Entity>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Entity>> getEntitiesByUserId(@Parameter(in = ParameterIn.PATH, description = "User ID", required=true, schema=@Schema()) @PathVariable("userId") Long userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Entity>>(objectMapper.readValue("[ {\n  \"zip\" : 1,\n  \"address\" : \"address\",\n  \"phone\" : 6,\n  \"city\" : \"city\",\n  \"entityType\" : \"customer\",\n  \"entityName\" : \"entityName\",\n  \"entityId\" : 0,\n  \"state\" : \"state\"\n}, {\n  \"zip\" : 1,\n  \"address\" : \"address\",\n  \"phone\" : 6,\n  \"city\" : \"city\",\n  \"entityType\" : \"customer\",\n  \"entityName\" : \"entityName\",\n  \"entityId\" : 0,\n  \"state\" : \"state\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Entity>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Entity>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateEntity(@Parameter(in = ParameterIn.DEFAULT, description = "Entity object that needs to be updated.", required=true, schema=@Schema()) @Valid @RequestBody Entity body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

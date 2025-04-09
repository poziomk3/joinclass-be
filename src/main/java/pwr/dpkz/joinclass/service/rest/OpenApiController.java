package pwr.dpkz.joinclass.service.rest;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenApiController {

    @GetMapping(value = "/openapi.yaml", produces = "application/yaml")
    public ResponseEntity<Resource> serveOpenApiYaml() {
        Resource yamlFile = new ClassPathResource("openapi.yaml");
        return ResponseEntity.ok(yamlFile);
    }
}

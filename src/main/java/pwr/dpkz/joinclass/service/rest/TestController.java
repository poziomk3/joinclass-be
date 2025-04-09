package pwr.dpkz.joinclass.service.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;
import pwr.dpkz.joinclass.api.TasksApi;
import pwr.dpkz.joinclass.model.NewTaskRequest;
import pwr.dpkz.joinclass.model.Task;

import java.util.List;
import java.util.UUID;

@Component
public class TestController implements TasksApi {


    @Override
    public ResponseEntity<List<Task>> tasksGet() {
        Jwt jwt = (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        String userId = jwt.getSubject();
        String email = jwt.getClaim("email");
        return null;
    }

    @Override
    public ResponseEntity<Task> tasksPost(NewTaskRequest newTaskRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Task> tasksTaskIdGet(UUID taskId) {
        return null;
    }
}

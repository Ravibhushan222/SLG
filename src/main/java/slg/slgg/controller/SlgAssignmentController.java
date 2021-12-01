package slg.slgg.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.RestController;
import slg.slgg.pojo.request.SlgRequest;
import slg.slgg.pojo.response.SlgResponse;

import slg.slgg.responses.APIResponse;
import slg.slgg.responses.message.CustomSuccessEnum;
import slg.slgg.service.SlgAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;
@RestController
public class SlgAssignmentController {
@Autowired
SlgAssignmentService slgAssignmentService;

    @PostMapping("/addSlg")
    public ResponseEntity<APIResponse> add(@RequestBody SlgRequest request) throws JsonProcessingException {
        Map<String, Object> dataObject = new HashMap<>();
        SlgResponse responsedata = slgAssignmentService.addSlgAssignment(request);
        dataObject.put("assignment_id", responsedata.getAssignment_id());
        return  new ResponseEntity<>(new APIResponse(true, CustomSuccessEnum.SUCCESS_SLG_ASSIGNMENT_ADD, dataObject), HttpStatus.OK);
    }

}

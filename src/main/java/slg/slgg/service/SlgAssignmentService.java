package slg.slgg.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import slg.slgg.pojo.request.SlgRequest;
import slg.slgg.pojo.response.SlgResponse;

public interface SlgAssignmentService {
    public SlgResponse addSlgAssignment(SlgRequest slgRequest) throws JsonProcessingException;

}

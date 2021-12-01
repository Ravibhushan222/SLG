package slg.slgg.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import slg.slgg.pojo.request.SlgRequest;
import slg.slgg.pojo.response.SlgResponse;

public interface SlgAssignmentDao {
    public SlgResponse addSlgAssignment(SlgRequest slgRequest) throws JsonProcessingException;


}

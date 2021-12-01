package slg.slgg.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;
import slg.slgg.dao.SlgAssignmentDao;
import slg.slgg.pojo.request.SlgRequest;
import slg.slgg.pojo.response.SlgResponse;
import slg.slgg.service.SlgAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class SlgAssignmentServiceImpl implements SlgAssignmentService {

    @Autowired
    SlgAssignmentDao slgAssignmentDao;
    @Override
    public SlgResponse addSlgAssignment(SlgRequest slgRequest) throws JsonProcessingException {
        return slgAssignmentDao.addSlgAssignment(slgRequest);
    }

}

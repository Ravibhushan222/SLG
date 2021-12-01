package slg.slgg.dao.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import slg.slgg.dao.SlgAssignmentDao;
import slg.slgg.pojo.request.SlgRequest;
import slg.slgg.pojo.response.SlgResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import slg.slgg.pojo.Assignment;

@Service
public class SlgAssignmentDaoImpl implements SlgAssignmentDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public SlgResponse addSlgAssignment(SlgRequest slgRequest) throws JsonProcessingException {
        String sql = "INSERT INTO sh_slg_assignment "
                + " (company_id, game_id,assignment,attempts,start_date,end_date,attempts_type,created_by) "
                + "values (?, ?, ?, ?,?,?,?,?)";

        Assignment assignment = new Assignment();
        assignment.setPlayer(slgRequest.getRecipients().get(0).getPlayers());
        assignment.setRecipient_type(slgRequest.getRecipients().get(0).getRecipients_type());
        ObjectMapper mapper = new ObjectMapper();
        String assignmentjson = mapper.writeValueAsString(assignment);

     Integer attempts = slgRequest.getRecipients().get(0).getMax_attempts();
     String start_date= slgRequest.getRecipients().get(0).getStart_date();
     String end_date= slgRequest.getRecipients().get(0).getEnd_date();
        String attempt_type = slgRequest.getRecipients().get(0).getAttempts_type();

        jdbcTemplate.update(sql,slgRequest.getCompany_id(),slgRequest.getGame_id(),assignmentjson,
                attempts,start_date,end_date,attempt_type,1);

       SlgResponse slgResponse = new SlgResponse();
       String sqll = "Select assignment_id from sh_slg_assignment where company_id ="+ slgRequest.getCompany_id()+
               " and game_id = " + slgRequest.getGame_id();
       Integer assignment_id= jdbcTemplate.queryForObject(sqll,Integer.class);

       slgResponse.setAssignment_id(assignment_id);
        return slgResponse;
    }

}

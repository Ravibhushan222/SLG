package slg.slgg.pojo.request;

import java.io.Serializable;
import java.util.List;

public class SlgRequest  {
    private Integer company_id;
    private Integer game_id;
     private List<RecipientRequest>recipients;

    public SlgRequest() {

    }

    public SlgRequest(Integer company_id, Integer game_id, List<RecipientRequest> recipients) {
        this.company_id = company_id;
        this.game_id = game_id;
        this.recipients = recipients;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public Integer getGame_id() {
        return game_id;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }

    public List<RecipientRequest> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<RecipientRequest> recipients) {
        this.recipients = recipients;
    }
}




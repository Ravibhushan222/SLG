package slg.slgg.pojo.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import slg.slgg.pojo.Player;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RecipientRequest {
    private  String recipients_type;
    private String attempts_type;
    private String start_date;
    private String end_date;
    private Integer max_attempts;
    private List<Player> players;


}

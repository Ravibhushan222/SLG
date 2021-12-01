package slg.slgg.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Player {
private Integer key_id;
private String filter_key;
private Boolean is_all;
List<Values>values;
}

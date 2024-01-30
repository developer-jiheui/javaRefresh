package practice02_dql;

import lombok.*;

import java.sql.Timestamp;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TalkDto {
  private int talk_no;
  private String talk_content;
  private String talk_user;
  private Timestamp written_at;
}

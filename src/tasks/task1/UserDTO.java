package tasks.task1;

import java.util.UUID;

public class UserDTO {
  private UUID uuid;
  private String username;
  private String email;

  public UserDTO(UUID id, String username, String email) {
    this.uuid = id;
    this.username = username;
    this.email = email;
  }


}

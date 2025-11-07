package tasks.task1;

import java.util.UUID;

public class User {
  private final UUID id;
  private String username;
  private String email;
  private boolean active;
  private UserRole role;
  private UUID uuid;

  public User(String username, String email, boolean active, UserRole role) {
    this.id = UUID.randomUUID();
    this.username = username;
    this.email = email;
    this.active = active;
    this.role = role;
  }

  public UserRole getRole() {
    return role;
  }

  public String getUsername () {
    return username;
  }

  public String getEmail () {
    return email;
  }

  public UUID getId() {
    return id;
  }

  public boolean isActive() { return active; }
}

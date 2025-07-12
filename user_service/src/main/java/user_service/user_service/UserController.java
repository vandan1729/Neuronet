package user_service.user_service;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RefreshScope
@RestController
public class UserController {

    @Value("${custom.message:Default message}")
    private String message;

    @GetMapping("/api/users/test/")
    public Map<String, Object> testUser() {
        return Map.of(
            "id", 1,
            "name", "Test User",
            "email", "testuser@example.com"
        );
    }
}
package webcloud.bestrestaurent.user.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginDto {
    private Long userId;
    private TokenDto tokenDto;
    // login시 userid 넘겨주기 위함
}
package com.weBank.weBank.security;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/16/21
 */
@Data
@NoArgsConstructor
@Component
public class JwtConfig {

    @Value("${security.jwt.uri:}")
    private String Uri;

    @Value("${security.jwt.header:}")
    private String header;

    @Value("${security.jwt.prefix:}")
    private String prefix;

    @Value("${security.jwt.expiration:1234}")
    private int expiration;

    @Value("${security.jwt.secret:}")
    private String secret;

}

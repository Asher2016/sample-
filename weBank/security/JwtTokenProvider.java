package com.weBank.weBank.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/16/21
 */
@Service
@Slf4j
public class JwtTokenProvider {
/*
        private final JwtConfig jwtConfig;

        public JwtTokenProvider(JwtConfig jwtConfig) {
            this.jwtConfig = jwtConfig;
        }

        public String generateToken(Authentication authentication) {

            Long now = System.currentTimeMillis();
            return Jwts.builder()
                    .setSubject(authentication.getName())
                    .claim("authorities", authentication.getAuthorities().stream()
                            .map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                    .setIssuedAt(new Date(now))
                    .setExpiration(new Date(now + jwtConfig.getExpiration() * 1000))  // in milliseconds
                    .signWith(SignatureAlgorithm.HS512, jwtConfig.getSecret().getBytes())
                    .compact();
        }

        public Claims getClaimsFromJWT(String token) {
            return Jwts.parser()
                    .setSigningKey(jwtConfig.getSecret().getBytes())
                    .parseClaimsJws(token)
                    .getBody();
        }

        public boolean validateToken(String authToken) {
            try {
                Jwts.parser()
                        .setSigningKey(jwtConfig.getSecret().getBytes())
                        .parseClaimsJws(authToken);

                return true;
            } catch (MalformedJwtException ex) {
                log.error("Invalid JWT token");
            } catch (ExpiredJwtException ex) {
                log.error("Expired JWT token");
            } catch (UnsupportedJwtException ex) {
                log.error("Unsupported JWT token");
            } catch (IllegalArgumentException ex) {
                log.error("JWT claims string is empty.");
            }
            return false;
        }
*/
}

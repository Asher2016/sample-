package com.weBank.weBank.security.model;

/**
 * Created by
 * User: Aloui Achref
 * Date: 3/16/21
 */
public class CustomerDetailsImpl {
    private static final long serialVersionUID = 1L;
/*
    private Long id;

    private String username;

    private String email;

    @JsonIgnore
    private String password;

    private Collection<? extends GrantedAuthority> authorities;

    public CustomerDetailsImpl(Long id, String username, String email, String password,
                           Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static CustomerDetailsImpl build(Customer user) {
        List<GrantedAuthority> authorities = null;
        return new CustomerDetailsImpl(
                user.getId(),
                user.getFirstName(),
                user.getAccount().getPassword(),
                user.getAccount().getEmail(),
                authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CustomerDetailsImpl user = (CustomerDetailsImpl) o;
        return Objects.equals(id, user.id);
    }*/
}
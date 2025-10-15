//package com.student.portal.security.model;
//
//import com.student.portal.domain.Student;
//import com.student.portal.domain.Teacher;
//import com.student.portal.domain.User;
//import lombok.Getter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.List;
//@Getter
//public class CustomUserDetails implements UserDetails {
//    private final Long id;
//    private final String username;
//    private final String password;
//    private final List<GrantedAuthority> authorities;
//
//    private CustomUserDetails(Long id, String username, String password, List<GrantedAuthority> authorities) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//        this.authorities = authorities;
//    }
//
//    public static CustomUserDetails from(User u) {
//        String role =
//                (u instanceof Student) ? "ROLE_STUDENT" :
//                        (u instanceof Teacher) ? "ROLE_TEACHER" : "ROLE_ADMIN";
//        return new CustomUserDetails(
//                u.getId(),
//                u.getLogin(),
//                u.getPassword(),
//                List.of(new SimpleGrantedAuthority(role))
//        );
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}

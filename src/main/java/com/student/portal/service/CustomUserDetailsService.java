//package com.student.portal.service;
//
//import com.student.portal.domain.Student;
//import com.student.portal.domain.Teacher;
//import com.student.portal.domain.User;
//import com.student.portal.repository.UserRepository;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//    private final UserRepository users;
//
//    public CustomUserDetailsService(UserRepository users) { this.users = users; }
//
//    @Override
//    @Transactional(readOnly = true)
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User u = users.findByLogin(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//
//        String role = (u instanceof Student) ? "ROLE_STUDENT" :
//                (u instanceof Teacher) ? "ROLE_TEACHER" : "ROLE_ADMIN";
//
//        return org.springframework.security.core.userdetails.User
//                .withUsername(u.getLogin())
//                .password(u.getPassword())
//                .authorities(new SimpleGrantedAuthority(role))
//                .accountExpired(false).accountLocked(false)
//                .credentialsExpired(false).disabled(false)
//                .build();
//    }
//}

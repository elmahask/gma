package com.gma.assistance.gma.service;

import com.gma.assistance.gma.entity.Operator;
import com.gma.assistance.gma.entity.Role;
import com.gma.assistance.gma.entity.UserPrincipal;
import com.gma.assistance.gma.repository.OperatorRepository;
import com.gma.assistance.gma.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    @Autowired
    private OperatorRepository operatorRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Operator op = operatorRepository.findByUserName(userName);
        List<Role> roles = roleRepository.findAllByOperatorId(op.getId());
        return new UserPrincipal(op, roles);
    }
}

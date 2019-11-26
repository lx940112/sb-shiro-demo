package com.xlkh.shiro.demo.service.sys.impl;

import com.xlkh.shiro.demo.service.sys.SysFuncService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Lucas
 */
@Service
public class SysFuncServiceImpl implements SysFuncService {
    @Override
    public Set<String> getPermissionCodesByUserId(Long userId) {
        return null;
    }
}

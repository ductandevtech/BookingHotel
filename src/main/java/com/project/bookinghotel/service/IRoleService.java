package com.project.bookinghotel.service;

import java.util.List;

import com.project.bookinghotel.model.Role;
import com.project.bookinghotel.model.User;

/**
 * @author Simpson Alfred
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}

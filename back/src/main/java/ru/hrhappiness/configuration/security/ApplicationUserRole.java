package ru.hrhappiness.configuration.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static ru.hrhappiness.configuration.security.ApplicationUserPermission.*;
//роли
public enum ApplicationUserRole {
    ADMIN(Sets.newHashSet(USER_PROJECT_CARD_READ,USER_PROJECT_CARD_READ_BY_ID,USER_PROJECT_CARD_CREATE,USER_PROJECT_CARD_DELETE_DRAFT,USER_PROJECT_CARD_ARCHIVING,USER_PROJECT_CARD_UPDATE_CARD,USER_PROJECT_CARD_WITHOUT_DRAFT,USER_PROJECT_CARD_DELETE_ALL,USER_PROJECT_CARD_WITHOUT_DRAFT)),
    UP(Sets.newHashSet(USER_PROJECT_CARD_READ,USER_PROJECT_CARD_CREATE,USER_PROJECT_CARD_DELETE_DRAFT,USER_PROJECT_CARD_UPDATE_CARD,USER_PROJECT_CARD_WITHOUT_DRAFT)),
    RC(Sets.newHashSet(USER_PROJECT_CARD_WITHOUT_DRAFT)),
    NO(Sets.newHashSet(USER_PROJECT_CARD_WITHOUT_DRAFT)),
    NP(Sets.newHashSet(USER_PROJECT_CARD_WITHOUT_DRAFT));

    private final Set<ApplicationUserPermission> permissionSet;

    ApplicationUserRole(Set<ApplicationUserPermission> permissionSet) {
        this.permissionSet = permissionSet;
    }

    public Set<ApplicationUserPermission> getPermissionSet() {
        return permissionSet;
    }

    public Set<SimpleGrantedAuthority> getAuthorities(){
        Set<SimpleGrantedAuthority> permissions = getPermissionSet().stream()
                .map(permissionSet ->new SimpleGrantedAuthority(permissionSet.getPermission()))
                .collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
        return permissions;
    }

}

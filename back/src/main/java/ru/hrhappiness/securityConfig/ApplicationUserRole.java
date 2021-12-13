package ru.hrhappiness.securityConfig;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static ru.hrhappiness.securityConfig.ApplicationUserPermission.*;

//роли
public enum ApplicationUserRole {
    ADMIN(Sets.newHashSet(USER_PROJECT_CARD_READ,
            USER_PROJECT_CARD_READ_BY_ID,
            USER_PROJECT_CARD_RESTORING_FROM_ARCHIVE,
            USER_PROJECT_CARD_CREATE,
            USER_PROJECT_CARD_DELETE_DRAFT,
            USER_PROJECT_CARD_ARCHIVING,
            USER_PROJECT_CARD_UPDATE_CARD,
            USER_PROJECT_CARD_WITHOUT_DRAFT,
            USER_PROJECT_CARD_DELETE_ALL,
            USER_PROJECT_CARD_WITHOUT_DRAFT,
            USER_PROJECT_CARD_OUTPUT_NAME_CUSTOMERS,
            OUTPUT_ALL_INFORMATION_ABOUT_CUSTOMERS,
            USER_PROJECT_CARD_DELETE_BY_ID,
            CREATE_CUSTOMER,
            SHOW_NAME_ALL_CUSTOMERS,
            SEND_MESSAGE_MAIL,
            SHOW_MAIL_WITH_WHICH_SEND_MESSAGE_BY_MAIL)),

    UP(Sets.newHashSet(USER_PROJECT_CARD_READ,
            USER_PROJECT_CARD_ARCHIVING,
            USER_PROJECT_CARD_RESTORING_FROM_ARCHIVE,
            USER_PROJECT_CARD_CREATE,
            USER_PROJECT_CARD_DELETE_DRAFT,
            USER_PROJECT_CARD_UPDATE_CARD,
            USER_PROJECT_CARD_WITHOUT_DRAFT,
            USER_PROJECT_CARD_READ_BY_ID,
            USER_PROJECT_CARD_OUTPUT_NAME_CUSTOMERS,
            SHOW_NAME_ALL_CUSTOMERS,
            SEND_MESSAGE_MAIL)),

    RC(Sets.newHashSet(USER_PROJECT_CARD_WITHOUT_DRAFT,
            USER_PROJECT_CARD_READ_BY_ID,
            SEND_MESSAGE_MAIL)),

    NO(Sets.newHashSet(USER_PROJECT_CARD_WITHOUT_DRAFT,
            USER_PROJECT_CARD_READ_BY_ID,
            SEND_MESSAGE_MAIL)),

    NP(Sets.newHashSet(USER_PROJECT_CARD_READ_BY_ID));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    //получение доступа у пользователей
    public Set<SimpleGrantedAuthority> getAuthorities(){

        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());

        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }

}

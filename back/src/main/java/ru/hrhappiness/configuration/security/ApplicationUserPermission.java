package ru.hrhappiness.configuration.security;
//разрешения
public enum ApplicationUserPermission {

    USER_PROJECT_CARD_READ("userProjectCard:read"),//посмотреть все карточки
    USER_PROJECT_CARD_READ_BY_ID("userProjectCard:readById"),//найти карточку по айди (просмотр КП)
    USER_PROJECT_CARD_CREATE("userProjectCard:create"),//создать карточку
    USER_PROJECT_CARD_ARCHIVING("userProjectCard:archiving"),//архивировать карточку
    USER_PROJECT_CARD_UPDATE_CARD("UserProjectCard:updateCard"),//изменить карточку
    USER_PROJECT_CARD_DELETE_DRAFT("userProjectCard:deleteCardDraft"),//удалить черновик
    USER_PROJECT_CARD_DELETE("userProjectCard:deleteCard"),//удалить карточку
    USER_PROJECT_CARD_WITHOUT_DRAFT("userProjectCard:allCardsWithoutDraft"),//вывести все карточки без черновиков
    USER_PROJECT_CARD_DELETE_ALL("userProjectCard:DeleteAllCards");//удалить все карточки



    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}

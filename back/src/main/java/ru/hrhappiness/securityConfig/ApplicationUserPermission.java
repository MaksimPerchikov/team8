package ru.hrhappiness.securityConfig;
//разрешения
public enum ApplicationUserPermission {

    USER_PROJECT_CARD_READ("userProjectCard:readAllCards"),//посмотреть все карточки
    USER_PROJECT_CARD_READ_BY_ID("userProjectCard:readById"),//найти карточку по айди (просмотр КП)
    USER_PROJECT_CARD_CREATE("userProjectCard:create"),//создать карточку
    USER_PROJECT_CARD_ARCHIVING("userProjectCard:archiving"),//архивировать карточку
    USER_PROJECT_CARD_UPDATE_CARD("UserProjectCard:updateCard"),//изменить карточку
    USER_PROJECT_CARD_DELETE_DRAFT("userProjectCard:deleteCardDraft"),//удалить черновик
    USER_PROJECT_CARD_DELETE_BY_ID("userProjectCard:deleteCardById"),//удалить карточку по айди
    USER_PROJECT_CARD_WITHOUT_DRAFT("userProjectCard:allCardsWithoutDraft"),//вывести все карточки без черновиков
    USER_PROJECT_CARD_DELETE_ALL("userProjectCard:DeleteAllCards"),//удалить все карточки
    USER_PROJECT_CARD_RESTORING_FROM_ARCHIVE("userProjectCard:restoring from archive to in progress"),//воcстановление из Архива. Изменить из Архив на В работе
    USER_PROJECT_CARD_OUTPUT_NAME_CUSTOMERS("customers:outputName"),//вывести названия заказчиков
    OUTPUT_ALL_INFORMATION_ABOUT_CUSTOMERS("customers:outputAllInformation"),//вывести всю информацию о заказчиках
    CREATE_CUSTOMER("customer:createCustomer"),//создать заказчика
    SHOW_NAME_ALL_CUSTOMERS("customers:showAllNameCustomers"),//показать наименования всех заказчиков
    SEND_MESSAGE_MAIL("messageByGmail:sendMessageMail"),//поделиться карточкой по почте
    SHOW_MAIL_WITH_WHICH_SEND_MESSAGE_BY_MAIL("messageByGmail:showMailWithWhichSendMessage_byMail");//узнать почту,с которой идет рассылка



    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}

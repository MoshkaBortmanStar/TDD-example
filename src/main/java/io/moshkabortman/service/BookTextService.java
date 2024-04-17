package io.moshkabortman.service;

public interface BookTextService {

    /**
     * Долен вернуть строку sys_id с префиксом "ID_%sys_id"
     * @param itemName name of item
     */
    String book(String itemName);


}

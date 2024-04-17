package io.moshkabortman.service;

public interface BookOrderService {

    /**
     * Booking item if item isn't true
     * @param  itemName name of item in table item
     * @return int sys_id of free item
     */
    int book(String itemName);

}

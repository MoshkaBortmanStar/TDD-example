package io.moshkabortman.service.impl;

import io.moshkabortman.repository.BookRepository;
import io.moshkabortman.service.BookTextService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookTextServiceImpl implements BookTextService {

    private final BookRepository bookRepository;


    @Override
    public String book(String itemName) {
        return "ID_"
                + bookRepository.findAllByNameByIsBooked(itemName, false);
    }
}

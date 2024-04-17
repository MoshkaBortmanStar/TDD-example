package io.moshkabortman.service.impl;

import io.moshkabortman.repository.BookRepository;
import io.moshkabortman.service.BookOrderService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BookOrderServiceImpl implements BookOrderService {

    private final BookRepository bookRepository;

    @Override
    public int book(String itemName) {
        return bookRepository.findAllByNameByIsBooked(itemName, false);
    }
}

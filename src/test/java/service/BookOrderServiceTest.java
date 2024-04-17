package service;

import io.moshkabortman.repository.BookRepository;
import io.moshkabortman.service.BookOrderService;
import io.moshkabortman.service.impl.BookOrderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class BookOrderServiceTest {
    // main
    private BookOrderService bookOrderService;
    // mock
    private BookRepository bookRepository;


    @BeforeEach
    public void setUp() {
        bookRepository = Mockito.mock(BookRepository.class);
        bookOrderService = new BookOrderServiceImpl(bookRepository);
        when(bookRepository.findAllByNameByIsBooked(any(String.class), any(Boolean.class))).thenReturn(5);

    }

    @Test
    void test_book() {
//        принмимает в сбея стрингу которя будет именем тоовара
        String tv = "TV";
        int itemSysIdResult = bookOrderService.book(tv);
        // товар естьзабронируй и верни нам sys_id этого товара, если его нет верни 0
//        select * from table_item where table_item.is_book = false and item_name = 'iron';

        Assertions.assertEquals(5, itemSysIdResult);
    }

    @Test
    void test_book_2() {
//        принмимает в сбея стрингу которя будет именем тоовара
        String iron = "iron";
        int itemSysIdResult = bookOrderService.book(iron);
        // товар естьзабронируй и верни нам sys_id этого товара, если его нет верни 0
//        select * from table_item where table_item.is_book = false and item_name = 'iron';

        Assertions.assertEquals(5, itemSysIdResult);
    }


}

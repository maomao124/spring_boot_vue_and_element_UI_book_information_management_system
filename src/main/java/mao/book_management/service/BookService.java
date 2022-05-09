package mao.book_management.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import mao.book_management.entity.Book;

import java.util.List;

/**
 * Project name(项目名称)：spring_boot_vue_and_element_UI_book_information_management_system
 * Package(包名): mao.book_management.service
 * Class(类名): BookService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/9
 * Time(创建时间)： 13:11
 * Version(版本): 1.0
 * Description(描述)： 没有使用
 */

public interface BookService
{
    /**
     * Save boolean.
     *
     * @param book the book
     * @return the boolean
     */
    Boolean save(Book book);

    /**
     * Update boolean.
     *
     * @param book the book
     * @return the boolean
     */
    Boolean update(Book book);

    /**
     * Delete boolean.
     *
     * @param id the id
     * @return the boolean
     */
    Boolean delete(Integer id);

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    Book getById(Integer id);

    /**
     * Gets all.
     *
     * @return the all
     */
    List<Book> getAll();

    /**
     * Gets page.
     *
     * @param currentPage the current page
     * @param pageSize    the page size
     * @return the page
     */
    IPage<Book> getPage(int currentPage, int pageSize);
}

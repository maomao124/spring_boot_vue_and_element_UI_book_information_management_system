package mao.book_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Project name(项目名称)：spring_boot_vue_and_element_UI_book_information_management_system
 * Package(包名): mao.book_management.controller
 * Class(类名): HTMLPageController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/9
 * Time(创建时间)： 14:57
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class HTMLPageController
{
    /**
     * 对html页面放行，默认页面
     *
     * @return books.html
     */
    @RequestMapping("/")
    public String getHTMLPageBooks()
    {
        return "books";
    }
}

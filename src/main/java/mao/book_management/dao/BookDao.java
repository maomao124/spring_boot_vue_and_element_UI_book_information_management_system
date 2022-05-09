package mao.book_management.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import mao.book_management.entity.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * Project name(项目名称)：spring_boot_vue_and_element_UI_book_information_management_system
 * Package(包名): mao.book_management.dao
 * Class(类名): BookDao
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/5/9
 * Time(创建时间)： 13:09
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Mapper
public interface BookDao extends BaseMapper<Book>
{

}


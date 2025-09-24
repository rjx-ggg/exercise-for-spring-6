package com.ssll.spring6.jdbc.tx.dao;

/**
 * ClassName: BookDao
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/24 21:26
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);
}

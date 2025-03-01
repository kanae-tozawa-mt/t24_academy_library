package jp.co.metateam.library.model;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;

/**
 * 書籍マスタDTO
 */
@Getter
@Setter
public class BookMstDto {

    private Long id;

    private String isbn;

    private String title;

    private long stockCount;

    private Timestamp deletedAt;

    private BookMst bookMst;
}

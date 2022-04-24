package models;

import java.util.List;

public interface Search {

    List<Paper> list();

    Paper create(String title, String author);

    Paper get(Long paper_id);

    Paper update(Long paper_id, String title, String author);

    Boolean delete(Long paper_id);


}

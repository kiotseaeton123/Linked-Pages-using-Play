package models;


import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicLong;

public class SearchImplement implements Search {

    SortedMap<Long, Paper> papers = new ConcurrentSkipListMap<>();
    AtomicLong sequence = new AtomicLong();

    @Override
    public List<Paper> list() {
        return new ArrayList<Paper>(papers.values());
    }

    @Override
    public Paper create(String title, String author) {
        Long paper_id = sequence.incrementAndGet();
        Paper paper = new Paper(paper_id, title, author);
        papers.put(paper_id, paper);
        return paper;
    }

    @Override
    public Paper get(Long paper_id) {
        return papers.get(paper_id);
    }

    @Override
    public synchronized Paper update(Long paper_id, String title, String author) {
        Paper paper = papers.get(paper_id);
        if(paper != null){
            Paper updated = new Paper(paper_id, title, author);
            papers.put(paper_id, updated);
            return updated;
        } else return null;
    }

    @Override
    public Boolean delete(Long paper_id) {
        return papers.remove(paper_id) != null;
    }

}

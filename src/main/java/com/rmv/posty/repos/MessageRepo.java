package com.rmv.posty.repos;

import com.rmv.posty.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Integer> {

    List<Message> findMessageByTag(String tag);

}

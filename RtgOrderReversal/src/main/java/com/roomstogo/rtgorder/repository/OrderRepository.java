package com.roomstogo.rtgorder.repository;

import com.roomstogo.rtgorder.dto.OrderDto;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import java.util.Optional;

public interface OrderRepository extends MongoRepository<OrderDto, String> {
    Optional<OrderDto> findByOrderId(String orderId);
//    List<Tutorial> findByPublished(boolean published);
}


package com.roomstogo.rtgorder.controller;

import com.roomstogo.rtgorder.dto.OrderDto;
import com.roomstogo.rtgorder.repository.OrderRepository;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// import io.swagger.annotations.Api;

@Log4j2
@RestController
@RequestMapping("/order")   // change to: /api/reversal
@ConfigurationProperties()
@ComponentScan(basePackages = {"com.roomstogo.rtgorder"})
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    public ModelMapper modelMapper;


    public OrderController() {
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @PostMapping(path = "/revorder", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderDto> revorder( @RequestBody OrderDto orderDto)  {

            log.info("--->>>>> OrderController.revorderr ---->>>>> {} ", orderDto);

            return ResponseEntity.ok(orderDto);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {

        return ResponseEntity.ok("hello there..");
    }


    @GetMapping("/all")
   public ResponseEntity<List<OrderDto>> getOrders(@RequestParam(required = false) String orderId) {
       try {
           List<OrderDto> orders = new ArrayList<OrderDto>();
           orderRepository.findAll().forEach(orders::add);

           if (orders.isEmpty()) {
               return new ResponseEntity<>(HttpStatus.NO_CONTENT);
           }

           return new ResponseEntity<>(orders, HttpStatus.OK);
       } catch (Exception e) {
           return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
       }
   }


    @GetMapping("/version")
    public ResponseEntity<String> getVersion() {
        try {

            return new ResponseEntity<>("Ver 1.3", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }





    @PostMapping("/create")
   public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto orderDto) {
       try {
        // OrderDto _orderDto = tutorialRepository.save(new OrderDto(orderDto.getTitle(), orderDto.getDescription(), false));

           OrderDto _orderDto = orderRepository.save(orderDto);

           return new ResponseEntity<>(_orderDto, HttpStatus.CREATED);
       } catch (Exception e) {
           return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
       }
   }

   @GetMapping("/id/{id}")
   public ResponseEntity<OrderDto> getOrderById(@PathVariable("id") String id) {
       Optional<OrderDto> orderData = orderRepository.findByOrderId(id);

       if (orderData.isPresent()) {
           return new ResponseEntity<>(orderData.get(), HttpStatus.OK);
       } else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
   }

   /**
    * Updates the order, updates entire order
    * @param id
    * @param orderDto
    * @return
    */
   @PutMapping("/update/{id}")
   public ResponseEntity<OrderDto> updateOrder(@PathVariable("id") String id, @RequestBody OrderDto orderDto) {
       Optional<OrderDto> orderData = orderRepository.findByOrderId(id);

       if (orderData.isPresent()) {
             OrderDto _order = orderData.get();
            _order =  mapOrder(orderDto);

           return new ResponseEntity<>(orderRepository.save(_order), HttpStatus.OK);
       } else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
   }



    /**
     * MapOrder - a data mapper for order
     *
     * @param orderDto
     * @return
     */
    private OrderDto mapOrder(OrderDto orderDto) {

        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(orderDto, OrderDto.class);
    }


   @DeleteMapping("/delete/{id}")
   public ResponseEntity<HttpStatus> deleteOrder(@PathVariable("id") String id) {
       try {
           orderRepository.deleteById(id);
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
   }


}

package com.asset.assetcreation;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafKaConsumerService {

   
  @KafkaListener(topics = "${general.topic.name}", 
          groupId = "${general.topic.group.id}")
  public void consume(String message) {
     System.out.println(String.format("Message recieved -> %s", message));
  }

  @KafkaListener(topics = "${user.topic.name}", 
          groupId = "${user.topic.group.id}",
          containerFactory = "userKafkaListenerContainerFactory")
  public void consume(User user) {
	  System.out.println(String.format("User created -> %s", user));
  }

}

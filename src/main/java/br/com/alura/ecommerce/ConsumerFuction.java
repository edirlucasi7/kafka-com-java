package br.com.alura.ecommerce;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerFuction {

	void consume(ConsumerRecord<String, String> record);
}

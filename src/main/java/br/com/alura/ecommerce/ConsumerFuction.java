package br.com.alura.ecommerce;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerFuction<T> {

	void consume(ConsumerRecord<String, T> record);
}

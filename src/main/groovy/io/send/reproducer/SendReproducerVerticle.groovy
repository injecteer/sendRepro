package io.send.reproducer

import groovy.transform.TypeChecked
import io.vertx.core.AbstractVerticle
import io.vertx.core.eventbus.DeliveryOptions

@TypeChecked
class SendReproducerVerticle extends AbstractVerticle {
  
  DeliveryOptions HOP_OPTS = new DeliveryOptions( sendTimeout:5000 )
  
  @Override
  void start() throws Exception {
    vertx.eventBus().send( 'addr', [ aa:42 ], HOP_OPTS ){ println it }
  }
  
}
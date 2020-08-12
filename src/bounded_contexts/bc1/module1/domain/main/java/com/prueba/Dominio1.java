package com.prueba;

import bounded_contexts.shared.domain.bus.event.DomainEvent;
import bounded_contexts.shared.domain.bus.event.DomainEventSubscriber;

public final class Dominio1 implements DomainEventSubscriber {
    @Override
    public void onDomainEventReceived(DomainEvent event) {

    }
}

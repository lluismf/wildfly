package org.jboss.as.clustering.infinispan.subsystem;

import org.jboss.as.controller.AbstractRemoveStepHandler;
import org.jboss.as.controller.OperationContext;
import org.jboss.as.controller.OperationFailedException;
import org.jboss.dmr.ModelNode;
import org.jboss.logging.Logger;

/**
 * @author Richard Achmatowicz (c) 2011 Red Hat Inc.
 */
public class TransportRemove extends AbstractRemoveStepHandler {

    private static final Logger log = Logger.getLogger(TransportRemove.class.getPackage().getName());
    public static final TransportRemove INSTANCE = new TransportRemove();

    public TransportRemove() {
        super();
    }

    @Override
    protected void performRuntime(OperationContext context, ModelNode operation, ModelNode model) throws OperationFailedException {
        // need to set reload-required on the server
        context.reloadRequired();
    }
}

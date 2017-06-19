package org.mef.app.MefClasses;

/**
 * Created by Aboelbisher on 18/06/2017.
 */
public class AggregatedNodeEdgePoint
{
            /*type leafref {
                    path '/tapi-common:context/tapi-topology:topology/tapi-topology:node/tapi-topology:owned-node-edge-point/tapi-topology:uuid';
                }

       */

    boolean config;

    public AggregatedNodeEdgePoint(boolean config) {
        this.config = config;
    }
}

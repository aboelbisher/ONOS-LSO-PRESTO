package org.mef.app.MefClasses;
import java.util.*;

/**
 * Created by Aboelbisher on 18/06/2017.
 */
public class MefNode extends MefBaseClass
{
    List<OwnedNodeEgdePoint> ownedNodeEgdePoint; //owned-node-edge-point
    //******* uses node-g;

    List<AggregatedNodeEdgePoint> aggregatedNodeEdgePoints; // aggregated-node-edge-point


    public MefNode(String uuid)
    {
        super(uuid);
    }
}

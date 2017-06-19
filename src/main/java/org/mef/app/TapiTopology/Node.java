package org.mef.app.TapiTopology;

import java.util.List;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class Node extends ResourceSpec
{
    public List<String> _layerProtocolName;
    public AdminStatePac _state;
    public TransferTimingPac _transferTiming;
    public  List<NodeEdgePoint> _ownedNodeEdgePoint;
    public String _encapTopology;
    public TransferCapacityPac _transferCapacity;
    public TransferCostPac _transferCost;
    public  List<String> _aggregatedNodeEdgePoint;
    public TransferIntegrityPac _transferIntegrity;
}

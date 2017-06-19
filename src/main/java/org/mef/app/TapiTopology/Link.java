package org.mef.app.TapiTopology;

import java.util.List;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class Link extends ResourceSpec
{
    public Direction _direction = Direction.BIDIRECTIONAL;
    public List<String> _layerProtocolName;
    public TransferCapacityPac _transferCapacity;
    public AdminStatePac _state ;
    public List<LinkPort> _linkPort;
    public String _node;
    public TransferIntegrityPac _transferIntegrity;
    public LayerProtocolTransitionPac _lpTransition;
    public TransferCostPac _transferCost ;
    public RiskParameterPac _riskParameter;
    public TransferTimingPac _transferTiming;
    public ValidationPac _validation;
}

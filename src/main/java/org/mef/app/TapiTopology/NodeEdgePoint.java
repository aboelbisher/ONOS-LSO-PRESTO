package org.mef.app.TapiTopology;

import java.util.List;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class NodeEdgePoint extends ResourceSpec
{
    public List<LayerProtocol> _layerProtocol;
    public Direction _direction = Direction.BIDIRECTIONAL;
    public AdminStatePac _state;
    public List<String> _clientNodeEdgePoint;
    public List<String> _mappedServiceEndPoint;
}

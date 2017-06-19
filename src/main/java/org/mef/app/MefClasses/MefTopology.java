package org.mef.app.MefClasses;

import java.util.List;

/**
 * Created by Aboelbisher on 18/06/2017.
 */
public class MefTopology
{
    public List<MefNode> node;
    public List<MefLink> link;
    public List<LayerProtocolName> layerProtocols; //layer-protocol-name
    public String uuid;
    /*"UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.
                    UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.
                    Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}
                    Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6";
     */
    public List<NameValuePair> name;



    public MefTopology(List<MefNode> nodes, List<MefLink> links, List<LayerProtocolName> layerProtocols, String uuid)
    {
        this.node = nodes;
        this.link = links;
        this.layerProtocols = layerProtocols;
        this.uuid = uuid;
    }


}



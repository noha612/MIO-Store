package shipping;

public class NormalShipping extends Shipping {

    private Transport transport;

    public void doNormalShipping() {
        // TODO - implement NormalShipping.doNormalShipping
        throw new UnsupportedOperationException();
    }

    public NormalShipping() {
        // TODO - implement NormalShipping.NormalShipping
        throw new UnsupportedOperationException();
    }

    public Transport getTransport() {
        return this.transport;
    }

    /**
     *
     * @param transport
     */
    public void setTransport(Transport transport) {
        this.transport = transport;
    }

}

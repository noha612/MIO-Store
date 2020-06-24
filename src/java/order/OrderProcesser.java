package order;

public class OrderProcesser {

    private Order order;
    private OrderDAO dao;

    public Order getOrder() {
        return this.order;
    }

    /**
     *
     * @param order
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderDAO getDao() {
        return this.dao;
    }

    /**
     *
     * @param dao
     */
    public void setDao(OrderDAO dao) {
        this.dao = dao;
    }

    public void getOrderByID() {
        // TODO - implement OrderProcesser.getOrderByID
        throw new UnsupportedOperationException();
    }

    public void searchOrderByName() {
        // TODO - implement OrderProcesser.searchOrderByName
        throw new UnsupportedOperationException();
    }

    public void updateStatus() {
        // TODO - implement OrderProcesser.updateStatus
        throw new UnsupportedOperationException();
    }

    public void cancelOrder() {
        // TODO - implement OrderProcesser.cancelOrder
        throw new UnsupportedOperationException();
    }

    public OrderProcesser() {
        // TODO - implement OrderProcesser.OrderProcesser
        throw new UnsupportedOperationException();
    }

    public void makeOrderWithFacade() {
        // TODO - implement OrderProcesser.makeOrderWithFacade
        throw new UnsupportedOperationException();
    }

}

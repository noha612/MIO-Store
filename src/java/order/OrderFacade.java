package order;

import payment.PaymentService;
import shipping.ShippingService;

public class OrderFacade {

	private static OrderFacade ORDER_FACADE;
	private PaymentService paymentService;
	private PromotionService promontionService;
	private ShippingService shippingService;
	private NotificationService notificationService;

	public OrderFacade() {
		// TODO - implement OrderFacade.OrderFacade
		throw new UnsupportedOperationException();
	}

	public void getInstance() {
		// TODO - implement OrderFacade.getInstance
		throw new UnsupportedOperationException();
	}

	public void defaultOrderCashondeliveryNormalShipNopromo() {
		// TODO - implement OrderFacade.defaultOrderCashondeliveryNormalShipNopromo
		throw new UnsupportedOperationException();
	}

	public void fastOrderScanQRExpressship() {
		// TODO - implement OrderFacade.fastOrderScanQRExpressship
		throw new UnsupportedOperationException();
	}

}
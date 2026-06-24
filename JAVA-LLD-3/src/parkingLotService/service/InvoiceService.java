package parkingLotService.service;

import parkingLotService.model.Invoice;
import parkingLotService.model.Ticket;

public class InvoiceService {
    private final PricingService pricingService;
    public InvoiceService( PricingService pricingService) {
        this.pricingService = pricingService;
    }

    public Invoice generateInvoice(Ticket ticket)
    {

        double price = pricingService.getCalculatedPrice(ticket.getVehicle().getParkingPreference(), ticket.getEntryTime(), ticket.getExitTime());

        return new Invoice(
                "INV-" + ticket.getTicketId(),
                ticket.getTicketId(),
                ticket.getParkingSpot().getSpotId(),
                price,
                ticket.getEntryTime(),
                ticket.getExitTime()
        );
    }
}

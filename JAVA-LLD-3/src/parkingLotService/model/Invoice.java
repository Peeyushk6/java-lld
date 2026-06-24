package parkingLotService.model;

import java.time.LocalDateTime;

public class Invoice {
    private final String invoiceId;
    private final String ticketId;
    private final String spotId;
    private final double amount;
    private final LocalDateTime entryTime;
    private final LocalDateTime exitTime;

    public Invoice(String invoiceId, String ticketId, String spotId,  double amount, LocalDateTime entryTime, LocalDateTime exitTime){
        this.invoiceId = invoiceId;
        this.ticketId = ticketId;
        this.spotId = spotId;
        this.amount = amount;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public String getSpotId() {
        return spotId;
    }
}

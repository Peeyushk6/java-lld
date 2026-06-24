package parkingLotService.Main;

import parkingLotService.enums.ParkingPreference;
import parkingLotService.enums.SupportedVehicleType;
import parkingLotService.model.*;
import parkingLotService.service.ParkingLotService;
import parkingLotService.service.TicketService;
import parkingLotService.strategy.SpotAllocationStrategyFactory;

import java.util.List;

public class main {
    static void main() {

        //Create Parking Spot
        ParkingSpot parkingSpot1 = new ParkingSpot("1", SupportedVehicleType.CAR, 10);
        ParkingSpot parkingSpot2 = new ParkingSpot("2", SupportedVehicleType.CAR, 10);
        ParkingSpot parkingSpot3 = new ParkingSpot("3", SupportedVehicleType.BIKE, 10);
        ParkingSpot parkingSpot4 = new ParkingSpot("4", SupportedVehicleType.EV, 10);

        //Create Parking Floor and assign Spot to these floors.
        ParkingFloor parkingFloor1 = new ParkingFloor("1", List.of(parkingSpot1, parkingSpot2, parkingSpot3));
        ParkingFloor parkingFloor2 = new ParkingFloor("2", List.of(parkingSpot4));

        //Create Parking Lot with the location Selected and assign the floors to the parking lot.
        ParkingLot parkingLot = new ParkingLot("AMB Mall", List.of(parkingFloor1,parkingFloor2));

        // Create SpotALlocation Strategy factory

        SpotAllocationStrategyFactory spotAllocationStrategyFactory = new SpotAllocationStrategyFactory();

        //Select the strategy to allocate the spot to the vehicle.
        SpotAllocator allocator = new SpotAllocator(spotAllocationStrategyFactory);

        //Initiate Ticket Service
        TicketService ticketService = new TicketService();

        //Create ParkingLotService to manage the parking lot operations.
        ParkingLotService parkingLotService = new ParkingLotService(allocator, ticketService, parkingLot);

        //Create vehicles that will be entering the parking lot.
        Vehicle car1 = new Car("KA-04-MJ-5555", ParkingPreference.NORMAL);
        Vehicle car2 = new Car("KA-04-MJ-4444",ParkingPreference.VIP);
        Vehicle bike1 = new Bike("KA-04-MJ-3333",ParkingPreference.NORMAL);
        Vehicle eV1 = new EVCar("KA-04-MJ-2222", ParkingPreference.NORMAL);

        //Park Vehicle
        Ticket car1Ticket = parkingLotService.parkVehicle(car1);
        Ticket car2Ticket = parkingLotService.parkVehicle(car2);
        Ticket bike1Ticket = parkingLotService.parkVehicle(bike1);
        Ticket Ev1Ticket = parkingLotService.parkVehicle(eV1);

        //Print Ticket
        System.out.println(
                "Ticket Details car1Ticket -> " +
                "ID: " + car1Ticket.getTicketId() +
                ", Entry Time: " + car1Ticket.getEntryTime() +
                ", Vehicle Number: " + car1Ticket.getVehicle().getVehicleNumber() +
                ", Spot ID: " + car1Ticket.getParkingSpot().getSpotId()
        );


        System.out.println(
                "Ticket Details car2Ticket -> " +
                        "ID: " + car2Ticket.getTicketId() +
                        ", Entry Time: " + car2Ticket.getEntryTime() +
                        ", Vehicle Number: " + car2Ticket.getVehicle().getVehicleNumber() +
                        ", Spot ID: " + car2Ticket.getParkingSpot().getSpotId()
        );


        System.out.println(
                "Ticket Details bike1Ticket -> " +
                        "ID: " + bike1Ticket.getTicketId() +
                        ", Entry Time: " + bike1Ticket.getEntryTime() +
                        ", Vehicle Number: " + bike1Ticket.getVehicle().getVehicleNumber() +
                        ", Spot ID: " + bike1Ticket.getParkingSpot().getSpotId()
        );

        System.out.println(
                "Ticket Details Ev1Ticket -> " +
                        "ID: " + Ev1Ticket.getTicketId() +
                        ", Entry Time: " + Ev1Ticket.getEntryTime() +
                        ", Vehicle Number: " + Ev1Ticket.getVehicle().getVehicleNumber() +
                        ", Spot ID: " + Ev1Ticket.getParkingSpot().getSpotId()
        );



    }
}

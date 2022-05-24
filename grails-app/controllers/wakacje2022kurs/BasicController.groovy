package wakacje2022kurs

import grails.converters.JSON
import grails.converters.XML
import wakacje2022kurs.core.Trip

import javax.transaction.Transactional

class BasicController {

    InterestingPlaceService interestingPlaceService

    def index() {
//        Trip myTrip = new Trip()
//        myTrip.name = "Wycieczka do Vegas"
//        myTrip.endPoint = "Vegas Nevada"
//        myTrip.startDate = new Date();
//        myTrip.startingPoint = "Warszawa"
//        myTrip.endDate = new Date()

//        saveTrip(myTrip)
        render Trip.findAllByStartingPointAndEndPoint("Warszawa", "Rzym") as XML

//        render (Trip.list() as XML)
//        render (Trip.findAllByEndPoint("Rzym") as XML)
    }
//    @Transactional
//    void saveTrip(Trip trip){
//        trip.save(flush:true, failOnError: true)
//    }

    def otherEndPoint() {
        render "coś innego"
    }

//    def newTrip(){
//        Trip trip = new Trip(
//                name:"Oglądanie wielorybów",
//                startingPoint: "Gdańsk",
//                endPoint: "Bergen",
//                startDate: new Date(),
//                endDate: new Date()
//        )
//
//        interestingPlaceService.saveNewTrip(trip)
//        render trip as XML
//    }
}

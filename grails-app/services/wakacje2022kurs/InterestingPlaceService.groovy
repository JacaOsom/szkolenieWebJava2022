package wakacje2022kurs

import grails.gorm.transactions.Transactional
import wakacje2022kurs.core.PlacesToVisit
import wakacje2022kurs.core.Trip

@Transactional
class InterestingPlaceService {

    def addCosTam() {
        PlacesToVisit toVisit = new PlacesToVisit(
            name: "Coś tam",
            ticketPrice: 100,
            timeToSpend: "2h")

        Trip.findByEndPoint("Rzym").addToPlacesToVisit(toVisit).save(flush:true, failOnError: true)
        }

    def saveNewTrip(Trip trip){
        trip.save(flush:true, failOnError: true)
    }
}


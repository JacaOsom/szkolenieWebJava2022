package wakacje2022kurs.core

import org.grails.datastore.gorm.GormEntity

class PlacesToVisit implements GormEntity<PlacesToVisit>{

    String name
    Double ticketPrice
    String timeToSpend

    static belongsTo = [trip: Trip]

}

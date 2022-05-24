package wakacje2022kurs.core

import org.grails.datastore.gorm.GormEntity

class Trip implements GormEntity<Trip>{

    String name;
    String startingPoint
    Date startDate
    Date endDate
    String endPoint

    static hasMany = [placesToVisit: PlacesToVisit]

    static constraints = {
        name blank: false, size: 0..40;
    }

}

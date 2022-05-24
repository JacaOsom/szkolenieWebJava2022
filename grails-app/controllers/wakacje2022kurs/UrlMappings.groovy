package wakacje2022kurs

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/pogoda"(controller:"weather", action: "index") //lub "Weather" niezaleznie od wielkości liter

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}

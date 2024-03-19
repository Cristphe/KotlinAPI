package projectkotlin.application.config.resource.response

import projectkotlin.domain.avenger.Avenger

data class AvengerResponse(
    val nick: String,
    val person: String,
    val description: String?,
    val history: String?
){
    companion object{
        fun from(avenger: Avenger) = AvengerResponse(
            
        )
    }
}

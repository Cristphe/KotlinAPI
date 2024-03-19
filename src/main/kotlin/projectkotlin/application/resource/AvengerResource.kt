package projectkotlin.application.config.resource;

import jakarta.validation.Valid
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projectkotlin.application.config.resource.response.AvengerResponse;
import projectkotlin.web.resource.response.request.AvengerRequest

@RestController
@RequestMapping(value = ["/v1/api/avenger"])
public class AvengerResource {

    @GetMapping
    fun getAvengers() = ResponseEntity.ok().body(emptyList<AvengerResponse>())

    @GetMapping( "{id}")
    fun getAvengersDetails(@PathVariable("id") id: Long) = ResponseEntity.ok().build<AvengerResponse>()

    @PostMapping
    fun createAvenger(@Valid @RequestBody request: AvengerRequest) =

}

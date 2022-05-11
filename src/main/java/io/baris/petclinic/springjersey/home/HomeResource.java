package io.baris.petclinic.springjersey.home;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HomeResource {

    @Operation(
        summary = "Homepage",
        tags = {"Homepage"},
        responses = {
            @ApiResponse(
                description = "Homepage",
                content = @Content(schema = @Schema(implementation = String.class))
            )
        }
    )
    @GET
    public String homepage() {
        return "Welcome to Pet Clinic";
    }
}

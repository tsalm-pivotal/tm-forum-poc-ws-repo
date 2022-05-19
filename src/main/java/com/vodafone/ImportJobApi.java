/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.vodafone;

import org.openapitools.model.Error;
import org.openapitools.model.ImportJob;
import org.openapitools.model.ImportJobCreate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-11T11:10:26.067+02:00[Europe/Berlin]")
@Validated
@Tag(name = "importJob", description = "the importJob API")
public interface ImportJobApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /importJob : Creates a ImportJob
     * This operation creates a ImportJob entity.
     *
     * @param importJob The ImportJob to be created (required)
     * @return Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "createImportJob",
        summary = "Creates a ImportJob",
        tags = { "importJob" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Created", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ImportJob.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/importJob",
        produces = { "application/json;charset=utf-8" },
        consumes = { "application/json;charset=utf-8" }
    )
    default ResponseEntity<ImportJob> createImportJob(
        @Parameter(name = "importJob", description = "The ImportJob to be created", required = true, schema = @Schema(description = "")) @Valid @RequestBody ImportJobCreate importJob
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"path\" : \"path\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"completionDate\" : \"2000-01-23T04:56:07.000+00:00\", \"errorLog\" : \"errorLog\", \"id\" : \"id\", \"href\" : \"https://openapi-generator.tech\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"contentType\" : \"contentType\", \"url\" : \"https://openapi-generator.tech\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /importJob/{id} : Deletes a ImportJob
     * This operation deletes a ImportJob entity.
     *
     * @param id Identifier of the ImportJob (required)
     * @return Deleted (status code 204)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "deleteImportJob",
        summary = "Deletes a ImportJob",
        tags = { "importJob" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Deleted"),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/importJob/{id}",
        produces = { "application/json;charset=utf-8" }
    )
    default ResponseEntity<Void> deleteImportJob(
        @Parameter(name = "id", description = "Identifier of the ImportJob", required = true, schema = @Schema(description = "")) @PathVariable("id") String id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /importJob : List or find ImportJob objects
     * This operation list or find ImportJob entities
     *
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "listImportJob",
        summary = "List or find ImportJob objects",
        tags = { "importJob" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ImportJob.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/importJob",
        produces = { "application/json;charset=utf-8" }
    )
    default ResponseEntity<List<ImportJob>> listImportJob(
        @Parameter(name = "fields", description = "Comma-separated properties to be provided in response", schema = @Schema(description = "")) @Valid @RequestParam(value = "fields", required = false) String fields,
        @Parameter(name = "offset", description = "Requested index for start of resources to be provided in response", schema = @Schema(description = "")) @Valid @RequestParam(value = "offset", required = false) Integer offset,
        @Parameter(name = "limit", description = "Requested number of resources to be provided in response", schema = @Schema(description = "")) @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"path\" : \"path\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"completionDate\" : \"2000-01-23T04:56:07.000+00:00\", \"errorLog\" : \"errorLog\", \"id\" : \"id\", \"href\" : \"https://openapi-generator.tech\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"contentType\" : \"contentType\", \"url\" : \"https://openapi-generator.tech\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /importJob/{id} : Retrieves a ImportJob by ID
     * This operation retrieves a ImportJob entity. Attribute selection is enabled for all first level attributes.
     *
     * @param id Identifier of the ImportJob (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "retrieveImportJob",
        summary = "Retrieves a ImportJob by ID",
        tags = { "importJob" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ImportJob.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "404", description = "Not Found", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "405", description = "Method Not allowed", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "409", description = "Conflict", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Error.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/importJob/{id}",
        produces = { "application/json;charset=utf-8" }
    )
    default ResponseEntity<ImportJob> retrieveImportJob(
        @Parameter(name = "id", description = "Identifier of the ImportJob", required = true, schema = @Schema(description = "")) @PathVariable("id") String id,
        @Parameter(name = "fields", description = "Comma-separated properties to provide in response", schema = @Schema(description = "")) @Valid @RequestParam(value = "fields", required = false) String fields
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"path\" : \"path\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"completionDate\" : \"2000-01-23T04:56:07.000+00:00\", \"errorLog\" : \"errorLog\", \"id\" : \"id\", \"href\" : \"https://openapi-generator.tech\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"contentType\" : \"contentType\", \"url\" : \"https://openapi-generator.tech\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

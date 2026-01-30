package dev.ia;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/admin/ingest")
@ApplicationScoped
public class IngestResource {

    @Inject
    DocumentIngestor ingestor;

    @POST
    public String ingest() {
        ingestor.ingest();
        return "Ingestão executada com sucesso";
    }
}

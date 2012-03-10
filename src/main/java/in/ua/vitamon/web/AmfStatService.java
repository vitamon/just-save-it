package in.ua.vitamon.web;

import in.ua.vitamon.model.DataEntity;
import in.ua.vitamon.server.DataPersister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * @author: vit.tam@gmail.com
 */
public class AmfStatService {
    private static final Logger log = LoggerFactory.getLogger(AmfStatService.class);

    private DataPersister dataPersister = new DataPersister();

    public Collection<DataEntity> searchAllEntries(String appId) {
        Collection<DataEntity> entries = dataPersister.findAllMatches(appId);
        log.debug("found " + entries.size() + " entries: " + entries.toString());
        return entries;
    }
}
package org.launchcode.soilbuilder.data;

import org.launchcode.soilbuilder.models.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Integer> {
}

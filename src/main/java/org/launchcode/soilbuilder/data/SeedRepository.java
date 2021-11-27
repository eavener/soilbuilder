package org.launchcode.soilbuilder.data;

import org.launchcode.soilbuilder.models.Seed;
import org.springframework.data.repository.CrudRepository;

public interface SeedRepository extends CrudRepository<Seed, Integer> {
}

package com.jackiew.repo;

import com.jackiew.domain.DemoDomain;
import org.springframework.data.repository.CrudRepository;

public interface DemoRepo extends CrudRepository<DemoDomain, Integer> {
}

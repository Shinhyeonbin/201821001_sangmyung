package com.developers.dmaker.repository;

import com.developers.dmaker.code.StatusCode;
import com.developers.dmaker.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Snow
 */
@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {

    Optional<Developer> findByMemberId(String memberId);

    List<Developer> findDevelopersByStatusEquals(StatusCode status);
}

package com.jina.parking.repository;

import com.jina.parking.entity.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Membership,Long> {

}

package com.javakc.pms.dispord.dao;

import com.javakc.pms.dispord.entity.DispOrd;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DispOrdDao extends JpaRepository<DispOrd, String> {
}

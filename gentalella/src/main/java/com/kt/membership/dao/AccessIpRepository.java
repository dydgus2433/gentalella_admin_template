package com.kt.membership.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kt.membership.domain.entity.AccessIp;

public interface AccessIpRepository extends JpaRepository<AccessIp, String> {

	public AccessIp findByIpAndUseYn(String ipAddr, String string);

}

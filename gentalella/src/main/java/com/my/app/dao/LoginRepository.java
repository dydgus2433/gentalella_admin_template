package com.my.app.dao;
//package com.kt.membership.dao;
//
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.kt.membership.domain.entity.Login;
//
//public interface LoginRepository extends JpaRepository<Login, String>{
//
//	Login findByOllehId(String ollehId);
//	
//	Login findByOllehIdAndAuthKey(String ollehId, String authKey);
//	
//	Login findByMbrIdAndAuthKey(Object encrypt, String authKey) ;
//	
//	Login findByMbrId(String mbrId);
//	
//	@Modifying
//	@Transactional
//	@Query(value = "delete from login where mbr_id = :mbr_id", nativeQuery = true)
//	int deleteLogin(@Param("mbrId") String mbrId);
//
//}

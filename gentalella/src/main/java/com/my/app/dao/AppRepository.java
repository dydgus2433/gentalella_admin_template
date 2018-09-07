package com.my.app.dao;
//package com.kt.membership.dao;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.kt.membership.domain.entity.App;
//import com.kt.membership.domain.entity.AppPrimaryKey;
//
//public interface AppRepository extends JpaRepository<App, AppPrimaryKey>{
//
//	/**
//	 * 
//	 * @param os OS 종류
//	 * @param version
//	 * @param useYn
//	 * @return App Object
//	 */
//	App findByOsAndVersionAndUseYn(String os, String version, Character useYn);
//	
//	/**
//	 * 
//	 * @param os
//	 * @param status 배포상태 ('P' : 상용(강제), 'T' : 테스트 버전, 'O' : 상용(선택 업데이트)
//	 * @param useYn
//	 * @return
//	 */
//	App findTop1ByOsAndStatusAndUseYnOrderByVersionDesc(String os, Character status, Character useYn);
//	
//	App findTop1ByOsAndStatusNotAndUseYnOrderByVersionDesc(String os, Character status, Character useYn);
//}

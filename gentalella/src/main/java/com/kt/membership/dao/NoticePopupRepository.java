package com.kt.membership.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.kt.membership.domain.entity.NoticePopup;

public interface NoticePopupRepository extends JpaRepository<NoticePopup, UUID> {
	/**
	 * 서버 점검 내역 체크
	 * 현재 시간에 걸려있는 점검이 있는지 확인
	 * @return
	 */
	@Query(value = "select * from notice_popup where type = 'S' and start_date < CURRENT_TIMESTAMP and end_date > CURRENT_TIMESTAMP LIMIT 1", nativeQuery = true)
	NoticePopup findTop1ByCurrentDateBetweenStartDateAndEndDate();
	
	
	@Query(value="select * from notice_popup where menu = :menu and start_date  < CURRENT_TIMESTAMP and end_date > CURRENT_TIMESTAMP LIMIT 1", nativeQuery = true)
	NoticePopup getNoticePopupInfo(int menu);
	
	@Query(value = "select * from notice_popup ", nativeQuery = true)
	List<NoticePopup> getNoticePopupList();
	
	
	@Query(value = "select * from notice_popup where id = :id" , nativeQuery = true)
	NoticePopup selectNoticePopupId(@Param("id") String id);
	/**
	 * delete login
	 * @param id
	 * @return
	 */
	@Modifying
	@Transactional
	@Query( value = "delete from notice_popup where id = :id", nativeQuery = true)
	int deleteNoticePopup(@Param("id") String id);
	/**
	 * 메뉴, 시작/끝 시간으로 1건 조회
	 * @param menu
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	NoticePopup findTop1ByMenuAndStartDateBeforeAndEndDateAfterOrderByStartDate(int menu, Timestamp startDate, Timestamp endDate);
	
}

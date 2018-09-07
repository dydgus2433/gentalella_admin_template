package com.my.app.tibero.dao;

import java.util.HashMap;
import java.util.List;

import com.my.app.tibero.domain.entity.BankListTbl;
import com.my.app.tibero.domain.entity.CustInfoTbl;
import com.my.app.tibero.domain.entity.KtPayerInfoTbl;
import com.my.app.tibero.domain.entity.NotiSendTbl;
import com.my.app.tibero.domain.entity.OrdListTbl;
import com.my.app.tibero.domain.entity.ParamChkKtPayer;
import com.my.app.tibero.domain.entity.ParamGetOrdList;
import com.my.app.tibero.domain.entity.PayAcntTbl;
import com.my.app.tibero.domain.entity.RceiptNoTbl;
import com.my.app.tibero.domain.entity.RequestAcntAuthenInfo;
import com.my.app.tibero.domain.entity.RequestAcntAuthenResultInfo;
import com.my.app.tibero.domain.entity.RequestAllDisconInfo;
import com.my.app.tibero.domain.entity.RequestBarcodeInfo;
import com.my.app.tibero.domain.entity.RequestDisconInfo;
import com.my.app.tibero.domain.entity.RequestPhoneAuthenInfo;
import com.my.app.tibero.domain.entity.RequestPhoneAuthenResultInfo;
import com.my.app.tibero.domain.entity.TotOrdListTbl;
import com.my.app.tibero.domain.entity.UpdateAcntSeqInfo;
import com.my.app.tibero.domain.entity.UpdateRceipNoInfo;

public interface PayDao {

	//휴대폰 인증
	public void requestPhoneAuthen(RequestPhoneAuthenInfo requestPhoneAuthenInfo);
	//휴대폰 인증 결과
	public void requestPhoneAuthenResult(RequestPhoneAuthenResultInfo requestPhoneAuthenResultInfo);
	
	//ARS 계좌인증
	public void requestAcntAuthen(RequestAcntAuthenInfo requestAcntAuthenInfo);
		
	//ARS 계좌인증 확인
	public void requestAcntAuthenResult(RequestAcntAuthenResultInfo requestAcntAuthenResultInfo);
	
	//계좌해지
	public void requestDiscon(RequestDisconInfo requestDisconInfo);
	
	//전체 계좌해지
	public void requestAllDiscon(RequestAllDisconInfo requestAllDisconInfo);
	
	//MS ID 조회
	public String getMsId(String inMbrId);
	//로열티 멤버 조회(생년월일 이름)
	public CustInfoTbl getCustInfoForPhoneAuthen(HashMap<String,Object> map);
	
	
	
	//은행 결제 가능시간
	public String getBarringTimeMsg(HashMap<String, Object> map);
	
	//간편 결제 등록계좌 목록
	public List<PayAcntTbl> getPayAcntList(HashMap<String, Object> map);
	
	//새틀 은행 목록
	public List<BankListTbl> getBankList(HashMap<String, Object> map);
	//바코드 정보
	public void requestBarcode(RequestBarcodeInfo requestBarcodeInfo);
	
	
	//KT 자동납부계좌 체크
	public KtPayerInfoTbl chkKtPayer(ParamChkKtPayer paramChkKtPayer);
	//결제 목록
	public List<OrdListTbl> getOrdList(ParamGetOrdList paramGetOrdList);
	
	
	
	//결제 총합
	public TotOrdListTbl getTotOrdList(ParamGetOrdList paramGetOrdList);
	//현금 영수증 조회
	public RceiptNoTbl getRceiptNoInfo(HashMap<String, Object> map);
	
	//현금 영수증 변경
	public void updateRceiptNo(UpdateRceipNoInfo updateRceipInfo);
	//계좌 순서 변경
	public void updateAcntSeq(UpdateAcntSeqInfo updateAcntSeqInfo);
	//결제 알림 목록
	public List<NotiSendTbl> getNotiSend(String inMbrId);
	//결제 알림 사용자 미조회 카운트
	public int getTotNotiSend(String inMbrId);
	//결제알림 읽기
	public void updateNotiSend(NotiSendTbl notiSendTbl);
	
	//패키지 프록시
	public String getPrc(String inSynonymId);
	
	
}

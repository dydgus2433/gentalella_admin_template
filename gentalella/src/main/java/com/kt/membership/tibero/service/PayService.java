package com.kt.membership.tibero.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kt.membership.exception.KPayDaoException;
import com.kt.membership.tibero.dao.PayDao;
import com.kt.membership.tibero.domain.entity.BankListTbl;
import com.kt.membership.tibero.domain.entity.CustInfoTbl;
import com.kt.membership.tibero.domain.entity.KtPayerInfoTbl;
import com.kt.membership.tibero.domain.entity.NotiSendTbl;
import com.kt.membership.tibero.domain.entity.OrdListTbl;
import com.kt.membership.tibero.domain.entity.ParamChkKtPayer;
import com.kt.membership.tibero.domain.entity.ParamGetOrdList;
import com.kt.membership.tibero.domain.entity.PayAcntTbl;
import com.kt.membership.tibero.domain.entity.RceiptNoTbl;
import com.kt.membership.tibero.domain.entity.RequestAcntAuthenInfo;
import com.kt.membership.tibero.domain.entity.RequestAcntAuthenResultInfo;
import com.kt.membership.tibero.domain.entity.RequestAllDisconInfo;
import com.kt.membership.tibero.domain.entity.RequestBarcodeInfo;
import com.kt.membership.tibero.domain.entity.RequestDisconInfo;
import com.kt.membership.tibero.domain.entity.RequestPhoneAuthenInfo;
import com.kt.membership.tibero.domain.entity.RequestPhoneAuthenResultInfo;
import com.kt.membership.tibero.domain.entity.TotOrdListTbl;
import com.kt.membership.tibero.domain.entity.UpdateAcntSeqInfo;

@Service("payService")
public class PayService {
	@Autowired
	private PayDao payDao;
	private static final String PG_EPAY_ACNT	= "PG_EPAY_ACNT";
	private static final String PG_EPAY_ORD		= "PG_EPAY_ORD";
	private static final String STR_ZERO		= "0";
	
	public RequestPhoneAuthenInfo requestPhoneAuthen(RequestPhoneAuthenInfo requestPhoneAuthenInfo) 
			throws KPayDaoException{
		String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
		requestPhoneAuthenInfo.setInPgEpayAcnt(inPgEpayAcnt);
		payDao.requestPhoneAuthen(requestPhoneAuthenInfo);		
		return requestPhoneAuthenInfo;		
	}
	
	
	public RequestPhoneAuthenResultInfo requestPhoneAuthenResult (RequestPhoneAuthenResultInfo requestPhoneAuthenResultInfo) 
	throws KPayDaoException{
		String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
		requestPhoneAuthenResultInfo.setInPgEpayAcnt(inPgEpayAcnt);
		payDao.requestPhoneAuthenResult(requestPhoneAuthenResultInfo);
		return requestPhoneAuthenResultInfo;
	}
	
	public RequestAcntAuthenInfo requestAcntAuthen(RequestAcntAuthenInfo requestAcntAuthenInfo)
	throws KPayDaoException{
		String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
		requestAcntAuthenInfo.setInPgEpayAcnt(inPgEpayAcnt);
		payDao.requestAcntAuthen(requestAcntAuthenInfo);
		return requestAcntAuthenInfo;
	}
//	public RequestAcntAuthenResultInfo 
	
	public RequestAcntAuthenResultInfo requestAcntAuthenResultInfo(RequestAcntAuthenResultInfo requestAcntAuthenResultInfo)
			throws KPayDaoException{
				String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
				requestAcntAuthenResultInfo.setInPgEpayAcnt(inPgEpayAcnt);
				payDao.requestAcntAuthenResult(requestAcntAuthenResultInfo);
				return requestAcntAuthenResultInfo;
	}
	
	public RequestDisconInfo requestDisconInfo(RequestDisconInfo requestDisconInfo)
			throws KPayDaoException{
				String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
				requestDisconInfo.setInPgEpayAcnt(inPgEpayAcnt);
				payDao.requestDiscon(requestDisconInfo);
				return requestDisconInfo;
	}
	
	public RequestAllDisconInfo requestAcntAuthenResultInfo(RequestAllDisconInfo requestAllDisconInfo)
			throws KPayDaoException{
				String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
				requestAllDisconInfo.setInPgEpayAcnt(inPgEpayAcnt);
				payDao.requestAllDiscon(requestAllDisconInfo);
				return requestAllDisconInfo;
	}
	
	public String getMsId(String inMbrId) throws KPayDaoException{
		return payDao.getMsId(inMbrId);
	}
	
	public CustInfoTbl getCustInfoForPhoneAuthen(String inMbrId) 
			throws KPayDaoException{
		HashMap<String, Object> map = new HashMap<String, Object>();
		String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
		map.put("inPgEpayAcnt", inPgEpayAcnt);
		map.put("inMbrId", inMbrId);
		return payDao.getCustInfoForPhoneAuthen(map);		
	}
	
	public String getBarringTimeMsg(String inBankCd)
			throws KPayDaoException{
		HashMap<String, Object> map = new HashMap<String, Object>();
		String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
		map.put("inPgEpayAcnt", inPgEpayAcnt);
		map.put("inMbrId", inBankCd);
		return payDao.getBarringTimeMsg(map);	
	}
	
	public List<PayAcntTbl> getPayAcntList(String inMbrId)
			throws KPayDaoException{
				HashMap<String, Object> map = new HashMap<String, Object>();
				String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
				map.put("inPgEpayAcnt", inPgEpayAcnt);
				map.put("inMbrId", inMbrId);
				return payDao.getPayAcntList(map);	
	}
	
	public List<BankListTbl> getBankList(String inMbrId)
			throws KPayDaoException{
				HashMap<String, Object> map = new HashMap<String, Object>();
				String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
				map.put("inPgEpayAcnt", inPgEpayAcnt);
				map.put("inMbrId", inMbrId);
				return payDao.getBankList(map);	
	}
	
	
	public RequestBarcodeInfo requestBarcode(RequestBarcodeInfo requestBarcodeInfo)
		throws KPayDaoException{
		String inPgEpayOrd = payDao.getPrc(PG_EPAY_ORD);
		requestBarcodeInfo.setInPgEpayOrd(inPgEpayOrd);
		payDao.requestBarcode(requestBarcodeInfo);
		return requestBarcodeInfo;
	}
	public KtPayerInfoTbl chkKtPayer(ParamChkKtPayer paramChkKtPayer) 
		throws KPayDaoException{
		String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
		paramChkKtPayer.setInPgEpayAcnt(inPgEpayAcnt);
		return payDao.chkKtPayer(paramChkKtPayer);
	}
	
	public List<OrdListTbl> getOrdList(ParamGetOrdList paramGetOrdList)
		throws KPayDaoException{
		String inPgEpayOrd = payDao.getPrc(PG_EPAY_ORD);
		paramGetOrdList.setInPgEpayOrd(inPgEpayOrd);
		
		List<OrdListTbl> res = payDao.getOrdList(paramGetOrdList);
		if(res == null) {
			res = new ArrayList<>();
			OrdListTbl val = new OrdListTbl();
			val.setErrCd(STR_ZERO);
			res.add(val);
		}
		
		return res;
	}
	
	
	public TotOrdListTbl getTotOrdList(ParamGetOrdList paramGetOrdList)
			throws KPayDaoException{
			
		String inPgEpayOrd = payDao.getPrc(PG_EPAY_ORD);
		paramGetOrdList.setInPgEpayOrd(inPgEpayOrd);
		
		TotOrdListTbl res = payDao.getTotOrdList(paramGetOrdList);
		
		return res;
	}
	
	public RceiptNoTbl getRceiptNoInfo(String inMbrId) 
		throws KPayDaoException{
		
		HashMap<String, Object> map = new HashMap<>();
		String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
		map.put("inPgEpayAcnt", inPgEpayAcnt);
		map.put("inMbrId",inMbrId);
		return payDao.getRceiptNoInfo(map);
	}
	
	public UpdateAcntSeqInfo updateAcntSeq(UpdateAcntSeqInfo updateAcntSeqInfo)
		throws KPayDaoException{
		String inPgEpayAcnt = payDao.getPrc(PG_EPAY_ACNT);
		updateAcntSeqInfo.setInPgEpayAcnt(inPgEpayAcnt);
		payDao.updateAcntSeq(updateAcntSeqInfo);
		return updateAcntSeqInfo;
	}
	
	
	public List<NotiSendTbl> getNotiSend(String inMbrId)
		throws KPayDaoException{
		return payDao.getNotiSend(inMbrId);
	}
	
	public int getTotNotiSend(String inMbrId)
		throws KPayDaoException {
		return payDao.getTotNotiSend(inMbrId);
	}
	
	public void updateNotiSend(NotiSendTbl notiSendTbl)
		throws KPayDaoException{
		payDao.updateNotiSend(notiSendTbl);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

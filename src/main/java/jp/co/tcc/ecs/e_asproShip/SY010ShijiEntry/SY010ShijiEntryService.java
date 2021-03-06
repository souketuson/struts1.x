package jp.co.tcc.ecs.e_asproShip.SY010ShijiEntry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.tcc.ecsolution.framework.otherUtils.StringUtil;

public class SY010ShijiEntryService {

	/**
	 * o×ðõ·é
	 *
	 * @param bean
	 * @return
	 * @throws Exception
	 */
	public SY010ShijiEntryBean search(SY010ShijiEntryBean bean) throws Exception {
		SY010ShijiEntryDAO dao = new SY010ShijiEntryDAO();
		HashMap<String, List<Map<String, String>>> map = new HashMap<String, List<Map<String, String>>>();

		map = dao.search(StringUtil.nvl(bean.getLoginUser().getCoNo()), bean.getSeq_no());
		bean.setLstHead((List<Map<String, String>>) map.get("LIST"));
		bean.setLstDetail((List<Map<String, String>>) map.get("LIST_DETAIL"));

		List<Map<String, String>> headInfo = bean.getLstHead();

		if (headInfo.size() > 0) {
			Map<String, String> row = headInfo.get(0);

			bean.setOrder_cd(StringUtil.nvl(row.get("ORDER_CD"))); // ¶CD
			bean.setOrder_ymd_hms(StringUtil.nvl(row.get("ORDER_YMD_HM")));	//¶ú
			bean.setSisya_name(StringUtil.nvl(row.get("SISYA_NAME"))); // xÐ
			bean.setWh_nm(StringUtil.nvl(row.get("WH_NM"))); //  qÉ
			bean.setShip_kbn_nm(StringUtil.nvl(row.get("SHIP_KBN_NM"))); // o×æª
			bean.setSyoriKbnNm(StringUtil.nvl(row.get("JOUTAI"))); // óµ

			bean.setKokyaku_cd(StringUtil.nvl(row.get("KOKYAKU_CD"))); // ótXCD
			bean.setKokyaku_nm1(StringUtil.nvl(row.get("KOKYAKU_NM1"))); // ótX¼P
			bean.setKokyaku_nm2(StringUtil.nvl(row.get("KOKYAKU_NM2"))); // ótX¼Q
			bean.setKokyaku_kana1(StringUtil.nvl(row.get("KOKYAKU_KANA1"))); // ótXJiP
			bean.setKokyaku_kana2(StringUtil.nvl(row.get("KOKYAKU_KANA2"))); // ótXJiQ
			bean.setKokyaku_zip(StringUtil.nvl(row.get("KOKYAKU_ZIP"))); // ótXEXÖÔ
			bean.setKokyaku_addr1(StringUtil.nvl(row.get("KOKYAKU_ADDR1"))); // ótXEZP
			bean.setKokyaku_addr2(StringUtil.nvl(row.get("KOKYAKU_ADDR2"))); // ótXEZQ
			bean.setKokyaku_addr3(StringUtil.nvl(row.get("KOKYAKU_ADDR3"))); // ótXEZR
			bean.setKokyaku_tel1(StringUtil.nvl(row.get("KOKYAKU_TEL1"))); // ótXEdbÔP
			bean.setKokyaku_tel2(StringUtil.nvl(row.get("KOKYAKU_TEL2"))); // ótXEdbÔQ
			bean.setKokyaku_fax(StringUtil.nvl(row.get("KOKYAKU_FAX"))); // ótXEFAX
			bean.setKokyaku_mail1(StringUtil.nvl(row.get("KOKYAKU_MAIL1"))); // ótXE[P
			bean.setKokyaku_mail2(StringUtil.nvl(row.get("KOKYAKU_MAIL2"))); // ótXE[Q
			bean.setKokyaku_mail3(StringUtil.nvl(row.get("KOKYAKU_MAIL3"))); // ótXE[R
			bean.setTdk_cd(StringUtil.nvl(row.get("TDK_CD"))); // øóXCD
			bean.setTdk_nm1(StringUtil.nvl(row.get("TDK_NM1"))); // øóX¼P
			bean.setTdk_nm2(StringUtil.nvl(row.get("TDK_NM2"))); // øóX¼Q
			bean.setTdk_kana1(StringUtil.nvl(row.get("TDK_KANA1"))); // øóXJiP
			bean.setTdk_kana2(StringUtil.nvl(row.get("TDK_KANA2"))); // øóXJiQ
			bean.setTdk_zip(StringUtil.nvl(row.get("TDK_ZIP"))); // øóXEXÖÔ
			bean.setTdk_addr1(StringUtil.nvl(row.get("TDK_ADDR1"))); // øóXEZP
			bean.setTdk_addr2(StringUtil.nvl(row.get("TDK_ADDR2"))); // øóXEZQ
			bean.setTdk_addr3(StringUtil.nvl(row.get("TDK_ADDR3"))); // øóXEZR
			bean.setTdk_tel1(StringUtil.nvl(row.get("TDK_TEL1"))); // øóXEdbÔP
			bean.setTdk_tel2(StringUtil.nvl(row.get("TDK_TEL2"))); // øóXEdbÔQ

			bean.setTdk_ymd(StringUtil.nvl(row.get("TDK_YMD"))); // zBwèú
			bean.setHstm_kbn_nm(StringUtil.nvl(row.get("HSTM_KBN_NM"))); // ¨Í¯ÔÑæª

			bean.setSksj_cd(StringUtil.nvl(row.get("SKSJ_CD"))); // o×w¦Ô
			bean.setSyukka_yotei_ymd(StringUtil.nvl(row.get("SYUKKA_YOTEI_YMD"))); // o×\èú
			bean.setKosu(StringUtil.nvl(row.get("KOSU"))); // Âû
			bean.setOkurino(StringUtil.nvl(row.get("OKURINO"))); // â¹No
			bean.setOrder_biko(StringUtil.nvl(row.get("ORDER_BIKO"))); // â¹No

			bean.setMake_date(StringUtil.nvl(row.get("MAKE_DATE"))); // o^ú
			bean.setRep_date(StringUtil.nvl(row.get("REP_DATE"))); // XVú
			bean.setRep_user_nm(StringUtil.nvl(row.get("REP_USER_NM"))); // XVÒ

			bean.setQty_cnt(StringUtil.nvl(row.get("QTY_CNT"))); // ¾×Êv
			bean.setSeikyuu_kin(StringUtil.nvl(row.get("SEIKYUU_KIN"))); // ¿àziÅ²«j
			bean.setSeikyuu_zei_kin(StringUtil.nvl(row.get("SEIKYUU_ZEI_KIN"))); // ÁïÅ
			bean.setSeikyuu_zei_k_kin(StringUtil.nvl(row.get("SEIKYUU_ZEI_K_KIN"))); // ¿àziÅÝj
		}
		return bean;
	}

}

/**
 * Copyright (C) 2017 FZJT Co. Ltd.
 *
 *
 * @className:com.xed.financing.wxgzh.mapper.accountInfo.AccountInfoMapper
 * @description:
 * 
 * @version:v1.0.0 
 * @author:ZhangJun
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2017年3月22日    ZhangJun  v1.0.0        create
 *
 *
 */
package com.xed.financing.wxgzh.mapper.accountaddress;

import java.sql.SQLException;
import java.util.List;

import com.xed.financing.wxgzh.model.accountaddress.AccountAddressBean;

/**
 * 用户地址信息
 * @className:com.xed.financing.wxgzh.mapper.accountaddress.AccountAddressMapper
 * @description:
 * @version:v1.0.0 
 * @date:2017年4月19日 下午2:21:17
 * @author:Elias Zheng
 */
public interface AccountAddressMapper
{
	/**
	 * 查询用户地址信息
	 * @Description:
	 * @param accountAddressBean
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:Elias Zheng
	 * @date:2017年4月19日 下午2:23:09
	 */
	public List<AccountAddressBean> queryAccountAddress(AccountAddressBean accountAddressBean) throws SQLException;
	
	/**
	 * 查询用户地址数量
	 * @Description:
	 * @param accountAddressBean
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:Elias Zheng
	 * @date:2017年4月19日 下午2:23:09
	 */
	public Integer countAccountAddress(AccountAddressBean accountAddressBean) throws SQLException;

	/**
	 * 查询用户默认地址信息
	 * @Description:
	 * @param accountAddressBean
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:Elias Zheng
	 * @date:2017年4月19日 下午2:23:09
	 */
	public AccountAddressBean queryAccountAddressDefaultById(AccountAddressBean accountAddressBean) throws SQLException;
	
	/**
	 * 新增用户地址
	 * @Description:
	 * @param accountAddressBean
	 * @return
	 * @throws SQLException
	 * @version:v1.0
	 * @author:Elias Zheng
	 * @date:2017年4月20日 下午5:15:26
	 */
	public void insertAccountAddress(AccountAddressBean accountAddressBean) throws SQLException;

	/**
	 * 修改用户地址
	 * @Description:
	 * @param accountAddressBean
	 * @throws SQLException
	 * @version:v1.0
	 * @author:QT
	 * @date:2017年11月22日 下午4:08:50
	 */
	public void editAccountAddress(AccountAddressBean accountAddressBean) throws SQLException;
}

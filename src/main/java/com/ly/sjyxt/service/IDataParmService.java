package com.ly.sjyxt.service;

import com.alibaba.fastjson.JSONObject;
import com.ly.sjyxt.common.ResponseBase;
import com.ly.sjyxt.entity.DataParm;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 数据源参数表 服务类
 * </p>
 *
 * @author ly
 * @since 2020-06-10
 */
public interface IDataParmService {

  /**
   *  查询 所有点数据
   * @param parameter
   * @param ds_id
   * @return
   */
  JSONObject list(String parameter,String ds_id);

  /**
   *  添加数据
   * @param dataParm
   * @return
   */
  ResponseBase add(DataParm dataParm);

  ResponseBase delete(String[] parm_ids);
}

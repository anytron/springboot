package com.anytron.base;

import tk.mybatis.mapper.common.Mapper;

/**
 * 类名: BaseMapper
 * <br/>包名 com.anytron.mapper.base
 * <br/>作用: 所有mapper需要实现此接口
 * <pre>
 * 实现此接口可实现集成功能基础CRUD功能
 * 特殊sql比如联合查询多表等使用自定义方法自定义mapper映射sql
 * </pre>
 * <br/>作者: YanPJ
 * <br/>日期: 2017年12月18日上午9:36:34
 * <br/>版本: @version V1.0
 */
public interface BaseMapper<T> extends Mapper<T> {

}

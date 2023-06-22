package com.sunday.usercenter.mapper;

import tk.mybatis.mapper.common.*;

public interface BaseTxMapper<T> extends Mapper<T>, IdsMapper<T>, MySqlMapper<T>, ConditionMapper<T> {
}

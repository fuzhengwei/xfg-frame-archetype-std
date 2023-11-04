#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.persistent.dao;

import ${package}.infrastructure.persistent.po.UserOrderPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IUserOrderDao {

    void insert(UserOrderPO userOrderPO);

    void updateOrderStatusByUserId(String userId);

    List<UserOrderPO> selectByUserId(String userId);

}

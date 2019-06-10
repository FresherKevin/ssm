/**
 * Copyright (C), 2018-2019,
 * FileName: RoleMapper
 * Author:   Kevin
 * Date:     2019/6/10 15:54
 * Description:
 */
package cn.nh.kevin.Mapper;

/**
 * 〈〉
 *
 * @author Kevin
 * @create 2019/6/10
 * @since 1.0.0
 */
import cn.nh.kevin.pojo.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    public int insertRole(Role role);
    public Role getRole(@Param("id") Long id);
    public int updateRole(Role role);
    public int deleteRole(@Param("id") Long id);
}
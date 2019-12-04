/*
 * Email:        quyongquan@qq.com
 * FileName:     MemberService
 * CreationDate: 2019/12/3
 * Author:       渠永泉
 */
package top.quyq.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.util.StringUtils;
import top.quyq.entity.Member;
import top.quyq.query.MemberQuery;

/**
 * @author Quyq
 * @TODO
 **/

public interface MemberService {

    /**
     * 删除或更新
     * @param entity
     * @return
     */
    default Member insertOrUpdate(Member entity){
        if(StringUtils.hasText(entity.getId()))
            return update(entity);
        return insert(entity);
    }

    Member insert(Member entity);

    Member update(Member entity);

    /**
     * 通过证件号码查找
     * @param card
     * @return
     */
    Member findByCard(String card);

    /**
     * 通过条件分页查找
     * @param query
     * @return
     */
    IPage<Member> findByCondition(MemberQuery query);

}

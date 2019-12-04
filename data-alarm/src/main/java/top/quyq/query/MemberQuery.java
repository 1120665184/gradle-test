/*
 * Email:        quyongquan@qq.com
 * FileName:     MemberQuery
 * CreationDate: 2019/12/3
 * Author:       渠永泉
 */
package top.quyq.query;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.quyq.base.BaseQuery;

/**
 * @author Quyq
 **/
@Data
@EqualsAndHashCode(callSuper=true)
public class MemberQuery extends BaseQuery {
    private static final long serialVersionUID = 6564043182776909160L;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;
}

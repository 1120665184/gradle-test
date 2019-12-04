/*
 * Email:        quyongquan@qq.com
 * FileName:     Member
 * CreationDate: 2019/12/3
 * Author:       渠永泉
 */
package top.quyq.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import top.quyq.base.BaseEntity;

/**
 * @author Quyq
 * 实体类
 **/
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper=true)
public class Member extends BaseEntity {

    private static final long serialVersionUID = -1351460032922738499L;
    private String name;
    private String card;
    private Integer gender;
}

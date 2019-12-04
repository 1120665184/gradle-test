/*
 * Email:        quyongquan@qq.com
 * FileName:     AlarmMemberController
 * CreationDate: 2019/12/3
 * Author:       渠永泉
 */
package top.quyq.controller.alarm;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.quyq.entity.Member;
import top.quyq.query.MemberQuery;
import top.quyq.service.MemberService;

/**
 * @author Quyq
 * 控制层
 **/
@RestController
@RequestMapping(value = "/alarm/member")
public class AlarmMemberController {

    @Autowired
    private MemberService memberService;

    /**
     * 通过条件查找
     * @param query
     * @return
     */
    @GetMapping
    public IPage findByCondition(MemberQuery query){
        return memberService.findByCondition(query);
    }

    @PostMapping
    public Member updateOrAdd(@RequestBody Member entity){
        return memberService.insertOrUpdate(entity);
    }

    /**
     * 通过证件号查找
     * @param card
     * @return
     */
    @GetMapping("{card}")
    public Member findByCard(@PathVariable String card){
        return memberService.findByCard(card);
    }

}

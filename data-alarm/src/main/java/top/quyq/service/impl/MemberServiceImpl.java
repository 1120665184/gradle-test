/*
 * Email:        quyongquan@qq.com
 * FileName:     MemberServiceImpl
 * CreationDate: 2019/12/3
 * Author:       渠永泉
 */
package top.quyq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import top.quyq.entity.Member;
import top.quyq.mapper.MemberMapper;
import top.quyq.query.MemberQuery;
import top.quyq.service.MemberService;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Quyq
 * 实现类
 **/
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Member insert(Member entity) {
        entity.setCreatedTime(LocalDateTime.now());
        memberMapper.insert(entity);
        return entity;
    }

    @Override
    public Member update(Member entity) {
        entity.setModifyTime(LocalDateTime.now());
        memberMapper.updateById(entity);
        String id = entity.getId();
        return memberMapper.selectById(id);
    }

    @Override
    public Member findByCard(String card) {
        QueryWrapper<Member> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(Member::getCard,card);
        return memberMapper.selectOne(wrapper);
    }

    @Override
    public IPage<Member> findByCondition(MemberQuery query) {
        Page<Member> page = new Page<>(query.getPage(),query.getPageSize());

        QueryWrapper<Member> wrapper = new QueryWrapper<>();
        if(StringUtils.hasText(query.getName())){
            wrapper.lambda().like(Member::getName,query.getName());
        }
        if(Objects.nonNull(query.getGender())){
            wrapper.lambda().eq(Member::getGender,query.getGender());
        }
        wrapper.lambda().orderByDesc(Member::getModifyTime,Member::getCreatedTime);


        return memberMapper.selectPage(page,wrapper);
    }
}

/*
 * @(#) UserRepository.java 2018/3/21
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.simpo.respository;

import com.xuwc.simpo.entity.Redis;
import com.xuwc.simpo.entity.Thread;
import com.xuwc.simpo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**  Redis Repository
 * @author xuwc
 * @version 1.0
 * @since 2018/3/21
 */
@Repository
public interface RedisRepository extends JpaSpecificationExecutor<Redis>,JpaRepository<Redis,Long> {

}

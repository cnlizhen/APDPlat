/**
 * 
 * APDPlat - Application Product Development Platform
 * Copyright (c) 2013, 杨尚川, yang-shangchuan@qq.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package org.apdplat.module.security.service;

import org.springframework.security.authentication.dao.SaltSource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * 用户salt服务，salt为：
 * 用户名+APDPlat应用级产品开发平台的作者是杨尚川，联系方式（邮件：ysc@apdplat.org）(QQ：281032878)
 * @author 杨尚川
 */
@Service("saltSource")
public class APDPlatSaltSource implements SaltSource{
    @Override
    public Object getSalt(UserDetails user) {
        //变化的用户名+固定的字符串
        String text = user.getUsername()+"APDPlat应用级产品开发平台的作者是杨尚川，联系方式（邮件：ysc@apdplat.org）(QQ：281032878)";
        return text;
    }
}

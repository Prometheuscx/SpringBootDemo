package com.silvanspace.demo.controller;

import com.silvanspace.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Descriptions:
 * @Author: zhongjianlong
 * @Email: zhongjl@thinkive.com
 * @CreateDate: 06/09/2017
 * @CreateTime: 4:54 PM
 */
@RestController
@RequestMapping("/users")
public class UserController {

	// 创建线程安全的Map
	static Map<String, User> users = Collections.synchronizedMap(new HashMap<String, User>());

	/**
	 * 查询所有用户
	 * @return
	 */
	@GetMapping(value = "/")
	public List<User> getAllUsers() {
		User user = new User();
		user.setAge(12);
		user.setName("zs");
		user.setId("u1");
		users.put("u1",user);
		return new ArrayList<User>(users.values());
	}

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@PostMapping(value = "/")
	public String addUser(@ModelAttribute User user) {
		users.put(user.getId(),user);

		return "success";
	}

	/**
	 * 根据id获取用户
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public User getUserByID(@PathVariable String id) {
		return users.get(id);
	}

	/*public String updateUserByID(@PathVariable String id, @ModelAttribute User user) {
		User user1 = users.get(id);
		user1.setName(user.getName());
		user1.setAge(user.getAge());

		users.put(id, user1);

		return "success";
	}

	public String delUserByID(@PathVariable String id) {
		users.remove(id);
		return "success";
	}*/
}

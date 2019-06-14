package webadv.s16202109.lab3.respository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import webadv.s16202109.lab3.entity.User;


@Mapper
public interface UserRepository {
	@Results(id="UserMap", value={ 
		    @Result(property = "user_id", column = "User_id",  jdbcType=JdbcType.INTEGER), 
		    @Result(property = "account", column = "User_account"),
		    @Result(property = "user_name", column = "User_name")
	})
	@Select("select * from User") 
	public List<User> findAll();
	
	@Select("select * from User where User_account=#{account} and User_password=md5(#{password})")
	@ResultMap(value="UserMap")
	public User validUser(@Param("account")String account,@Param("password")String password);
	
	@Select("select * from User where User_name like concat('%',#{name},'%')")
	@ResultMap(value="UserMap")			
	public List<User> findByName(@Param("user_name")String name);
	
	@Select("select * from User where User_account=#{account} ")
	@ResultMap(value="UserMap")
	public User validUseraccount(@Param("account")String account);
	
	@Select("INSERT INTO User (`User_account`, `User_password`, `User_name`) VALUES (#{account},md5(#{password}), #{user_name})")
	@ResultMap(value="UserMap")
	public void insert(@Param("account")String account,@Param("password")String password,@Param("user_name")String name);

}


package  com.example.blogboot.Service;
import com.example.blogboot.POJO.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @ClassName : AdminService
 * @Author : Administrator
 * @Date: 2021/6/26 16:29
 * @Description :
 */
@Mapper
@Service
public interface AdminService {
      Admin getByid(Integer id);
      int register(Admin admin);
      Admin getByusername(String username);
}

import com.jackchen.BootOptimization;
import com.jackchen.model.OrderDTO;
import com.jackchen.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BootOptimization.class})
public class OptimizationTest {

    @Resource
    private OrderService orderService;
    @Test
    public void handle(){
        OrderDTO dto = new OrderDTO();
        //通过传过来的参数确定是哪一种的促销方案
        dto.setType("hander1");
        String result = orderService.order(dto);
        System.out.println(result);
    }
}

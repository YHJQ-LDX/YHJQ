import com.yhjqsw.wm.common.WMAdminApplication;
import com.yhjqsw.wm.hotline.dao.TreceiptMapper;
import com.yhjqsw.wm.hotline.dao.TtransferslipMapper;
import com.yhjqsw.wm.hotline.model.Treceipt;
import com.yhjqsw.wm.hotline.model.Ttransferslip;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WMAdminApplication.class)
public class Test2 {
    @Autowired
    private TtransferslipMapper ttransferslipMapper;
    @Autowired
    private TreceiptMapper treceiptMapper;
    @Test
    public void test(){
         Long receiptid=00000000000000000002L;
//        List<Treceipt> result= ttransferslipMapper.findByReceiptidNo();
        System.out.println("=================================");
//        System.out.println(result.get(0).getReceiptcode());
//        System.out.println(result.get(0).getTreceipt().getReceiptcode());//定义一个对象传给前端即可
    }
    @Test
    public void testand(){
//        List<Treceipt> result= treceiptMapper.findall();
//        System.out.println("-==============================-");
//        System.out.println(result.get(0));

    }
}

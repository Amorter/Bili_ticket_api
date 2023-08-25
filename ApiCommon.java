package amort.bili.api;

/**
 * @author Amort
 * PC端和PE端的通用api
 * 目前api全部通用
 * 预测B站未来会更新
 */
public interface ApiCommon {

    /**
     * GET
     * Need Cookie : NO
     * 获取订单信息
     * url = "https://show.bilibili.com/api/ticket/project/get?version=134&id=" + self.user_data["project_id"] + "&project_id="+ self.user_data["project_id"]
     * url参数: id
     */
    public String ORDER_INFO = "https://show.bilibili.com/api/ticket/project/get";


    /**
     * GET
     * Need Cookie : YES
     * 获取购票人
     * url = "https://show.bilibili.com/api/ticket/buyer/list?is_default&projectId=" + self.user_data["project_id"]
     * url参数: projectId|商品id
     */
    public String BUYER_INFO = "https://show.bilibili.com/api/ticket/buyer/list";


    /**
     * POST
     * Need Cookie : YES
     * 订单准备
     * url = "https://show.bilibili.com/api/ticket/order/prepare"
     * url参数: null
     * 表单参数: count|购买数量  order_type|订单类型(1即可)  project_id|商品id  screen_id|场次id(票种)  sku_id|场次id(日期)
     */
    public String ORDER_PREPARE = "https://show.bilibili.com/api/ticket/order/prepare";


    /**
     * POST
     * Need Cookie : YES
     * 创建订单
     * url = "https://show.bilibili.com/api/ticket/order/createV2?project_id=" + self.user_data["project_id"]
     * url参数: project_id|商品id
     */
    public String ORDER_CREATE = "https://show.bilibili.com/api/ticket/order/createV2";


    /**
     * GET
     * Need Cookie : YES
     * 获取订单中心的订单列表（包含会员购商品）
     * url = "https://show.bilibili.com/api/ticket/ordercenter/list"
     * url参数: null
     */
    public String ORDER_LIST_CENTER = "https://show.bilibili.com/api/ticket/ordercenter/list";

    /**
     * GET
     * Need Cookie : YES
     * 获取票务订单列表
     * url = "https://show.bilibili.com/api/ticket/order/list?page=0&page_size=10"
     * url参数: page|page_size
     */
    public String ORDER_LIST_SHOW = "https://show.bilibili.com/api/ticket/order/list";

    public String DEAUFLT_HEADERS = "{" +
            "\"User-Agent\": \"Mozilla/5.0 (Windows NT 10.0; WOW64; rv:52.0) Gecko/20100101 Firefox/52.0\"," +
            "\"Referer\": \"https://show.bilibili.com/\"," +
            "\"Cache-Control\": \"max-age=0\"," +
            "\"Upgrade-Insecure-Requests\": \"1\"," +
            "\"Sec-Fetch-Site\": \"same-origin\"," +
            "\"Sec-Fetch-Mode\": \"navigate\"," +
            "\"Sec-Fetch-User\": \"?1\",\n" +
            "\"Sec-Fetch-Dest\": \"document\"," +
            "\"Cookie\": \"a=b;\"," +
            "\"Accept\": \"*/*\"," +
            "\"Accept-Language\": \"zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3\"," +
            "\"Accept-Encoding\": \"\"," +
            "\"Connection\": \"keep-alive\"" +
            "}";
}

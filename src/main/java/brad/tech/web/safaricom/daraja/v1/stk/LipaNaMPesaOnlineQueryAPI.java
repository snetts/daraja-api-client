package brad.tech.web.safaricom.daraja.v1.stk;

import brad.tech.web.safaricom.daraja.MPesaException;

public class LipaNaMPesaOnlineQueryAPI extends LipaNaMPesaOnlineAPIBase {

    public LipaNaMPesaOnlineQueryAPI(String url) {
        super(url);
    }

    public LipaNaMPesaResponse query(LipaNaMPesaQueryRequest request) throws MPesaException {
        return super.executeLipaNaMPesaOnlineRequest(request);
    }
}

package brad.tech.web.safaricom.daraja.v1.stk;

import brad.tech.web.safaricom.daraja.JsonSerializable;

public class LipaNaMPesaResponse implements JsonSerializable {

    private String merchantRequestID, checkoutRequestID;
    private String responseCode, resultDesc, responseDescription, resultCode;

    public String getMerchantRequestID() {
        return merchantRequestID;
    }

    public void setMerchantRequestID(String merchantRequestID) {
        this.merchantRequestID = merchantRequestID;
    }

    public String getCheckoutRequestID() {
        return checkoutRequestID;
    }

    public void setCheckoutRequestID(String checkoutRequestID) {
        this.checkoutRequestID = checkoutRequestID;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String toJson() {
        return String.format("{" +
                        "\"MerchantRequestID\" : \"%s\", " +
                        "\"CheckoutRequestID\" : \"%s\", " +
                        "\"ResponseCode\" : \"%s\", " +
                        "\"ResultDesc\" : \"%s\", " +
                        "\"ResponseDescription\" : \"%s\", " +
                        "\"ResultCode\" : \"%s\" " +
                        "}",
                merchantRequestID, checkoutRequestID, responseCode, resultDesc, responseDescription, resultCode
        );
    }
}

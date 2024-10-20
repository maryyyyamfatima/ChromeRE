package org.chromium.chrome.browser.endpoint_fetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class EndpointResponse {
    public final String a;

    public EndpointResponse(String str) {
        this.a = str;
    }

    public static EndpointResponse createEndpointResponse(String str) {
        return new EndpointResponse(str);
    }
}

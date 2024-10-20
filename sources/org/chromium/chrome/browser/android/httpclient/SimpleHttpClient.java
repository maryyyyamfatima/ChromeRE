package org.chromium.chrome.browser.android.httpclient;

import defpackage.M41;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SimpleHttpClient {

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class HttpResponse {
    }

    public static HttpResponse createHttpResponse(int i, int i2, byte[] bArr, String[] strArr, String[] strArr2) {
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (!hashMap.containsKey(strArr[i3])) {
                hashMap.put(strArr[i3], strArr2[i3]);
            } else {
                StringBuilder a = M41.a((String) hashMap.get(strArr[i3]), "\n");
                a.append(strArr2[i3]);
                hashMap.put(strArr[i3], a.toString());
            }
        }
        return new HttpResponse();
    }
}

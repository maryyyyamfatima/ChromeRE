package org.chromium.chrome.browser.survey;

import J.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SurveyHttpClientBridge {
    public final long a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class HttpResponse {
        public final int a;
        public final int b;
        public final byte[] c;
        public final HashMap d;

        public HttpResponse(int i, int i2, byte[] bArr, HashMap hashMap) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
            this.d = new HashMap(hashMap);
        }
    }

    public SurveyHttpClientBridge(Profile profile) {
        this.a = N.M30XmOhv(0, profile);
    }

    public static HttpResponse createHttpResponse(int i, int i2, byte[] bArr, String[] strArr, String[] strArr2) {
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (!hashMap.containsKey(strArr[i3])) {
                hashMap.put(strArr[i3], new ArrayList());
            }
            ((List) hashMap.get(strArr[i3])).add(strArr2[i3]);
        }
        return new HttpResponse(i, i2, bArr, hashMap);
    }
}

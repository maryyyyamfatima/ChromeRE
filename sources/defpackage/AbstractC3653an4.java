package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: an4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3653an4 {
    public static void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2.concat(" should not be null or empty."));
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(AbstractC7848n0.a(str, " should not be null."));
        }
    }

    public static void a(String str, String str2, byte[][] bArr, HashMap hashMap, Bundle bundle) {
        Parcelable[] parcelableArr;
        c(str, "schemelessOrigin");
        bundle.putString("topLevelOrigin", str);
        c(str2, "schemelessIframeOrigin");
        bundle.putString("paymentRequestOrigin", str2);
        if (bArr == null || bArr.length <= 0) {
            parcelableArr = null;
        } else {
            parcelableArr = new Parcelable[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                Bundle bundle2 = new Bundle();
                b(bArr[i], "certificateChain[" + i + "]");
                bundle2.putByteArray("certificate", bArr[i]);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray("topLevelCertificateChain", parcelableArr);
        }
        if (hashMap == null || hashMap.isEmpty()) {
            throw new IllegalArgumentException("methodDataMap should not be null or empty.");
        }
        bundle.putStringArrayList("methodNames", new ArrayList<>(hashMap.keySet()));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            b(entry.getValue(), "methodDataMap's entry value");
            bundle3.putString((String) entry.getKey(), ((C5027en4) entry.getValue()).b);
        }
        bundle.putParcelable("methodData", bundle3);
        bundle.putString("origin", str);
        bundle.putString("iframeOrigin", str2);
        if (parcelableArr != null) {
            bundle.putParcelableArray("certificateChain", parcelableArr);
        }
        String str3 = (String) ((Map.Entry) hashMap.entrySet().iterator().next()).getKey();
        bundle.putString("methodName", str3);
        C5027en4 c5027en4 = (C5027en4) hashMap.get(str3);
        bundle.putString("data", c5027en4 == null ? "{}" : c5027en4.b);
        bundle.putParcelable("dataMap", bundle3);
    }
}

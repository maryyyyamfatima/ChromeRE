package defpackage;

import J.N;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: k8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6864k8 extends AbstractC7584mE {
    public C6864k8() {
        super("ExperimentsForAgsa", "");
    }

    public final HashMap c() {
        String c = CachedFeatureFlags.c(b(), "");
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(c);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    @Override // defpackage.AbstractC7584mE
    public final void a() {
        C7928nE c7928nE = UN.a;
        HashMap hashMap = new HashMap();
        String[] M1ealghd = N.M1ealghd(this.a);
        for (int i = 0; i < M1ealghd.length; i += 2) {
            hashMap.put(M1ealghd[i], M1ealghd[i + 1]);
        }
        O83.a.t(b(), new JSONObject(hashMap).toString());
    }
}

package org.chromium.components.policy;

import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PolicyConverter {
    public long a;

    public PolicyConverter(long j) {
        this.a = j;
    }

    public static JSONObject b(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                obj = b((Bundle) obj);
            }
            if (obj instanceof Bundle[]) {
                obj = a((Bundle[]) obj);
            }
            jSONObject.put(str, JSONObject.wrap(obj));
        }
        return jSONObject;
    }

    public static JSONArray a(Bundle[] bundleArr) {
        JSONArray jSONArray = new JSONArray();
        for (Bundle bundle : bundleArr) {
            jSONArray.put(b(bundle));
        }
        return jSONArray;
    }

    public static PolicyConverter create(long j) {
        return new PolicyConverter(j);
    }

    public final void onNativeDestroyed() {
        this.a = 0L;
    }
}

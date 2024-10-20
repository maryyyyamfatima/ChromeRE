package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9391rW0 implements InterfaceC10077tW0 {
    @Override // defpackage.InterfaceC10077tW0
    public final String[] a(Object obj) {
        JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.optString(i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // defpackage.InterfaceC10077tW0
    public final String b(Object obj, String str) {
        JSONObject jSONObject = (JSONObject) obj;
        if (JSONObject.NULL.equals(jSONObject.opt(str))) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @Override // defpackage.InterfaceC10077tW0
    public final boolean c(Object obj, String str) {
        return ((JSONObject) obj).has(str);
    }
}

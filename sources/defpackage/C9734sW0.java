package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sW0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9734sW0 implements InterfaceC10420uW0 {
    @Override // defpackage.InterfaceC10420uW0
    public final void a(Object obj, String str, String str2) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            if (str2 == null) {
                jSONObject.put(str, JSONObject.NULL);
            } else {
                jSONObject.put(str, str2);
            }
        } catch (JSONException unused) {
            AbstractC4851eH1.a("GCMMessage", "Error when serializing a GCMMessage into a JSONObject.", new Object[0]);
        }
    }

    @Override // defpackage.InterfaceC10420uW0
    public final void c(Object obj, String[] strArr) {
        JSONObject jSONObject = (JSONObject) obj;
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str : strArr) {
                jSONArray.put(str);
            }
            jSONObject.put("data", jSONArray);
        } catch (JSONException unused) {
            AbstractC4851eH1.a("GCMMessage", "Error when serializing a GCMMessage into a JSONObject.", new Object[0]);
        }
    }

    @Override // defpackage.InterfaceC10420uW0
    public final Object b() {
        return new JSONObject();
    }
}

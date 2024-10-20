package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uM2 */
/* loaded from: classes.dex */
public final class C10372uM2 extends GM2 {
    public final /* synthetic */ JSONObject r = null;
    public final /* synthetic */ KM2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10372uM2(KM2 km2) {
        super(km2, false);
        this.s = km2;
    }

    @Override // defpackage.GM2
    public final void n() {
        C6257iN1 c6257iN1 = this.s.c;
        InterfaceC3857bO2 o = o();
        c6257iN1.getClass();
        JSONObject jSONObject = new JSONObject();
        long a = c6257iN1.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "PAUSE");
            jSONObject.put("mediaSessionId", c6257iN1.i());
            JSONObject jSONObject2 = this.r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        c6257iN1.c(a, jSONObject.toString());
        c6257iN1.k.d(a, o);
    }
}

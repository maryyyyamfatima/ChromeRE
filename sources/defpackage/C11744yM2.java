package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yM2 */
/* loaded from: classes.dex */
public final class C11744yM2 extends GM2 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ JSONObject s = null;
    public final /* synthetic */ KM2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11744yM2(KM2 km2, boolean z) {
        super(km2, false);
        this.t = km2;
        this.r = z;
    }

    @Override // defpackage.GM2
    public final void n() {
        C6257iN1 c6257iN1 = this.t.c;
        InterfaceC3857bO2 o = o();
        boolean z = this.r;
        c6257iN1.getClass();
        JSONObject jSONObject = new JSONObject();
        long a = c6257iN1.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "SET_VOLUME");
            jSONObject.put("mediaSessionId", c6257iN1.i());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("muted", z);
            jSONObject.put("volume", jSONObject2);
            JSONObject jSONObject3 = this.s;
            if (jSONObject3 != null) {
                jSONObject.put("customData", jSONObject3);
            }
        } catch (JSONException unused) {
        }
        c6257iN1.c(a, jSONObject.toString());
        c6257iN1.o.d(a, o);
    }
}

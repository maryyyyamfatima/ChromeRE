package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xM2 */
/* loaded from: classes.dex */
public final class C11401xM2 extends GM2 {
    public final /* synthetic */ double r;
    public final /* synthetic */ JSONObject s = null;
    public final /* synthetic */ KM2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11401xM2(KM2 km2, double d) {
        super(km2, false);
        this.t = km2;
        this.r = d;
    }

    @Override // defpackage.GM2
    public final void n() {
        C6257iN1 c6257iN1 = this.t.c;
        InterfaceC3857bO2 o = o();
        c6257iN1.getClass();
        double d = this.r;
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        JSONObject jSONObject = new JSONObject();
        long a = c6257iN1.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "SET_VOLUME");
            jSONObject.put("mediaSessionId", c6257iN1.i());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("level", d);
            jSONObject.put("volume", jSONObject2);
            JSONObject jSONObject3 = this.s;
            if (jSONObject3 != null) {
                jSONObject.put("customData", jSONObject3);
            }
        } catch (JSONException unused) {
        }
        c6257iN1.c(a, jSONObject.toString());
        c6257iN1.n.d(a, o);
    }
}

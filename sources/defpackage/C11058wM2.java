package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wM2 */
/* loaded from: classes.dex */
public final class C11058wM2 extends GM2 {
    public final /* synthetic */ C6963kR1 r;
    public final /* synthetic */ KM2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11058wM2(KM2 km2, C6963kR1 c6963kR1) {
        super(km2, false);
        this.s = km2;
        this.r = c6963kR1;
    }

    @Override // defpackage.GM2
    public final void n() {
        C6257iN1 c6257iN1 = this.s.c;
        InterfaceC3857bO2 o = o();
        c6257iN1.getClass();
        JSONObject jSONObject = new JSONObject();
        long a = c6257iN1.a();
        C6963kR1 c6963kR1 = this.r;
        c6963kR1.getClass();
        long j = c6963kR1.a;
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", c6257iN1.i());
            jSONObject.put("currentTime", WH.b(j));
            int i = c6963kR1.b;
            if (i == 1) {
                jSONObject.put("resumeState", "PLAYBACK_START");
            } else if (i == 2) {
                jSONObject.put("resumeState", "PLAYBACK_PAUSE");
            }
            JSONObject jSONObject2 = c6963kR1.c;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        c6257iN1.c(a, jSONObject.toString());
        c6257iN1.g = Long.valueOf(j);
        c6257iN1.m.d(a, new C4538dN1(c6257iN1, o));
    }
}

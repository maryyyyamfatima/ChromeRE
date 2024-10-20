package defpackage;

import com.google.android.gms.cast.MediaStatus;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oM2 */
/* loaded from: classes.dex */
public final class C8315oM2 extends GM2 {
    public final /* synthetic */ KM2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8315oM2(KM2 km2) {
        super(km2, false);
        this.r = km2;
    }

    @Override // defpackage.GM2
    public final void n() {
        C6257iN1 c6257iN1 = this.r.c;
        InterfaceC3857bO2 o = o();
        c6257iN1.getClass();
        JSONObject jSONObject = new JSONObject();
        long a = c6257iN1.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "GET_STATUS");
            MediaStatus mediaStatus = c6257iN1.f;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.g);
            }
        } catch (JSONException unused) {
        }
        c6257iN1.c(a, jSONObject.toString());
        c6257iN1.p.d(a, o);
    }
}

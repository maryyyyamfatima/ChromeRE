package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sM2 */
/* loaded from: classes.dex */
public final class C9686sM2 extends GM2 {
    public final /* synthetic */ int[] r;
    public final /* synthetic */ KM2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9686sM2(KM2 km2, int[] iArr) {
        super(km2, true);
        this.s = km2;
        this.r = iArr;
    }

    @Override // defpackage.GM2
    public final void n() {
        C6257iN1 c6257iN1 = this.s.c;
        InterfaceC3857bO2 o = o();
        int[] iArr = this.r;
        c6257iN1.getClass();
        JSONObject jSONObject = new JSONObject();
        long a = c6257iN1.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", c6257iN1.i());
            JSONArray jSONArray = new JSONArray();
            for (int i : iArr) {
                jSONArray.put(i);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        c6257iN1.c(a, jSONObject.toString());
        c6257iN1.s.d(a, o);
    }
}

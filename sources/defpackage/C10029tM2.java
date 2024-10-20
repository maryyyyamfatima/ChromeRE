package defpackage;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tM2 */
/* loaded from: classes.dex */
public final class C10029tM2 extends GM2 {
    public final /* synthetic */ MediaLoadRequestData r;
    public final /* synthetic */ KM2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10029tM2(KM2 km2, MediaLoadRequestData mediaLoadRequestData) {
        super(km2, false);
        this.s = km2;
        this.r = mediaLoadRequestData;
    }

    @Override // defpackage.GM2
    public final void n() {
        C6257iN1 c6257iN1 = this.s.c;
        InterfaceC3857bO2 o = o();
        c6257iN1.getClass();
        MediaLoadRequestData mediaLoadRequestData = this.r;
        MediaInfo mediaInfo = mediaLoadRequestData.a;
        MediaQueueData mediaQueueData = mediaLoadRequestData.g;
        if (mediaInfo == null && mediaQueueData == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo2 = mediaLoadRequestData.a;
            if (mediaInfo2 != null) {
                jSONObject.put("media", mediaInfo2.s1());
            }
            if (mediaQueueData != null) {
                jSONObject.put("queueData", mediaQueueData.r1());
            }
            jSONObject.putOpt("autoplay", mediaLoadRequestData.h);
            long j = mediaLoadRequestData.i;
            if (j != -1) {
                jSONObject.put("currentTime", WH.b(j));
            }
            jSONObject.put("playbackRate", mediaLoadRequestData.j);
            jSONObject.putOpt("credentials", mediaLoadRequestData.n);
            jSONObject.putOpt("credentialsType", mediaLoadRequestData.o);
            jSONObject.putOpt("atvCredentials", mediaLoadRequestData.p);
            jSONObject.putOpt("atvCredentialsType", mediaLoadRequestData.q);
            long[] jArr = mediaLoadRequestData.k;
            if (jArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < jArr.length; i++) {
                    jSONArray.put(i, jArr[i]);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            jSONObject.putOpt("customData", mediaLoadRequestData.m);
            jSONObject.put("requestId", mediaLoadRequestData.r);
        } catch (JSONException e) {
            MediaLoadRequestData.s.d("Error transforming MediaLoadRequestData into JSONObject", e);
            jSONObject = new JSONObject();
        }
        long a = c6257iN1.a();
        try {
            jSONObject.put("requestId", a);
            jSONObject.put("type", "LOAD");
        } catch (JSONException unused) {
        }
        c6257iN1.c(a, jSONObject.toString());
        c6257iN1.j.d(a, o);
    }
}

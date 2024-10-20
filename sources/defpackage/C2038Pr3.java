package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pr3 */
/* loaded from: classes.dex */
public final class C2038Pr3 extends Q91 {
    public final C8563p43 g;

    public C2038Pr3(String str, Context context, String str2, C9957t82 c9957t82, C8563p43 c8563p43) {
        super(str, context, str2, c9957t82);
        this.g = c8563p43;
    }

    public final byte[] c() {
        return this.g.toByteArray();
    }

    public final String d() {
        String uri = Uri.parse("https://scone-pa.googleapis.com").buildUpon().encodedPath(!(this.e != null) ? "/v1/survey/event_anonymous" : "/v1/survey/event").build().toString();
        int i = AbstractC3208Yr3.b;
        return uri;
    }
}

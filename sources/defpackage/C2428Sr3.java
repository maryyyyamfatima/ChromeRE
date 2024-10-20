package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sr3 */
/* loaded from: classes.dex */
public final class C2428Sr3 extends Q91 {
    public final C9591s43 g;

    public C2428Sr3(String str, Context context, String str2, C9957t82 c9957t82, C9591s43 c9591s43) {
        super(str, context, str2, c9957t82);
        this.g = c9591s43;
    }

    public final byte[] c() {
        return this.g.toByteArray();
    }

    public final String d() {
        String uri = Uri.parse("https://scone-pa.googleapis.com").buildUpon().encodedPath(!(this.e != null) ? "/v1/survey/trigger/trigger_anonymous" : "/v1/survey/trigger").build().toString();
        int i = AbstractC3208Yr3.b;
        return uri;
    }
}

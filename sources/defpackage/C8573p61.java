package defpackage;

import com.google.android.libraries.surveys.internal.model.SurveyDataImpl;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: p61, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8573p61 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ C9944t61 d;

    public final void b(SurveyDataImpl surveyDataImpl) {
        C9944t61 c9944t61 = this.d;
        HashMap hashMap = c9944t61.b;
        String str = this.a;
        hashMap.put(str, surveyDataImpl);
        long currentTimeMillis = System.currentTimeMillis();
        c9944t61.h.put(str, Long.valueOf(currentTimeMillis));
        AbstractC4851eH1.d("HatsNextController", "Last download time for survey with ID %s is %s.", str, Long.valueOf(currentTimeMillis));
        EI2.h(0, 6, "Android.Survey.DownloadResponseCode2");
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public C8573p61(C9944t61 c9944t61, String str, PP pp, QP qp) {
        this.d = c9944t61;
        this.a = str;
        this.b = pp;
        this.c = qp;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r5, defpackage.EnumC2168Qr3 r6) {
        /*
            r4 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r5
            r5 = 1
            r1[r5] = r6
            java.lang.String r3 = "Failed to fetch survey (trigger id: %s, error: %s.)"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            java.lang.String r3 = "HatsNextController"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            defpackage.AbstractC4851eH1.a(r3, r1, r2)
            int r6 = r6.ordinal()
            if (r6 == 0) goto L27
            if (r6 == r5) goto L28
            r5 = 3
            if (r6 == r0) goto L27
            if (r6 == r5) goto L25
            r0 = 5
            goto L28
        L25:
            r0 = 4
            goto L28
        L27:
            r0 = r5
        L28:
            t61 r5 = r4.d
            r5.getClass()
            r5 = 6
            java.lang.String r6 = "Android.Survey.DownloadResponseCode2"
            defpackage.EI2.h(r0, r5, r6)
            java.lang.Runnable r5 = r4.c
            if (r5 == 0) goto L3a
            r5.run()
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8573p61.a(java.lang.String, Qr3):void");
    }
}

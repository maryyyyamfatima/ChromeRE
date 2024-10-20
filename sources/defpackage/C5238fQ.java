package defpackage;

import android.content.Context;
import android.os.Handler;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fQ */
/* loaded from: classes.dex */
public final class C5238fQ extends AbstractC0185Bl {
    public final C5582gQ h;
    public final InterfaceC10590uz3 i;

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Context context = V60.a;
            C5582gQ c5582gQ = this.h;
            c5582gQ.getClass();
            c5582gQ.g = new Handler();
            c5582gQ.a = this.i;
            C12260zr3.b().a(context, c5582gQ.j, new Runnable() { // from class: PP
                public /* synthetic */ PP() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C5582gQ c5582gQ2 = C5582gQ.this;
                    Tab h = ((AbstractC11276wz3) c5582gQ2.a).h();
                    String str = c5582gQ2.j;
                    if (c5582gQ2.c(h, str)) {
                        return;
                    }
                    YP yp = new YP(c5582gQ2, str);
                    c5582gQ2.i = yp;
                    ((AbstractC11276wz3) c5582gQ2.a).c(yp);
                }
            }, new Runnable() { // from class: QP
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC4851eH1.f("ChromeSurveyCtrler", "Survey does not exists or download failed.", new Object[0]);
                }
            });
            O83.a.d(c5582gQ.l);
        }
    }

    public C5238fQ(C5582gQ c5582gQ, AbstractC11276wz3 abstractC11276wz3) {
        this.h = c5582gQ;
        this.i = abstractC11276wz3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:            if (r0 == false) goto L159;     */
    @Override // defpackage.AbstractC0185Bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            r9 = this;
            sA2 r0 = defpackage.C9626sA2.g()
            r0.getClass()
            boolean r0 = defpackage.AbstractC1171Ja0.a(r0)
            if (r0 != 0) goto L11
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Laf
        L11:
            AX r0 = defpackage.AX.e()
            java.lang.String r1 = "force-enable-chrome-survey"
            boolean r0 = r0.g(r1)
            gQ r1 = r9.h
            if (r0 == 0) goto L2a
            r1.getClass()
            r0 = 2
            defpackage.C5582gQ.e(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto Laf
        L2a:
            r1.getClass()
            Q83 r0 = defpackage.O83.a
            r2 = -1
            java.lang.String r4 = r1.k
            long r4 = r0.g(r2, r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L42
            defpackage.C5582gQ.e(r4)
            r2 = r3
            goto L43
        L42:
            r2 = r4
        L43:
            if (r2 != 0) goto Laa
            nE r2 = defpackage.UN.a
            java.lang.String r2 = "max-download-attempts"
            java.lang.String r5 = "ChromeSurveyNextAndroid"
            int r2 = J.N.M37SqSAy(r5, r2, r4)
            java.lang.String r1 = r1.l
            int r1 = r0.f(r4, r1)
            if (r2 <= 0) goto L5c
            if (r1 >= r2) goto L5a
            goto L5c
        L5a:
            r1 = r4
            goto L5d
        L5c:
            r1 = r3
        L5d:
            if (r1 == 0) goto Laa
            boolean r1 = defpackage.AbstractC10385uP0.a
            if (r1 == 0) goto L69
            r0 = 8
            defpackage.C5582gQ.e(r0)
            goto La6
        L69:
            r1 = -1
            java.lang.String r2 = "last_rolled_for_chrome_survey_key"
            int r6 = r0.f(r1, r2)
            java.lang.Object r7 = org.chromium.base.ThreadUtils.a
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            r8 = 6
            int r7 = r7.get(r8)
            if (r6 != r7) goto L82
            r0 = 3
            defpackage.C5582gQ.e(r0)
            goto La6
        L82:
            java.lang.String r6 = "max-number"
            int r5 = J.N.M37SqSAy(r5, r6, r1)
            if (r5 != r1) goto L8f
            r0 = 4
            defpackage.C5582gQ.e(r0)
            goto La6
        L8f:
            r0.q(r7, r2)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r0 = r0.nextInt(r5)
            if (r0 != 0) goto La2
            defpackage.C5582gQ.e(r8)
            r0 = r3
            goto La7
        La2:
            r0 = 5
            defpackage.C5582gQ.e(r0)
        La6:
            r0 = r4
        La7:
            if (r0 == 0) goto Laa
            goto Lab
        Laa:
            r3 = r4
        Lab:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5238fQ.b():java.lang.Object");
    }
}

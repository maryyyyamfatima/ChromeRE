package defpackage;

import android.app.Activity;
import org.chromium.base.ApplicationStatus;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class BK0 implements InterfaceC11179wj {
    public final InterfaceC2678Up3 a;
    public int g = -1;
    public final Activity h;

    public abstract boolean a();

    public abstract String d();

    public abstract void e();

    public BK0(Activity activity, InterfaceC2678Up3 interfaceC2678Up3) {
        this.h = activity;
        this.a = interfaceC2678Up3;
    }

    @Override // defpackage.InterfaceC11179wj
    public final void o(Activity activity, int i) {
        InterfaceC2678Up3 interfaceC2678Up3 = this.a;
        if (i == 2 || i == 3) {
            OJ0 oj0 = ((C12075zK0) interfaceC2678Up3).I;
            if (oj0 != null) {
                oj0.a.j();
            }
            f();
            return;
        }
        if (i == 4) {
            OJ0 oj02 = ((C12075zK0) interfaceC2678Up3).I;
            if (oj02 != null) {
                oj02.a(21, false);
                return;
            }
            return;
        }
        if (i == 5) {
            c();
        } else {
            if (i != 6) {
                return;
            }
            b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r6 = this;
            boolean r0 = r6.a()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 1
            r6.g = r0
            java.lang.String r0 = r6.d()
            Up3 r1 = r6.a
            r2 = r1
            zK0 r2 = (defpackage.C12075zK0) r2
            SK0 r2 = r2.f
            r2.getClass()
            if (r0 != 0) goto L1b
            goto L4e
        L1b:
            PJ0 r3 = new PJ0
            r3.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4e
            r4.<init>(r0)     // Catch: org.json.JSONException -> L4e
            java.lang.String r0 = "pos"
            int r0 = r4.getInt(r0)     // Catch: org.json.JSONException -> L4e
            r3.a = r0     // Catch: org.json.JSONException -> L4e
            java.lang.String r0 = "lpos"
            int r0 = r4.getInt(r0)     // Catch: org.json.JSONException -> L4e
            r3.b = r0     // Catch: org.json.JSONException -> L4e
            java.lang.String r0 = "off"
            int r0 = r4.getInt(r0)     // Catch: org.json.JSONException -> L4e
            r3.c = r0     // Catch: org.json.JSONException -> L4e
            java.lang.String r0 = "tabId"
            int r0 = r4.getInt(r0)     // Catch: org.json.JSONException -> L4e
            r3.d = r0     // Catch: org.json.JSONException -> L4e
            java.lang.String r0 = "contentState"
            java.lang.String r0 = r4.getString(r0)     // Catch: org.json.JSONException -> L4e
            r3.e = r0     // Catch: org.json.JSONException -> L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            if (r3 != 0) goto L52
            goto L70
        L52:
            int r0 = r3.d
            r2.A = r0
            org.chromium.ui.modelutil.PropertyModel r4 = r2.k
            if (r4 == 0) goto L5f
            ND2 r5 = defpackage.AbstractC4077c13.c
            r4.m(r5, r0)
        L5f:
            Mm3 r0 = r2.G
            if (r0 != 0) goto L66
            r2.E = r3
            goto L70
        L66:
            org.chromium.chrome.browser.feed.FeedStream r0 = (org.chromium.chrome.browser.feed.FeedStream) r0
            boolean r2 = r0.g(r3)
            if (r2 != 0) goto L70
            r0.C = r3
        L70:
            zK0 r1 = (defpackage.C12075zK0) r1
            r1.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BK0.f():void");
    }

    public final void c() {
        int i = this.g;
        if (i == 4 || i == 0 || i == 5) {
            return;
        }
        this.g = 4;
        e();
        C12075zK0 c12075zK0 = (C12075zK0) this.a;
        c12075zK0.getClass();
        if (WK0.a().a) {
            c12075zK0.p = false;
            c12075zK0.f.r(false);
            AbstractC9664sI0.c(4);
        }
    }

    public void b() {
        if (this.g == 5) {
            return;
        }
        c();
        this.g = 5;
        ApplicationStatus.h(this);
    }
}

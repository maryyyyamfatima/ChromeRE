package defpackage;

import J.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.components.media_router.BrowserMediaRouter;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class KE extends HE {
    public GU h;
    public final HashMap i;
    public final OE j;
    public final TH k;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:            if (r9 == r8.h.e) goto L345;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:            if (r9 == r0.e) goto L345;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bb, code lost:            if (r0.equals(r4.f()) != false) goto L345;     */
    @Override // defpackage.InterfaceC5240fQ1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KE.c(int, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    @Override // defpackage.HE, defpackage.InterfaceC5240fQ1
    public final void n(String str) {
        GU x;
        boolean containsKey = this.d.containsKey(str);
        super.n(str);
        if (containsKey && (x = x(str)) != null) {
            C1560Ma0 c1560Ma0 = this.k.c;
            TR1 tr1 = c1560Ma0 != null ? c1560Ma0.b : null;
            if (tr1 != null) {
                this.j.i(tr1, x.b, "stop");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: JSONException -> 0x00a6, TryCatch #0 {JSONException -> 0x00a6, blocks: (B:7:0x000f, B:19:0x005a, B:21:0x005e, B:23:0x0062, B:27:0x0069, B:31:0x0074, B:33:0x007b, B:37:0x0082, B:41:0x008d, B:43:0x0097, B:44:0x00a2, B:46:0x0031, B:49:0x003b, B:52:0x0045), top: B:6:0x000f }] */
    @Override // defpackage.InterfaceC5240fQ1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.util.HashMap r0 = r7.d
            boolean r8 = r0.containsKey(r8)
            if (r8 != 0) goto L9
            return
        L9:
            OE r8 = r7.j
            r8.getClass()
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> La6
            r1.<init>(r9)     // Catch: org.json.JSONException -> La6
            java.lang.String r9 = "type"
            java.lang.String r9 = r1.optString(r9)     // Catch: org.json.JSONException -> La6
            int r2 = r9.hashCode()     // Catch: org.json.JSONException -> La6
            r3 = -1
            r4 = -1409221232(0xffffffffac00fd90, float:-1.833065E-12)
            r5 = 2
            r6 = 1
            if (r2 == r4) goto L45
            r4 = -906487690(0xffffffffc9f81876, float:-2032398.8)
            if (r2 == r4) goto L3b
            r4 = 784257294(0x2ebed10e, float:8.677335E-11)
            if (r2 == r4) goto L31
            goto L4f
        L31:
            java.lang.String r2 = "leave_session"
            boolean r9 = r9.equals(r2)     // Catch: org.json.JSONException -> La6
            if (r9 == 0) goto L4f
            r9 = r5
            goto L50
        L3b:
            java.lang.String r2 = "client_connect"
            boolean r9 = r9.equals(r2)     // Catch: org.json.JSONException -> La6
            if (r9 == 0) goto L4f
            r9 = r0
            goto L50
        L45:
            java.lang.String r2 = "client_disconnect"
            boolean r9 = r9.equals(r2)     // Catch: org.json.JSONException -> La6
            if (r9 == 0) goto L4f
            r9 = r6
            goto L50
        L4f:
            r9 = r3
        L50:
            KE r2 = r8.e
            java.lang.String r4 = "clientId"
            if (r9 == 0) goto L7b
            if (r9 == r6) goto L62
            if (r9 == r5) goto L5e
            r8.d(r1)     // Catch: org.json.JSONException -> La6
            goto Lbc
        L5e:
            r8.c(r1)     // Catch: org.json.JSONException -> La6
            goto Lbc
        L62:
            java.lang.String r8 = r1.getString(r4)     // Catch: org.json.JSONException -> La6
            if (r8 != 0) goto L69
            goto Lbc
        L69:
            java.util.HashMap r9 = r2.i     // Catch: org.json.JSONException -> La6
            java.lang.Object r8 = r9.get(r8)     // Catch: org.json.JSONException -> La6
            GU r8 = (defpackage.GU) r8     // Catch: org.json.JSONException -> La6
            if (r8 != 0) goto L74
            goto Lbc
        L74:
            java.lang.String r8 = r8.a     // Catch: org.json.JSONException -> La6
            r9 = 0
            r2.t(r8, r9)     // Catch: org.json.JSONException -> La6
            goto Lbc
        L7b:
            java.lang.String r9 = r1.getString(r4)     // Catch: org.json.JSONException -> La6
            if (r9 != 0) goto L82
            goto Lbc
        L82:
            java.util.HashMap r1 = r2.i     // Catch: org.json.JSONException -> La6
            java.lang.Object r9 = r1.get(r9)     // Catch: org.json.JSONException -> La6
            GU r9 = (defpackage.GU) r9     // Catch: org.json.JSONException -> La6
            if (r9 != 0) goto L8d
            goto Lbc
        L8d:
            r9.f = r6     // Catch: org.json.JSONException -> La6
            TH r1 = r8.d     // Catch: org.json.JSONException -> La6
            boolean r1 = r1.g()     // Catch: org.json.JSONException -> La6
            if (r1 == 0) goto La2
            java.lang.String r1 = r9.b     // Catch: org.json.JSONException -> La6
            java.lang.String r4 = r8.b()     // Catch: org.json.JSONException -> La6
            java.lang.String r5 = "new_session"
            r8.g(r1, r3, r5, r4)     // Catch: org.json.JSONException -> La6
        La2:
            r2.w(r9)     // Catch: org.json.JSONException -> La6
            goto Lbc
        La6:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "JSONException while handling internal message: "
            r9.<init>(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r0 = "CafMR"
            defpackage.AbstractC4851eH1.a(r0, r8, r9)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.KE.h(java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.HE
    public final UR1 p(String str) {
        return CH.e(str);
    }

    @Override // defpackage.HE
    public final AbstractC6450iw v() {
        return this.k;
    }

    public final void y(String str, String str2) {
        GU gu = (GU) this.i.get(str);
        if (gu == null) {
            return;
        }
        if (!gu.f) {
            gu.g.add(str2);
            return;
        }
        w(gu);
        BrowserMediaRouter browserMediaRouter = (BrowserMediaRouter) this.b;
        long j = browserMediaRouter.a;
        if (j != 0) {
            N.MM5f2cm0(j, browserMediaRouter, gu.a, str2);
        }
    }

    public final void w(GU gu) {
        ArrayList arrayList = gu.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            BrowserMediaRouter browserMediaRouter = (BrowserMediaRouter) this.b;
            long j = browserMediaRouter.a;
            if (j != 0) {
                N.MM5f2cm0(j, browserMediaRouter, gu.a, str);
            }
        }
        arrayList.clear();
    }

    @Override // defpackage.HE
    public final void r(QH qh, String str) {
        TH th;
        OE oe;
        super.r(qh, str);
        Iterator it = this.i.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            th = this.k;
            oe = this.j;
            if (!hasNext) {
                break;
            }
            GU gu = (GU) it.next();
            String str2 = gu.a;
            C1560Ma0 c1560Ma0 = th.c;
            oe.i(c1560Ma0 != null ? c1560Ma0.b : null, gu.b, "cast");
        }
        for (GU gu2 : oe.e.i.values()) {
            if (gu2.f) {
                oe.g(gu2.b, -1, "new_session", oe.b());
            }
        }
        KM2 km2 = th.a.h;
        if (!km2.h()) {
            KM2.f();
        } else {
            KM2.b(new C8315oM2(km2));
        }
    }

    @Override // defpackage.HE
    public final void o(C6609jP1 c6609jP1, String str, int i, int i2, boolean z) {
        super.o(c6609jP1, str, i, i2, z);
        CH e = CH.e(c6609jP1.c);
        String str2 = e.c;
        if (str2 != null) {
            HashMap hashMap = this.i;
            if (hashMap.containsKey(str2)) {
                return;
            }
            hashMap.put(str2, new GU(i, c6609jP1.a, str2, e.d, str));
        }
    }

    @Override // defpackage.HE
    public final void u(String str) {
        GU x = x(str);
        if (x != null) {
            this.h = (GU) this.i.remove(x.b);
        }
        super.u(str);
    }

    public final GU x(String str) {
        for (GU gu : this.i.values()) {
            if (gu.a.equals(str)) {
                return gu;
            }
        }
        return null;
    }

    public KE(MQ1 mq1, BrowserMediaRouter browserMediaRouter) {
        super(mq1, browserMediaRouter);
        this.i = new HashMap();
        TH th = new TH(this);
        this.k = th;
        this.j = new OE(this, th);
    }
}

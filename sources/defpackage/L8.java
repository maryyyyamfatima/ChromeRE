package defpackage;

import org.chromium.components.browser_ui.site_settings.AllSiteSettings;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class L8 implements No4 {
    public final /* synthetic */ AllSiteSettings a;

    public L8(AllSiteSettings allSiteSettings) {
        this.a = allSiteSettings;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:            if (r1.size() != 0) goto L255;     */
    @Override // defpackage.No4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.util.Collection r9) {
        /*
            r8 = this;
            org.chromium.components.browser_ui.site_settings.AllSiteSettings r0 = r8.a
            android.app.Activity r1 = r0.getActivity()
            if (r1 != 0) goto L9
            return
        L9:
            r1 = 0
            r0.p0 = r1
            androidx.preference.PreferenceScreen r1 = r0.N0()
            r1.a0()
            r0.R0()
            java.util.HashSet r1 = r0.q0
            r2 = 1
            if (r1 != 0) goto L1c
            goto L42
        L1c:
            java.util.Iterator r1 = r9.iterator()
        L20:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r1.next()
            io4 r3 = (defpackage.C6408io4) r3
            jo4 r3 = r3.a
            java.lang.String r3 = r3.d()
            java.lang.String r3 = defpackage.T34.b(r3, r2)
            java.util.HashSet r4 = r0.q0
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L20
            r1.remove()
            goto L20
        L42:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L4b:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L7e
            java.lang.Object r3 = r9.next()
            io4 r3 = (defpackage.C6408io4) r3
            java.lang.String r4 = r0.o0
            if (r4 == 0) goto L6d
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L6d
            java.lang.String r4 = r3.g()
            java.lang.String r5 = r0.o0
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L4b
        L6d:
            Qo4 r4 = new Qo4
            Jy2 r5 = r0.c0
            android.content.Context r5 = r5.a
            GP r6 = r0.j0
            ke3 r7 = r0.n0
            r4.<init>(r5, r6, r3, r7)
            r1.add(r4)
            goto L4b
        L7e:
            int r9 = r1.size()
            r3 = 0
            if (r9 != 0) goto L86
            goto Laa
        L86:
            java.util.Collections.sort(r1)
            java.util.Iterator r9 = r1.iterator()
        L8d:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r9.next()
            Qo4 r4 = (defpackage.Qo4) r4
            androidx.preference.PreferenceScreen r5 = r0.N0()
            r5.W(r4)
            goto L8d
        La1:
            r0.p0 = r1
            int r9 = r1.size()
            if (r9 == 0) goto Laa
            goto Lab
        Laa:
            r2 = r3
        Lab:
            android.widget.TextView r9 = r0.l0
            if (r9 != 0) goto Lb0
            return
        Lb0:
            if (r2 == 0) goto Lb4
            r3 = 8
        Lb4:
            r9.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.L8.a(java.util.Collection):void");
    }
}

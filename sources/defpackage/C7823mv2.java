package defpackage;

import android.content.LocusId;
import android.view.contentcapture.ContentCaptureManager;
import android.view.contentcapture.DataRemovalRequest$Builder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mv2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7823mv2 {
    public static C7823mv2 d;
    public boolean a;
    public V24 b;
    public final ContentCaptureManager c;

    public static void c(String str) {
        if (AX.e().g("dump-captured-content-to-logcat-for-testing")) {
            AbstractC4851eH1.d("ContentCapture", str, new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:            if (defpackage.AX.e().g("dump-captured-content-to-logcat-for-testing") == false) goto L21;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7823mv2(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.Class<android.view.contentcapture.ContentCaptureManager> r0 = android.view.contentcapture.ContentCaptureManager.class
            java.lang.Object r5 = r5.getSystemService(r0)
            android.view.contentcapture.ContentCaptureManager r5 = (android.view.contentcapture.ContentCaptureManager) r5
            r4.c = r5
            r0 = 0
            if (r5 != 0) goto L16
            java.lang.String r5 = "ContentCaptureManager isn't available."
            c(r5)
            goto L77
        L16:
            android.content.ComponentName r1 = defpackage.AbstractC7135kv2.a(r5)     // Catch: java.lang.RuntimeException -> L1b
            goto L2a
        L1b:
            r1 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "ContentCapture"
            java.lang.String r3 = "Error to get component name"
            defpackage.AbstractC4851eH1.a(r1, r3, r2)
            r1 = r0
        L2a:
            if (r1 != 0) goto L32
            java.lang.String r5 = "Service isn't available."
            c(r5)
            goto L77
        L32:
            java.lang.String r2 = "com.google.android.as"
            java.lang.String r1 = r1.getPackageName()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Package doesn't match, current one is "
            r1.<init>(r2)
            android.content.ComponentName r2 = defpackage.AbstractC7135kv2.a(r5)
            java.lang.String r2 = r2.getPackageName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            c(r1)
            boolean r1 = org.chromium.base.BuildInfo.a()
            if (r1 != 0) goto L6a
            AX r1 = defpackage.AX.e()
            java.lang.String r2 = "dump-captured-content-to-logcat-for-testing"
            boolean r1 = r1.g(r2)
            if (r1 != 0) goto L6a
            goto L77
        L6a:
            boolean r5 = defpackage.AbstractC7479lv2.a(r5)
            r4.a = r5
            if (r5 != 0) goto L77
            java.lang.String r5 = "ContentCapture disabled."
            c(r5)
        L77:
            android.view.contentcapture.ContentCaptureManager r5 = r4.c
            if (r5 != 0) goto L83
            V24 r5 = new V24
            r5.<init>(r0, r0)
            r4.b = r5
            goto Ld4
        L83:
            java.util.Set r5 = defpackage.AbstractC5761gv2.a(r5)
            if (r5 != 0) goto L8a
            goto Ld4
        L8a:
            java.util.Iterator r5 = r5.iterator()
            r1 = r0
        L8f:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto Lcd
            java.lang.Object r2 = r5.next()
            android.view.contentcapture.ContentCaptureCondition r2 = (android.view.contentcapture.ContentCaptureCondition) r2
            int r3 = defpackage.AbstractC6105hv2.a(r2)
            r3 = r3 & 2
            if (r3 == 0) goto Lba
            if (r1 != 0) goto Laa
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        Laa:
            android.content.LocusId r2 = defpackage.AbstractC6447iv2.a(r2)
            java.lang.String r2 = defpackage.AbstractC6791jv2.a(r2)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r1.add(r2)
            goto L8f
        Lba:
            if (r0 != 0) goto Lc1
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        Lc1:
            android.content.LocusId r2 = defpackage.AbstractC6447iv2.a(r2)
            java.lang.String r2 = defpackage.AbstractC6791jv2.a(r2)
            r0.add(r2)
            goto L8f
        Lcd:
            V24 r5 = new V24
            r5.<init>(r0, r1)
            r4.b = r5
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7823mv2.<init>(android.content.Context):void");
    }

    public final void a() {
        ContentCaptureManager contentCaptureManager = this.c;
        if (contentCaptureManager == null) {
            return;
        }
        contentCaptureManager.removeData(new DataRemovalRequest$Builder().forEverything().build());
    }

    public final void b(String[] strArr) {
        ContentCaptureManager contentCaptureManager = this.c;
        if (contentCaptureManager == null) {
            return;
        }
        DataRemovalRequest$Builder dataRemovalRequest$Builder = new DataRemovalRequest$Builder();
        for (String str : strArr) {
            dataRemovalRequest$Builder = dataRemovalRequest$Builder.addLocusId(new LocusId(str), 0);
        }
        contentCaptureManager.removeData(dataRemovalRequest$Builder.build());
    }
}

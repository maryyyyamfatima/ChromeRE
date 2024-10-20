package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Iz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1167Iz1 {
    public final C11274wz1 a;

    public C1167Iz1(C11274wz1 c11274wz1) {
        this.a = c11274wz1;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r8) {
        /*
            r7 = this;
            vz1 r0 = new vz1
            r0.<init>(r8)
            wz1 r1 = r7.a
            android.os.Bundle r2 = r1.a
            java.lang.String r3 = "lens_activity_binder"
            r2.putBinder(r3, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r0.<init>(r2)
            java.lang.String r2 = "google://lens"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.setData(r2)
            java.lang.String r2 = "userdebug"
            java.lang.String r3 = android.os.Build.TYPE
            boolean r2 = r2.equals(r3)
            r3 = 0
            if (r2 == 0) goto L53
            java.lang.String r2 = "lens_standalone_entrypoints"
            r4 = 1
            java.lang.reflect.Method r5 = defpackage.AbstractC0884Gu3.b     // Catch: java.lang.Exception -> L47
            if (r5 == 0) goto L4f
            java.lang.reflect.Method r5 = defpackage.AbstractC0884Gu3.c     // Catch: java.lang.Exception -> L47
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L47
            r6[r3] = r2     // Catch: java.lang.Exception -> L47
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L47
            r6[r4] = r2     // Catch: java.lang.Exception -> L47
            r2 = 0
            java.lang.Object r2 = r5.invoke(r2, r6)     // Catch: java.lang.Exception -> L47
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L47
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L47
            goto L50
        L47:
            r2 = move-exception
            java.lang.String r5 = "SystemProperties"
            java.lang.String r6 = "get error"
            android.util.Log.e(r5, r6, r2)
        L4f:
            r2 = r3
        L50:
            if (r2 == 0) goto L53
            r3 = r4
        L53:
            if (r3 == 0) goto L58
            java.lang.String r2 = "com.google.android.apps.search.lens.standalone"
            goto L5a
        L58:
            java.lang.String r2 = "com.google.android.googlequicksearchbox"
        L5a:
            r0.setPackage(r2)
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.String r4 = "start_activity_time_nanos"
            android.os.Bundle r1 = r1.a
            r1.putLong(r4, r2)
            java.lang.String r2 = "lens_activity_params"
            r0.putExtra(r2, r1)
            java.lang.String r2 = "handover_session_id"
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L88
            long r3 = r1.getLong(r2)
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L88
            long r1 = r1.getLong(r2)
            java.lang.String r3 = "handover-session-id"
            r0.putExtra(r3, r1)
        L88:
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            r1 = 32768(0x8000, float:4.5918E-41)
            r0.addFlags(r1)
            r8.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1167Iz1.a(android.content.Context):void");
    }
}

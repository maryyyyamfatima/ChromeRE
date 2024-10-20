package defpackage;

import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NM0 extends RM0 {
    public final Callback d;
    public final /* synthetic */ SM0 e;

    @Override // defpackage.RM0
    public final int b() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NM0(SM0 sm0, int i, String str, C2687Ur2 c2687Ur2) {
        super(i, str);
        this.e = sm0;
        this.d = c2687Ur2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.nio.ByteBuffer c() {
        /*
            r17 = this;
            r1 = r17
            SM0 r2 = r1.e
            java.lang.String r3 = "FilePTDS"
            java.io.File r4 = r1.c
            r5 = 2
            r6 = 1
            r7 = 0
            r8 = 0
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            r11.<init>()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.String r12 = r4.getPath()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            r11.append(r12)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.String r12 = ".new"
            r11.append(r12)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            r0.<init>(r11)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.io.File r11 = new java.io.File     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            r12.<init>()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.String r13 = r4.getPath()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            r12.append(r13)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.String r13 = ".bak"
            r12.append(r13)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.String r12 = r12.toString()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            r11.<init>(r12)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            boolean r12 = r11.exists()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            if (r12 == 0) goto L4d
            defpackage.C0575El.e(r11, r4)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
        L4d:
            boolean r11 = r0.exists()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            if (r11 == 0) goto L72
            boolean r11 = r4.exists()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            if (r11 == 0) goto L72
            boolean r11 = r0.delete()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            if (r11 != 0) goto L72
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.String r12 = "Failed to delete outdated new file "
            r11.<init>(r12)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            r11.append(r0)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.String r0 = r11.toString()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.lang.String r11 = "AtomicFile"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
        L72:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            r0.<init>(r4)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.nio.channels.FileChannel r11 = r0.getChannel()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.nio.channels.FileChannel$MapMode r12 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            long r13 = r11.position()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            long r15 = r11.size()     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.nio.MappedByteBuffer r11 = r11.map(r12, r13, r15)     // Catch: java.io.IOException -> La9 java.io.FileNotFoundException -> Lc4
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.io.IOException -> La3 java.io.FileNotFoundException -> La6
            java.lang.String r12 = "Tabs.PersistedTabData.Storage.LoadTime.%s"
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch: java.io.IOException -> La3 java.io.FileNotFoundException -> La6
            r2.getClass()     // Catch: java.io.IOException -> La3 java.io.FileNotFoundException -> La6
            java.lang.String r14 = "File"
            r13[r7] = r14     // Catch: java.io.IOException -> La3 java.io.FileNotFoundException -> La6
            java.lang.String r0 = java.lang.String.format(r0, r12, r13)     // Catch: java.io.IOException -> La3 java.io.FileNotFoundException -> La6
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.io.IOException -> La3 java.io.FileNotFoundException -> La6
            long r12 = r12 - r9
            defpackage.EI2.n(r12, r0)     // Catch: java.io.IOException -> La3 java.io.FileNotFoundException -> La6
            goto Ldf
        La3:
            r0 = move-exception
            r9 = r6
            goto Lac
        La6:
            r0 = move-exception
            r9 = r6
            goto Lc7
        La9:
            r0 = move-exception
            r9 = r7
            r11 = r8
        Lac:
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r7] = r4
            java.lang.String r0 = r0.getMessage()
            r5[r6] = r0
            java.lang.String r0 = "IOException while attempting to restore %s. Details: %s"
            java.lang.String r0 = java.lang.String.format(r10, r0, r5)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            defpackage.AbstractC4851eH1.a(r3, r0, r4)
            goto Lde
        Lc4:
            r0 = move-exception
            r9 = r7
            r11 = r8
        Lc7:
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r7] = r4
            java.lang.String r0 = r0.getMessage()
            r5[r6] = r0
            java.lang.String r0 = "FileNotFoundException while attempting to restore  %s. Details: %s"
            java.lang.String r0 = java.lang.String.format(r10, r0, r5)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            defpackage.AbstractC4851eH1.a(r3, r0, r4)
        Lde:
            r6 = r9
        Ldf:
            r2.getClass()
            java.lang.String r0 = "Tabs.PersistedTabData.Storage.Restore.File"
            defpackage.EI2.b(r0, r6)
            if (r6 == 0) goto Lea
            r8 = r11
        Lea:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.NM0.c():java.nio.ByteBuffer");
    }

    @Override // defpackage.RM0
    public final AbstractC0185Bl a() {
        return new MM0(this);
    }

    @Override // defpackage.RM0
    public final boolean equals(Object obj) {
        if (obj instanceof NM0) {
            return super.equals(obj);
        }
        return false;
    }
}

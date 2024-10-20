package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ny, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8181ny implements VO2 {
    public static final C8752pe2 b = C8752pe2.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final C8752pe2 c = new C8752pe2("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, C8752pe2.e);
    public final C3492aK1 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x0026, B:18:0x0052, B:21:0x0066, B:23:0x006c, B:43:0x005b, B:41:0x005e, B:36:0x0061), top: B:8:0x0026 }] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.FileOutputStream] */
    @Override // defpackage.LA0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r7, java.io.File r8, defpackage.C0543Ee2 r9) {
        /*
            r6 = this;
            JO2 r7 = (defpackage.JO2) r7
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r7 = r7.get()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            pe2 r1 = defpackage.C8181ny.c
            java.lang.Object r2 = r9.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r7.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r7.getWidth()
            r7.getHeight()
            int r3 = defpackage.UH1.a     // Catch: java.lang.Throwable -> L80
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L80
            pe2 r3 = defpackage.C8181ny.b     // Catch: java.lang.Throwable -> L80
            java.lang.Object r3 = r9.c(r3)     // Catch: java.lang.Throwable -> L80
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L80
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L80
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5f
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5f
            aK1 r8 = r6.a
            if (r8 == 0) goto L4b
            gD r4 = new gD     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r4.<init>(r5, r8)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            goto L4c
        L47:
            r7 = move-exception
            goto L59
        L49:
            r4 = r5
            goto L5f
        L4b:
            r4 = r5
        L4c:
            r7.compress(r2, r3, r4)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5f
            r4.close()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5f
            r4.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L80
        L55:
            r8 = 1
            goto L65
        L57:
            r7 = move-exception
            r5 = r4
        L59:
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.io.IOException -> L5e java.lang.Throwable -> L80
        L5e:
            throw r7     // Catch: java.lang.Throwable -> L80
        L5f:
            if (r4 == 0) goto L64
            r4.close()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L80
        L64:
            r8 = 0
        L65:
            r3 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L7f
            java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L80
            defpackage.AbstractC10296u74.c(r7)     // Catch: java.lang.Throwable -> L80
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L80
            java.lang.Object r9 = r9.c(r1)     // Catch: java.lang.Throwable -> L80
            java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L80
            r7.hasAlpha()     // Catch: java.lang.Throwable -> L80
        L7f:
            return r8
        L80:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8181ny.a(java.lang.Object, java.io.File, Ee2):boolean");
    }

    public C8181ny(C3492aK1 c3492aK1) {
        this.a = c3492aK1;
    }

    @Override // defpackage.VO2
    public final GA0 b(C0543Ee2 c0543Ee2) {
        return GA0.TRANSFORMED;
    }
}

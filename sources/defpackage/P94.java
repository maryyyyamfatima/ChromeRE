package defpackage;

import android.media.MediaMetadataRetriever;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class P94 implements RO2 {
    public static final C8752pe2 d = new C8752pe2("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new G94());
    public static final C8752pe2 e = new C8752pe2("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new H94());
    public static final L94 f = new L94();
    public final M94 a;
    public final InterfaceC11610xy b;
    public final L94 c = f;

    @Override // defpackage.RO2
    public final boolean a(Object obj, C0543Ee2 c0543Ee2) {
        return true;
    }

    public P94(InterfaceC11610xy interfaceC11610xy, M94 m94) {
        this.b = interfaceC11610xy;
        this.a = m94;
    }

    @Override // defpackage.RO2
    public final JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        long longValue = ((Long) c0543Ee2.c(d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(Pd4.a("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
        Integer num = (Integer) c0543Ee2.c(e);
        if (num == null) {
            num = 2;
        }
        AbstractC7809mt0 abstractC7809mt0 = (AbstractC7809mt0) c0543Ee2.c(AbstractC7809mt0.f);
        if (abstractC7809mt0 == null) {
            abstractC7809mt0 = AbstractC7809mt0.e;
        }
        AbstractC7809mt0 abstractC7809mt02 = abstractC7809mt0;
        this.c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.a.a(mediaMetadataRetriever, obj);
            return C12296zy.c(c(mediaMetadataRetriever, longValue, num.intValue(), i, i2, abstractC7809mt02), this.b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.close();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(android.media.MediaMetadataRetriever r9, long r10, int r12, int r13, int r14, defpackage.AbstractC7809mt0 r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L51
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L51
            if (r14 == r0) goto L51
            lt0 r0 = defpackage.AbstractC7809mt0.d
            if (r15 == r0) goto L51
            r0 = 18
            java.lang.String r0 = r9.extractMetadata(r0)     // Catch: java.lang.Throwable -> L51
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L51
            r1 = 19
            java.lang.String r1 = r9.extractMetadata(r1)     // Catch: java.lang.Throwable -> L51
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L51
            r2 = 24
            java.lang.String r2 = r9.extractMetadata(r2)     // Catch: java.lang.Throwable -> L51
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L51
            r3 = 90
            if (r2 == r3) goto L36
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 != r3) goto L39
        L36:
            r8 = r1
            r1 = r0
            r0 = r8
        L39:
            float r13 = r15.b(r0, r1, r13, r14)     // Catch: java.lang.Throwable -> L51
            float r14 = (float) r0     // Catch: java.lang.Throwable -> L51
            float r14 = r14 * r13
            int r6 = java.lang.Math.round(r14)     // Catch: java.lang.Throwable -> L51
            float r14 = (float) r1     // Catch: java.lang.Throwable -> L51
            float r13 = r13 * r14
            int r7 = java.lang.Math.round(r13)     // Catch: java.lang.Throwable -> L51
            r2 = r9
            r3 = r10
            r5 = r12
            android.graphics.Bitmap r13 = defpackage.F94.a(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L51
            goto L52
        L51:
            r13 = 0
        L52:
            if (r13 != 0) goto L58
            android.graphics.Bitmap r13 = r9.getFrameAtTime(r10, r12)
        L58:
            if (r13 == 0) goto L5b
            return r13
        L5b:
            O94 r9 = new O94
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.P94.c(android.media.MediaMetadataRetriever, long, int, int, int, mt0):android.graphics.Bitmap");
    }
}

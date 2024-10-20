package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pt0 */
/* loaded from: classes.dex */
public final class C8840pt0 {
    public static final C8752pe2 f = C8752pe2.a(EnumC0041Ai0.PREFER_ARGB_8888, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final C8752pe2 g = new C8752pe2("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C8752pe2.e);
    public static final C8752pe2 h;
    public static final C8752pe2 i;
    public static final Set j;
    public static final C8153nt0 k;
    public static final ArrayDeque l;
    public final InterfaceC11610xy a;
    public final DisplayMetrics b;
    public final C3492aK1 c;
    public final List d;
    public final O51 e = O51.a();

    static {
        C7121kt0 c7121kt0 = AbstractC7809mt0.a;
        Boolean bool = Boolean.FALSE;
        h = C8752pe2.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = C8752pe2.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new C8153nt0();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = AbstractC10296u74.a;
        l = new ArrayDeque(0);
    }

    public C8840pt0(ArrayList arrayList, DisplayMetrics displayMetrics, InterfaceC11610xy interfaceC11610xy, C3492aK1 c3492aK1) {
        this.d = arrayList;
        AbstractC6464iy2.b(displayMetrics);
        this.b = displayMetrics;
        AbstractC6464iy2.b(interfaceC11610xy);
        this.a = interfaceC11610xy;
        AbstractC6464iy2.b(c3492aK1);
        this.c = c3492aK1;
    }

    public final C12296zy a(InterfaceC3026Xh1 interfaceC3026Xh1, int i2, int i3, C0543Ee2 c0543Ee2, InterfaceC8497ot0 interfaceC8497ot0) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.c.c(byte[].class, 65536);
        synchronized (C8840pt0.class) {
            arrayDeque = l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        EnumC0041Ai0 enumC0041Ai0 = (EnumC0041Ai0) c0543Ee2.c(f);
        EnumC1942Oy2 enumC1942Oy2 = (EnumC1942Oy2) c0543Ee2.c(g);
        AbstractC7809mt0 abstractC7809mt0 = (AbstractC7809mt0) c0543Ee2.c(AbstractC7809mt0.f);
        boolean booleanValue = ((Boolean) c0543Ee2.c(h)).booleanValue();
        C8752pe2 c8752pe2 = i;
        try {
            C12296zy c = C12296zy.c(b(interfaceC3026Xh1, options2, abstractC7809mt0, enumC0041Ai0, enumC1942Oy2, c0543Ee2.c(c8752pe2) != null && ((Boolean) c0543Ee2.c(c8752pe2)).booleanValue(), i2, i3, booleanValue, interfaceC8497ot0), this.a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.c.g(bArr);
            return c;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = l;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.c.g(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0346  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(defpackage.InterfaceC3026Xh1 r26, android.graphics.BitmapFactory.Options r27, defpackage.AbstractC7809mt0 r28, defpackage.EnumC0041Ai0 r29, defpackage.EnumC1942Oy2 r30, boolean r31, int r32, int r33, boolean r34, defpackage.InterfaceC8497ot0 r35) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8840pt0.b(Xh1, android.graphics.BitmapFactory$Options, mt0, Ai0, Oy2, boolean, int, int, boolean, ot0):android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:            throw r0;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(defpackage.InterfaceC3026Xh1 r4, android.graphics.BitmapFactory.Options r5, defpackage.InterfaceC8497ot0 r6, defpackage.InterfaceC11610xy r7) {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.a()
            r4.c()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.AbstractC10075tV3.b
            r3.lock()
            android.graphics.Bitmap r4 = r4.b(r5)     // Catch: java.lang.Throwable -> L1d java.lang.IllegalArgumentException -> L1f
            r3.unlock()
            return r4
        L1d:
            r4 = move-exception
            goto L3a
        L1f:
            r3 = move-exception
            java.io.IOException r0 = e(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L39
            r7.b(r1)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L38
            r1 = 0
            r5.inBitmap = r1     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L38
            android.graphics.Bitmap r4 = c(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L1d java.io.IOException -> L38
            java.util.concurrent.locks.Lock r5 = defpackage.AbstractC10075tV3.b
            r5.unlock()
            return r4
        L38:
            throw r0     // Catch: java.lang.Throwable -> L1d
        L39:
            throw r0     // Catch: java.lang.Throwable -> L1d
        L3a:
            java.util.concurrent.locks.Lock r5 = defpackage.AbstractC10075tV3.b
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8840pt0.c(Xh1, android.graphics.BitmapFactory$Options, ot0, xy):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String a = AbstractC9307rF1.a(" (", bitmap.getAllocationByteCount(), ")");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        String valueOf = String.valueOf(bitmap.getConfig());
        StringBuilder sb = new StringBuilder("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        return Y5.a(sb, valueOf, a);
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        String d = d(options.inBitmap);
        StringBuilder sb = new StringBuilder("Exception decoding bitmap, outWidth: ");
        sb.append(i2);
        sb.append(", outHeight: ");
        sb.append(i3);
        sb.append(", outMimeType: ");
        return new IOException(AbstractC10204ts.a(sb, str, ", inBitmap: ", d), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }
}

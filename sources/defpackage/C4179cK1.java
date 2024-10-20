package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cK1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4179cK1 implements InterfaceC11610xy {
    public static final Bitmap.Config f = Bitmap.Config.ARGB_8888;
    public final InterfaceC5898hK1 a;
    public final Set b;
    public final C3836bK1 c;
    public final long d;
    public long e;

    @Override // defpackage.InterfaceC11610xy
    public final synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                ((C10124te3) this.a).getClass();
                if (AbstractC10296u74.c(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                    ((C10124te3) this.a).getClass();
                    int c = AbstractC10296u74.c(bitmap);
                    ((C10124te3) this.a).f(bitmap);
                    this.c.getClass();
                    this.e += c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((C10124te3) this.a).e(bitmap);
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        String.valueOf(this.a);
                    }
                    g(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((C10124te3) this.a).e(bitmap);
                bitmap.isMutable();
                this.b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC11610xy
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap f2 = f(i, i2, config);
        if (f2 != null) {
            f2.eraseColor(0);
            return f2;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.InterfaceC11610xy
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap f2 = f(i, i2, config);
        if (f2 != null) {
            return f2;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final synchronized Bitmap f(int i, int i2, Bitmap.Config config) {
        Bitmap b;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + String.valueOf(config) + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            b = ((C10124te3) this.a).b(i, i2, config != null ? config : f);
            int i3 = 8;
            if (b == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    ((C10124te3) this.a).getClass();
                    char[] cArr = AbstractC10296u74.a;
                    int i4 = i * i2;
                    int i5 = AbstractC9610s74.a[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
                    C10124te3.c((i5 != 1 ? (i5 == 2 || i5 == 3) ? 2 : i5 != 4 ? 4 : 8 : 1) * i4, config);
                }
            } else {
                long j = this.e;
                ((C10124te3) this.a).getClass();
                this.e = j - AbstractC10296u74.c(b);
                this.c.getClass();
                b.setHasAlpha(true);
                b.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((C10124te3) this.a).getClass();
                char[] cArr2 = AbstractC10296u74.a;
                int i6 = i * i2;
                int i7 = AbstractC9610s74.a[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
                if (i7 == 1) {
                    i3 = 1;
                } else if (i7 == 2 || i7 == 3) {
                    i3 = 2;
                } else if (i7 != 4) {
                    i3 = 4;
                }
                C10124te3.c(i3 * i6, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                String.valueOf(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    @Override // defpackage.InterfaceC11610xy
    public final void e() {
        g(0L);
    }

    @Override // defpackage.InterfaceC11610xy
    public final void d(int i) {
        if (i >= 40 || i >= 20) {
            e();
        } else if (i >= 20 || i == 15) {
            g(this.d / 2);
        }
    }

    public final synchronized void g(long j) {
        while (this.e > j) {
            C10124te3 c10124te3 = (C10124te3) this.a;
            Bitmap bitmap = (Bitmap) c10124te3.b.c();
            if (bitmap != null) {
                c10124te3.a(Integer.valueOf(AbstractC10296u74.c(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    String.valueOf(this.a);
                }
                this.e = 0L;
                return;
            }
            this.c.getClass();
            long j2 = this.e;
            ((C10124te3) this.a).getClass();
            this.e = j2 - AbstractC10296u74.c(bitmap);
            if (Log.isLoggable("LruBitmapPool", 3)) {
                ((C10124te3) this.a).e(bitmap);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                String.valueOf(this.a);
            }
            bitmap.recycle();
        }
    }

    public C4179cK1(long j) {
        C10124te3 c10124te3 = new C10124te3();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j;
        this.a = c10124te3;
        this.b = unmodifiableSet;
        this.c = new C3836bK1();
    }
}

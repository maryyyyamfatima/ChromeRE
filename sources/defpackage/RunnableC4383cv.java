package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC4383cv extends Drawable implements Runnable, Animatable, Handler.Callback {
    public static final byte[] a0 = "NETSCAPE2.0".getBytes();
    public static Paint b0;
    public static Paint c0;
    public static HandlerThreadC4040bv d0;
    public static Handler e0;
    public int A;
    public int B;
    public int C;
    public boolean F;
    public int G;
    public byte[] K;
    public boolean L;
    public int[] M;
    public int N;
    public long O;
    public boolean P;
    public int Q;
    public int R;
    public boolean S;
    public boolean V;
    public boolean W;
    public final C5070ev a;
    public final byte[] g;
    public int h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public final Bitmap m;
    public final int[] n;
    public boolean o;
    public float p;
    public volatile boolean q;
    public volatile boolean r;
    public int t;
    public boolean u;
    public int[] v;
    public int[] w;
    public boolean x;
    public int y;
    public int z;
    public volatile boolean s = true;
    public final byte[] D = new byte[256];
    public int E = 2;
    public final short[] H = new short[4096];
    public final byte[] I = new byte[4096];

    /* renamed from: J, reason: collision with root package name */
    public final byte[] f11503J = new byte[4097];
    public final boolean T = true;
    public final Handler U = new Handler(Looper.getMainLooper(), this);
    public int X = 0;
    public int Y = 0;
    public boolean Z = true;

    public void c() {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public RunnableC4383cv(C5070ev c5070ev, Bitmap.Config config) {
        if (d0 == null) {
            HandlerThreadC4040bv handlerThreadC4040bv = new HandlerThreadC4040bv();
            d0 = handlerThreadC4040bv;
            handlerThreadC4040bv.start();
            e0 = new Handler(d0.getLooper(), d0);
        }
        if (b0 == null) {
            b0 = new Paint(2);
            Paint paint = new Paint(2);
            c0 = paint;
            paint.setFilterBitmap(true);
        }
        this.a = c5070ev;
        this.g = c5070ev.a;
        this.h = c5070ev.d;
        int i = c5070ev.b;
        this.i = i;
        this.C = i;
        this.A = i;
        int i2 = c5070ev.c;
        this.j = i2;
        this.B = i2;
        this.t = c5070ev.i;
        this.q = c5070ev.f;
        if (this.q) {
            return;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
            this.m = createBitmap;
            if (createBitmap == null) {
                throw new OutOfMemoryError("Cannot allocate bitmap");
            }
            int i3 = i * i2;
            this.n = new int[i3];
            this.K = new byte[i3];
            this.k = i2;
            this.l = i2;
            Handler handler = e0;
            handler.sendMessage(handler.obtainMessage(10, this));
        } catch (OutOfMemoryError unused) {
            this.q = true;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.k = rect.width();
        int height = rect.height();
        this.l = height;
        int i = this.k;
        int i2 = this.i;
        boolean z = (i == i2 || height == this.j) ? false : true;
        this.o = z;
        if (z) {
            this.p = Math.max(i / i2, height / this.j);
        }
        if (this.q) {
            return;
        }
        Handler handler = e0;
        handler.sendMessage(handler.obtainMessage(12, this));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            stop();
        } else if (visible || z2) {
            start();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.q || this.k == 0 || this.l == 0 || !this.V) {
            return;
        }
        if (this.o) {
            canvas.save();
            float f = this.p;
            canvas.scale(f, f, 0.0f, 0.0f);
            canvas.drawBitmap(this.m, 0.0f, 0.0f, c0);
            canvas.restore();
        } else {
            canvas.drawBitmap(this.m, 0.0f, 0.0f, b0);
        }
        if (this.P) {
            if (this.S) {
                return;
            }
            long max = Math.max(this.O + this.Q, SystemClock.uptimeMillis() + 5);
            this.O = max;
            scheduleSelf(this, max);
            return;
        }
        if (!this.r) {
            start();
        } else {
            unscheduleSelf(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.j;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.P;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.P) {
            return;
        }
        this.P = true;
        if (!this.s) {
            this.r = true;
        }
        this.O = SystemClock.uptimeMillis();
        run();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.P) {
            unscheduleSelf(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.T) {
            super.scheduleSelf(runnable, j);
            this.S = true;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.P = false;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.r) {
            return;
        }
        Handler handler = e0;
        handler.sendMessage(handler.obtainMessage(10, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0230, code lost:            r27.q = true;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8, types: [int] */
    /* JADX WARN: Type inference failed for: r16v9, types: [int] */
    /* JADX WARN: Type inference failed for: r17v3, types: [int] */
    /* JADX WARN: Type inference failed for: r18v4, types: [int] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v42, types: [int] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v20, types: [int] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.RunnableC4383cv r27) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC4383cv.b(cv):void");
    }

    public final int d() {
        int i = this.h;
        int i2 = i + 1;
        byte[] bArr = this.g;
        int i3 = bArr[i] & 255;
        this.h = i2 + 1;
        return i3 | ((bArr[i2] & 255) << 8);
    }

    public final void e() {
        int i;
        do {
            int i2 = this.h;
            int i3 = i2 + 1;
            i = this.g[i2] & 255;
            this.h = i3 + i;
        } while (i > 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 11) {
            return false;
        }
        this.Q = message.arg1;
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            int[] iArr = this.n;
            int i = this.i;
            bitmap.setPixels(iArr, 0, i, 0, 0, i, this.j);
            c();
            this.V = true;
            this.S = false;
            invalidateSelf();
        }
        return true;
    }
}

package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.os.Looper;
import java.util.Set;
import org.chromium.base.Callback;
import org.chromium.components.image_fetcher.ImageFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xi1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3031Xi1 extends ImageFetcher {
    public ImageFetcher b;
    public C6461iy c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3031Xi1(ImageFetcher imageFetcher, C1241Jo0 c1241Jo0, int i) {
        super(imageFetcher);
        Runtime runtime = Runtime.getRuntime();
        C6461iy c6461iy = new C6461iy(c1241Jo0, Math.min((int) Math.max(1.0f, ((float) (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory()))) * 0.125f), i));
        this.c = c6461iy;
        this.b = imageFetcher;
        imageFetcher.e();
        if (this.b.e() == 0) {
            this.d = 2;
        } else if (this.b.e() == 1) {
            this.d = 3;
        } else {
            this.d = 2;
        }
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void b() {
        ImageFetcher imageFetcher = this.b;
        if (imageFetcher != null) {
            imageFetcher.b();
            this.b = null;
        }
        C6461iy c6461iy = this.c;
        if (c6461iy != null) {
            C1111Io0 c1111Io0 = c6461iy.b;
            Set set = c6461iy.c.a;
            if (set.contains(c1111Io0)) {
                c1111Io0.a = null;
                set.remove(c1111Io0);
            }
            c6461iy.b = null;
            this.c = null;
        }
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void c(C0037Ah1 c0037Ah1, Callback callback) {
        this.b.c(c0037Ah1, callback);
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void a() {
        this.c.b().f(-1);
        Looper.myQueue().addIdleHandler(new C5775gy());
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final int e() {
        return this.d;
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void d(final C0037Ah1 c0037Ah1, final Callback callback) {
        Bitmap a;
        if (this.c == null) {
            a = null;
        } else {
            a = this.c.a(f(c0037Ah1.a, c0037Ah1.e, c0037Ah1.c, c0037Ah1.d));
        }
        if (a == null) {
            this.b.d(c0037Ah1, new Callback() { // from class: Wi1
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    C3031Xi1 c3031Xi1 = C3031Xi1.this;
                    c3031Xi1.getClass();
                    C0037Ah1 c0037Ah12 = c0037Ah1;
                    String str = c0037Ah12.a;
                    if (bitmap != null && c3031Xi1.c != null) {
                        c3031Xi1.c.c(bitmap, C3031Xi1.f(str, c0037Ah12.e, c0037Ah12.c, c0037Ah12.d));
                    }
                    callback.onResult(bitmap);
                }
            });
            return;
        }
        this.a.getClass();
        N.Mlt0uwKm(c0037Ah1.b, 8);
        callback.onResult(a);
    }

    public static String f(String str, boolean z, int i, int i2) {
        return str + "/" + (z ? 1 : 0) + "/" + i + "/" + i2;
    }
}

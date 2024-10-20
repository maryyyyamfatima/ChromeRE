package defpackage;

import J.N;
import android.graphics.Bitmap;
import org.chromium.base.Callback;
import org.chromium.components.image_fetcher.ImageFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: b32, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3745b32 extends ImageFetcher {
    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void a() {
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void b() {
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final int e() {
        return 0;
    }

    public C3745b32(C0557Eh1 c0557Eh1) {
        super(c0557Eh1);
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void d(final C0037Ah1 c0037Ah1, final Callback callback) {
        final long currentTimeMillis = System.currentTimeMillis();
        N.M3LHmG_m(this.a.a, 0, c0037Ah1.a, c0037Ah1.b, c0037Ah1.c, c0037Ah1.d, c0037Ah1.f, new C0427Dh1(c0037Ah1, new Callback() { // from class: a32
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C3745b32 c3745b32 = C3745b32.this;
                c3745b32.getClass();
                callback.onResult((Bitmap) obj);
                String str = c0037Ah1.b;
                c3745b32.a.getClass();
                N.MtnQwbxo(str, currentTimeMillis);
            }
        }));
    }

    @Override // org.chromium.components.image_fetcher.ImageFetcher
    public final void c(C0037Ah1 c0037Ah1, Callback callback) {
        N.Mno1Q7sp(this.a.a, 0, c0037Ah1.a, c0037Ah1.b, c0037Ah1.f, new C0297Ch1(callback));
    }
}

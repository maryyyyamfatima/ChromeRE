package defpackage;

import org.chromium.base.Callback;
import org.chromium.components.image_fetcher.ImageFetcher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10316uB1 {
    public final ImageFetcher a;
    public boolean b;
    public boolean c;
    public int d;

    public C10316uB1(ImageFetcher imageFetcher) {
        this.a = imageFetcher;
    }

    public final void a(final Callback callback, String str) {
        this.a.c(C0037Ah1.b(str, "LightweightReactions"), new Callback() { // from class: rB1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                Callback.this.onResult((C5070ev) obj);
            }
        });
    }
}

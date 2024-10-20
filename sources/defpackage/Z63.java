package defpackage;

import android.graphics.Bitmap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Z63 implements Runnable {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ C3426a73 g;

    public Z63(C3426a73 c3426a73, Bitmap bitmap) {
        this.g = c3426a73;
        this.a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.j.onResult(this.a);
    }
}

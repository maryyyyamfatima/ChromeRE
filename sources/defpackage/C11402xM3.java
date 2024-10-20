package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xM3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11402xM3 implements LargeIconBridge.LargeIconCallback {
    public final WeakReference a;
    public final Runnable g;
    public final /* synthetic */ C11745yM3 h;

    public C11402xM3(C11745yM3 c11745yM3, PL3 pl3, TL3 tl3) {
        this.h = c11745yM3;
        this.a = new WeakReference(pl3);
        this.g = tl3;
    }

    @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
    public final void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2) {
        WeakReference weakReference = this.a;
        PL3 pl3 = (PL3) weakReference.get();
        if (pl3 != null) {
            pl3.d = i2;
            C11745yM3 c11745yM3 = this.h;
            C7722me3 c7722me3 = pl3.a;
            if (bitmap == null) {
                c11745yM3.getClass();
                if (c7722me3.d != 6) {
                    C6964kR2 c6964kR2 = c11745yM3.c;
                    c6964kR2.e.setColor(i);
                    pl3.e = new BitmapDrawable(c11745yM3.a.getResources(), c6964kR2.b(c7722me3.b.i(), false));
                    pl3.f = null;
                    pl3.c = z ? 3 : 2;
                }
            } else {
                c11745yM3.getClass();
                float width = c11745yM3.g * bitmap.getWidth();
                int i3 = c11745yM3.e;
                int round = Math.round(width / i3);
                if (c7722me3.d == 6) {
                    round = i3 / 2;
                }
                C5590gR2 c5590gR2 = new C5590gR2(c11745yM3.a.getResources(), bitmap);
                c5590gR2.b(round);
                c5590gR2.d.setAntiAlias(true);
                c5590gR2.invalidateSelf();
                c5590gR2.setFilterBitmap(true);
                pl3.e = c5590gR2;
                pl3.f = null;
                pl3.c = 1;
            }
            Runnable runnable = this.g;
            if (runnable != null) {
                runnable.run();
            }
        }
        weakReference.clear();
    }
}

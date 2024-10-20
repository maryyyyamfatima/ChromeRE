package defpackage;

import android.graphics.Bitmap;
import org.chromium.components.favicon.LargeIconBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class Ul4 implements LargeIconBridge.LargeIconCallback {
    public final /* synthetic */ Wl4 a;

    public /* synthetic */ Ul4(Wl4 wl4) {
        this.a = wl4;
    }

    @Override // org.chromium.components.favicon.LargeIconBridge.LargeIconCallback
    public final void onLargeIconAvailable(Bitmap bitmap, int i, boolean z, int i2) {
        Wl4 wl4 = this.a;
        if (bitmap == null) {
            int i3 = wl4.b;
            bitmap = new C6964kR2(i3, i3, i3 / 2, i, wl4.c).b(wl4.a.i(), false);
        }
        wl4.d.onResult(bitmap);
    }
}

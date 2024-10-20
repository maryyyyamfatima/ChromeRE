package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: my, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7837my implements InterfaceC8852pv0 {
    public final int a;
    public Bitmap g;
    public final Rect h = new Rect();
    public Callback i;

    public C7837my(int i) {
        this.a = i;
    }

    public final void c(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        this.g = bitmap;
        this.h.set(0, 0, bitmap.getWidth(), this.g.getHeight());
    }

    @Override // defpackage.InterfaceC8852pv0
    public final void b() {
        Bitmap bitmap;
        if (this.i == null || (bitmap = this.g) == null) {
            return;
        }
        this.i.onResult(new C9880sv0(bitmap, false, this.h, YO2.a(null)));
        this.g = null;
    }

    @Override // defpackage.InterfaceC8852pv0
    public final void a(C9195qv0 c9195qv0) {
        this.i = c9195qv0;
    }
}

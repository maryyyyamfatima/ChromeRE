package defpackage;

import android.content.res.AssetManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ok, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8442ok implements InterfaceC8374oY1, InterfaceC8098nk {
    public final AssetManager a;

    @Override // defpackage.InterfaceC8374oY1
    public final void a() {
    }

    public C8442ok(AssetManager assetManager) {
        this.a = assetManager;
    }

    @Override // defpackage.InterfaceC8374oY1
    public final InterfaceC8030nY1 c(C3727b02 c3727b02) {
        return new C9128qk(this.a, this);
    }

    @Override // defpackage.InterfaceC8098nk
    public final InterfaceC3145Yf0 b(AssetManager assetManager, String str) {
        return new C8313oM0(assetManager, str);
    }
}

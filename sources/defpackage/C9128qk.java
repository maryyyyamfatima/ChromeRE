package defpackage;

import android.content.res.AssetManager;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9128qk implements InterfaceC8030nY1 {
    public final AssetManager a;
    public final InterfaceC8098nk b;

    @Override // defpackage.InterfaceC8030nY1
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        Uri uri = (Uri) obj;
        return new C7686mY1(new R82(uri), this.b.b(this.a, uri.toString().substring(22)));
    }

    public C9128qk(AssetManager assetManager, InterfaceC8098nk interfaceC8098nk) {
        this.a = assetManager;
        this.b = interfaceC8098nk;
    }
}

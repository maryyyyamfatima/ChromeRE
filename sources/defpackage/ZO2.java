package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ZO2 implements InterfaceC8374oY1 {
    public final Resources a;

    @Override // defpackage.InterfaceC8374oY1
    public final void a() {
    }

    public ZO2(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.InterfaceC8374oY1
    public final InterfaceC8030nY1 c(C3727b02 c3727b02) {
        return new C5236fP2(this.a, c3727b02.b(Uri.class, AssetFileDescriptor.class));
    }
}

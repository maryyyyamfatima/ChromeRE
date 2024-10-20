package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cP2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4205cP2 implements InterfaceC8374oY1 {
    public final Resources a;

    @Override // defpackage.InterfaceC8374oY1
    public final void a() {
    }

    public C4205cP2(Resources resources) {
        this.a = resources;
    }

    @Override // defpackage.InterfaceC8374oY1
    public final InterfaceC8030nY1 c(C3727b02 c3727b02) {
        return new C5236fP2(this.a, c3727b02.b(Uri.class, InputStream.class));
    }
}

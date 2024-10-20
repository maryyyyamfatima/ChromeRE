package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rn3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9492rn3 implements InterfaceC8374oY1 {
    @Override // defpackage.InterfaceC8374oY1
    public final void a() {
    }

    @Override // defpackage.InterfaceC8374oY1
    public final InterfaceC8030nY1 c(C3727b02 c3727b02) {
        return new C10178tn3(c3727b02.b(Uri.class, ParcelFileDescriptor.class));
    }
}

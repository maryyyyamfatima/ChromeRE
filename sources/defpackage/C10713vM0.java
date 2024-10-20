package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10713vM0 implements InterfaceC11742yM0 {
    @Override // defpackage.InterfaceC11742yM0
    public final void c(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    @Override // defpackage.InterfaceC11742yM0
    public final Object b(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    @Override // defpackage.InterfaceC11742yM0
    public final Class a() {
        return ParcelFileDescriptor.class;
    }
}

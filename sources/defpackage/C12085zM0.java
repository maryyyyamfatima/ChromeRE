package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zM0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12085zM0 implements InterfaceC11742yM0 {
    @Override // defpackage.InterfaceC11742yM0
    public final void c(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // defpackage.InterfaceC11742yM0
    public final Object b(File file) {
        return new FileInputStream(file);
    }

    @Override // defpackage.InterfaceC11742yM0
    public final Class a() {
        return InputStream.class;
    }
}

package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BM0 implements InterfaceC8030nY1 {
    public final InterfaceC11742yM0 a;

    @Override // defpackage.InterfaceC8030nY1
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        File file = (File) obj;
        return new C7686mY1(new R82(file), new C11399xM0(file, this.a));
    }

    public BM0(InterfaceC11742yM0 interfaceC11742yM0) {
        this.a = interfaceC11742yM0;
    }
}

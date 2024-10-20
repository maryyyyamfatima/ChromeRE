package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nm3 */
/* loaded from: classes.dex */
public final class C8114nm3 extends AbstractC0185Bl {
    public final /* synthetic */ C8458om3 h;

    public C8114nm3(C8458om3 c8458om3) {
        this.h = c8458om3;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        C8458om3 c8458om3 = this.h;
        c8458om3.h = (C0461Do0) obj;
        c8458om3.f();
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        File b = C9513rr0.b();
        if (b == null) {
            return null;
        }
        return new C0461Do0("", b.getAbsolutePath(), b.getUsableSpace(), b.getTotalSpace(), 0);
    }
}

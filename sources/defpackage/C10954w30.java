package defpackage;

import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w30 */
/* loaded from: classes2.dex */
public final class C10954w30 implements InterfaceC3906bY1 {
    public final /* synthetic */ C11297x30 a;

    @Override // defpackage.InterfaceC3906bY1
    public final void a(int i) {
        if (i == 5 || i == 2) {
            this.a.a.a.a(false);
        }
    }

    public C10954w30(C11297x30 c11297x30) {
        this.a = c11297x30;
    }

    @Override // defpackage.InterfaceC3906bY1
    public final void c(int i, PropertyModel propertyModel) {
        C11297x30 c11297x30 = this.a;
        if (i != 0) {
            if (i == 1) {
                c11297x30.c.c(2, c11297x30.b);
                return;
            }
            return;
        }
        C9925t30 c9925t30 = c11297x30.a.a;
        c9925t30.getClass();
        AbstractC9966tA.a(C1202Jg1.a()).k(new C9239r30(c9925t30), c9925t30.d);
        if (c9925t30.i == null) {
            c9925t30.i = new RunnableC8554p30(c9925t30);
        }
        c9925t30.f.postDelayed(c9925t30.i, 30000L);
        C8897q30 c8897q30 = new C8897q30(c9925t30);
        C11640y30 c11640y30 = c9925t30.e;
        c11640y30.a();
        c11640y30.c = new C10611v30(c11640y30.b, c11640y30.a, c8897q30);
        c11297x30.c.c(1, c11297x30.b);
    }
}

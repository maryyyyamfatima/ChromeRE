package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Wy1 */
/* loaded from: classes.dex */
public final class C2981Wy1 extends WZ {
    public static final /* synthetic */ int F = 0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    InterfaceC7161l00 D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    U80 E;

    @Override // defpackage.AbstractC10593v00
    public final boolean q() {
        return true;
    }

    public C2981Wy1() {
        super("LazilyConvertedElement");
        this.E = AbstractC3111Xy1.a;
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new C2851Vy1();
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        C3184Yn c3184Yn = AbstractC3111Xy1.a;
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        AbstractC6726jk3 abstractC6726jk3 = this.z;
        ((C2851Vy1) abstractC6726jk3).b = atomicReference;
        ((C2851Vy1) abstractC6726jk3).a = atomicReference2;
    }

    @Override // defpackage.AbstractC10593v00
    public final WZ z(C7849n00 c7849n00) {
        InterfaceC7161l00 interfaceC7161l00 = this.D;
        U80 u80 = this.E;
        C2851Vy1 c2851Vy1 = (C2851Vy1) this.z;
        AtomicReference atomicReference = c2851Vy1.b;
        AtomicReference atomicReference2 = c2851Vy1.a;
        C3184Yn c3184Yn = AbstractC3111Xy1.a;
        if (atomicReference2.get() == null || ((WeakReference) atomicReference2.get()).get() != interfaceC7161l00) {
            atomicReference2.set(new WeakReference(interfaceC7161l00));
            atomicReference.set(null);
        }
        WZ wz = (WZ) atomicReference.get();
        if (wz != null) {
            return wz;
        }
        WZ a = interfaceC7161l00.a(c7849n00, u80);
        atomicReference.set(a);
        return a;
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        C2851Vy1 c2851Vy1 = (C2851Vy1) abstractC6726jk3;
        C2851Vy1 c2851Vy12 = (C2851Vy1) abstractC6726jk32;
        c2851Vy12.a = c2851Vy1.a;
        c2851Vy12.b = c2851Vy1.b;
    }
}

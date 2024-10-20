package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ky0 */
/* loaded from: classes.dex */
public final class C1421Ky0 implements VB2 {
    public static InterfaceC12198zh1 c;
    public static C4341co d = new C4341co(100, 100);
    public final C0156Bf0 a;
    public C0676Ff0 b;

    public C1421Ky0(WB2 wb2) {
        C0327Cn1 c0327Cn1 = AbstractC1066If0.a;
        wb2.getClass();
        C0156Bf0 c0156Bf0 = new C0156Bf0(wb2);
        this.a = c0156Bf0;
        this.b = new C0676Ff0(c0156Bf0);
        RD1[] rd1Arr = {((Qr4) c0156Bf0.d.get()).a.a()};
        C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
        Object[] objArr = (Object[]) rd1Arr.clone();
        L82.a(objArr.length, objArr);
        OL2 m = AbstractC0562Ei1.m(objArr.length, objArr);
        YX0 yx0 = new YX0();
        EnumC6747jo0 enumC6747jo0 = EnumC6747jo0.a;
        int i = AbstractC4575dU3.a;
        new C7335lX((AbstractC0562Ei1) m, true, (Executor) enumC6747jo0, (Callable) new ZT3(AbstractC6294iU3.g(), yx0));
    }
}

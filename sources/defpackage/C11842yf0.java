package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yf0 */
/* loaded from: classes.dex */
public final class C11842yf0 implements InterfaceC9989tE2 {
    public final C12185zf0 a;
    public final int b;

    public C11842yf0(C12185zf0 c12185zf0, int i) {
        this.a = c12185zf0;
        this.b = i;
    }

    @Override // defpackage.InterfaceC9989tE2
    public final Object get() {
        C12185zf0 c12185zf0 = this.a;
        int i = this.b;
        switch (i) {
            case 0:
                CustomTabsConnection g = CustomTabsConnection.g();
                AbstractC6122hy2.a(g);
                return g;
            case 1:
                c12185zf0.a.getClass();
                Q83 q83 = O83.a;
                AbstractC6122hy2.a(q83);
                return q83;
            case 2:
                C9340rM c9340rM = c12185zf0.a;
                c9340rM.getClass();
                return new C10776vY3(new C8998qM(c9340rM));
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C11205wn1(AbstractC9683sM.a(c12185zf0.a), (C11548xn1) c12185zf0.g.get(), C2680Uq0.a(c12185zf0.h), (C10776vY3) c12185zf0.f.get());
            case 4:
                c12185zf0.a.getClass();
                C11548xn1 c11548xn1 = Wn4.a.d;
                AbstractC6122hy2.a(c11548xn1);
                return c11548xn1;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                C11548xn1 c11548xn12 = (C11548xn1) c12185zf0.g.get();
                c12185zf0.a.getClass();
                C5660ge3 c5660ge3 = AbstractC5316fe3.a;
                AbstractC6122hy2.a(c5660ge3);
                return new D62(c11548xn12, c5660ge3);
            case 6:
                return new C2037Pr2((C11205wn1) c12185zf0.i.get(), (C72) c12185zf0.l.get(), (C11370xG1) c12185zf0.m.get());
            case 7:
                return new C72((C11205wn1) c12185zf0.i.get(), (VX3) c12185zf0.k.get());
            case 8:
                return new VX3((C8719pY3) c12185zf0.j.get(), (C11205wn1) c12185zf0.i.get(), (C10776vY3) c12185zf0.f.get());
            case 9:
                return new C8719pY3(AbstractC9683sM.a(c12185zf0.a));
            case 10:
                return new C11370xG1((C11205wn1) c12185zf0.i.get(), (VX3) c12185zf0.k.get(), (C10776vY3) c12185zf0.f.get());
            case 11:
                return new C1061Ie0(AbstractC9683sM.a(c12185zf0.a), C2680Uq0.a(c12185zf0.o));
            case 12:
                return new C6022hh3();
            case 13:
                return new H43(C2680Uq0.a(c12185zf0.d));
            case 14:
                c12185zf0.a.getClass();
                C10505ul c10505ul = AbstractC10848vl.a;
                AbstractC6122hy2.a(c10505ul);
                return c10505ul;
            default:
                throw new AssertionError(i);
        }
    }
}

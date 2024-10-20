package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dd4 */
/* loaded from: classes.dex */
public final class C4624dd4 extends NP2 implements AV0 {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ View j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4624dd4(View view, InterfaceC8927q80 interfaceC8927q80) {
        super(interfaceC8927q80);
        this.j = view;
    }

    @Override // defpackage.AV0
    public final Object c(Object obj, Object obj2) {
        return ((C4624dd4) e((M33) obj, (InterfaceC8927q80) obj2)).g(C8546p14.a);
    }

    @Override // defpackage.AbstractC11245wu
    public final InterfaceC8927q80 e(Object obj, InterfaceC8927q80 interfaceC8927q80) {
        C4624dd4 c4624dd4 = new C4624dd4(this.j, interfaceC8927q80);
        c4624dd4.i = obj;
        return c4624dd4;
    }

    @Override // defpackage.AbstractC11245wu
    public final Object g(Object obj) {
        Object obj2;
        Object obj3 = Q90.COROUTINE_SUSPENDED;
        int i = this.h;
        View view = this.j;
        if (i == 0) {
            SP2.b(obj);
            M33 m33 = (M33) this.i;
            this.i = m33;
            this.h = 1;
            m33.g = view;
            m33.a = 3;
            m33.i = this;
            return obj3;
        }
        Object obj4 = C8546p14.a;
        if (i == 1) {
            M33 m332 = (M33) this.i;
            SP2.b(obj);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                AbstractC0087Ar1.e(viewGroup, "<this>");
                Uc4 uc4 = new Uc4(viewGroup, null);
                this.i = null;
                this.h = 2;
                m332.getClass();
                M33 m333 = new M33();
                m333.i = AbstractC0477Dr1.a(m333, m333, uc4);
                if (m333.hasNext()) {
                    m332.h = m333;
                    m332.a = 2;
                    m332.i = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SP2.b(obj);
        }
        return obj4;
    }
}

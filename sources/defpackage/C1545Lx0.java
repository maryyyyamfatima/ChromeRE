package defpackage;

import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Lx0 */
/* loaded from: classes.dex */
public final class C1545Lx0 implements InterfaceC7260lI {
    public final /* synthetic */ C1675Mx0 b;

    @Override // defpackage.InterfaceC7260lI
    public final /* synthetic */ Map b(C5277fX3 c5277fX3) {
        return AbstractC6572jI.a(this, c5277fX3);
    }

    @Override // defpackage.InterfaceC7260lI
    public final boolean isEnabled() {
        return true;
    }

    public C1545Lx0(C1675Mx0 c1675Mx0) {
        this.b = c1675Mx0;
    }

    @Override // defpackage.InterfaceC7260lI
    public final InterfaceC7948nI a(C7849n00 c7849n00, int i) {
        C1675Mx0 c1675Mx0 = this.b;
        c1675Mx0.getClass();
        if (((PM3) C8635pI.q.get(i)) != null) {
            if (C1675Mx0.g.compareAndSet(true, false)) {
                final C4763e12 c4763e12 = c1675Mx0.b;
                c4763e12.getClass();
                c4763e12.c.execute(new Runnable() { // from class: c12
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        int i2;
                        SM3 sm3;
                        C4763e12 c4763e122 = C4763e12.this;
                        c4763e122.d.getClass();
                        ConditionVariable conditionVariable = AbstractC3733b12.a;
                        ArrayList arrayList = new ArrayList(AbstractC3733b12.d);
                        ArrayList arrayList2 = new ArrayList(AbstractC3733b12.c);
                        c4763e122.f.getClass();
                        Iterator it = C4763e12.a(arrayList).iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            str = c4763e122.e;
                            i2 = c4763e122.a;
                            sm3 = c4763e122.b;
                            if (!hasNext) {
                                break;
                            }
                            C1110Io c1110Io = (C1110Io) it.next();
                            c1110Io.a = "NativeLibChecking";
                            sm3.a(i2, str, c1110Io.a());
                        }
                        Iterator it2 = C4763e12.a(arrayList2).iterator();
                        while (it2.hasNext()) {
                            C1110Io c1110Io2 = (C1110Io) it2.next();
                            c1110Io2.a = "NativeLibLoading";
                            sm3.a(i2, str, c1110Io2.a());
                        }
                    }
                });
            }
            C5277fX3 c5277fX3 = c7849n00.k;
            C1156Ix0 c1156Ix0 = (C1156Ix0) (c5277fX3 == null ? null : c5277fX3.a(C1156Ix0.class));
            if (c1156Ix0 != null && c1156Ix0.b.compareAndSet(true, false)) {
                return new C8635pI(i, c1675Mx0.f, c1675Mx0.c, c1675Mx0.d, c1675Mx0.e);
            }
        }
        return InterfaceC7948nI.a;
    }
}

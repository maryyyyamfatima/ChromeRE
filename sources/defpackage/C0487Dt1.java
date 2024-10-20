package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Dt1 */
/* loaded from: classes.dex */
public final class C0487Dt1 extends AbstractC0835Gl {
    public final a b;
    public a c;
    public final /* synthetic */ C0617Et1 d;
    public final /* synthetic */ Object e;

    @Override // defpackage.AbstractC0835Gl
    public final void b(Object obj, Object obj2) {
        a aVar = (a) obj;
        boolean z = true;
        boolean z2 = obj2 == null;
        a aVar2 = this.b;
        a aVar3 = z2 ? aVar2 : this.c;
        if (aVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.a;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, this, aVar3)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(aVar) != this) {
                    z = false;
                    break;
                }
            }
            if (z && z2) {
                a aVar4 = this.c;
                AbstractC0087Ar1.b(aVar4);
                aVar2.f(aVar4);
            }
        }
    }

    public C0487Dt1(a aVar, C0617Et1 c0617Et1, Object obj) {
        this.d = c0617Et1;
        this.e = obj;
        this.b = aVar;
    }

    @Override // defpackage.AbstractC0835Gl
    public final C2823Vs3 c(Object obj) {
        if (this.d.y() == this.e) {
            return null;
        }
        return VG1.a;
    }
}

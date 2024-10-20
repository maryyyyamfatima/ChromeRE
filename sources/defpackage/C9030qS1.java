package defpackage;

import java.util.Iterator;
import org.chromium.base.MemoryPressureListener;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9030qS1 implements InterfaceC8000nS1 {
    @Override // defpackage.InterfaceC8000nS1
    public final void a(int i) {
        Object obj = ThreadUtils.a;
        C12157za2 c12157za2 = MemoryPressureListener.a;
        if (c12157za2 == null) {
            return;
        }
        Iterator it = c12157za2.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC8000nS1) c11814ya2.next()).a(i);
            }
        }
    }
}

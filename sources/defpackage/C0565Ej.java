package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ej, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0565Ej extends C8385oa2 {
    public final HashSet i = new HashSet();
    public final C0435Dj j = new Callback() { // from class: Dj
        @Override // org.chromium.base.Callback
        public final void onResult(Object obj) {
            C0565Ej.q(C0565Ej.this);
        }

        @Override // org.chromium.base.Callback
        public final ZE e0(Object obj) {
            return new ZE(this, obj);
        }
    };

    @Override // defpackage.C8385oa2
    public final void p(Object obj) {
        throw new IllegalStateException("#set(...) should not be called directly on ApplicationViewportInsetSupplier.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Dj] */
    public C0565Ej() {
        super.p(0);
    }

    public static void q(C0565Ej c0565Ej) {
        Iterator it = c0565Ej.i.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = ((C8385oa2) ((InterfaceC7697ma2) it.next())).g;
            i = Math.max(i, obj == null ? 0 : ((Integer) obj).intValue());
        }
        super.p(Integer.valueOf(i));
    }
}

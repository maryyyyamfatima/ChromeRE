package defpackage;

import J.N;
import android.util.SparseArray;
import org.chromium.base.Callback;
import org.chromium.ui.resources.ResourceManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rv0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9537rv0 extends AbstractC4892eP2 {
    public final SparseArray c;

    @Override // defpackage.AbstractC4892eP2
    public final void c(int i) {
    }

    public C9537rv0(int i, InterfaceC3862bP2 interfaceC3862bP2) {
        super(i, interfaceC3862bP2);
        this.c = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [qv0] */
    public final void d(final int i, InterfaceC8852pv0 interfaceC8852pv0) {
        this.c.put(i, interfaceC8852pv0);
        interfaceC8852pv0.a(new Callback() { // from class: qv0
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                C9537rv0.this.b(i, (IO2) obj);
            }
        });
    }

    public final void e(int i) {
        SparseArray sparseArray = this.c;
        InterfaceC8852pv0 interfaceC8852pv0 = (InterfaceC8852pv0) sparseArray.get(i);
        if (interfaceC8852pv0 == null) {
            return;
        }
        sparseArray.remove(i);
        interfaceC8852pv0.a(null);
        InterfaceC3862bP2 interfaceC3862bP2 = this.b;
        if (interfaceC3862bP2 != null) {
            ResourceManager resourceManager = (ResourceManager) interfaceC3862bP2;
            int i2 = this.a;
            if (i2 == 2 || i2 == 1) {
                long j = resourceManager.d;
                if (j == 0) {
                    return;
                }
                N.MxwZmAzJ(j, resourceManager, i2, i);
            }
        }
    }

    @Override // defpackage.AbstractC4892eP2
    public final void a(int i) {
        InterfaceC8852pv0 interfaceC8852pv0 = (InterfaceC8852pv0) this.c.get(i);
        if (interfaceC8852pv0 == null) {
            return;
        }
        interfaceC8852pv0.b();
    }
}

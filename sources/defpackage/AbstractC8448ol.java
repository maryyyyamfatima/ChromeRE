package defpackage;

import android.util.SparseArray;
import java.util.concurrent.ExecutionException;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ol, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8448ol extends AbstractC4892eP2 {
    public final SparseArray c;
    public final InterfaceC8104nl d;

    public AbstractC8448ol(int i, InterfaceC3862bP2 interfaceC3862bP2, InterfaceC8104nl interfaceC8104nl) {
        super(i, interfaceC3862bP2);
        this.c = new SparseArray();
        this.d = interfaceC8104nl;
    }

    @Override // defpackage.AbstractC4892eP2
    public final void a(int i) {
        SparseArray sparseArray = this.c;
        C7760ml c7760ml = (C7760ml) sparseArray.get(i);
        if (c7760ml != null && !c7760ml.a(false)) {
            try {
                b(i, (IO2) c7760ml.f());
                sparseArray.remove(i);
                return;
            } catch (InterruptedException unused) {
                b(i, null);
                return;
            } catch (ExecutionException unused2) {
                b(i, null);
                return;
            }
        }
        try {
            TraceEvent.b("AsyncPreloadResourceLoader.createResource", null);
            C0964Hk3 a = this.d.a(i);
            TraceEvent.c("AsyncPreloadResourceLoader.createResource");
            b(i, a);
            sparseArray.remove(i);
        } catch (Throwable th) {
            TraceEvent.c("AsyncPreloadResourceLoader.createResource");
            throw th;
        }
    }

    @Override // defpackage.AbstractC4892eP2
    public final void c(int i) {
        SparseArray sparseArray = this.c;
        if (sparseArray.get(i) != null) {
            return;
        }
        C7760ml c7760ml = new C7760ml(this, i);
        c7760ml.c(AbstractC0185Bl.f);
        sparseArray.put(i, c7760ml);
    }
}

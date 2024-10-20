package defpackage;

import com.youtube.android.libraries.elements.templates.EkoProcessor;
import io.grpc.Status;
import java.io.IOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Z14 implements InterfaceC9395rX {
    public final InterfaceC9790sg0 a;
    public final boolean b = Boolean.FALSE.booleanValue();

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, AbstractC9053qX abstractC9053qX) {
        final C3397a24 c3397a24 = (C3397a24) obj;
        return new C0664Fc3(this.a.a(c3397a24.k).g(C5785h.a), new DV0() { // from class: Y14
            @Override // defpackage.DV0
            public final Object apply(Object obj2) {
                C3397a24 c3397a242 = c3397a24;
                Z14 z14 = Z14.this;
                z14.getClass();
                try {
                    C3709ax0 a = EkoProcessor.a(c3397a242.l.p(), (byte[]) ((AbstractC9095qe2) obj2).d(AbstractC8868py0.a), z14.b);
                    Status status = a.a;
                    if (status.b()) {
                        z14.a.b(c3397a242.k, a.b);
                        return C5971hZ.a;
                    }
                    throw new C10239ty0("Eko processor error: " + status.getDescription());
                } catch (IOException e) {
                    throw new C10239ty0("Invalid eko template", e);
                }
            }
        });
    }

    public Z14(InterfaceC9790sg0 interfaceC9790sg0) {
        this.a = interfaceC9790sg0;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C3397a24.o;
    }
}

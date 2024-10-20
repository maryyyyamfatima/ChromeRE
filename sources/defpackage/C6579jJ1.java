package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jJ1 */
/* loaded from: classes.dex */
public final class C6579jJ1 implements InterfaceC9395rX {
    public final C5893hJ1 a;

    @Override // defpackage.InterfaceC9395rX
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.InterfaceC9395rX
    public final VY c(Object obj, final AbstractC9053qX abstractC9053qX) {
        final C4518dJ1 c4518dJ1 = (C4518dJ1) obj;
        return new C6657jZ(new H4() { // from class: iJ1
            @Override // defpackage.H4
            public final void run() {
                C6579jJ1 c6579jJ1 = C6579jJ1.this;
                C4518dJ1 c4518dJ12 = c4518dJ1;
                AbstractC9053qX abstractC9053qX2 = abstractC9053qX;
                C5893hJ1 c5893hJ1 = c6579jJ1.a;
                c5893hJ1.getClass();
                if (c4518dJ12 != null) {
                    int i = c4518dJ12.j;
                    if ((i & 1) != 0) {
                        if ((i & 4) != 0) {
                            if (c4518dJ12.l >= 0.1d) {
                                View view = ((C2924Wn) abstractC9053qX2).a;
                                if (view == null) {
                                    throw new C10239ty0("No view is available, loop has not been registered");
                                }
                                synchronized (c5893hJ1.e) {
                                    c5893hJ1.a(c4518dJ12.k);
                                    c5893hJ1.a.put(c4518dJ12.k, new C5549gJ1(c4518dJ12));
                                }
                                view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC5205fJ1(c5893hJ1, c4518dJ12));
                                return;
                            }
                            throw new C10239ty0("LoopCommand delay is too small");
                        }
                    }
                }
                throw new C10239ty0("Invalid LoopCommand");
            }
        });
    }

    public C6579jJ1(C5893hJ1 c5893hJ1) {
        this.a = c5893hJ1;
    }

    @Override // defpackage.InterfaceC9395rX
    public final VF0 a() {
        return C4518dJ1.q;
    }
}

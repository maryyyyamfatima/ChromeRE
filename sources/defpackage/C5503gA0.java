package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5503gA0 implements InterfaceC7805ms2 {
    @Override // defpackage.InterfaceC7805ms2
    public final void a(int i, String str) {
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void e(String str, ArrayList arrayList) {
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void f(int i, String str, C4025bs2 c4025bs2) {
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void g(int i, String str, C4025bs2 c4025bs2, Callback callback) {
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void b(int i, String str, final C2687Ur2 c2687Ur2) {
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: fA0
            @Override // java.lang.Runnable
            public final void run() {
                c2687Ur2.onResult(ByteBuffer.allocateDirect(0));
            }
        });
    }

    @Override // defpackage.InterfaceC7805ms2
    public final InterfaceC7461ls2 c(int i, String str) {
        C1436Lb0 c1436Lb0 = C1695Nb0.B;
        return C1436Lb0.a(ByteBuffer.allocateDirect(0));
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void d(int i, String str, C3809bF c3809bF) {
        C1436Lb0 c1436Lb0 = C1695Nb0.B;
        c3809bF.onResult(C1436Lb0.a(ByteBuffer.allocateDirect(0)));
    }
}

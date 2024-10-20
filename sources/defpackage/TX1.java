package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.chromium.base.Callback;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TX1 implements InterfaceC7805ms2 {
    public final HashMap a = new HashMap();

    @Override // defpackage.InterfaceC7805ms2
    public final InterfaceC7461ls2 c(int i, String str) {
        return null;
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void d(int i, String str, C3809bF c3809bF) {
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void e(String str, ArrayList arrayList) {
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void f(int i, String str, C4025bs2 c4025bs2) {
        c4025bs2.a();
        this.a.put(h(i), c4025bs2.get());
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void g(int i, String str, C4025bs2 c4025bs2, Callback callback) {
        f(i, str, c4025bs2);
        ((C1306Kb0) callback).onResult(0);
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void b(final int i, String str, final C2687Ur2 c2687Ur2) {
        PostTask.d(AbstractC5103f04.a, new Runnable() { // from class: SX1
            @Override // java.lang.Runnable
            public final void run() {
                HashMap hashMap = TX1.this.a;
                int i2 = i;
                c2687Ur2.onResult(hashMap.get(TX1.h(i2)) == null ? null : (ByteBuffer) hashMap.get(TX1.h(i2)));
            }
        });
    }

    @Override // defpackage.InterfaceC7805ms2
    public final void a(int i, String str) {
        this.a.remove(h(i));
    }

    public static String h(int i) {
        return String.format(Locale.US, "%d", Integer.valueOf(i));
    }
}

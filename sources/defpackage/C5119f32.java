package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f32, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5119f32 implements InterfaceC1390Ks {
    public final Handler a;
    public C1519Ls b;
    public boolean c;
    public int d = 0;
    public final C12157za2 e = new C12157za2();

    public C5119f32() {
        Object obj = ThreadUtils.a;
        HandlerThread handlerThread = new HandlerThread("NetworkStatusListener");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.a = handler;
        handler.post(new Runnable() { // from class: e32
            @Override // java.lang.Runnable
            public final void run() {
                C5119f32 c5119f32 = C5119f32.this;
                c5119f32.getClass();
                Object obj2 = ThreadUtils.a;
                c5119f32.b = new C1519Ls(c5119f32);
            }
        });
    }

    @Override // defpackage.InterfaceC1390Ks
    public final void c(int i) {
        Object obj = ThreadUtils.a;
        if (this.c) {
            return;
        }
        this.d = i;
        this.c = true;
        Iterator it = this.e.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1390Ks) c11814ya2.next()).c(i);
            }
        }
    }

    @Override // defpackage.InterfaceC1390Ks
    public final void b(int i) {
        Object obj = ThreadUtils.a;
        this.d = i;
        Iterator it = this.e.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                return;
            } else {
                ((InterfaceC1390Ks) c11814ya2.next()).b(i);
            }
        }
    }
}

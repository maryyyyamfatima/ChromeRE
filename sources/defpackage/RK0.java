package defpackage;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class RK0 implements InterfaceC9676sK2 {
    public Runnable a;
    public final /* synthetic */ SK0 b;

    public final void b() {
        RecyclerView recyclerView = this.b.a.A;
        if (recyclerView != null) {
            AbstractC2348Sb3 abstractC2348Sb3 = recyclerView.S;
            if (abstractC2348Sb3 != null && abstractC2348Sb3.k()) {
                recyclerView.S.l(this);
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
            this.a = null;
        }
    }

    public RK0(SK0 sk0) {
        this.b = sk0;
    }

    @Override // defpackage.InterfaceC9676sK2
    public final void a() {
        new Handler().post(new Runnable() { // from class: PK0
            @Override // java.lang.Runnable
            public final void run() {
                RK0.this.b();
            }
        });
    }
}

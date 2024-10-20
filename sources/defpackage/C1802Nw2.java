package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Nw2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1802Nw2 {
    public final C2303Rs3 a;
    public final Runnable b;

    public C1802Nw2(Context context, RunnableC0243Bw2 runnableC0243Bw2) {
        TraceEvent.b("PlayerSwipeRefreshHandler", null);
        this.b = runnableC0243Bw2;
        C2303Rs3 c2303Rs3 = new C2303Rs3(context);
        this.a = c2303Rs3;
        c2303Rs3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int c = AbstractC11746yN.c(context, R.dimen.f30400_resource_name_obfuscated_res_0x7f080172);
        c2303Rs3.o.setBackgroundColor(c);
        c2303Rs3.t.g.w = c;
        int[] iArr = {AbstractC10957w33.b(context)};
        C11400xM1 c11400xM1 = c2303Rs3.t.g;
        c11400xM1.j = iArr;
        c11400xM1.b(0);
        c11400xM1.b(0);
        c2303Rs3.setEnabled(true);
        c2303Rs3.a = new InterfaceC2173Qs3() { // from class: Lw2
            @Override // defpackage.InterfaceC2173Qs3
            public final void a() {
                final C1802Nw2 c1802Nw2 = C1802Nw2.this;
                c1802Nw2.a.postDelayed(new Runnable() { // from class: Mw2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1802Nw2.this.a.h(false, false);
                    }
                }, 500L);
                c1802Nw2.b.run();
            }
        };
        TraceEvent.c("PlayerSwipeRefreshHandler");
    }
}

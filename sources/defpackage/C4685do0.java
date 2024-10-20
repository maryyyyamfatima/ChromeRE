package defpackage;

import android.content.Context;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import org.chromium.chrome.browser.AppHooks;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: do0 */
/* loaded from: classes.dex */
public final class C4685do0 implements V02, InterfaceC0186Bl0 {
    public final Context a;
    public final QB g;
    public final CompositorViewHolder h;
    public final C6166i6 i;
    public final InterfaceC10590uz3 j;
    public final int k;
    public final InterfaceC9377rT1 l;
    public final Runnable m;
    public final C3511aO0 n;
    public boolean o = false;
    public C3655ao0 p;
    public XS1 q;

    public C4685do0(a aVar, int i, InterfaceC9377rT1 interfaceC9377rT1, KQ2 kq2, InterfaceC10590uz3 interfaceC10590uz3, C3511aO0 c3511aO0, m mVar, CC cc, CompositorViewHolder compositorViewHolder, C6166i6 c6166i6) {
        this.a = aVar;
        this.k = i;
        this.l = interfaceC9377rT1;
        this.m = kq2;
        this.j = interfaceC10590uz3;
        this.n = c3511aO0;
        this.g = mVar;
        this.h = compositorViewHolder;
        this.i = c6166i6;
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.p = null;
        this.o = false;
    }

    @Override // defpackage.V02
    public final void U() {
        C3655ao0 g = AppHooks.get().g();
        this.p = g;
        if (g != null) {
            g.b = new InterfaceC0079Ap3() { // from class: co0
                @Override // defpackage.InterfaceC0079Ap3
                public final /* synthetic */ boolean i() {
                    return AbstractC12248zp3.a(this);
                }

                @Override // defpackage.InterfaceC0079Ap3
                public final Object get() {
                    return Boolean.valueOf(!((AbstractC11276wz3) C4685do0.this.j).o());
                }
            };
            Context context = this.a;
            int i = this.k;
            QB qb = AbstractC11185wk.a(i) ? this.g : null;
            CompositorViewHolder compositorViewHolder = this.h;
            C6166i6 c6166i6 = this.i;
            this.p.a.add(new C6480j11(this.m));
            C3655ao0 c3655ao0 = this.p;
            InterfaceC10590uz3 interfaceC10590uz3 = this.j;
            c3655ao0.a.add(new JN0(interfaceC10590uz3, this.n));
            InterfaceC9377rT1 interfaceC9377rT1 = this.l;
            XS1 a = a(interfaceC9377rT1, interfaceC10590uz3);
            Integer[] numArr = {Integer.valueOf(R.id.forward_menu_id), Integer.valueOf(R.id.reload_menu_id)};
            if (a.c != null) {
                for (int i2 = 0; i2 < 2; i2++) {
                    a.c.add(Integer.valueOf(numArr[i2].intValue()));
                }
            }
            if (AbstractC11185wk.a(i)) {
                this.p.a.add(new C2414Sp(context, qb, compositorViewHolder, c6166i6, new InterfaceC0079Ap3() { // from class: Up
                    public /* synthetic */ C2674Up() {
                    }

                    @Override // defpackage.InterfaceC0079Ap3
                    public final /* synthetic */ boolean i() {
                        return AbstractC12248zp3.a(this);
                    }

                    @Override // defpackage.InterfaceC0079Ap3
                    public final Object get() {
                        Tab tab = (Tab) C6166i6.this.g;
                        if (tab == null) {
                            return null;
                        }
                        return tab.b();
                    }
                }));
            }
            if (i == 0) {
                a(interfaceC9377rT1, interfaceC10590uz3).c = null;
                this.p.a.add(new C8013nV(interfaceC10590uz3));
            } else if (i == 1) {
                Integer[] numArr2 = {Integer.valueOf(R.id.bookmark_this_page_id), Integer.valueOf(R.id.preferences_id)};
                XS1 a2 = a(interfaceC9377rT1, interfaceC10590uz3);
                if (a2.c != null) {
                    for (int i3 = 0; i3 < 2; i3++) {
                        a2.c.add(Integer.valueOf(numArr2[i3].intValue()));
                    }
                }
            }
            this.o = true;
        }
    }

    public final XS1 a(InterfaceC9377rT1 interfaceC9377rT1, InterfaceC10590uz3 interfaceC10590uz3) {
        if (this.q == null) {
            XS1 xs1 = new XS1(interfaceC9377rT1, interfaceC10590uz3);
            this.q = xs1;
            this.p.a.add(xs1);
        }
        return this.q;
    }
}

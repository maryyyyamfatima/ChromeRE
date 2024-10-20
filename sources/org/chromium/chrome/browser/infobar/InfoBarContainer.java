package org.chromium.chrome.browser.infobar;

import J.N;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import defpackage.C0282Ce1;
import defpackage.C0447Dl1;
import defpackage.C0967Hl1;
import defpackage.C10021tL;
import defpackage.C11494xe1;
import defpackage.C11814ya2;
import defpackage.C12157za2;
import defpackage.C8106nl1;
import defpackage.C8793pl1;
import defpackage.DC;
import defpackage.G1;
import defpackage.InterfaceC11596xv1;
import defpackage.InterfaceC2006Pl1;
import defpackage.InterfaceC4481dC;
import defpackage.InterfaceC6387il1;
import defpackage.InterfaceC9821sl1;
import defpackage.J44;
import defpackage.QB;
import defpackage.ViewOnAttachStateChangeListenerC8450ol1;
import defpackage.ViewOnAttachStateChangeListenerC9478rl1;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.infobar.InfoBarContainer;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.infobars.InfoBar;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.DeviceFormFactor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class InfoBarContainer implements J44, InterfaceC11596xv1, InterfaceC6387il1 {
    public static final /* synthetic */ int u = 0;
    public final C8106nl1 a;
    public final ViewOnAttachStateChangeListenerC8450ol1 g;
    public final ArrayList h;
    public final C12157za2 i;
    public final C12157za2 j;
    public final C8793pl1 k;
    public final Tab l;
    public long m;
    public boolean n;
    public boolean o;
    public View p;
    public C0967Hl1 q;
    public C0282Ce1 r;
    public InterfaceC4481dC s;
    public QB t;

    static {
        C10021tL.f().a(new G1() { // from class: ml1
            @Override // defpackage.G1
            public final void D(boolean z) {
                int i = InfoBarContainer.u;
                C0967Hl1.w = !z;
            }
        });
    }

    public static InfoBarContainer c(Tab tab) {
        return (InfoBarContainer) tab.F().b(InfoBarContainer.class);
    }

    public InfoBarContainer(Tab tab) {
        C8106nl1 c8106nl1 = new C8106nl1(this);
        this.a = c8106nl1;
        this.g = new ViewOnAttachStateChangeListenerC8450ol1(this);
        this.h = new ArrayList();
        this.i = new C12157za2();
        this.j = new C12157za2();
        this.k = new C8793pl1(this);
        tab.v(c8106nl1);
        this.p = tab.a();
        this.l = tab;
        Activity activity = (Activity) tab.m().k().get();
        if (activity != null) {
            d(activity);
        }
        this.m = N.MQNiH$D1(this);
    }

    public final void addInfoBar(InfoBar infoBar) {
        if (infoBar == null) {
            return;
        }
        ArrayList arrayList = this.h;
        if (arrayList.contains(infoBar)) {
            return;
        }
        infoBar.l = this.q.getContext();
        infoBar.j = this;
        Iterator it = this.i.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            }
            InterfaceC9821sl1 interfaceC9821sl1 = (InterfaceC9821sl1) c11814ya2.next();
            arrayList.isEmpty();
            interfaceC9821sl1.getClass();
        }
        arrayList.add(infoBar);
        C0967Hl1 c0967Hl1 = this.q;
        c0967Hl1.getClass();
        infoBar.n();
        C0447Dl1 c0447Dl1 = c0967Hl1.r;
        ArrayList arrayList2 = c0447Dl1.h;
        int i = 0;
        while (true) {
            if (i < arrayList2.size()) {
                if (infoBar.a() < ((InterfaceC2006Pl1) arrayList2.get(i)).a()) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = arrayList2.size();
                break;
            }
        }
        arrayList2.add(i, infoBar);
        c0447Dl1.e();
    }

    @Override // defpackage.J44
    public final void destroy() {
        b();
        this.l.w(this.a);
        long j = this.m;
        if (j != 0) {
            N.MUX1cETi(j, this);
            this.m = 0L;
        }
        this.n = true;
    }

    public boolean hasInfoBars() {
        return !this.h.isEmpty();
    }

    public final int getTopInfoBarIdentifier() {
        if (!hasInfoBars()) {
            return -1;
        }
        InfoBar infoBar = (InfoBar) this.h.get(0);
        long j = infoBar.o;
        if (j == 0) {
            return -1;
        }
        return N.MIZvQmze(j, infoBar);
    }

    public final void e(boolean z) {
        this.o = z;
        C0967Hl1 c0967Hl1 = this.q;
        if (c0967Hl1 == null) {
            return;
        }
        c0967Hl1.setVisibility(z ? 8 : 0);
    }

    @Override // defpackage.InterfaceC11596xv1
    public final void g(boolean z) {
        boolean z2 = this.q.getVisibility() == 0;
        if (z) {
            if (z2) {
                this.q.setVisibility(4);
            }
        } else {
            if (z2 || this.o) {
                return;
            }
            this.q.setVisibility(0);
        }
    }

    public static void a(InfoBarContainer infoBarContainer) {
        if (infoBarContainer.q == null) {
            return;
        }
        Tab tab = infoBarContainer.l;
        WebContents b = tab.b();
        if (b != null) {
            C0967Hl1 c0967Hl1 = infoBarContainer.q;
            if (b != c0967Hl1.o) {
                c0967Hl1.e(b);
                long j = infoBarContainer.m;
                if (j != 0) {
                    N.Mb3PR8J$(j, infoBarContainer, b);
                }
            }
        }
        View view = infoBarContainer.p;
        ViewOnAttachStateChangeListenerC8450ol1 viewOnAttachStateChangeListenerC8450ol1 = infoBarContainer.g;
        if (view != null) {
            view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC8450ol1);
        }
        View a = tab.a();
        infoBarContainer.p = a;
        if (a != null) {
            a.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC8450ol1);
        }
    }

    public final void d(Activity activity) {
        Tab tab = this.l;
        C0967Hl1 c0967Hl1 = new C0967Hl1(activity, this.k, DC.u(tab.m()), DeviceFormFactor.b(tab.m()));
        this.q = c0967Hl1;
        c0967Hl1.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC9478rl1(this));
        C0967Hl1 c0967Hl12 = this.q;
        boolean z = this.o;
        c0967Hl12.getClass();
        c0967Hl12.setVisibility(z ? 8 : 0);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.bottom_container);
        C0967Hl1 c0967Hl13 = this.q;
        if (c0967Hl13 != null) {
            c0967Hl13.s = viewGroup;
            if (c0967Hl13.c()) {
                c0967Hl13.g();
            }
        }
        C0282Ce1 c0282Ce1 = new C0282Ce1(new C11494xe1(activity, tab));
        this.r = c0282Ce1;
        this.j.a(c0282Ce1);
        this.i.a(this.r);
        tab.m().r().a(this);
    }

    public final void b() {
        InterfaceC4481dC interfaceC4481dC;
        C0282Ce1 c0282Ce1 = this.r;
        if (c0282Ce1 != null) {
            this.j.d(c0282Ce1);
            this.i.d(this.r);
            this.r = null;
        }
        C0967Hl1 c0967Hl1 = this.q;
        if (c0967Hl1 != null) {
            c0967Hl1.e(null);
            long j = this.m;
            if (j != 0) {
                N.Mb3PR8J$(j, this, null);
            }
            this.q.c();
            this.q = null;
        }
        Tab tab = this.l;
        if (((Activity) tab.m().k().get()) != null && (interfaceC4481dC = this.s) != null) {
            ((m) this.t).o(interfaceC4481dC);
        }
        tab.m().r().h(this);
        View view = this.p;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.g);
            this.p = null;
        }
    }
}

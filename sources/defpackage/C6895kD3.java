package defpackage;

import java.util.HashSet;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kD3 */
/* loaded from: classes.dex */
public final class C6895kD3 implements InterfaceC6377ij3, InterfaceC0186Bl0, InterfaceC3657ao2 {
    public final I5 i;
    public final InterfaceC10590uz3 j;
    public C6209iD3 k;
    public C6551jD3 l;
    public final HashSet a = new HashSet();
    public int g = 0;
    public int h = 0;
    public boolean m = false;

    @Override // defpackage.InterfaceC3657ao2
    public final void e() {
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void f() {
    }

    public C6895kD3(I5 i5, AbstractC11276wz3 abstractC11276wz3) {
        this.j = abstractC11276wz3;
        this.i = i5;
        i5.b(this);
    }

    @Override // defpackage.InterfaceC0186Bl0
    public final void onDestroy() {
        this.i.c(this);
        ((AbstractC11276wz3) this.j).s(this.k);
    }

    @Override // defpackage.InterfaceC6377ij3
    public final void g() {
        if (this.m) {
            int i = this.g + this.h;
            HashSet hashSet = this.a;
            EI2.l(Math.round((hashSet.size() / i) * 100.0f), "Android.ActivityStop.PercentageOfTabsUsed");
            EI2.d(hashSet.size(), "Android.ActivityStop.NumberOfTabsUsed");
            hashSet.clear();
            this.h = 0;
            this.g = 0;
            this.l.a();
            this.m = false;
        }
    }

    @Override // defpackage.InterfaceC3657ao2
    public final void c() {
        InterfaceC10590uz3 interfaceC10590uz3 = this.j;
        AbstractC11276wz3 abstractC11276wz3 = (AbstractC11276wz3) interfaceC10590uz3;
        if (abstractC11276wz3.i) {
            this.g = abstractC11276wz3.n();
        } else {
            C6209iD3 c6209iD3 = new C6209iD3(this);
            this.k = c6209iD3;
            abstractC11276wz3.c(c6209iD3);
        }
        Tab tabAt = abstractC11276wz3.g().getTabAt(abstractC11276wz3.e);
        if (tabAt != null) {
            this.a.add(Integer.valueOf(tabAt.getId()));
        }
        this.l = new C6551jD3(this, interfaceC10590uz3);
        this.m = true;
    }
}

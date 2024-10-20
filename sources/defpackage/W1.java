package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class W1 extends AbstractC3965bi2 implements InterfaceC5863hD1 {
    public final C5175fD1 c;
    public final HashMap d;

    @Override // defpackage.AbstractC3965bi2
    public final boolean i(View view, Object obj) {
        return view == obj;
    }

    @Override // defpackage.InterfaceC5863hD1
    public final void a(InterfaceC7925nD1 interfaceC7925nD1, Object obj, int i, int i2) {
        j();
    }

    @Override // defpackage.InterfaceC5863hD1
    public final void b(InterfaceC7925nD1 interfaceC7925nD1, Object obj, int i, int i2) {
        j();
    }

    @Override // defpackage.InterfaceC5863hD1
    public final void c(InterfaceC7925nD1 interfaceC7925nD1, int i, Object obj, Object obj2, int i2) {
        j();
    }

    public W1(C5175fD1 c5175fD1) {
        this.c = c5175fD1;
        this.d = new HashMap(c5175fD1.size());
    }

    @Override // defpackage.AbstractC3965bi2
    public final Object h(int i, ViewGroup viewGroup) {
        C1661Mu1 c1661Mu1 = (C1661Mu1) this.c.get(i);
        HashMap hashMap = this.d;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get(c1661Mu1);
        if (viewGroup2 == null) {
            viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(c1661Mu1.e, viewGroup, false);
            hashMap.put(c1661Mu1, viewGroup2);
            if (viewGroup.indexOfChild(viewGroup2) == -1) {
                viewGroup.addView(viewGroup2);
            }
            AbstractC4079c2 abstractC4079c2 = c1661Mu1.g;
            if (abstractC4079c2 != null) {
                abstractC4079c2.b(viewGroup2);
            }
        }
        return viewGroup2;
    }

    @Override // defpackage.AbstractC3965bi2
    public final void d(ViewGroup viewGroup, Object obj) {
        if (obj == null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) obj;
        if (viewGroup.indexOfChild(viewGroup2) != -1) {
            viewGroup.removeView(viewGroup2);
        }
        HashMap hashMap = this.d;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((ViewGroup) entry.getValue()).equals(viewGroup2)) {
                hashMap.remove(entry.getKey());
                return;
            }
        }
    }

    @Override // defpackage.AbstractC3965bi2
    public final int f() {
        return this.c.size();
    }

    @Override // defpackage.AbstractC3965bi2
    public final int g(Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = 0;
        while (true) {
            C5175fD1 c5175fD1 = this.c;
            if (i >= c5175fD1.size()) {
                return -2;
            }
            if (viewGroup.equals(this.d.get(c5175fD1.get(i)))) {
                return i;
            }
            i++;
        }
    }
}

package defpackage;

import J.N;
import android.content.Context;
import com.android.chrome.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.chromium.chrome.browser.offlinepages.OfflinePageBridge;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.net.NetworkChangeNotifier;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cb2 */
/* loaded from: classes.dex */
public final class C0268Cb2 extends BA0 implements G22 {
    public static HashMap m;
    public final ViewOnClickListenerC1069If3 a;
    public final InterfaceC0679Ff3 g;
    public final InterfaceC10590uz3 h;
    public final C12163zb2 i;
    public final HashMap j = new HashMap();
    public boolean k = false;
    public Tab l;

    public C0268Cb2(InterfaceC10590uz3 interfaceC10590uz3, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, C0008Ab2 c0008Ab2) {
        this.a = viewOnClickListenerC1069If3;
        this.g = c0008Ab2;
        this.h = interfaceC10590uz3;
        this.i = new C12163zb2(this, interfaceC10590uz3);
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        if (V0(tab)) {
            ((C0138Bb2) this.j.get(Integer.valueOf(tab.getId()))).a = true;
            W0(tab, false);
        }
    }

    @Override // defpackage.BA0
    public final void P0(int i, Tab tab) {
        W0(tab, false);
        this.l = tab;
    }

    @Override // defpackage.BA0
    public final void A0(int i, Tab tab) {
        this.l = null;
        this.a.a(this.g);
    }

    @Override // defpackage.BA0
    public final void r0(Tab tab) {
        X0(tab);
        this.a.a(this.g);
    }

    @Override // defpackage.BA0
    public final void S0(TabImpl tabImpl) {
        if (!AbstractC2217Rb2.e(tabImpl)) {
            X0(tabImpl);
        } else if (V0(tabImpl)) {
            HashMap hashMap = this.j;
            ((C0138Bb2) hashMap.get(Integer.valueOf(tabImpl.getId()))).a = false;
            ((C0138Bb2) hashMap.get(Integer.valueOf(tabImpl.getId()))).b = false;
        }
        this.a.a(this.g);
    }

    public final void X0(Tab tab) {
        boolean V0 = V0(tab);
        HashMap hashMap = this.j;
        if (V0) {
            hashMap.remove(Integer.valueOf(tab.getId()));
            tab.w(this);
        }
        if (hashMap.isEmpty() && this.k) {
            NetworkChangeNotifier.g(this);
            this.k = false;
        }
    }

    @Override // defpackage.G22
    public final void b(int i) {
        AbstractC2217Rb2.d();
        Objects.toString(this.g);
        W0(this.l, true);
        if (AbstractC2217Rb2.d()) {
            return;
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            ((C0138Bb2) it.next()).b = false;
        }
    }

    public final boolean V0(Tab tab) {
        return this.j.containsKey(Integer.valueOf(tab.getId()));
    }

    public final void W0(Tab tab, boolean z) {
        if (tab == null || tab.l() || tab.isHidden() || !AbstractC2217Rb2.e(tab)) {
            return;
        }
        AbstractC2217Rb2.a().getClass();
        OfflinePageBridge a = OfflinePageBridge.a(Profile.b(tab.b()));
        if ((a == null ? false : N.MYT2RMuB(a.a, a, tab.b())) || !AbstractC2217Rb2.d()) {
            return;
        }
        boolean V0 = V0(tab);
        HashMap hashMap = this.j;
        if (V0 && ((C0138Bb2) hashMap.get(Integer.valueOf(tab.getId()))).a) {
            if (!(V0(tab) && ((C0138Bb2) hashMap.get(Integer.valueOf(tab.getId()))).b) || z) {
                Context context = tab.getContext();
                int id = tab.getId();
                AbstractC2217Rb2.a().getClass();
                if (id != -1) {
                    InterfaceC0679Ff3 interfaceC0679Ff3 = this.g;
                    Objects.toString(interfaceC0679Ff3);
                    C12188zf3 a2 = C12188zf3.a(context.getString(R.string.0_resource_name_obfuscated_res_0x7f140716), interfaceC0679Ff3, 0, 3);
                    a2.i = false;
                    String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f14094a);
                    Integer valueOf = Integer.valueOf(id);
                    a2.d = string;
                    a2.e = valueOf;
                    a2.j = 6000;
                    this.a.c(a2);
                }
                ((C0138Bb2) hashMap.get(Integer.valueOf(tab.getId()))).b = true;
            }
        }
    }
}

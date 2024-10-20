package defpackage;

import android.text.SpannableString;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.widget.ChromeBulletSpan;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: pT2 */
/* loaded from: classes.dex */
public final class C8693pT2 extends BA0 implements J44, InterfaceC9985tD3 {
    public final Tab a;
    public View g;
    public int h;

    @Override // defpackage.InterfaceC9985tD3
    public final int N() {
        return 1;
    }

    @Override // defpackage.InterfaceC9985tD3
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.InterfaceC9985tD3
    public final /* synthetic */ void v() {
    }

    public static boolean W0(Tab tab) {
        C8693pT2 c8693pT2;
        return (tab == null || !tab.isInitialized() || (c8693pT2 = (C8693pT2) tab.F().b(C8693pT2.class)) == null || c8693pT2.g == null || !c8693pT2.a.q().b(c8693pT2)) ? false : true;
    }

    public C8693pT2(TabImpl tabImpl) {
        this.a = tabImpl;
        tabImpl.v(this);
    }

    @Override // defpackage.BA0
    public final void G0(int i, Tab tab, LoadUrlParams loadUrlParams) {
        this.a.q().c(this);
        this.g = null;
    }

    @Override // defpackage.BA0
    public final void K0(Tab tab, GURL gurl) {
        this.a.q().c(this);
        this.g = null;
    }

    @Override // defpackage.BA0
    public final void J0(Tab tab, GURL gurl) {
        this.h = 0;
        this.a.q().c(this);
        this.g = null;
    }

    @Override // defpackage.J44
    public final void destroy() {
        this.a.w(this);
    }

    public static SpannableString V0(ContextThemeWrapper contextThemeWrapper, int i) {
        SpannableString spannableString = new SpannableString(contextThemeWrapper.getString(i));
        spannableString.setSpan(new ChromeBulletSpan(contextThemeWrapper), 0, spannableString.length(), 0);
        return spannableString;
    }

    @Override // defpackage.InterfaceC9985tD3
    public final View a() {
        return this.g;
    }
}

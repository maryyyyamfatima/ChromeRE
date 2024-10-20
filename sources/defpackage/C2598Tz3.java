package defpackage;

import android.content.Intent;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tz3 */
/* loaded from: classes.dex */
public final class C2598Tz3 extends BA0 implements J44 {
    public final Tab a;
    public InterfaceC0079Ap3 g;
    public Intent h;

    public C2598Tz3(TabImpl tabImpl) {
        this.a = tabImpl;
        tabImpl.v(this);
    }

    @Override // defpackage.BA0
    public final void j0(TabImpl tabImpl) {
        if (!(this.g.get() == tabImpl) || this.h == null || AbstractC7239lD3.b(tabImpl).getIntent() == this.h) {
            return;
        }
        AbstractC7239lD3.b(tabImpl).startActivity(this.h);
    }

    @Override // defpackage.J44
    public final void destroy() {
        this.a.w(this);
    }
}

package defpackage;

import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Cd0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0276Cd0 implements InterfaceC0079Ap3 {
    public final /* synthetic */ Tab a;

    public /* synthetic */ C0276Cd0(TabImpl tabImpl) {
        this.a = tabImpl;
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final Object get() {
        return this.a.getContext();
    }

    @Override // defpackage.InterfaceC0079Ap3
    public final /* synthetic */ boolean i() {
        return AbstractC12248zp3.a(this);
    }
}

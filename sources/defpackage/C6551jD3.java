package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: jD3 */
/* loaded from: classes.dex */
public final class C6551jD3 extends AbstractC0909Gz3 {
    public final /* synthetic */ C6895kD3 h;

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void R(int i, int i2, Tab tab) {
        this.h.a.add(Integer.valueOf(tab.getId()));
    }

    @Override // defpackage.AbstractC0909Gz3, defpackage.InterfaceC8876pz3
    public final void a0(int i, int i2, Tab tab) {
        this.h.h++;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6551jD3(C6895kD3 c6895kD3, InterfaceC10590uz3 interfaceC10590uz3) {
        super(interfaceC10590uz3);
        this.h = c6895kD3;
    }
}

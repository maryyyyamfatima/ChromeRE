package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: xy3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C11614xy3 implements InterfaceC0904Gy3 {
    public final /* synthetic */ Tab a;
    public final /* synthetic */ InterfaceC0904Gy3 b;

    public /* synthetic */ C11614xy3(Tab tab, C7841my3 c7841my3) {
        this.a = tab;
        this.b = c7841my3;
    }

    @Override // defpackage.InterfaceC0904Gy3
    public final void a(int i) {
        Tab tab = this.a;
        if (tab == null) {
            return;
        }
        FI2.a("TabGrid.TabSearchChipTapped");
        this.b.a(i);
        AbstractC0124Ay3.a(tab);
    }
}

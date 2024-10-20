package defpackage;

import org.chromium.chrome.browser.ChromeTabbedActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zR */
/* loaded from: classes.dex */
public final class C12109zR implements InterfaceC10844vk1 {
    public final /* synthetic */ ChromeTabbedActivity a;

    public C12109zR(ChromeTabbedActivity chromeTabbedActivity) {
        this.a = chromeTabbedActivity;
    }

    @Override // defpackage.InterfaceC10844vk1
    public final boolean b() {
        return ((AbstractC11276wz3) this.a.s1()).j(true).getCount() > 0;
    }

    @Override // defpackage.InterfaceC10844vk1
    public final void a() {
        ChromeTabbedActivity chromeTabbedActivity = this.a;
        if (chromeTabbedActivity.m()) {
            return;
        }
        if (!chromeTabbedActivity.d0.d || !chromeTabbedActivity.n0) {
            chromeTabbedActivity.finish();
        } else {
            ((AbstractC11276wz3) chromeTabbedActivity.s1()).j(true).j();
        }
    }

    @Override // defpackage.InterfaceC10844vk1
    public final boolean isActiveModel() {
        return ((AbstractC11276wz3) this.a.s1()).j(true).isActiveModel();
    }
}

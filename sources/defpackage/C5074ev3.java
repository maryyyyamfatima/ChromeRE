package defpackage;

import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ev3 */
/* loaded from: classes.dex */
public final class C5074ev3 implements YU0 {
    public final /* synthetic */ C5418fv3 a;

    @Override // defpackage.YU0
    public final /* synthetic */ void a() {
    }

    public C5074ev3(C5418fv3 c5418fv3) {
        this.a = c5418fv3;
    }

    @Override // defpackage.YU0
    public final void b(Tab tab) {
        boolean isUserInteractable = tab.isUserInteractable();
        C5418fv3 c5418fv3 = this.a;
        if (isUserInteractable) {
            c5418fv3.m = tab;
            c5418fv3.l = true;
        } else {
            c5418fv3.i.h(tab.getId());
        }
    }
}

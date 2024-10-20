package defpackage;

import org.chromium.chrome.browser.tab.TabImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yd0 */
/* loaded from: classes.dex */
public final class C11830yd0 extends MA3 {
    public final /* synthetic */ C0146Bd0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11830yd0(C0146Bd0 c0146Bd0, TabImpl tabImpl) {
        super(tabImpl);
        this.l = c0146Bd0;
    }

    @Override // defpackage.MA3
    public final int s() {
        int s = super.s();
        if (s != 3 || this.l.b) {
            return s;
        }
        return 1;
    }
}

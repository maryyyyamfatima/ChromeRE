package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import org.chromium.chrome.browser.tasks.tab_management.j;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yA3 */
/* loaded from: classes.dex */
public final class C11685yA3 extends AbstractC4099c51 {
    public final /* synthetic */ AbstractC12077zK2 c;
    public final /* synthetic */ j d;

    @Override // defpackage.AbstractC4099c51
    public final int c(int i) {
        if (this.d.b.g.r.s(i) == 4) {
            return ((GridLayoutManager) this.c).F;
        }
        return 1;
    }

    public C11685yA3(j jVar, AbstractC12077zK2 abstractC12077zK2) {
        this.d = jVar;
        this.c = abstractC12077zK2;
    }
}

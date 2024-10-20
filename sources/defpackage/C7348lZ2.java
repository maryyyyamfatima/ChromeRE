package defpackage;

import android.content.Context;
import org.chromium.chrome.browser.searchwidget.SearchActivity;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lZ2 */
/* loaded from: classes.dex */
public final class C7348lZ2 extends C10285u6 {
    public final /* synthetic */ SearchActivity E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7348lZ2(SearchActivity searchActivity, Context context, C1449Ld3 c1449Ld3, C2021Po1 c2021Po1) {
        super(context, c1449Ld3, c2021Po1);
        this.E = searchActivity;
    }

    @Override // org.chromium.ui.base.WindowAndroid
    public final ZX1 s() {
        return this.E.N();
    }

    @Override // defpackage.C10285u6, org.chromium.ui.base.WindowAndroid
    public final C11939yv1 r() {
        return (H5) this.g;
    }
}

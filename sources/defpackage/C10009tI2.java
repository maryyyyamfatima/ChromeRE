package defpackage;

import android.view.View;
import android.view.ViewGroup;
import org.chromium.chrome.browser.signin.SyncPromoView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tI2 */
/* loaded from: classes.dex */
public final class C10009tI2 extends AbstractC8638pI2 {
    @Override // defpackage.AbstractC7951nI2
    public final int d() {
        return 4;
    }

    public C10009tI2(C10695vI2 c10695vI2) {
        super(c10695vI2);
    }

    @Override // defpackage.AbstractC7951nI2
    public final View e(int i, View view, ViewGroup viewGroup) {
        return view == null ? SyncPromoView.a(16, viewGroup) : view;
    }
}

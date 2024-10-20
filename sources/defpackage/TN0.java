package defpackage;

import android.view.View;
import org.chromium.chrome.browser.findinpage.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TN0 implements View.OnFocusChangeListener {
    public final /* synthetic */ a a;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        a aVar = this.a;
        aVar.B = false;
        if (z) {
            return;
        }
        if (aVar.g.getText().length() > 0) {
            aVar.w = true;
        }
        aVar.r.r().d(aVar.g);
    }

    public TN0(a aVar) {
        this.a = aVar;
    }
}

package defpackage;

import J.N;
import android.view.KeyEvent;
import android.widget.TextView;
import org.chromium.chrome.browser.findinpage.a;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class VN0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ a a;

    public VN0(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1) {
            return false;
        }
        a aVar = this.a;
        if (aVar.s == null) {
            return false;
        }
        if (aVar.w) {
            aVar.w = false;
            a.a(aVar, true);
        } else {
            aVar.r.r().d(aVar.g);
            IN0 in0 = aVar.s;
            N.MNC06_Rq(in0.b, in0);
            aVar.B = true;
        }
        return true;
    }
}

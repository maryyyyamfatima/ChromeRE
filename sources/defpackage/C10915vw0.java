package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vw0 */
/* loaded from: classes.dex */
public final class C10915vw0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ ViewOnClickListenerC0501Dw0 a;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        View focusSearch;
        if (i == 6) {
            this.a.r.performClick();
            return true;
        }
        if (i != 5 || (focusSearch = textView.focusSearch(2)) == null) {
            return false;
        }
        focusSearch.requestFocus();
        return true;
    }

    public C10915vw0(ViewOnClickListenerC0501Dw0 viewOnClickListenerC0501Dw0) {
        this.a = viewOnClickListenerC0501Dw0;
    }
}

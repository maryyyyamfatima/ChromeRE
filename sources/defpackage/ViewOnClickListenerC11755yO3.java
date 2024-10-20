package defpackage;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yO3 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC11755yO3 implements View.OnClickListener {
    public final /* synthetic */ Toolbar a;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C12098zO3 c12098zO3 = this.a.R;
        C6287iT1 c6287iT1 = c12098zO3 == null ? null : c12098zO3.g;
        if (c6287iT1 != null) {
            c6287iT1.collapseActionView();
        }
    }

    public ViewOnClickListenerC11755yO3(Toolbar toolbar) {
        this.a = toolbar;
    }
}

package defpackage;

import android.widget.PopupMenu;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class JJ3 implements PopupMenu.OnDismissListener {
    public final /* synthetic */ TextViewWithClickableSpans a;

    @Override // android.widget.PopupMenu.OnDismissListener
    public final void onDismiss(PopupMenu popupMenu) {
        this.a.g = null;
    }

    public JJ3(TextViewWithClickableSpans textViewWithClickableSpans) {
        this.a = textViewWithClickableSpans;
    }
}

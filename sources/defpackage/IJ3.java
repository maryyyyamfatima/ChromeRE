package defpackage;

import android.text.style.ClickableSpan;
import android.view.MenuItem;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class IJ3 implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ ClickableSpan a;
    public final /* synthetic */ TextViewWithClickableSpans g;

    public IJ3(TextViewWithClickableSpans textViewWithClickableSpans, ClickableSpan clickableSpan) {
        this.g = textViewWithClickableSpans;
        this.a = clickableSpan;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.a.onClick(this.g);
        return true;
    }
}

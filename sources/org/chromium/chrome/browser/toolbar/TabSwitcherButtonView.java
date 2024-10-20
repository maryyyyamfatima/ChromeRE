package org.chromium.chrome.browser.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.C8609pC3;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TabSwitcherButtonView extends ListMenuButton {
    public C8609pC3 s;

    public TabSwitcherButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // org.chromium.components.browser_ui.widget.listmenu.ListMenuButton, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        C8609pC3 d = C8609pC3.d(getContext(), 3);
        this.s = d;
        setImageDrawable(d);
    }
}

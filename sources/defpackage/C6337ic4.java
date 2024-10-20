package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ic4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6337ic4 extends AbstractC7711mc4 {
    public C6337ic4() {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Override // defpackage.AbstractC7711mc4
    public final void c(View view, Object obj) {
        view.setAccessibilityPaneTitle((CharSequence) obj);
    }

    @Override // defpackage.AbstractC7711mc4
    public final boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }

    @Override // defpackage.AbstractC7711mc4
    public final Object b(View view) {
        CharSequence accessibilityPaneTitle;
        accessibilityPaneTitle = view.getAccessibilityPaneTitle();
        return accessibilityPaneTitle;
    }
}

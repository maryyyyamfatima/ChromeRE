package defpackage;

import android.view.View;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kc4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7023kc4 extends AbstractC7711mc4 {
    @Override // defpackage.AbstractC7711mc4
    public final void c(View view, Object obj) {
        view.setAccessibilityHeading(((Boolean) obj).booleanValue());
    }

    @Override // defpackage.AbstractC7711mc4
    public final boolean f(Object obj, Object obj2) {
        return !AbstractC7711mc4.a((Boolean) obj, (Boolean) obj2);
    }

    public C7023kc4() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // defpackage.AbstractC7711mc4
    public final Object b(View view) {
        boolean isAccessibilityHeading;
        isAccessibilityHeading = view.isAccessibilityHeading();
        return Boolean.valueOf(isAccessibilityHeading);
    }
}

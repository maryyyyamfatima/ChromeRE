package defpackage;

import android.view.View;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hc4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5993hc4 extends AbstractC7711mc4 {
    @Override // defpackage.AbstractC7711mc4
    public final void c(View view, Object obj) {
        view.setScreenReaderFocusable(((Boolean) obj).booleanValue());
    }

    @Override // defpackage.AbstractC7711mc4
    public final boolean f(Object obj, Object obj2) {
        return !AbstractC7711mc4.a((Boolean) obj, (Boolean) obj2);
    }

    public C5993hc4() {
        super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    @Override // defpackage.AbstractC7711mc4
    public final Object b(View view) {
        boolean isScreenReaderFocusable;
        isScreenReaderFocusable = view.isScreenReaderFocusable();
        return Boolean.valueOf(isScreenReaderFocusable);
    }
}

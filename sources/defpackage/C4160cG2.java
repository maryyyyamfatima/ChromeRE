package defpackage;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cG2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4160cG2 extends DynamicLayout {
    public final int a;

    public C4160cG2(String str, TextPaint textPaint, int i, Layout.Alignment alignment) {
        super(str, str, textPaint, i, alignment, 1.0f, 0.0f, true, TextUtils.TruncateAt.END, i);
        this.a = 2;
    }

    @Override // android.text.DynamicLayout, android.text.Layout
    public final int getLineCount() {
        int lineCount = super.getLineCount() - 1;
        int i = this.a;
        return lineCount > i ? i : super.getLineCount() - 1;
    }

    @Override // android.text.DynamicLayout, android.text.Layout
    public final int getEllipsisCount(int i) {
        return (i != this.a + (-1) || super.getLineCount() + (-2) <= i) ? 0 : 3;
    }

    @Override // android.text.DynamicLayout, android.text.Layout
    public final int getEllipsisStart(int i) {
        if (i != this.a - 1 || super.getLineCount() - 2 <= i) {
            return 0;
        }
        return (getLineEnd(i) - getLineStart(i)) - 1;
    }
}

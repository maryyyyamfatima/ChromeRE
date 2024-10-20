package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WY3 extends AbstractC7590mF0 {
    public final TextView o;

    public WY3(TextView textView) {
        super(textView);
        this.o = textView;
    }

    @Override // defpackage.AbstractC7590mF0
    public final int n(float f, float f2) {
        TextView textView = this.o;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        int offsetForPosition = textView.getOffsetForPosition(f, f2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForPosition, offsetForPosition, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return spanned.getSpanStart(clickableSpanArr[0]);
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.AbstractC7590mF0
    public final void o(ArrayList arrayList) {
        CharSequence text = this.o.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                arrayList.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.AbstractC7590mF0
    public final void s(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan x = x(i);
        TextView textView = this.o;
        if (x == null) {
            Log.w("TvLinksAccessibilityHelper", "LinkSpan is null for offset: " + i);
            accessibilityEvent.setContentDescription(textView.getText());
            return;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            text = spanned.subSequence(spanned.getSpanStart(x), spanned.getSpanEnd(x));
        }
        accessibilityEvent.setContentDescription(text);
    }

    @Override // defpackage.AbstractC7590mF0
    public final void t(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        ClickableSpan x = x(i);
        Rect rect = new Rect();
        TextView textView = this.o;
        if (x == null) {
            Log.w("TvLinksAccessibilityHelper", "LinkSpan is null for offset: " + i);
            accessibilityNodeInfoCompat.o(textView.getText());
        } else {
            CharSequence text = textView.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                text = spanned.subSequence(spanned.getSpanStart(x), spanned.getSpanEnd(x));
            }
            accessibilityNodeInfoCompat.o(text);
        }
        accessibilityNodeInfoCompat.a.setFocusable(true);
        accessibilityNodeInfoCompat.n(true);
        w(x, rect);
        if (!rect.isEmpty()) {
            w(x, rect);
            accessibilityNodeInfoCompat.l(rect);
        } else {
            Log.w("TvLinksAccessibilityHelper", "LinkSpan bounds is empty for: " + i);
            rect.set(0, 0, 1, 1);
            accessibilityNodeInfoCompat.l(rect);
        }
        accessibilityNodeInfoCompat.a(16);
    }

    @Override // defpackage.AbstractC7590mF0
    public final boolean r(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        ClickableSpan x = x(i);
        if (x != null) {
            x.onClick(this.o);
            return true;
        }
        Log.e("TvLinksAccessibilityHelper", "LinkSpan is null for offset: " + i);
        return false;
    }

    public final ClickableSpan x(int i) {
        CharSequence text = this.o.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return clickableSpanArr[0];
        }
        return null;
    }

    public final Rect w(ClickableSpan clickableSpan, Rect rect) {
        Layout layout;
        TextView textView = this.o;
        CharSequence text = textView.getText();
        if ((text instanceof Spanned) && (layout = textView.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            rect.right = (int) primaryHorizontal2;
            if (lineForOffset == lineForOffset2) {
                rect.left = (int) primaryHorizontal;
            } else {
                rect.left = 0;
            }
            rect.top = layout.getLineTop(lineForOffset2);
            rect.bottom = layout.getLineBottom(lineForOffset2);
            rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
        }
        return rect;
    }

    @Override // defpackage.AbstractC7590mF0, defpackage.O0
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        accessibilityNodeInfoCompat.j(C5792h1.g);
        accessibilityNodeInfoCompat.n(false);
    }
}

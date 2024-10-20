package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class XB1 extends AbstractC7590mF0 {
    public final Rect o;
    public final TextView p;

    public XB1(TextView textView) {
        super(textView);
        this.o = new Rect();
        this.p = textView;
    }

    @Override // defpackage.AbstractC7590mF0
    public final int n(float f, float f2) {
        TextView textView = this.p;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        int i = -1;
        if (textView.getLayout() != null) {
            i = textView.getLayout().getOffsetForHorizontal(textView.getLayout().getLineForVertical((int) (Math.min((textView.getHeight() - textView.getTotalPaddingBottom()) - 1, Math.max(0.0f, f2 - textView.getTotalPaddingTop())) + textView.getScrollY())), Math.min((textView.getWidth() - textView.getTotalPaddingRight()) - 1, Math.max(0.0f, f - textView.getTotalPaddingLeft())) + textView.getScrollX());
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return spanned.getSpanStart(clickableSpanArr[0]);
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.AbstractC7590mF0
    public final void o(ArrayList arrayList) {
        CharSequence text = this.p.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                arrayList.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.AbstractC7590mF0
    public final void s(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan w = w(i);
        TextView textView = this.p;
        if (w == null) {
            Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
            accessibilityEvent.setContentDescription(textView.getText());
            return;
        }
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            text = spanned.subSequence(spanned.getSpanStart(w), spanned.getSpanEnd(w));
        }
        accessibilityEvent.setContentDescription(text);
    }

    @Override // defpackage.AbstractC7590mF0
    public final void t(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        Layout layout;
        ClickableSpan w = w(i);
        TextView textView = this.p;
        if (w == null) {
            Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
            accessibilityNodeInfoCompat.o(textView.getText());
        } else {
            CharSequence text = textView.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                text = spanned.subSequence(spanned.getSpanStart(w), spanned.getSpanEnd(w));
            }
            accessibilityNodeInfoCompat.o(text);
        }
        accessibilityNodeInfoCompat.a.setFocusable(true);
        accessibilityNodeInfoCompat.n(true);
        CharSequence text2 = textView.getText();
        Rect rect = this.o;
        rect.setEmpty();
        if ((text2 instanceof Spanned) && (layout = textView.getLayout()) != null) {
            Spanned spanned2 = (Spanned) text2;
            int spanStart = spanned2.getSpanStart(w);
            int spanEnd = spanned2.getSpanEnd(w);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 == lineForOffset) {
                rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
            } else if (layout.getParagraphDirection(lineForOffset) == -1) {
                rect.right = (int) primaryHorizontal;
            } else {
                rect.left = (int) primaryHorizontal;
            }
            rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
        }
        if (rect.isEmpty()) {
            Log.e("LinkAccessibilityHelper", "LinkSpan bounds is empty for: " + i);
            rect.set(0, 0, 1, 1);
        }
        accessibilityNodeInfoCompat.l(rect);
        accessibilityNodeInfoCompat.a(16);
    }

    @Override // defpackage.AbstractC7590mF0
    public final boolean r(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        ClickableSpan w = w(i);
        if (w != null) {
            w.onClick(this.p);
            return true;
        }
        Log.e("LinkAccessibilityHelper", "LinkSpan is null for offset: " + i);
        return false;
    }

    public final ClickableSpan w(int i) {
        CharSequence text = this.p.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return clickableSpanArr[0];
        }
        return null;
    }
}

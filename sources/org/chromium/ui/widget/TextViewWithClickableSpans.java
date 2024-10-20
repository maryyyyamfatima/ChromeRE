package org.chromium.ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupMenu;
import defpackage.IJ3;
import defpackage.JJ3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class TextViewWithClickableSpans extends TextViewWithLeading implements View.OnLongClickListener {
    public AccessibilityManager a;
    public PopupMenu g;

    public TextViewWithClickableSpans(Context context) {
        super(context);
        setSaveEnabled(false);
        this.a = (AccessibilityManager) getContext().getSystemService("accessibility");
        a();
    }

    public TextViewWithClickableSpans(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSaveEnabled(false);
        this.a = (AccessibilityManager) getContext().getSystemService("accessibility");
        a();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            return;
        }
        a();
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (!this.a.isTouchExplorationEnabled()) {
            return false;
        }
        c();
        return true;
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
    }

    public final void a() {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null) {
            return;
        }
        setOnLongClickListener(accessibilityManager.isTouchExplorationEnabled() ? this : null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 || !this.a.isTouchExplorationEnabled() || d(motionEvent)) {
            return onTouchEvent;
        }
        ClickableSpan[] b = b();
        if (b != null && b.length != 0) {
            if (b.length == 1) {
                b[0].onClick(this);
            } else {
                c();
            }
        }
        return true;
    }

    public final boolean d(MotionEvent motionEvent) {
        CharSequence text = getText();
        if (!(text instanceof SpannableString)) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - getTotalPaddingLeft();
        int totalPaddingTop = y - getTotalPaddingTop();
        int scrollX = getScrollX() + totalPaddingLeft;
        int scrollY = getScrollY() + totalPaddingTop;
        Layout layout = getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        return ((ClickableSpan[]) ((SpannableString) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class)).length > 0;
    }

    public final ClickableSpan[] b() {
        CharSequence text = getText();
        if (!(text instanceof SpannableString)) {
            return null;
        }
        SpannableString spannableString = (SpannableString) text;
        return (ClickableSpan[]) spannableString.getSpans(0, spannableString.length(), ClickableSpan.class);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(i, bundle);
        }
        ClickableSpan[] b = b();
        if (b != null && b.length != 0) {
            if (b.length == 1) {
                b[0].onClick(this);
            } else {
                c();
            }
        }
        return true;
    }

    public final void c() {
        ClickableSpan[] b = b();
        if (b == null || b.length == 0 || this.g != null) {
            return;
        }
        SpannableString spannableString = (SpannableString) getText();
        PopupMenu popupMenu = new PopupMenu(getContext(), this);
        this.g = popupMenu;
        Menu menu = popupMenu.getMenu();
        for (ClickableSpan clickableSpan : b) {
            menu.add(spannableString.subSequence(spannableString.getSpanStart(clickableSpan), spannableString.getSpanEnd(clickableSpan))).setOnMenuItemClickListener(new IJ3(this, clickableSpan));
        }
        this.g.setOnDismissListener(new JJ3(this));
        this.g.show();
    }
}

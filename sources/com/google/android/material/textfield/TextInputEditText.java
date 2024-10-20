package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.android.chrome.R;
import defpackage.C1325Kf;
import defpackage.GM1;
import defpackage.JG2;
import defpackage.SJ3;
import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class TextInputEditText extends C1325Kf {
    public final Rect k;
    public boolean l;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(GM1.a(context, attributeSet, R.attr.0_resource_name_obfuscated_res_0x7f0501c4, 0), attributeSet, 0);
        this.k = new Rect();
        TypedArray d = SJ3.d(context, attributeSet, JG2.Y0, R.attr.0_resource_name_obfuscated_res_0x7f0501c4, R.style.f108140_resource_name_obfuscated_res_0x7f15066f, new int[0]);
        this.l = d.getBoolean(0, false);
        d.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d = d();
        if (d != null && d.H && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout d = d();
        if (d == null || !d.H) {
            return super.getHint();
        }
        if (d.F) {
            return d.G;
        }
        return null;
    }

    @Override // defpackage.C1325Kf, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout d = d();
            CharSequence charSequence = null;
            if (d != null && d.F) {
                charSequence = d.G;
            }
            editorInfo.hintText = charSequence;
        }
        return onCreateInputConnection;
    }

    public final TextInputLayout d() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout d = d();
        if (!(d != null && this.l) || rect == null) {
            return;
        }
        Rect rect2 = this.k;
        d.getFocusedRect(rect2);
        rect.bottom = rect2.bottom;
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout d = d();
        if (d != null && this.l) {
            return d.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout d = d();
        if ((d != null && this.l) && rect != null) {
            int height = d.getHeight() - getHeight();
            int i = rect.left;
            int i2 = rect.top;
            int i3 = rect.right;
            int i4 = rect.bottom + height;
            Rect rect2 = this.k;
            rect2.set(i, i2, i3, i4);
            return super.requestRectangleOnScreen(rect2);
        }
        return super.requestRectangleOnScreen(rect);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d();
    }
}

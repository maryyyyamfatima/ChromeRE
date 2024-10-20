package defpackage;

import android.text.Editable;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC11215wp {
    void announceForAccessibility(CharSequence charSequence);

    void append(CharSequence charSequence);

    Editable getEditableText();

    int getHighlightColor();

    int getSelectionEnd();

    int getSelectionStart();

    Editable getText();

    boolean isFocused();

    void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent);

    void setCursorVisible(boolean z);

    void setSelection(int i, int i2);
}

package org.chromium.chrome.browser.vr.keyboard;

import java.util.Locale;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public class TextEditAction {
    public final int a;
    public final String b;
    public final int c;

    public static TextEditAction[] createArray(int i) {
        return new TextEditAction[i];
    }

    public TextEditAction(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final String toString() {
        return String.format(Locale.US, "TextEditAction {[%d] Text[%s] Cursor[%d]}", Integer.valueOf(this.a), this.b, Integer.valueOf(this.c));
    }
}

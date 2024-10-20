package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.UpdateAppearance;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mp3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7788mp3 extends SpannableString {
    public C7788mp3(String str) {
        super(str);
    }

    @Override // android.text.SpannableString
    public final boolean equals(Object obj) {
        if (!(obj instanceof C7788mp3)) {
            return false;
        }
        C7788mp3 c7788mp3 = (C7788mp3) obj;
        if (!TextUtils.equals(this, c7788mp3)) {
            return false;
        }
        if (TextUtils.isEmpty(this)) {
            return true;
        }
        UpdateAppearance[] updateAppearanceArr = (UpdateAppearance[]) getSpans(0, length(), UpdateAppearance.class);
        UpdateAppearance[] updateAppearanceArr2 = (UpdateAppearance[]) c7788mp3.getSpans(0, c7788mp3.length(), UpdateAppearance.class);
        if (updateAppearanceArr.length != updateAppearanceArr2.length) {
            return false;
        }
        for (int i = 0; i < updateAppearanceArr.length; i++) {
            UpdateAppearance updateAppearance = updateAppearanceArr[i];
            UpdateAppearance updateAppearance2 = updateAppearanceArr2[i];
            if (getSpanStart(updateAppearance) == c7788mp3.getSpanStart(updateAppearance2) && getSpanEnd(updateAppearance) == c7788mp3.getSpanEnd(updateAppearance2) && getSpanFlags(updateAppearance) == c7788mp3.getSpanFlags(updateAppearance2) && updateAppearance.getClass() == updateAppearance2.getClass()) {
                if (updateAppearance instanceof ForegroundColorSpan) {
                    if (((ForegroundColorSpan) updateAppearance).getForegroundColor() != ((ForegroundColorSpan) updateAppearance2).getForegroundColor()) {
                        return false;
                    }
                } else if (updateAppearance instanceof BackgroundColorSpan) {
                    if (((BackgroundColorSpan) updateAppearance).getBackgroundColor() != ((BackgroundColorSpan) updateAppearance2).getBackgroundColor()) {
                        return false;
                    }
                } else if (updateAppearance instanceof StyleSpan) {
                    if (((StyleSpan) updateAppearance).getStyle() != ((StyleSpan) updateAppearance2).getStyle()) {
                        return false;
                    }
                } else if (updateAppearance instanceof TextAppearanceSpan) {
                    TextAppearanceSpan textAppearanceSpan = (TextAppearanceSpan) updateAppearance;
                    TextAppearanceSpan textAppearanceSpan2 = (TextAppearanceSpan) updateAppearance2;
                    if (TextUtils.equals(textAppearanceSpan.getFamily(), textAppearanceSpan2.getFamily()) && textAppearanceSpan.getLinkTextColor().equals(textAppearanceSpan2.getLinkTextColor()) && textAppearanceSpan.getTextColor().equals(textAppearanceSpan2.getTextColor()) && textAppearanceSpan.getTextSize() == textAppearanceSpan2.getTextSize() && textAppearanceSpan.getTextStyle() == textAppearanceSpan2.getTextStyle()) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}

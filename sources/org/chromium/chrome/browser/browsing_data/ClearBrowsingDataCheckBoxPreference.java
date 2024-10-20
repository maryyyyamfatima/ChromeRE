package org.chromium.chrome.browser.browsing_data;

import android.R;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import defpackage.AbstractC9108qg3;
import defpackage.C10021tL;
import defpackage.C11997z52;
import defpackage.C1812Ny2;
import defpackage.C8765pg3;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataCheckBoxPreference;
import org.chromium.components.browser_ui.settings.ChromeBaseCheckBoxPreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ClearBrowsingDataCheckBoxPreference extends ChromeBaseCheckBoxPreference {
    public View Z;
    public Runnable a0;
    public boolean b0;

    public ClearBrowsingDataCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // org.chromium.components.browser_ui.settings.ChromeBaseCheckBoxPreference, androidx.preference.Preference
    public final void v(C1812Ny2 c1812Ny2) {
        super.v(c1812Ny2);
        View view = c1812Ny2.a;
        this.Z = view;
        final TextView textView = (TextView) view.findViewById(R.id.summary);
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: PS
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                if (!ClearBrowsingDataCheckBoxPreference.this.b0) {
                    return false;
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                TextView textView2 = textView;
                int offsetForPosition = textView2.getOffsetForPosition(x, y);
                CharSequence text = textView2.getText();
                if (!(text instanceof Spanned)) {
                    return false;
                }
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(offsetForPosition, offsetForPosition, ClickableSpan.class);
                if (clickableSpanArr.length <= 0) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    for (ClickableSpan clickableSpan : clickableSpanArr) {
                        clickableSpan.onClick(textView2);
                    }
                }
                return true;
            }
        });
    }

    @Override // androidx.preference.Preference
    public final void P(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        if (!charSequence2.contains("<link>") || !charSequence2.contains("</link>")) {
            super.P(charSequence);
        } else {
            if (C10021tL.f().c()) {
                super.P(charSequence2.replaceAll("</?link>", ""));
                return;
            }
            SpannableString a = AbstractC9108qg3.a(charSequence2, new C8765pg3(new C11997z52(this.a, new Callback() { // from class: OS
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj) {
                    return new ZE(this, obj);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj) {
                    Runnable runnable = ClearBrowsingDataCheckBoxPreference.this.a0;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }), "<link>", "</link>"));
            this.b0 = true;
            super.P(a);
        }
    }
}

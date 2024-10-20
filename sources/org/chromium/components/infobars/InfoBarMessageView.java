package org.chromium.components.infobars;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.chromium.ui.widget.TextViewWithClickableSpans;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class InfoBarMessageView extends TextViewWithClickableSpans {
    public boolean h;

    public InfoBarMessageView(Context context) {
        super(context);
    }

    public InfoBarMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // org.chromium.ui.widget.TextViewWithClickableSpans, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.h && motionEvent.getActionMasked() == 1) {
            long eventTime = motionEvent.getEventTime() - motionEvent.getDownTime();
            boolean z = eventTime >= ((long) ViewConfiguration.getTapTimeout()) && eventTime <= ((long) ViewConfiguration.getLongPressTimeout());
            ClickableSpan[] b = b();
            if (z && b != null && b.length == 1 && !d(motionEvent)) {
                b[0].onClick(this);
            }
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            this.h = true;
        }
    }
}

package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.Ec4;
import defpackage.R50;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements R50 {
    public TextView a;
    public Button g;
    public int h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.g = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:            if (a(1, r0, r0 - r2) != false) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:            r1 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:            if (r1 == false) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:            super.onMeasure(r8, r9);     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:            if (a(0, r0, r0) != false) goto L26;     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131231151(0x7f0801af, float:1.8078375E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131231150(0x7f0801ae, float:1.8078373E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = r1
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.h
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.g
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.h
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L57
            goto L58
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = r4
        L58:
            if (r1 == 0) goto L5d
            super.onMeasure(r8, r9)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.a;
        WeakHashMap weakHashMap = Ec4.a;
        if (!textView.isPaddingRelative()) {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
            return true;
        }
        textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
        return true;
    }
}

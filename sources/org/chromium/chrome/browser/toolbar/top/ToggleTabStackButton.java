package org.chromium.chrome.browser.toolbar.top;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.chrome.R;
import defpackage.C10226tv3;
import defpackage.C8609pC3;
import defpackage.InterfaceC9883sv3;
import defpackage.ZN3;
import org.chromium.base.TraceEvent;
import org.chromium.components.browser_ui.widget.listmenu.ListMenuButton;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ToggleTabStackButton extends ListMenuButton implements InterfaceC9883sv3, View.OnClickListener, View.OnLongClickListener {
    public C8609pC3 s;
    public C10226tv3 t;
    public View.OnClickListener u;
    public View.OnLongClickListener v;

    public ToggleTabStackButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // org.chromium.components.browser_ui.widget.listmenu.ListMenuButton, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        C8609pC3 d = C8609pC3.d(getContext(), 3);
        this.s = d;
        setImageDrawable(d);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    @Override // defpackage.InterfaceC9883sv3
    public final void a(int i, boolean z) {
        setEnabled(i >= 1);
        this.s.e(i, z);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.u == null || !isClickable()) {
            return;
        }
        this.u.onClick(this);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.v != null && isLongClickable()) {
            return this.v.onLongClick(view);
        }
        return ZN3.e(getContext(), view, getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f14072a));
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TraceEvent i5 = TraceEvent.i("ToggleTabStackButton.onLayout", null);
        try {
            super.onLayout(z, i, i2, i3, i4);
            if (i5 != null) {
                i5.close();
            }
        } catch (Throwable th) {
            if (i5 != null) {
                try {
                    i5.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        TraceEvent i3 = TraceEvent.i("ToggleTabStackButton.onMeasure", null);
        try {
            super.onMeasure(i, i2);
            if (i3 != null) {
                i3.close();
            }
        } catch (Throwable th) {
            if (i3 != null) {
                try {
                    i3.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}

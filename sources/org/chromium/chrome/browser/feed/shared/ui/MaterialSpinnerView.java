package org.chromium.chrome.browser.feed.shared.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.chrome.R;
import defpackage.AbstractC10957w33;
import defpackage.C5936hS;
import defpackage.C6280iS;
import org.chromium.base.TraceEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class MaterialSpinnerView extends AppCompatImageView {
    public final C6280iS i;

    public MaterialSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TraceEvent.b("MaterialSpinnerView", null);
        C6280iS c6280iS = new C6280iS(context);
        this.i = c6280iS;
        c6280iS.d(1);
        setImageDrawable(c6280iS);
        int[] iArr = {AbstractC10957w33.g(R.attr.f5250_resource_name_obfuscated_res_0x7f05013a, context)};
        C5936hS c5936hS = c6280iS.a;
        c5936hS.i = iArr;
        c5936hS.a(0);
        c5936hS.a(0);
        c6280iS.invalidateSelf();
        a(isAttachedToWindow());
        TraceEvent.c("MaterialSpinnerView");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        a(isAttachedToWindow());
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        a(false);
        super.onDetachedFromWindow();
    }

    public final void a(boolean z) {
        C6280iS c6280iS = this.i;
        if (c6280iS == null) {
            return;
        }
        boolean z2 = isShown() && z;
        if (c6280iS.isRunning() && !z2) {
            c6280iS.stop();
        } else {
            if (c6280iS.isRunning() || !z2) {
                return;
            }
            c6280iS.start();
        }
    }
}

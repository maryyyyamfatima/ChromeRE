package org.chromium.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.BulletSpan;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChromeBulletSpan extends BulletSpan {
    public final int a;

    public ChromeBulletSpan(Context context) {
        super(context.getResources().getDimensionPixelSize(R.dimen.f29320_resource_name_obfuscated_res_0x7f0800ff));
        this.a = context.getResources().getDimensionPixelSize(R.dimen.f29330_resource_name_obfuscated_res_0x7f080100);
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        super.drawLeadingMargin(canvas, paint, i + this.a, i2, i3, i4, i5, charSequence, i6, i7, z, layout);
    }
}

package org.chromium.components.content_creation.notes.models;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.os.Build;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class FooterStyle {
    public final int a;
    public final int b;

    public FooterStyle(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(TextView textView, TextView textView2, ImageView imageView) {
        int i = this.a;
        textView.setTextColor(i);
        textView2.setTextColor(i);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.b;
        if (i2 >= 29) {
            imageView.setColorFilter(new BlendModeColorFilter(i3, BlendMode.SRC_IN));
        } else {
            imageView.setColorFilter(i3, PorterDuff.Mode.SRC_IN);
        }
    }
}

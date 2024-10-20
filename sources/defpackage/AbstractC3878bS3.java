package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bS3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3878bS3 {
    public static void a(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        ViewOnLongClickListenerC4908eS3 viewOnLongClickListenerC4908eS3 = ViewOnLongClickListenerC4908eS3.p;
        if (viewOnLongClickListenerC4908eS3 != null && viewOnLongClickListenerC4908eS3.a == view) {
            ViewOnLongClickListenerC4908eS3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            ViewOnLongClickListenerC4908eS3 viewOnLongClickListenerC4908eS32 = ViewOnLongClickListenerC4908eS3.q;
            if (viewOnLongClickListenerC4908eS32 != null && viewOnLongClickListenerC4908eS32.a == view) {
                viewOnLongClickListenerC4908eS32.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerC4908eS3(charSequence, view);
    }
}

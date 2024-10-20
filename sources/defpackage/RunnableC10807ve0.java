package defpackage;

import android.content.Context;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ve0 */
/* loaded from: classes.dex */
public final class RunnableC10807ve0 implements Runnable {
    public final /* synthetic */ ViewOnLongClickListenerC11150we0 a;

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnLongClickListenerC11150we0 viewOnLongClickListenerC11150we0 = this.a;
        C0021Ae0 c0021Ae0 = viewOnLongClickListenerC11150we0.p;
        Context context = viewOnLongClickListenerC11150we0.v.getContext();
        if (c0021Ae0.d) {
            c0021Ae0.d = false;
            c0021Ae0.c.setVisibility(0);
            c0021Ae0.c.setAlpha(0.0f);
            float dimension = context.getResources().getDimension(R.dimen.0_resource_name_obfuscated_res_0x7f08016d);
            float textSize = c0021Ae0.b.getTextSize();
            c0021Ae0.b.setTextSize(0, dimension);
            float textSize2 = textSize / c0021Ae0.b.getTextSize();
            int[] iArr = new int[2];
            c0021Ae0.b.getLocationInWindow(iArr);
            c0021Ae0.b.requestLayout();
            c0021Ae0.b.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC12179ze0(c0021Ae0, textSize2, iArr));
        }
    }

    public RunnableC10807ve0(ViewOnLongClickListenerC11150we0 viewOnLongClickListenerC11150we0) {
        this.a = viewOnLongClickListenerC11150we0;
    }
}

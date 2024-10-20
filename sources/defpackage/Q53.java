package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.android.chrome.R;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Q53 extends C3823bH3 {
    public final Context s;
    public final LoadingView t;

    @Override // defpackage.C3823bH3
    public final Drawable e(Context context, boolean z, boolean z2) {
        Resources resources = context.getResources();
        ThreadLocal threadLocal = GP2.a;
        return resources.getDrawable(R.drawable.f46400_resource_name_obfuscated_res_0x7f090180, null);
    }

    public Q53(Activity activity, View view, int i, int i2, ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4, int i3, boolean z, ViewOnTouchListenerC3647am4 viewOnTouchListenerC3647am4) {
        super(activity, view, activity.getString(i), activity.getString(i2), false, viewTreeObserverOnGlobalLayoutListenerC8754pe4, AbstractC2884Wf.a(activity, i3), true, z);
        this.s = activity;
        this.i.p = viewOnTouchListenerC3647am4;
        this.t = (LoadingView) this.p.findViewById(R.id.loading_view);
    }
}

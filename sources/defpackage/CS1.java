package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public abstract class CS1 {
    public static ViewTreeObserverOnGlobalLayoutListenerC8754pe4 a(View view) {
        ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4 = new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(view);
        viewTreeObserverOnGlobalLayoutListenerC8754pe4.d(true);
        viewTreeObserverOnGlobalLayoutListenerC8754pe4.e(new Rect(0, 0, 0, (view.getHeight() - view.getResources().getDimensionPixelSize(R.dimen.f42310_resource_name_obfuscated_res_0x7f080804)) / 2));
        return viewTreeObserverOnGlobalLayoutListenerC8754pe4;
    }
}

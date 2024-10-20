package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.a;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tm4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10173tm4 {
    public final Activity a;
    public final InterfaceC0950Hi b;
    public final Handler c = new Handler();
    public final View d;
    public final KU3 e;
    public final Runnable f;
    public Q53 g;
    public final int h;

    public C10173tm4(a aVar, C1340Ki c1340Ki, ImageButton imageButton, KU3 ku3, Yl4 yl4) {
        R44.a(Profile.d());
        this.a = aVar;
        this.b = c1340Ki;
        this.d = imageButton;
        this.e = ku3;
        this.f = yl4;
        C7928nE c7928nE = UN.a;
        this.h = N.M37SqSAy("WebFeed", "intro-show-timeout-millis", 8000);
    }

    public final ViewTreeObserverOnGlobalLayoutListenerC8754pe4 a() {
        ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4 = new ViewTreeObserverOnGlobalLayoutListenerC8754pe4(this.d);
        viewTreeObserverOnGlobalLayoutListenerC8754pe4.e(new Rect(0, 0, 0, this.a.getResources().getDimensionPixelOffset(R.dimen.f42920_resource_name_obfuscated_res_0x7f080842)));
        return viewTreeObserverOnGlobalLayoutListenerC8754pe4;
    }
}
